/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.validation;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Assertion;
import org.jnario.ExampleCell;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.Resources;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.test.tools.JnarioTestTools;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("SpecJavaValidator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecJavaValidatorSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore modelStore;
  
  @Test
  @Ignore
  @Named("assert statement must be boolean [PENDING]")
  @Order(1)
  public void _assertStatementMustBeBoolean() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tfact \"invalid assert\"{\r\n\t\t\t\t\tassert 1\r\n\t\t\t\t}\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(Assertion.class);
    validationResult.assertErrorContains("cannot convert from int to boolean");
  }
  
  @Test
  @Ignore
  @Named("duplicate names of example methods are ignored [PENDING]")
  @Order(2)
  public void _duplicateNamesOfExampleMethodsAreIgnored() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tfact \"a***\" \r\n      \t\t\tfact \"a???\" \r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    JnarioTestTools.assertOKWithMessage(validationResult);
  }
  
  @Test
  @Named("specs without description but different types are OK")
  @Order(3)
  public void _specsWithoutDescriptionButDifferentTypesAreOK() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t  package bootstrap\r\n\r\n\t\t  describe \"something\"{\r\n\t\t\t  describe String{\r\n\t\t\t  }\r\n\t\t\t  describe Integer{\r\n\t\t\t  }\t\r\n\t\t  }\r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    JnarioTestTools.assertOKWithMessage(validationResult);
  }
  
  @Test
  @Named("specs with different method contexts are OK")
  @Order(4)
  public void _specsWithDifferentMethodContextsAreOK() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\timport java.util.Stack\r\n\t\t  \tdescribe Stack<E>{\r\n\t\t\t\tcontext push(E){\r\n\t\t\t\t}\r\n\t\t\t\tcontext push{\r\n\t\t\t\t}\r\n\t\t\t}  \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    JnarioTestTools.assertOKWithMessage(validationResult);
  }
  
  @Test
  @Ignore
  @Named("specs without description and same types are not OK [PENDING]")
  @Order(5)
  public void _specsWithoutDescriptionAndSameTypesAreNotOK() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t  package bootstrap\r\n\r\n\t\t  describe \"something\"{\r\n\t\t\t  describe String{\r\n\t\t\t  }\r\n\t\t\t  describe String{\r\n\t\t\t  }\t\r\n\t\t  }\r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    validationResult.assertErrorContains("The spec \'String\' is already defined.");
  }
  
  @Test
  @Ignore
  @Named("example table values must not be void [PENDING]")
  @Order(6)
  public void _exampleTableValuesMustNotBeVoid() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tdef examples{\r\n\t\t\t\t\t| a         |\r\n\t\t\t\t\t| throw new Exception() |\r\n\t\t\t\t}\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleCell.class);
    validationResult.assertErrorContains("void");
  }
  
  @Test
  @Ignore
  @Named("example table rows must have the same size [PENDING]")
  @Order(7)
  public void _exampleTableRowsMustHaveTheSameSize() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tdef examples{\r\n\t\t\t\t\t| a | b |\r\n\t\t\t\t\t| 0 |\r\n\t\t\t\t}\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleTable.class);
    validationResult.assertErrorContains("number");
  }
  
  @Test
  @Named("should can compare objects of the same type")
  @Order(8)
  public void _shouldCanCompareObjectsOfTheSameType() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tfact 1 => 1\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(XBinaryOperation.class);
    JnarioTestTools.assertOKWithMessage(validationResult);
  }
  
  @Test
  @Named("should can compare object with a class")
  @Order(9)
  public void _shouldCanCompareObjectWithAClass() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tfact 1 => typeof(int)\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(XBinaryOperation.class);
    JnarioTestTools.assertOKWithMessage(validationResult);
  }
  
  @Test
  @Named("should can compare with matcher")
  @Order(10)
  public void _shouldCanCompareWithMatcher() throws Exception {
    this.modelStore.parseSpec(
      "\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tfact 1 => notNullValue\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(XBinaryOperation.class);
    JnarioTestTools.assertOKWithMessage(validationResult);
  }
  
  public AssertableDiagnostics validate(@Extension final Class<? extends EObject> type) {
    XtextResourceSet _resourceSet = this.modelStore.getResourceSet();
    Resources.addContainerStateAdapter(_resourceSet);
    Query _query = Query.query(this.modelStore);
    final EObject target = _query.first(type);
    return RegisteredValidatorTester.validateObj(target);
  }
}
