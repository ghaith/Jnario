/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.jnario.test.util.Suites;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SuiteTestCreator.class)
@Named("Suite")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExecutableIsPendingSuiteSpec extends ExecutableIsPendingSpec {
  @Inject
  XtextResource resource;
  
  @Test
  @Named("suiteWith[\\\"A suite\\\", specReference[pendingExampleGroup]].isPending should be true")
  @Order(1)
  public void _suiteWithASuiteSpecReferencePendingExampleGroupIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = this.suiteWith("A suite", Suites.specReference(Specs.pendingExampleGroup())).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected suiteWith(\"A suite\", specReference(pendingExampleGroup)).isPending should be true but"
     + "\n     suiteWith(\"A suite\", specReference(pendingExampleGroup)).isPending is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     suiteWith(\"A suite\", specReference(pendingExampleGroup)) is " + new org.hamcrest.StringDescription().appendValue(this.suiteWith("A suite", Suites.specReference(Specs.pendingExampleGroup()))).toString()
     + "\n     specReference(pendingExampleGroup) is " + new org.hamcrest.StringDescription().appendValue(Suites.specReference(Specs.pendingExampleGroup())).toString()
     + "\n     pendingExampleGroup is " + new org.hamcrest.StringDescription().appendValue(Specs.pendingExampleGroup()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("suiteWith[\\\"A suite\\\", specReference[exampleGroupWith[example[\\\"passing\\\"]]]].isPending should be false")
  @Order(2)
  public void _suiteWithASuiteSpecReferenceExampleGroupWithExamplePassingIsPendingShouldBeFalse() throws Exception {
    boolean _isPending = this.suiteWith("A suite", Suites.specReference(Specs.exampleGroupWith(Specs.example("passing")))).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected suiteWith(\"A suite\", specReference(exampleGroupWith(example(\"passing\")))).isPending should be false but"
     + "\n     suiteWith(\"A suite\", specReference(exampleGroupWith(example(\"passing\")))).isPending is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     suiteWith(\"A suite\", specReference(exampleGroupWith(example(\"passing\")))) is " + new org.hamcrest.StringDescription().appendValue(this.suiteWith("A suite", Suites.specReference(Specs.exampleGroupWith(Specs.example("passing"))))).toString()
     + "\n     specReference(exampleGroupWith(example(\"passing\"))) is " + new org.hamcrest.StringDescription().appendValue(Suites.specReference(Specs.exampleGroupWith(Specs.example("passing")))).toString()
     + "\n     exampleGroupWith(example(\"passing\")) is " + new org.hamcrest.StringDescription().appendValue(Specs.exampleGroupWith(Specs.example("passing"))).toString()
     + "\n     example(\"passing\") is " + new org.hamcrest.StringDescription().appendValue(Specs.example("passing")).toString() + "\n", _should_be);
    
  }
  
  public Suite suiteWith(@Extension final String name, @Extension final SpecReference... references) {
    Suite _xblockexpression = null;
    {
      final Suite result = Suites.suiteWith(name, references);
      EList<EObject> _contents = this.resource.getContents();
      _contents.add(result);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
