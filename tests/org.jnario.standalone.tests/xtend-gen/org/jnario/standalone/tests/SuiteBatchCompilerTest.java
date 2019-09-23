/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.standalone.tests;

import com.google.common.base.Charsets;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.compiler.AbstractBatchCompiler;
import org.jnario.compiler.JnarioStandaloneCompiler;
import org.jnario.jnario.test.util.ExtendedSuiteInjectorProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExtendedSuiteInjectorProvider.class)
@SuppressWarnings("all")
public class SuiteBatchCompilerTest {
  @Inject
  private Provider<ModelStore> modelStoreProvider;
  
  private static String OUTPUT_DIRECTORY = "test-result";
  
  private static String XTEND_SRC_DIRECTORY = "testdata";
  
  @Before
  public void onSetup() {
    try {
      final File dir = new File(SuiteBatchCompilerTest.OUTPUT_DIRECTORY);
      boolean _exists = dir.exists();
      if (_exists) {
        Files.cleanFolder(dir, null, true, false);
      }
      new File(SuiteBatchCompilerTest.OUTPUT_DIRECTORY).mkdir();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void compile(final AbstractBatchCompiler batchCompiler) {
    batchCompiler.setSourcePath(SuiteBatchCompilerTest.XTEND_SRC_DIRECTORY);
    batchCompiler.setOutputPath(SuiteBatchCompilerTest.OUTPUT_DIRECTORY);
    batchCompiler.setDeleteTempDirectory(true);
    batchCompiler.setUseCurrentClassLoaderAsParent(true);
    batchCompiler.setCurrentClassLoader(this.getClass().getClassLoader());
    final Provider<ResourceSet> _function = new Provider<ResourceSet>() {
      @Override
      public ResourceSet get() {
        return SuiteBatchCompilerTest.this.modelStoreProvider.get().getResourceSet();
      }
    };
    batchCompiler.setResourceSetProvider(_function);
    batchCompiler.compile();
  }
  
  @After
  public void onTearDown() {
    try {
      File _file = new File(SuiteBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file, null, true, true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileTestData() {
    try {
      this.compile(JnarioStandaloneCompiler.create());
      final File outputDir = new File((SuiteBatchCompilerTest.OUTPUT_DIRECTORY + "/test"));
      final FilenameFilter _function = new FilenameFilter() {
        @Override
        public boolean accept(final File dir, final String name) {
          return name.endsWith(".java");
        }
      };
      Assert.assertEquals(7, ((List<String>)Conversions.doWrapArray(outputDir.list(_function))).size());
      File _file = new File(outputDir, "ExampleSuite.java");
      final String fileContent = com.google.common.io.Files.toString(_file, Charsets.UTF_8);
      Assert.assertTrue(("Expected to be to contain others specs, but was: \n\n" + fileContent), fileContent.contains("@Contains"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
