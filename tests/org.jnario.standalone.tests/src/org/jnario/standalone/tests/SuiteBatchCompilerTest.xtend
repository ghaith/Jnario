/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.standalone.tests

import com.google.common.base.Charsets
import com.google.common.io.Files
import com.google.inject.Inject
import com.google.inject.Provider
import java.io.File
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.compiler.AbstractBatchCompiler
import org.jnario.compiler.JnarioBatchCompiler
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.jnario.test.util.ExtendedSuiteInjectorProvider
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.suite.SuiteStandaloneSetup
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.util.Files.*
import static org.junit.Assert.*
import org.junit.Ignore
import org.jnario.compiler.JnarioStandaloneCompiler

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExtendedSuiteInjectorProvider))
class SuiteBatchCompilerTest {

	@Inject Provider<ModelStore> modelStoreProvider
	
    static String OUTPUT_DIRECTORY = "test-result"
    static String XTEND_SRC_DIRECTORY = "testdata"

	@Before
	def void onSetup() { 
    	val dir = new File(OUTPUT_DIRECTORY)
    	if(dir.exists){
          cleanFolder(dir, null, true, false)
    	}
        new File(OUTPUT_DIRECTORY).mkdir
	}
 
	def void compile(AbstractBatchCompiler batchCompiler) { 
        batchCompiler.sourcePath = XTEND_SRC_DIRECTORY
        batchCompiler.outputPath = OUTPUT_DIRECTORY
        batchCompiler.deleteTempDirectory = true
        batchCompiler.useCurrentClassLoaderAsParent = true
        batchCompiler.currentClassLoader = class.classLoader
		batchCompiler.setResourceSetProvider([|
			modelStoreProvider.get.resourceSet
		])
		batchCompiler.compile()
	}
	
	@After 
	def void onTearDown() {
       cleanFolder(new File(OUTPUT_DIRECTORY), null, true, true)
	}
 
 
	@Test
	def void testCompileTestData() {
		compile(JnarioStandaloneCompiler.create)

		val outputDir = new File(OUTPUT_DIRECTORY+"/test")
		assertEquals(7, outputDir.list[dir, name | name.endsWith(".java")].size)
		val fileContent = Files.toString(new File(outputDir, "ExampleSuite.java"), Charsets::UTF_8)
		assertTrue("Expected to be to contain others specs, but was: \n\n" + fileContent, fileContent.contains("@Contains"))
	}

}