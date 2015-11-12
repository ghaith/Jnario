/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("level")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteNodeBuilderLevelSpec extends SuiteNodeBuilderSpec {
  @Subject
  public SuiteNodeBuilder subject;
  
  @Test
  @Named("level[\\\"-\\\"]        => 1")
  @Order(1)
  public void _level1() throws Exception {
    int _level = this.level("#");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(1));
    Assert.assertTrue("\nExpected level(\"#\")        => 1 but"
     + "\n     level(\"#\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"-Suite\\\"]   => 1")
  @Order(2)
  public void _levelSuite1() throws Exception {
    int _level = this.level("#Suite");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(1));
    Assert.assertTrue("\nExpected level(\"#Suite\")   => 1 but"
     + "\n     level(\"#Suite\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"--Suite\\\"]  => 2")
  @Order(3)
  public void _levelSuite2() throws Exception {
    int _level = this.level("##Suite");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(2));
    Assert.assertTrue("\nExpected level(\"##Suite\")  => 2 but"
     + "\n     level(\"##Suite\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"---Suite\\\"] => 3")
  @Order(4)
  public void _levelSuite3() throws Exception {
    int _level = this.level("###Suite");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(3));
    Assert.assertTrue("\nExpected level(\"###Suite\") => 3 but"
     + "\n     level(\"###Suite\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  public int level(@Extension final String name) {
    Suite _suite = this.suite(name);
    return this.subject.level(_suite);
  }
}
