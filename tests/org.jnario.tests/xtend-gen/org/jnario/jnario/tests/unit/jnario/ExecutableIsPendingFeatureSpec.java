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

@Named("Feature")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExecutableIsPendingFeatureSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("feature[\\\"Without scenarios and without background\\\"].isPending[] should be true")
  @Order(1)
  public void _featureWithoutScenariosAndWithoutBackgroundIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.feature("Without scenarios and without background").isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected feature(\"Without scenarios and without background\").isPending() should be true but"
     + "\n     feature(\"Without scenarios and without background\").isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     feature(\"Without scenarios and without background\") is " + new org.hamcrest.StringDescription().appendValue(Features.feature("Without scenarios and without background")).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWith[implementedScenario].isPending[] should be false")
  @Order(2)
  public void _featureWithImplementedScenarioIsPendingShouldBeFalse() throws Exception {
    boolean _isPending = Features.featureWith(Features.implementedScenario()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected featureWith(implementedScenario).isPending() should be false but"
     + "\n     featureWith(implementedScenario).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWith(implementedScenario) is " + new org.hamcrest.StringDescription().appendValue(Features.featureWith(Features.implementedScenario())).toString()
     + "\n     implementedScenario is " + new org.hamcrest.StringDescription().appendValue(Features.implementedScenario()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWith[scenarioWithoutSteps, implementedScenario].isPending[] should be true")
  @Order(3)
  public void _featureWithScenarioWithoutStepsImplementedScenarioIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.featureWith(Features.scenarioWithoutSteps(), Features.implementedScenario()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected featureWith(scenarioWithoutSteps, implementedScenario).isPending() should be true but"
     + "\n     featureWith(scenarioWithoutSteps, implementedScenario).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWith(scenarioWithoutSteps, implementedScenario) is " + new org.hamcrest.StringDescription().appendValue(Features.featureWith(Features.scenarioWithoutSteps(), Features.implementedScenario())).toString()
     + "\n     scenarioWithoutSteps is " + new org.hamcrest.StringDescription().appendValue(Features.scenarioWithoutSteps()).toString()
     + "\n     implementedScenario is " + new org.hamcrest.StringDescription().appendValue(Features.implementedScenario()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackground[implementedBackground].isPending[] should be true")
  @Order(4)
  public void _featureWithBackgroundImplementedBackgroundIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.featureWithBackground(Features.implementedBackground()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected featureWithBackground(implementedBackground).isPending() should be true but"
     + "\n     featureWithBackground(implementedBackground).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackground(implementedBackground) is " + new org.hamcrest.StringDescription().appendValue(Features.featureWithBackground(Features.implementedBackground())).toString()
     + "\n     implementedBackground is " + new org.hamcrest.StringDescription().appendValue(Features.implementedBackground()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackground[backgroundWithoutSteps].isPending[] should be true")
  @Order(5)
  public void _featureWithBackgroundBackgroundWithoutStepsIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.featureWithBackground(Features.backgroundWithoutSteps()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected featureWithBackground(backgroundWithoutSteps).isPending() should be true but"
     + "\n     featureWithBackground(backgroundWithoutSteps).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackground(backgroundWithoutSteps) is " + new org.hamcrest.StringDescription().appendValue(Features.featureWithBackground(Features.backgroundWithoutSteps())).toString()
     + "\n     backgroundWithoutSteps is " + new org.hamcrest.StringDescription().appendValue(Features.backgroundWithoutSteps()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackgroundAndScenario[backgroundWithoutSteps, implementedScenario].isPending[] should be true")
  @Order(6)
  public void _featureWithBackgroundAndScenarioBackgroundWithoutStepsImplementedScenarioIsPendingShouldBeTrue() throws Exception {
    boolean _isPending = Features.featureWithBackgroundAndScenario(Features.backgroundWithoutSteps(), Features.implementedScenario()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario).isPending() should be true but"
     + "\n     featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario) is " + new org.hamcrest.StringDescription().appendValue(Features.featureWithBackgroundAndScenario(Features.backgroundWithoutSteps(), Features.implementedScenario())).toString()
     + "\n     backgroundWithoutSteps is " + new org.hamcrest.StringDescription().appendValue(Features.backgroundWithoutSteps()).toString()
     + "\n     implementedScenario is " + new org.hamcrest.StringDescription().appendValue(Features.implementedScenario()).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackgroundAndScenario[implementedBackground, implementedScenario].isPending[] should be false")
  @Order(7)
  public void _featureWithBackgroundAndScenarioImplementedBackgroundImplementedScenarioIsPendingShouldBeFalse() throws Exception {
    boolean _isPending = Features.featureWithBackgroundAndScenario(Features.implementedBackground(), Features.implementedScenario()).isPending();
    boolean _should_be = Should.should_be(Boolean.valueOf(_isPending), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected featureWithBackgroundAndScenario(implementedBackground, implementedScenario).isPending() should be false but"
     + "\n     featureWithBackgroundAndScenario(implementedBackground, implementedScenario).isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackgroundAndScenario(implementedBackground, implementedScenario) is " + new org.hamcrest.StringDescription().appendValue(Features.featureWithBackgroundAndScenario(Features.implementedBackground(), Features.implementedScenario())).toString()
     + "\n     implementedBackground is " + new org.hamcrest.StringDescription().appendValue(Features.implementedBackground()).toString()
     + "\n     implementedScenario is " + new org.hamcrest.StringDescription().appendValue(Features.implementedScenario()).toString() + "\n", _should_be);
    
  }
}
