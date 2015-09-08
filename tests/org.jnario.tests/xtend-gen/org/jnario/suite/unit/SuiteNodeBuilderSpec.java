/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SuiteNodeBuilderLevelSpec;
import org.jnario.suite.unit.SuiteNodeBuilderParentSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteNodeBuilderParentSpec.class, SuiteNodeBuilderLevelSpec.class })
@CreateWith(SuiteTestCreator.class)
@Named("SuiteNodeBuilder")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteNodeBuilderSpec {
  @Extension
  @Inject
  public ModelStore m;
  
  public Resource parseSuite(final CharSequence s) {
    Resource _xblockexpression = null;
    {
      final String input = (("package test\r\n\r\n" + s) + "\r\n");
      _xblockexpression = this.m.parseSuite(input);
    }
    return _xblockexpression;
  }
  
  public List<Suite> suites(final String... names) {
    final Function1<String, Suite> _function = new Function1<String, Suite>() {
      @Override
      public Suite apply(final String it) {
        return SuiteNodeBuilderSpec.this.suite(it);
      }
    };
    return ListExtensions.<String, Suite>map(((List<String>)Conversions.doWrapArray(names)), _function);
  }
  
  public Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = SuiteFactory.eINSTANCE.createSuite();
      suite.setName(name);
      _xblockexpression = suite;
    }
    return _xblockexpression;
  }
}
