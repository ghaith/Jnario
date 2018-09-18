/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.BackgroundsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Given methods from backgrounds are generated in every scenario class")
@SuppressWarnings("all")
public class BackgroundsFeatureGivenMethodsFromBackgroundsAreGeneratedInEveryScenarioClass extends BackgroundsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a feature with a background")
  public void _whenIHaveAFeatureWithABackground() {
    final StepArguments args = new StepArguments("package bootstrap\nFeature: Some feature\n\tBackground:\n\t\tGiven a user name\n\t\t\tthrow new RuntimeException()\n\tScenario: Scenario 1\n\tScenario: Scenario 2\n");
    this.jnarioFile = JnarioIterableExtensions.<String>first(args);
  }
  
  @Test
  @Order(1)
  @Named("Then every class should have a method that throws a RuntimeExeception")
  public void _thenEveryClassShouldHaveAMethodThatThrowsARuntimeExeception() {
    int _failureCount = FeatureExecutor.run(this.jnarioFile).getFailureCount();
    Assert.assertTrue("\nExpected jnarioFile.run.failureCount => 2 but"
     + "\n     jnarioFile.run.failureCount is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_failureCount)).toString()
     + "\n     jnarioFile.run is " + new org.hamcrest.StringDescription().appendValue(FeatureExecutor.run(this.jnarioFile)).toString()
     + "\n     jnarioFile is " + new org.hamcrest.StringDescription().appendValue(this.jnarioFile).toString() + "\n", Should.operator_doubleArrow(Integer.valueOf(_failureCount), Integer.valueOf(2)));
    
  }
}
