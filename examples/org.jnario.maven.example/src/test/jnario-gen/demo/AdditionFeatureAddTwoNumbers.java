/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package demo;

import demo.AdditionFeature;
import demo.Calculator;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Add two numbers")
@SuppressWarnings("all")
public class AdditionFeatureAddTwoNumbers extends AdditionFeature {
  final Calculator calculator = new Calculator();
  
  int result;
  
  @Test
  @Order(0)
  @Named("When I entered \\\"50\\\" and \\\"70\\\"")
  public void _whenIEntered50And70() {
    final StepArguments args = new StepArguments("50", "70");
    this.result = this.calculator.add(StringConversions.toInt(JnarioIterableExtensions.<String>first(args)), StringConversions.toInt(JnarioIterableExtensions.<String>second(args)));
  }
  
  @Test
  @Order(1)
  @Named("Then the result should be \\\"120\\\"")
  public void _thenTheResultShouldBe120() {
    final StepArguments args = new StepArguments("120");
    int _int = StringConversions.toInt(JnarioIterableExtensions.<String>first(args));
    Assert.assertTrue("\nExpected result => args.first.toInt but"
     + "\n     result is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(this.result)).toString()
     + "\n     args.first.toInt is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_int)).toString()
     + "\n     args.first is " + new org.hamcrest.StringDescription().appendValue(JnarioIterableExtensions.<String>first(args)).toString()
     + "\n     args is " + new org.hamcrest.StringDescription().appendValue(args).toString() + "\n", Should.operator_doubleArrow(Integer.valueOf(this.result), Integer.valueOf(_int)));
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("And is pending [PENDING]")
  public void _andIsPending() {
    
  }
}
