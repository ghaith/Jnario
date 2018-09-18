/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("ExampleGroup")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExecutableIsPendingExampleGroupSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("exampleGroupWith[pendingExample].isPending should be true")
  @Order(1)
  public void _exampleGroupWithPendingExampleIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Specs.exampleGroupWith(Specs.pendingExample()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected exampleGroupWith(pendingExample).isPending should be true but"
     + "\n     exampleGroupWith(pendingExample).isPending is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(pendingExample) is " + new org.hamcrest.StringDescription().appendValue(Specs.exampleGroupWith(Specs.pendingExample())).toString()
     + "\n     pendingExample is " + new org.hamcrest.StringDescription().appendValue(Specs.pendingExample()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("exampleGroupWith[implementedExample].isPending should be false")
  @Order(2)
  public void _exampleGroupWithImplementedExampleIsPendingShouldBeFalse() throws Exception {
    boolean _isPending = Specs.exampleGroupWith(Specs.implementedExample()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected exampleGroupWith(implementedExample).isPending should be false but"
     + "\n     exampleGroupWith(implementedExample).isPending is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(implementedExample) is " + new org.hamcrest.StringDescription().appendValue(Specs.exampleGroupWith(Specs.implementedExample())).toString()
     + "\n     implementedExample is " + new org.hamcrest.StringDescription().appendValue(Specs.implementedExample()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("exampleGroupWith[pendingExample, implementedExample].isPending should be true")
  @Order(3)
  public void _exampleGroupWithPendingExampleImplementedExampleIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Specs.exampleGroupWith(Specs.pendingExample(), Specs.implementedExample()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected exampleGroupWith(pendingExample, implementedExample).isPending should be true but"
     + "\n     exampleGroupWith(pendingExample, implementedExample).isPending is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(pendingExample, implementedExample) is " + new org.hamcrest.StringDescription().appendValue(Specs.exampleGroupWith(Specs.pendingExample(), Specs.implementedExample())).toString()
     + "\n     pendingExample is " + new org.hamcrest.StringDescription().appendValue(Specs.pendingExample()).toString()
     + "\n     implementedExample is " + new org.hamcrest.StringDescription().appendValue(Specs.implementedExample()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("exampleGroupWith[pendingExampleGroup].isPending should be true")
  @Order(4)
  public void _exampleGroupWithPendingExampleGroupIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Specs.exampleGroupWith(Specs.pendingExampleGroup()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected exampleGroupWith(pendingExampleGroup).isPending should be true but"
     + "\n     exampleGroupWith(pendingExampleGroup).isPending is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(pendingExampleGroup) is " + new org.hamcrest.StringDescription().appendValue(Specs.exampleGroupWith(Specs.pendingExampleGroup())).toString()
     + "\n     pendingExampleGroup is " + new org.hamcrest.StringDescription().appendValue(Specs.pendingExampleGroup()).toString() + "\n", _should_be);
    
  }
}
