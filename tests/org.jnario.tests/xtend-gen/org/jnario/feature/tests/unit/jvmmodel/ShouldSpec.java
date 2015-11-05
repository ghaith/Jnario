package org.jnario.feature.tests.unit.jvmmodel;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("Should")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ShouldSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Shows correct failure message in reused steps")
  @Order(1)
  public void _showsCorrectFailureMessageInReusedSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("");
    _builder.newLine();
    _builder.append("Feature: Failure messages when reusing steps");
    _builder.newLine();
    _builder.append("");
    _builder.newLine();
    _builder.append("	Scenario: name");
    _builder.newLine();
    _builder.append("	");
    _builder.newLine();
    _builder.append("		Given a step");
    _builder.newLine();
    _builder.append("			try{");
    _builder.newLine();
    _builder.append("				1 + 1 => 3");
    _builder.newLine();
    _builder.append("			}catch(AssertionError e){");
    _builder.newLine();
    _builder.append("				e.message should contain \"1 + 1 => 3\"");
    _builder.newLine();
    _builder.append("			}");
    _builder.newLine();
    _builder.append("			");
    _builder.newLine();
    _builder.append("	Scenario: name 2		");
    _builder.newLine();
    _builder.append("		Given a step");
    _builder.newLine();
    _builder.append("		");
    _builder.newLine();
    
    this._behaviorExecutor.executesSuccessfully(
      _builder.toString());
  }
}
