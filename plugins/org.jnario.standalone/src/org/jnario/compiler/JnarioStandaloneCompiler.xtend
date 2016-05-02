/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler

import com.google.common.base.Joiner
import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Injector
import java.io.File
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.common.types.descriptions.IStubGenerator
import org.eclipse.xtext.common.types.descriptions.JvmTypesResourceDescriptionStrategy
import org.eclipse.xtext.mwe.NameBasedFilter
import org.eclipse.xtext.mwe.PathTraverser
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.containers.FlatResourceSetBasedAllContainersState
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.suite.SuiteStandaloneSetup

class JnarioStandaloneCompiler extends AbstractBatchCompiler {
	
	final static val log = Logger.getLogger(JnarioStandaloneCompiler.getName())
	
	@Inject
	private IStubGenerator stubGenerator;
	
	List<Injector> injectors
	
	Map<String, Injector> injectorMap
	
    def static JnarioStandaloneCompiler create(){
		val setups = #[new FeatureStandaloneSetup(), new SpecStandaloneSetup(), new SuiteStandaloneSetup()]
		fromSetups(setups)
	}
	
	def initWithInjectors(List<Injector> injectors) {
	    this.injectors = injectors
        injectorMap = newHashMap(injectors.map[
            val fileExtension = getInstance(FileExtensionProvider).primaryFileExtension
            fileExtension -> it
        ])
	}
	
	def static fromSetups(List<? extends ISetup> setups) {
	    new JnarioStandaloneCompiler => [
    		injectors = setups.eagerMap[createInjectorAndDoEMFRegistration].toList
    		injectors.head.injectMembers(it)
    		injectorMap = newHashMap(injectors.map[
    			val fileExtension = getInstance(FileExtensionProvider).primaryFileExtension
    			fileExtension -> it
    		])
		]
	}
	
	override protected loadXtendFiles(ResourceSet resourceSet) {
	    applyEncoding
		resourceSet.eAdapters.add(
			new FlatResourceSetBasedAllContainersState(resourceSet) {

				override getContainedURIs(String containerHandle) {
					val uris = Lists.newArrayListWithCapacity(resourceSet.getResources().size());
					for (Resource r : resourceSet.getResources())
						uris.add(r.getURI());
					return uris;
				}
			
		})
		val nameBasedFilter = getNameBasedFilters()
		val pathTraverser = new PathTraverser();
		val sourcePathDirectories = getSourcePathDirectories(); 
		val pathes = pathTraverser.resolvePathes(sourcePathDirectories)[src|
				nameBasedFilter.exists[matches(src)]
		]
		pathes.keySet().forEach[src|
			val baseDir = URI.createFileURI(src+"/");
			val identifier = Joiner.on("_").join(baseDir.segments());
			val platformResourceURI = URI.createPlatformResourceURI(identifier+"/", true);
			resourceSet.getURIConverter().getURIMap().put(platformResourceURI,baseDir);
			for (URI uri :  pathes.get(src)) {
				if (log.isDebugEnabled()) {
					log.debug("load xtend file '" + uri + "'");
				}
				val uriToUse = uri.replacePrefix(baseDir, platformResourceURI);
				resourceSet.getResource(uriToUse, true);
			}
		]
		return resourceSet;
	}
	
	def applyEncoding() {
	    injectors.forEach [
	        getInstance(IEncodingProvider.Runtime).setDefaultEncoding(getFileEncoding());
	    ]
	}
	
// TODO REMOVE ME    
//    def Iterable<? extends URI> reverse(Collection<URI> uris) {
//        val list = newArrayList
//        list.addAll(uris)
//        Collections.reverse(list)
//        list
//    }
	
	def getNameBasedFilters() {
		injectors.eagerMap[
			val filter = new NameBasedFilter
			filter.extension = getInstance(FileExtensionProvider).primaryFileExtension
			filter
		]
	}
	
	override createStubs(ResourceSet resourceSet) {
		val outputDirectory = createTempDir("stubs");
		val fileSystemAccess = javaIoFileSystemAccessProvider.get();
		fileSystemAccess.setOutputPath(outputDirectory.toString());
		Lists.newArrayList(resourceSet.getResources()).forEach[
			val description = findResourceDescriptionManager(it)?.getResourceDescription(it);
			if (description != null) {
    			stubGenerator.doGenerateStubs(fileSystemAccess, description);
			}
		
		]
		return outputDirectory;
	}
	
	def findResourceDescriptionManager(Resource resource) {
	  getInstance(resource, IResourceDescription.Manager)
	}
	
	def <T> T getInstance(Resource resource, Class<T> type) {
	  injectorMap.get(resource.URI.fileExtension.toLowerCase)?.getInstance(type)
	}

	override generateJavaFiles(ResourceSet resourceSet) {
		val javaIoFileSystemAccess = javaIoFileSystemAccessProvider.get();
		val outputPath = this.outputPath // Workaround for java.lang.IllegalAccessError: tried to access field org.jnario.compiler.AbstractBatchCompiler.outputPath from class org.jnario.compiler.JnarioStandaloneCompiler$9
		javaIoFileSystemAccess.setOutputPath(outputPath);
		javaIoFileSystemAccess.setWriteTrace(writeTraceFiles);
		val resourceDescriptions = getResourceDescriptions(resourceSet);
		val exportedObjectsByType = resourceDescriptions
				.getExportedObjectsByType(TypesPackage.Literals.JVM_DECLARED_TYPE);
		if (log.isInfoEnabled()) {
			val size = exportedObjectsByType.size
			if (size == 0) {
				log.info("No sources to compile in '" + sourcePath + "'");
			} else {
				log.info("Compiling " + size + " source " + (if(size == 1)  "file" else "files") + " to " + outputPath);
			}
		}
		exportedObjectsByType.filter[getUserData(JvmTypesResourceDescriptionStrategy.IS_NESTED_TYPE) == null].forEach[eObjectDescription|
			val jvmGenericType = eObjectDescription.getEObjectOrProxy() as JvmDeclaredType;
//			JvmDeclaredType jvmGenericType = xtendJvmAssociations.getInferredType(xtendType);
			val generator = getInstance(jvmGenericType.eResource, JvmModelGenerator)
			val generatorConfig = getInstance(jvmGenericType.eResource, IGeneratorConfigProvider)
			val nameProvider = getInstance(jvmGenericType.eResource, IQualifiedNameProvider)
			val generatedType = (generator).generateType(jvmGenericType, generatorConfig.get(jvmGenericType));
			val qualifiedName = nameProvider.getFullyQualifiedName(jvmGenericType);
			if (log.isDebugEnabled()) {
				log.debug("write '" + outputPath + File.separator + getJavaFileName(qualifiedName) + "'");
			}
			javaIoFileSystemAccess.generateFile(getJavaFileName(qualifiedName), generatedType);
		]
	}

	def String getJavaFileName(QualifiedName typeName) {
		return Strings.concat("/", typeName.getSegments()) + ".java";
	}
	
	def static <T, R> List<R> eagerMap(List<T> list, Functions.Function1<? super T, ? extends R> transformation) {
		val result = new ArrayList(list.size())
		for (T t : list) {
			result.addAll(transformation.apply(t));
		}
		result
	}
}