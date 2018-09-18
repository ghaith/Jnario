/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with different keyword")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with reused steps with different keywords that throw an exception")
  public void _whenIHaveAScenarioWithReusedStepsWithDifferentKeywordsThatThrowAnException() {
    final StepArguments args = new StepArguments("package bootstrap\nFeature: Test\n\tScenario: TestScenario 1\n\t\tGiven step\n\t\t\tthrow new RuntimeException()\n\t\t\n\tScenario: TestScenario 2\n\t\tWhen step\n");
    this.jnarioFile = JnarioIterableExtensions.<String>first(args);
  }
  
  @Test
  @Order(1)
  @Named("Then the number of failures should be \\\"2\\\"")
  public void _thenTheNumberOfFailuresShouldBe2() {
    final StepArguments args = new StepArguments("2");
    int _failureCount = FeatureExecutor.run(this.jnarioFile).getFailureCount();
    int _int = StringConversions.toInt(JnarioIterableExtensions.<String>first(args));
    Should.operator_doubleArrow(Integer.valueOf(_failureCount), Integer.valueOf(_int));
  }
}
