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
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toMethodName[Example]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToMethodNameExampleSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("Don\\\'t use single underline as a java identifiert")
  @Order(1)
  public void _donTUseSingleUnderlineAsAJavaIdentifiert() throws Exception {
    String _firstMethodName = this.firstMethodName("[]");
    Assert.assertTrue("\nExpected firstMethodName(\"[]\") => \"__\" but"
     + "\n     firstMethodName(\"[]\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "__"));
    
  }
  
  @Test
  @Named("converts method description to camel case starting in lowercase")
  @Order(2)
  public void _convertsMethodDescriptionToCamelCaseStartingInLowercase() throws Exception {
    final Consumer<String> _function = new Consumer<String>() {
      @Override
      public void accept(final String it) {
        String _firstMethodName = ExampleNameProviderToMethodNameExampleSpec.this.firstMethodName(it);
        Assert.assertTrue("\nExpected firstMethodName(it) => \'_myExample\' but"
         + "\n     firstMethodName(it) is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString()
         + "\n     it is " + new org.hamcrest.StringDescription().appendValue(it).toString() + "\n", Should.operator_doubleArrow(_firstMethodName, "_myExample"));
        
      }
    };
    CollectionLiterals.<String>newArrayList(
      "\'my example\'", 
      "\'my\nexample\'", 
      "\'my\texample\'", 
      "\'my_example\'").forEach(_function);
  }
  
  @Test
  @Named("shortens method name to 250 chars")
  @Order(3)
  public void _shortensMethodNameTo250Chars() throws Exception {
    int _length = this.firstMethodName(this.nameOfLength(251)).length();
    Assert.assertTrue("\nExpected firstMethodName(nameOfLength(251)).length => 250 but"
     + "\n     firstMethodName(nameOfLength(251)).length is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_length)).toString()
     + "\n     firstMethodName(nameOfLength(251)) is " + new org.hamcrest.StringDescription().appendValue(this.firstMethodName(this.nameOfLength(251))).toString()
     + "\n     nameOfLength(251) is " + new org.hamcrest.StringDescription().appendValue(this.nameOfLength(251)).toString() + "\n", Should.operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(250)));
    
  }
  
  public String nameOfLength(@Extension final int i) {
    String _xblockexpression = null;
    {
      String result = "";
      IntegerRange _upTo = new IntegerRange(0, i);
      for (final Integer j : _upTo) {
        result = (result + "a");
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public String firstMethodName(@Extension final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{ fact " + content) + "}");
      _xblockexpression = this.subject.toMethodName(this.parse(contentWithContext).<Example>first(Example.class));
    }
    return _xblockexpression;
  }
}
