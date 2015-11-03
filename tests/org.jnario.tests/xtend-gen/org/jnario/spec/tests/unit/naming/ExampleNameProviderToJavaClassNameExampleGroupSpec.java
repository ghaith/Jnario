/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toJavaClassName[ExampleGroup]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToJavaClassNameExampleGroupSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should remove all white spaces from ExampleGroup\\\'s description")
  @Order(1)
  public void _shouldRemoveAllWhiteSpacesFromExampleGroupSDescription() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe \'My Example\'");
    Assert.assertFalse("\nExpected firstJavaClassName(\"describe \'My Example\'\") should not contain \" \" but"
     + "\n     firstJavaClassName(\"describe \'My Example\'\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName).toString() + "\n", Should.<Object>should_contain(_firstJavaClassName, " "));
    
  }
  
  @Test
  @Named("should append \\\'Spec\\\' to class name")
  @Order(2)
  public void _shouldAppendSpecToClassName() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe \'My Example\'");
    Matcher<String> _endsWith = Matchers.endsWith("Spec");
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe \'My Example\'\") => endsWith(\'Spec\') but"
     + "\n     firstJavaClassName(\"describe \'My Example\'\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName).toString()
     + "\n     endsWith(\'Spec\') is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString() + "\n", Should.<String>operator_doubleArrow(_firstJavaClassName, _endsWith));
    
  }
  
  @Test
  @Named("should prepend target type name")
  @Order(3)
  public void _shouldPrependTargetTypeName() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe org.junit.Assert \'My Example\'");
    Matcher<String> _startsWith = Matchers.startsWith("Assert");
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe org.junit.Assert \'My Example\'\") => startsWith(\"Assert\") but"
     + "\n     firstJavaClassName(\"describe org.junit.Assert \'My Example\'\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName).toString()
     + "\n     startsWith(\"Assert\") is " + new org.hamcrest.StringDescription().appendValue(_startsWith).toString() + "\n", Should.<String>operator_doubleArrow(_firstJavaClassName, _startsWith));
    
  }
  
  @Test
  @Named("should prepend unresolved target type name")
  @Order(4)
  public void _shouldPrependUnresolvedTargetTypeName() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe Unresolved");
    Matcher<String> _startsWith = Matchers.startsWith("UnresolvedSpec");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_firstJavaClassName, _startsWith);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe Unresolved\")              => startsWith(\"UnresolvedSpec\") but"
     + "\n     firstJavaClassName(\"describe Unresolved\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName).toString()
     + "\n     startsWith(\"UnresolvedSpec\") is " + new org.hamcrest.StringDescription().appendValue(_startsWith).toString() + "\n", _doubleArrow);
    
    String _firstJavaClassName_1 = this.firstJavaClassName("describe java.Unresolved");
    Matcher<String> _startsWith_1 = Matchers.startsWith("UnresolvedSpec");
    boolean _doubleArrow_1 = Should.<String>operator_doubleArrow(_firstJavaClassName_1, _startsWith_1);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe java.Unresolved\")         => startsWith(\"UnresolvedSpec\") but"
     + "\n     firstJavaClassName(\"describe java.Unresolved\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName_1).toString()
     + "\n     startsWith(\"UnresolvedSpec\") is " + new org.hamcrest.StringDescription().appendValue(_startsWith_1).toString() + "\n", _doubleArrow_1);
    
    String _firstJavaClassName_2 = this.firstJavaClassName("describe Unresolved$SubClass");
    Matcher<String> _startsWith_2 = Matchers.startsWith("SubClassSpec");
    boolean _doubleArrow_2 = Should.<String>operator_doubleArrow(_firstJavaClassName_2, _startsWith_2);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe Unresolved$SubClass\")     => startsWith(\"SubClassSpec\") but"
     + "\n     firstJavaClassName(\"describe Unresolved$SubClass\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName_2).toString()
     + "\n     startsWith(\"SubClassSpec\") is " + new org.hamcrest.StringDescription().appendValue(_startsWith_2).toString() + "\n", _doubleArrow_2);
    
    String _firstJavaClassName_3 = this.firstJavaClassName("describe java.Unresolved<String>");
    Matcher<String> _startsWith_3 = Matchers.startsWith("UnresolvedSpec");
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe java.Unresolved<String>\") => startsWith(\"UnresolvedSpec\") but"
     + "\n     firstJavaClassName(\"describe java.Unresolved<String>\") is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName_3).toString()
     + "\n     startsWith(\"UnresolvedSpec\") is " + new org.hamcrest.StringDescription().appendValue(_startsWith_3).toString() + "\n", Should.<String>operator_doubleArrow(_firstJavaClassName_3, _startsWith_3));
    
  }
  
  @Test
  @Named("should convert description to camel case")
  @Order(5)
  public void _shouldConvertDescriptionToCamelCase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "describe \'my example\'", 
      "describe \'my\nexample\'", 
      "describe \'my\texample\'", 
      "describe \'my_example\'");
    final Consumer<String> _function = new Consumer<String>() {
      @Override
      public void accept(final String it) {
        String _firstJavaClassName = ExampleNameProviderToJavaClassNameExampleGroupSpec.this.firstJavaClassName(it);
        Assert.assertTrue("\nExpected firstJavaClassName(it) => \'MyExampleSpec\' but"
         + "\n     firstJavaClassName(it) is " + new org.hamcrest.StringDescription().appendValue(_firstJavaClassName).toString()
         + "\n     it is " + new org.hamcrest.StringDescription().appendValue(it).toString() + "\n", Should.<String>operator_doubleArrow(_firstJavaClassName, "MyExampleSpec"));
        
      }
    };
    _newArrayList.forEach(_function);
  }
  
  @Test
  @Named("should prefix numbers")
  @Order(6)
  public void _shouldPrefixNumbers() throws Exception {
    final String name = this.firstJavaClassName("describe \"2 Facts\"{}\r\n");
    Assert.assertTrue("\nExpected name => \'_2FactsSpec\' but"
     + "\n     name is " + new org.hamcrest.StringDescription().appendValue(name).toString() + "\n", Should.<String>operator_doubleArrow(name, "_2FactsSpec"));
    
  }
  
  @Test
  @Named("should prefix numbers in nested specs")
  @Order(7)
  public void _shouldPrefixNumbersInNestedSpecs() throws Exception {
    final String name = this.secondJavaClassName(
      "describe \"2 Facts\"{\r\n      context \"Context\"\r\n}\r\n");
    Assert.assertTrue("\nExpected name => \'_2FactsContextSpec\' but"
     + "\n     name is " + new org.hamcrest.StringDescription().appendValue(name).toString() + "\n", Should.<String>operator_doubleArrow(name, "_2FactsContextSpec"));
    
  }
  
  @Test
  @Named("should append the target operation\\\'s name and params")
  @Order(8)
  public void _shouldAppendTheTargetOperationSNameAndParams() throws Exception {
    String _secondJavaClassName = this.secondJavaClassName(
      "describe org.junit.Assert{\r\n      context assertTrue(boolean) \r\n}\r\n");
    Matcher<String> _endsWith = Matchers.endsWith("AssertTrueBooleanSpec");
    Assert.assertTrue("\nExpected secondJavaClassName(\r\n        \'\'\'\r\n        describe org.junit.Assert{\r\n              context assertTrue(boolean) \r\n        }\r\n        \'\'\') => endsWith(\'AssertTrueBooleanSpec\') but"
     + "\n     secondJavaClassName(\r\n        \'\'\'\r\n        describe org.junit.Assert{\r\n              context assertTrue(boolean) \r\n        }\r\n        \'\'\') is " + new org.hamcrest.StringDescription().appendValue(_secondJavaClassName).toString()
     + "\n     endsWith(\'AssertTrueBooleanSpec\') is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString() + "\n", Should.<String>operator_doubleArrow(_secondJavaClassName, _endsWith));
    
  }
  
  @Test
  @Named("should append the description")
  @Order(9)
  public void _shouldAppendTheDescription() throws Exception {
    String _secondJavaClassName = this.secondJavaClassName(
      "describe org.junit.Assert{\r\n  context \'assertTrue\' \r\n}\r\n");
    Matcher<String> _endsWith = Matchers.endsWith("AssertTrueSpec");
    Assert.assertTrue("\nExpected secondJavaClassName(\r\n      \'\'\'\r\n        describe org.junit.Assert{\r\n          context \'assertTrue\' \r\n        }\r\n      \'\'\') => endsWith(\'AssertTrueSpec\') but"
     + "\n     secondJavaClassName(\r\n      \'\'\'\r\n        describe org.junit.Assert{\r\n          context \'assertTrue\' \r\n        }\r\n      \'\'\') is " + new org.hamcrest.StringDescription().appendValue(_secondJavaClassName).toString()
     + "\n     endsWith(\'AssertTrueSpec\') is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString() + "\n", Should.<String>operator_doubleArrow(_secondJavaClassName, _endsWith));
    
  }
  
  @Test
  @Named("should prepend the parent ExampleGroup\\\'s name")
  @Order(10)
  public void _shouldPrependTheParentExampleGroupSName() throws Exception {
    String _secondJavaClassName = this.secondJavaClassName(
      "describe org.junit.Assert{\r\n  context assertTrue(boolean) \r\n}\r\n");
    Assert.assertTrue("\nExpected secondJavaClassName(\r\n      \'\'\'\r\n      describe org.junit.Assert{\r\n        context assertTrue(boolean) \r\n      }\r\n      \'\'\') => \'AssertAssertTrueBooleanSpec\' but"
     + "\n     secondJavaClassName(\r\n      \'\'\'\r\n      describe org.junit.Assert{\r\n        context assertTrue(boolean) \r\n      }\r\n      \'\'\') is " + new org.hamcrest.StringDescription().appendValue(_secondJavaClassName).toString() + "\n", Should.<String>operator_doubleArrow(_secondJavaClassName, "AssertAssertTrueBooleanSpec"));
    
  }
  
  public String firstJavaClassName(@Extension final CharSequence content) {
    String _plus = (content + "{}");
    Query _parse = this.parse(_plus);
    ExampleGroup _first = _parse.<ExampleGroup>first(ExampleGroup.class);
    return this.subject.toJavaClassName(_first);
  }
  
  public String secondJavaClassName(@Extension final CharSequence content) {
    String _plus = (content + "{}");
    Query _parse = this.parse(_plus);
    ExampleGroup _second = _parse.<ExampleGroup>second(ExampleGroup.class);
    return this.subject.toJavaClassName(_second);
  }
}
