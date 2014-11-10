/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler

// TODO NO_XTEND
//class JnarioDocCompiler extends XtendBatchCompiler{
//	
//	private Executable2ResultMapping resultMapping
//	@Property private String resultFolder
//	@Inject private AbstractDocGenerator docGenerator
//	@Inject private IEncodingProvider.Runtime encodingProvider
//	
//	private ResourceSet resourceSet
//	
//	override compile() {
//		loadResources
//		generateDocumentation(resultMapping);
//		return true
//	}
//	
//	@Inject 
//	def setExecutable2ResultMapping(Executable2ResultMapping resultMapping){
//		this.resultMapping = resultMapping
//	}
//	
//	def loadResources(){
//		resourceSet = resourceSetProvider.get
//		encodingProvider.setDefaultEncoding(getFileEncoding())
//		resourceSet.getLoadOptions().put(XtextResource::OPTION_ENCODING, getFileEncoding());
//		val nameBasedFilter = new NameBasedFilter();
//		nameBasedFilter.setExtension(fileExtensionProvider.getPrimaryFileExtension());
//		val pathTraverser = new PathTraverser();
//		pathTraverser.resolvePathes(getSourcePathDirectories(), [input |
//				val matches = nameBasedFilter.matches(input);
//				if (matches) {
//					resourceSet.getResource(input, true);
//				}
//				return matches;
//			])
//		val classDirectory = createTempDir("classes")
//		installJvmTypeProvider(resourceSet, classDirectory)
//		EcoreUtil::resolveAll(resourceSet)
//		resourceSet
//	}
//	
//	def generateDocumentation(Executable2ResultMapping executable2ResultMapping){
//		val javaIoFileSystemAccess = javaIoFileSystemAccessProvider.get()
//		javaIoFileSystemAccess.setOutputPath(DocOutputConfigurationProvider::DOC_OUTPUT, outputPath)
//		for(r : resourceSet.resources){
//			if(fileExtensionProvider.isValid(r.URI.fileExtension)){
//				docGenerator.doGenerate(r, javaIoFileSystemAccess, executable2ResultMapping);
//			}
//		}
//	}
//	
//}