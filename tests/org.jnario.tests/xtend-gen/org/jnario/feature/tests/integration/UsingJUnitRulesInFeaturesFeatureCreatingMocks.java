package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Creating Mocks")
@SuppressWarnings("all")
public class UsingJUnitRulesInFeaturesFeatureCreatingMocks {
  @Test
  @Order(0)
  @Named("When I have a feature which creates a mock")
  public void whenIHaveAFeatureWhichCreatesAMock() {
    StepArguments _stepArguments = new StepArguments("package demo\nimport java.util.Stack\nFeature:  Mocking\n\n\tScenario: Create a mock in a Feature\n\t\tvar Stack x\n\t\tGiven a field with a mock\n\t\t\tx = mock(Stack)\n\t\tThen the mock should be created\n\t\t\tx => typeof(Stack)");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
  
  CharSequence jnarioFile;
}