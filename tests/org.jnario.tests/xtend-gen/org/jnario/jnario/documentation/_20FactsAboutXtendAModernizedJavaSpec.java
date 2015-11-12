/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * The syntax of Xtend is quite similar to Java, but Xtend code
 * is usually a lot shorter than its Java counterpart. However,
 * there are some important differences between Java and Xtend
 * one should be aware of.
 */
@Named("A modernized Java")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class _20FactsAboutXtendAModernizedJavaSpec extends _20FactsAboutXtendSpec {
  /**
   * Semicolons are optional in Xtend.
   */
  @Test
  @Named("No semicolons")
  @Order(1)
  public void _noSemicolons() throws Exception {
    String greeting = "";
    greeting = "Hello World";
    InputOutput.<String>println(greeting);
  }
  
  /**
   * Variable declarations are preceded by `var` or, in case of
   * final variables, by `val`.
   */
  @Test
  @Named("Variables are declared with var and val")
  @Order(2)
  public void _variablesAreDeclaredWithVarAndVal() throws Exception {
    String x = "I might change";
    final String y = "I\'ll never change";
  }
  
  /**
   * Having to precede variable declarations with `var` or `val` seems like a
   * step backwards at first glance, but the type of a variable can be inferred
   * from the expression on the right-hand side. This means we can omit the
   * type information for variable declarations, which makes code a lot more readable.
   */
  @Test
  @Named("Less typing thanks to type inference")
  @Order(3)
  public void _lessTypingThanksToTypeInference() throws Exception {
    final String greeting = "Hello World";
    boolean _doubleArrow = Should.operator_doubleArrow(greeting, String.class);
    Assert.assertTrue("\nExpected greeting => typeof(String) but"
     + "\n     greeting is " + new org.hamcrest.StringDescription().appendValue(greeting).toString() + "\n", _doubleArrow);
    
    Pair<String, String> _mappedTo = Pair.<String, String>of("german", "Hallo");
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("english", "Hello");
    final HashMap<String, String> greetings = CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1);
    Assert.assertTrue("\nExpected greetings => typeof(HashMap) but"
     + "\n     greetings is " + new org.hamcrest.StringDescription().appendValue(greetings).toString() + "\n", Should.operator_doubleArrow(greetings, HashMap.class));
    
  }
  
  /**
   * In case you are wondering what the `->` does in the previous example,
   * it is syntactic sugar for a tuple. To further increase the confusion, the `=>`
   * operator is part of Jnario and describes the expected behavior of objects.
   */
  @Test
  @Named("Syntactic sugar: Pairs")
  @Order(4)
  public void _syntacticSugarPairs() throws Exception {
    final Pair<String, String> pair = Pair.<String, String>of("spain", "italy");
    String _key = pair.getKey();
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_key, "spain");
    Assert.assertTrue("\nExpected pair.key   => \"spain\" but"
     + "\n     pair.key is " + new org.hamcrest.StringDescription().appendValue(_key).toString()
     + "\n     pair is " + new org.hamcrest.StringDescription().appendValue(pair).toString() + "\n", _doubleArrow);
    
    String _value = pair.getValue();
    Assert.assertTrue("\nExpected pair.value => \"italy\" but"
     + "\n     pair.value is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
     + "\n     pair is " + new org.hamcrest.StringDescription().appendValue(pair).toString() + "\n", Should.<String>operator_doubleArrow(_value, "italy"));
    
  }
  
  final String greeting = "Hello ";
  
  public String sayHello(@Extension final String name) {
    return (this.greeting + name);
  }
  
  /**
   * Fields and methods can be declared in Xtend exactly like in Java. The only difference id
   * that method declarations must be preceded with `def`:
   * 
   * <pre class="prettyprint lang-spec">
   * String greeting = "Hello "
   * 
   * def public String sayHello(String name){
   *   return greeting + name
   * }
   * </pre>
   * 
   * The type inference also works for fields and methods. You can omit
   * the return type of methods and the type of fields. Furthermore, methods are by default
   * public, so we can rewrite our previous example as:
   * 
   * <pre class="prettyprint lang-spec">
   * val greeting = "Hello "
   * 
   * def sayHello(String name){
   *   greeting + name // return is optional
   * }
   * </pre>
   * 
   * Calling fields and methods works exactly like in Java, but it is possible to
   * omit the parentheses when calling a method without parameters.
   */
  @Test
  @Named("Fields & methods work almost like in Java")
  @Order(5)
  public void _fieldsMethodsWorkAlmostLikeInJava() throws Exception {
    String _sayHello = this.sayHello("Sebastian");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_sayHello, (this.greeting + "Sebastian"));
    Assert.assertTrue("\nExpected sayHello(\"Sebastian\") => greeting + \"Sebastian\" but"
     + "\n     sayHello(\"Sebastian\") is " + new org.hamcrest.StringDescription().appendValue(_sayHello).toString()
     + "\n     greeting + \"Sebastian\" is " + new org.hamcrest.StringDescription().appendValue((this.greeting + "Sebastian")).toString()
     + "\n     greeting is " + new org.hamcrest.StringDescription().appendValue(this.greeting).toString() + "\n", _doubleArrow);
    
    String _string = Integer.valueOf(42).toString();
    Assert.assertTrue("\nExpected 42.toString => \"42\" but"
     + "\n     42.toString is " + new org.hamcrest.StringDescription().appendValue(_string).toString() + "\n", Should.<String>operator_doubleArrow(_string, "42"));
    
  }
}
