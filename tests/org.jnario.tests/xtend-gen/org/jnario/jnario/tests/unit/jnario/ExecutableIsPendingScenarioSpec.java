/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Scenario")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExecutableIsPendingScenarioSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("scenario[\\\"Without steps\\\"].isPending[] should be true")
  @Order(1)
  public void _scenarioWithoutStepsIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.scenario("Without steps").isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected scenario(\"Without steps\").isPending() should be true but"
     + "\n     scenario(\"Without steps\").isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenario(\"Without steps\") is " + new org.hamcrest.StringDescription().appendValue(Features.scenario("Without steps")).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("scenarioWith[stepWithoutImplementation].isPending[] should be true")
  @Order(2)
  public void _scenarioWithStepWithoutImplementationIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.scenarioWith(Features.stepWithoutImplementation()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected scenarioWith(stepWithoutImplementation).isPending() should be true but"
     + "\n     scenarioWith(stepWithoutImplementation).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenarioWith(stepWithoutImplementation) is " + new org.hamcrest.StringDescription().appendValue(Features.scenarioWith(Features.stepWithoutImplementation())).toString()
     + "\n     stepWithoutImplementation is " + new org.hamcrest.StringDescription().appendValue(Features.stepWithoutImplementation()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("scenarioWith[implementedStep].isPending[] should be false")
  @Order(3)
  public void _scenarioWithImplementedStepIsPendingShouldBeFalse() throws Exception {
    boolean _isPending = Features.scenarioWith(Features.implementedStep()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected scenarioWith(implementedStep).isPending() should be false but"
     + "\n     scenarioWith(implementedStep).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenarioWith(implementedStep) is " + new org.hamcrest.StringDescription().appendValue(Features.scenarioWith(Features.implementedStep())).toString()
     + "\n     implementedStep is " + new org.hamcrest.StringDescription().appendValue(Features.implementedStep()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("scenarioWith[stepWithoutImplementation, implementedStep].isPending[] should be true")
  @Order(4)
  public void _scenarioWithStepWithoutImplementationImplementedStepIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.scenarioWith(Features.stepWithoutImplementation(), Features.implementedStep()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected scenarioWith(stepWithoutImplementation, implementedStep).isPending() should be true but"
     + "\n     scenarioWith(stepWithoutImplementation, implementedStep).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenarioWith(stepWithoutImplementation, implementedStep) is " + new org.hamcrest.StringDescription().appendValue(Features.scenarioWith(Features.stepWithoutImplementation(), Features.implementedStep())).toString()
     + "\n     stepWithoutImplementation is " + new org.hamcrest.StringDescription().appendValue(Features.stepWithoutImplementation()).toString()
     + "\n     implementedStep is " + new org.hamcrest.StringDescription().appendValue(Features.implementedStep()).toString() + "\n", _should_be);
    
  }
}
