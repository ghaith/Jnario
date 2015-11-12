/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import java.util.Stack;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * In Xtend you can use the [with operator](http://www.eclipse.org/xtend/new_and_noteworthy/index.html#withOperator)
 *  `=>` as a let-expression, which allows binding any object to the scope of
 * the block, which can be handy when initializing objects. In Jnario `=>` also
 * can be used to describe the expected behavior of objects.
 * It works great together with Xtend's with operator. You can use it to:
 */
@Named("Using Xtend\\\'s with Operator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class UsingXtendSWithOperatorSpec {
  @Test
  @Named("initialize fixtures")
  @Order(1)
  public void _initializeFixtures() throws Exception {
    Stack<String> _stack = new Stack<String>();
    final Procedure1<Stack<String>> _function = new Procedure1<Stack<String>>() {
      @Override
      public void apply(final Stack<String> it) {
        it.add("red");
        it.add("blue");
      }
    };
    final Stack<String> stackWithTwoElements = ObjectExtensions.<Stack<String>>operator_doubleArrow(_stack, _function);
    int _size = stackWithTwoElements.size();
    Assert.assertTrue("\nExpected stackWithTwoElements.size => 2 but"
     + "\n     stackWithTwoElements.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     stackWithTwoElements is " + new org.hamcrest.StringDescription().appendValue(stackWithTwoElements).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(2)));
    
  }
  
  @Test
  @Named("write multiple assertions")
  @Order(2)
  public void _writeMultipleAssertions() throws Exception {
    final Procedure1<String> _function = new Procedure1<String>() {
      @Override
      public void apply(final String it) {
        int _length = it.length();
        boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(11));
        Assert.assertTrue("\nExpected length => 11 but"
         + "\n     length is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_length)).toString() + "\n", _doubleArrow);
        
        boolean _should_startWith = Should.should_startWith(it, "hello");
        Assert.assertTrue("\nExpected it should startWith(\"hello\") but"
         + "\n     it is " + new org.hamcrest.StringDescription().appendValue(it).toString() + "\n", _should_startWith);
        
        Assert.assertTrue("\nExpected it should endWith(\"world\") but"
         + "\n     it is " + new org.hamcrest.StringDescription().appendValue(it).toString() + "\n", Should.should_endWith(it, "world"));
        
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(
      "hello world", _function);
  }
}
