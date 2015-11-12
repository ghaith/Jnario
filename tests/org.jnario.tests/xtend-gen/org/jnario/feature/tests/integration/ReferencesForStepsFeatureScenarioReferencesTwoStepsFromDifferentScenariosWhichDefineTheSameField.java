/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Scenario references two steps from different scenarios which define the same field")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureScenarioReferencesTwoStepsFromDifferentScenariosWhichDefineTheSameField extends ReferencesForStepsFeature {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor behaviorExecutor;
  
  CharSequence jnarioFile;
  
  CharSequence jnarioFile2;
  
  @Test
  @Order(0)
  @Named("Given a feature")
  public void _givenAFeature() {
    final StepArguments args = new StepArguments("Feature: Field inference\n\t\t\tScenario: Scenario with field colors\n\t\t\t\tval colors = <String>list  \n\t\t\t\tGiven a color red\n\t\t\t\t\tcolors += \"red\"\n\t\t\tScenario: Other scenario with field colors\n\t\t\t\tval colors = <String>list \n\t\t\t\tGiven a color green\n\t\t\t\t\tcolors += \"green\"\n\t\t\tScenario: Two steps reuse same field\n\t\t\t\t\n\t\t\t\tGiven a color green\n\t\t\t\tAnd a color red\n\t\t\t\tThen colors are red & green\n\t\t\t\tcolors => list(\"green\", \"red\")\n");
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void _thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
