/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Before;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toMethodName[Before]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToMethodNameBeforeSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert before description to camel case starting in lowercase")
  @Order(1)
  public void _shouldConvertBeforeDescriptionToCamelCaseStartingInLowercase() throws Exception {
    final Consumer<String> _function = new Consumer<String>() {
      @Override
      public void accept(final String it) {
        String _firstMethodName = ExampleNameProviderToMethodNameBeforeSpec.this.firstMethodName(it);
        Assert.assertTrue("\nExpected firstMethodName => \'_myExample\' but"
         + "\n     firstMethodName is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "_myExample"));
        
      }
    };
    CollectionLiterals.<String>newArrayList(
      "before \'my example\'", 
      "before \'my\nexample\'", 
      "before \'my\texample\'", 
      "before \'my_example\'").forEach(_function);
  }
  
  @Test
  @Named("should use before as default name")
  @Order(2)
  public void _shouldUseBeforeAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("before{}");
    Assert.assertTrue("\nExpected firstMethodName(\"before{}\") => \"before\" but"
     + "\n     firstMethodName(\"before{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "before"));
    
  }
  
  @Test
  @Named("should use beforeAll as default name")
  @Order(3)
  public void _shouldUseBeforeAllAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("before all{}");
    Assert.assertTrue("\nExpected firstMethodName(\"before all{}\") => \"beforeAll\" but"
     + "\n     firstMethodName(\"before all{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "beforeAll"));
    
  }
  
  @Test
  @Named("should enumerate before without description")
  @Order(4)
  public void _shouldEnumerateBeforeWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("before{}\n                 before{}");
    Assert.assertTrue("\nExpected secondMethodName(\"before{}\n                 before{}\") => \"before2\" but"
     + "\n     secondMethodName(\"before{}\n                 before{}\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "before2"));
    
  }
  
  @Test
  @Named("should enumerate nested before without description")
  @Order(5)
  public void _shouldEnumerateNestedBeforeWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "before{}\n                 context{\n                   before{}\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\n                \"before{}\n                 context{\n                   before{}\n                 }\") => \"before2\" but"
     + "\n     secondMethodName(\n                \"before{}\n                 context{\n                   before{}\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "before2"));
    
  }
  
  @Test
  @Named("should enumerate nested before all without description")
  @Order(6)
  public void _shouldEnumerateNestedBeforeAllWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "before all{}\n                 context{\n                   before all{}\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\n                \"before all{}\n                 context{\n                   before all{}\n                 }\") => \"beforeAll2\" but"
     + "\n     secondMethodName(\n                \"before all{}\n                 context{\n                   before all{}\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "beforeAll2"));
    
  }
  
  @Test
  @Named("should keep default name of nested before and before all")
  @Order(7)
  public void _shouldKeepDefaultNameOfNestedBeforeAndBeforeAll() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "before{}\n                 context{\n                   before all{}\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\n                \"before{}\n                 context{\n                   before all{}\n                 }\") => \"beforeAll\" but"
     + "\n     secondMethodName(\n                \"before{}\n                 context{\n                   before all{}\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "beforeAll"));
    
  }
  
  @Test
  @Named("should escape invalid names")
  @Order(8)
  public void _shouldEscapeInvalidNames() throws Exception {
    String _firstMethodName = this.firstMethodName("before \'null\'{}");
    Assert.assertTrue("\nExpected firstMethodName(\"before \'null\'{}\") => \"_null\" but"
     + "\n     firstMethodName(\"before \'null\'{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "_null"));
    
  }
  
  public String firstMethodName(@Extension final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{" + content) + "}");
      _xblockexpression = this.subject.toMethodName(this.parse(contentWithContext).<Before>first(Before.class));
    }
    return _xblockexpression;
  }
  
  public String secondMethodName(@Extension final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{" + content) + "}");
      _xblockexpression = this.subject.toMethodName(this.parse(contentWithContext).<Before>second(Before.class));
    }
    return _xblockexpression;
  }
}
