/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.Arrays;
import java.util.function.Consumer;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToJavaClassNameSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toJavaClassName")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteClassNameProviderToJavaClassNameSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  public ExampleTable<SuiteClassNameProviderToJavaClassNameSpecExamples> _initSuiteClassNameProviderToJavaClassNameSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("name", "expectedClassName"), 
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  Arrays.asList("null", "null"), null, null),
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  Arrays.asList("\"#\"", "null"), _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell2(), null),
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  Arrays.asList("\"#my Suite\"", "\"MySuiteSuite\""), _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell4(), _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell5()),
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"MySuiteSuite\""), _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell6(), _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell7())
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderToJavaClassNameSpecExamples> examples = _initSuiteClassNameProviderToJavaClassNameSpecExamples();
  
  public Object _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell0() {
    return null;
  }
  
  public Object _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell1() {
    return null;
  }
  
  public String _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell2() {
    return "#";
  }
  
  public Object _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell3() {
    return null;
  }
  
  public String _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell4() {
    return "#my Suite";
  }
  
  public String _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell5() {
    return "MySuiteSuite";
  }
  
  public String _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell6() {
    return "##My Suite \n with multiple lines";
  }
  
  public String _initSuiteClassNameProviderToJavaClassNameSpecExamplesCell7() {
    return "MySuiteSuite";
  }
  
  @Test
  @Named("examples.forEach[subject.toJavaClassName[suite[name]] => expectedClassName]")
  @Order(1)
  public void _examplesForEachSubjectToJavaClassNameSuiteNameExpectedClassName() throws Exception {
    final Consumer<SuiteClassNameProviderToJavaClassNameSpecExamples> _function = new Consumer<SuiteClassNameProviderToJavaClassNameSpecExamples>() {
      @Override
      public void accept(final SuiteClassNameProviderToJavaClassNameSpecExamples it) {
        String _name = it.getName();
        Suite _suite = Suites.suite(_name);
        String _javaClassName = SuiteClassNameProviderToJavaClassNameSpec.this.subject.toJavaClassName(_suite);
        String _expectedClassName = it.getExpectedClassName();
        Assert.assertTrue("\nExpected subject.toJavaClassName(suite(name)) => expectedClassName but"
         + "\n     subject.toJavaClassName(suite(name)) is " + new org.hamcrest.StringDescription().appendValue(_javaClassName).toString()
         + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(SuiteClassNameProviderToJavaClassNameSpec.this.subject).toString()
         + "\n     suite(name) is " + new org.hamcrest.StringDescription().appendValue(_suite).toString()
         + "\n     name is " + new org.hamcrest.StringDescription().appendValue(_name).toString()
         + "\n     expectedClassName is " + new org.hamcrest.StringDescription().appendValue(_expectedClassName).toString() + "\n", Should.<String>operator_doubleArrow(_javaClassName, _expectedClassName));
        
      }
    };
    this.examples.forEach(_function);
  }
}
