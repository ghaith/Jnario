/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.mwe.NameBasedFilter;
import org.eclipse.xtext.mwe.PathTraverser;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.jnario.JnarioFile;
import org.jnario.JnarioTypeDeclaration;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

/**
 * @author Sebastian - Initial contribution and API
 */
public abstract class JnarioBatchCompiler extends AbstractBatchCompiler {
	
	@Inject
	private IEncodingProvider.Runtime encodingProvider;

	private final Logger log = Logger.getLogger(getClass());

	@Inject
	private JvmModelGenerator generator;

	@Inject
	private IGeneratorConfigProvider generatorConfigprovider;

	@Inject
	private IJvmModelAssociations jvmModelAssociations;

	@Override
	protected File createStubs(ResourceSet resourceSet) {
		File outputDirectory = createTempDir("stubs");
		JavaIoFileSystemAccess fileSystemAccess = javaIoFileSystemAccessProvider
				.get();
		fileSystemAccess.setOutputPath(outputDirectory.toString());
		List<EObject> objectsWithClasses = getObjectsWithClasses(jnarioResources(resourceSet));
		for (EObject eObject : objectsWithClasses) {
			StringBuilder classSignatureBuilder = new StringBuilder();
			String packageName = getPackageName(eObject);
			if (!Strings.isEmpty(packageName)) {
				classSignatureBuilder.append("package " + packageName + ";");
				classSignatureBuilder.append("\n");
			}
			classSignatureBuilder.append("public class "
					+ getClassName(eObject) + "{}");
			String javaFileName = getJavaFileName(eObject);
			if (log.isDebugEnabled()) {
				log.debug("create java stub '" + javaFileName + "'");
			}
			fileSystemAccess.generateFile(javaFileName,
					classSignatureBuilder.toString());
		}
		return outputDirectory;
	}

	@Override
	protected void generateJavaFiles(ResourceSet resourceSet) {
		JavaIoFileSystemAccess javaIoFileSystemAccess = javaIoFileSystemAccessProvider
				.get();
		javaIoFileSystemAccess.setOutputPath(outputPath);
		javaIoFileSystemAccess.setWriteTrace(writeTraceFiles);

		for (Resource resource : jnarioResources(resourceSet)) {
			JnarioFile file = filter(resource.getContents(), JnarioFile.class)
					.iterator().next();
			for (JnarioTypeDeclaration xtendClass : file.getXtendTypes()) {
				String packageName = toPath(getPackageName(xtendClass));
				for (JvmGenericType type : filter(resource.getContents(),
						JvmGenericType.class)) {
					CharSequence generatedType = generator.generateType(type,
							generatorConfigprovider.get(xtendClass));
					String fileName = packageName + type.getSimpleName()
							+ ".java";
					javaIoFileSystemAccess
							.generateFile(fileName, generatedType);
				}
			}
		}

		List<EObject> objectsWithClasses = getObjectsWithClasses(jnarioResources(resourceSet));
		if (log.isInfoEnabled()) {
			int size = Iterables.size(objectsWithClasses);
			if (size == 0) {
				log.info("No sources to compile in '" + sourcePath + "'");
			} else {
				log.info("Compiling " + size + " source "
						+ (size == 1 ? "file" : "files") + " to " + outputPath);
			}
		}
		for (EObject eObject : objectsWithClasses) {
			Iterable<JvmDeclaredType> jvmGenericTypes = Iterables.filter(
					jvmModelAssociations.getJvmElements(eObject),
					JvmDeclaredType.class);
			for (JvmDeclaredType jvmType : jvmGenericTypes) {
				CharSequence generatedType = generator.generateType(jvmType,
						generatorConfigprovider.get(eObject));
				String javaFileName = getJavaFileName(eObject);
				if (log.isDebugEnabled()) {
					log.debug("write '" + outputPath + File.separator
							+ javaFileName + "'");
				}
				javaIoFileSystemAccess
						.generateFile(javaFileName, generatedType);
			}
		}
	}

	@Override
	protected List<Issue> validate(ResourceSet resourceSet) {
		List<Issue> issues = Lists.newArrayList();
		List<Resource> resources = newArrayList(resourceSet.getResources());
		for (Resource resource : resources) {
			if (fileExtensionProvider
					.isValid(resource.getURI().fileExtension())) {
				IResourceServiceProvider resourceServiceProvider = ((XtextResource) resource)
						.getResourceServiceProvider();
				IResourceValidator resourceValidator = resourceServiceProvider
						.getResourceValidator();
				List<Issue> result = resourceValidator.validate(resource,
						CheckMode.ALL, null);
				addAll(issues, result);
			}
		}
		return issues;
	}

	protected Iterable<Resource> jnarioResources(ResourceSet resourceSet) {
		return newArrayList(filter(resourceSet.getResources(),
				new Predicate<Resource>() {
					public boolean apply(Resource resource) {
						return fileExtensionProvider.isValid(resource.getURI()
								.fileExtension());
					}
				}));
	}

	protected String getJavaFileName(EObject obj) {
		String packageName = getPackageName(obj);
		String javaClassName = getClassName(obj) + ".java";
		return toPath(packageName) + javaClassName;
	}

	private String toPath(String packageName) {
		if (packageName == null) {
			return "";
		}
		return packageName.replaceAll("\\.", "/") + "/";
	}

	protected String getPackageName(EObject obj) {
		return getContainerOfType(obj, JnarioFile.class).getPackage();
	}

	protected abstract String getClassName(EObject eObject);

	protected List<EObject> getObjectsWithClasses(Iterable<Resource> resources) {
		List<EObject> result = newArrayList();
		for (Resource resource : resources) {
			addObjectsWithClasses(resource, result);
		}
		return result;
	}

	protected abstract void addObjectsWithClasses(Resource resource,
			List<EObject> result);


	protected ResourceSet loadXtendFiles(final ResourceSet resourceSet) {
		encodingProvider.setDefaultEncoding(getFileEncoding());
		final NameBasedFilter nameBasedFilter = new NameBasedFilter();
		nameBasedFilter.setExtension(fileExtensionProvider.getPrimaryFileExtension());
		PathTraverser pathTraverser = new PathTraverser();
		List<String> sourcePathDirectories = getSourcePathDirectories(); 
		Multimap<String, URI> pathes = pathTraverser.resolvePathes(sourcePathDirectories, new Predicate<URI>() {
			public boolean apply(URI input) {
				boolean matches = nameBasedFilter.matches(input);
				return matches;
			}
		});
		for (String src : pathes.keySet()) {
			URI baseDir = URI.createFileURI(src+"/");
			String identifier = Joiner.on("_").join(baseDir.segments());
			for (URI uri :  pathes.get(src)) {
				if (log.isDebugEnabled()) {
					log.debug("load jnario file '" + uri + "'");
				}
				resourceSet.getResource(uri, true);
			}
		}
		return resourceSet;
	}
}
