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
import org.jnario.spec.spec.After;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toMethodName[After]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToMethodNameAfterSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert after description to camel case starting in lowercase")
  @Order(1)
  public void _shouldConvertAfterDescriptionToCamelCaseStartingInLowercase() throws Exception {
    final Consumer<String> _function = new Consumer<String>() {
      @Override
      public void accept(final String it) {
        String _firstMethodName = ExampleNameProviderToMethodNameAfterSpec.this.firstMethodName(it);
        Assert.assertTrue("\nExpected firstMethodName => \'_myExample\' but"
         + "\n     firstMethodName is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "_myExample"));
        
      }
    };
    CollectionLiterals.<String>newArrayList(
      "after \'my example\'", 
      "after \'my\nexample\'", 
      "after \'my\texample\'", 
      "after \'my_example\'").forEach(_function);
  }
  
  @Test
  @Named("should use after as default name")
  @Order(2)
  public void _shouldUseAfterAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("after{}");
    Assert.assertTrue("\nExpected firstMethodName(\"after{}\") => \"after\" but"
     + "\n     firstMethodName(\"after{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "after"));
    
  }
  
  @Test
  @Named("should use afterAll as default name")
  @Order(3)
  public void _shouldUseAfterAllAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("after all{}");
    Assert.assertTrue("\nExpected firstMethodName(\"after all{}\") => \"afterAll\" but"
     + "\n     firstMethodName(\"after all{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "afterAll"));
    
  }
  
  @Test
  @Named("should enumerate after without description")
  @Order(4)
  public void _shouldEnumerateAfterWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("after{}\n                 after{}");
    Assert.assertTrue("\nExpected secondMethodName(\"after{}\n                 after{}\") => \"after2\" but"
     + "\n     secondMethodName(\"after{}\n                 after{}\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "after2"));
    
  }
  
  @Test
  @Named("should enumerate nested after without description")
  @Order(5)
  public void _shouldEnumerateNestedAfterWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "after{}\n                 context{\n                   after{}\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\n                \"after{}\n                 context{\n                   after{}\n                 }\") => \"after2\" but"
     + "\n     secondMethodName(\n                \"after{}\n                 context{\n                   after{}\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "after2"));
    
  }
  
  @Test
  @Named("should enumerate nested after all without description")
  @Order(6)
  public void _shouldEnumerateNestedAfterAllWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "after all{}\n                 context{\n                   after all{}\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\n                \"after all{}\n                 context{\n                   after all{}\n                 }\") => \"afterAll2\" but"
     + "\n     secondMethodName(\n                \"after all{}\n                 context{\n                   after all{}\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "afterAll2"));
    
  }
  
  @Test
  @Named("nested after and after all keep their default name")
  @Order(7)
  public void _nestedAfterAndAfterAllKeepTheirDefaultName() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "after{}\n                 context{\n                   after all{}\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\n                \"after{}\n                 context{\n                   after all{}\n                 }\") => \"afterAll\" but"
     + "\n     secondMethodName(\n                \"after{}\n                 context{\n                   after all{}\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.operator_doubleArrow(_secondMethodName, "afterAll"));
    
  }
  
  public String firstMethodName(@Extension final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{" + content) + "}");
      _xblockexpression = this.subject.toMethodName(this.parse(contentWithContext).<After>first(After.class));
    }
    return _xblockexpression;
  }
  
  public String secondMethodName(@Extension final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{" + content) + "}");
      _xblockexpression = this.subject.toMethodName(this.parse(contentWithContext).<After>second(After.class));
    }
    return _xblockexpression;
  }
}
