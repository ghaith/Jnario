/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package introduction;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * <p align="center"><img src="file://localhost/Users/sebastian/Desktop/Specs.png"/></p>
 * 
 * *Jnario* is a framework helping you write executable software specifications.
 * It leverages the expressiveness of [Xtend](http://www.xtend-lang.org) and is easy to
 * integrate, as it compiles to plain [JUnit](http://www.junit.org/) tests.
 * In our other [presentation](http://www.eclipsecon.org/2012/sessions/program-thou-shalt-behave)
 * at this EclipseCon, we demonstrate how to use Jnario for writing executable acceptance
 * specifications in a business readable fashion.
 * This session introduces you to *Jnario Specs* fact another language of Jnario allowing
 * software behavior specification on a unit level. We demonstrate how you can design and document
 * your software at the same time.
 * For example, this document is actually generated from a [spec](https://gist.github.com/1762405) written
 * with *Jnario Specs*.
 */
@CreateWith(SpecTestCreator.class)
@Named("Jnario Specs - facts for Java")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class JnarioSpecsFactsForJavaSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public SpecExecutor _specExecutor;
  
  /**
   * Jnario improves the readability of tests by providing assertion methods which can extend
   * any object (making use of Xtend's [extension methods](http://www.eclipse.org/xtend/#extensionmethods)).
   * These assertions help you express how an object should behave. They can be combined with any
   * [Hamcrest](http://code.google.com/p/hamcrest/) matcher, giving you the freedom to choose from
   * a wide range of existing matchers.
   */
  @Test
  @Named("Should-style Assertions")
  @Order(1)
  public void _shouldStyleAssertions() throws Exception {
    boolean _should_be = Should.<String>should_be(
      "hello", "hello");
    Assert.assertTrue("\nExpected \"hello\" should be \"hello\" but"
     + "\n     \"hello\" should be \"hello\" is " + new org.hamcrest.StringDescription().appendValue(true).toString() + "\n", _should_be);
    
    boolean _should_be_1 = Should.<Boolean>should_be(
      Boolean.valueOf(true), false);
    Assert.assertFalse("\nExpected true should not be false but"
     + "\n     true should not be false is " + new org.hamcrest.StringDescription().appendValue(true).toString() + "\n", _should_be_1);
    
    Assert.assertTrue("\nExpected \"hello\" should be typeof(String) but"
     + "\n     \"hello\" should be typeof(String) is " + new org.hamcrest.StringDescription().appendValue(true).toString() + "\n", Should.should_be(
      "hello", String.class));
    
  }
  
  /**
   * With Jnario, debugging a failing test to discover the reason for its failure becomes
   * a thing of the past. Jnario provides a special assert statement that reports, when the assertion fails,
   * the value of all involved expressions.
   */
  @Test
  @Named("Self-explaining Assertions")
  @Order(2)
  public void _selfExplainingAssertions() throws Exception {
    final int x = 0;
    final int y = 1;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected x == 1 && y == 0 but"
         + "\n     x == 1 is " + new org.hamcrest.StringDescription().appendValue((x == 1)).toString()
         + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
         + "\n     y == 0 is " + new org.hamcrest.StringDescription().appendValue((y == 0)).toString()
         + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", ((x == 1) && (y == 0)));
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "Expected x == 1 && y == 0 but\n     x == 1 is <false>\n     x is <0>\n     y == 0 is <false>\n     y is <1>");
  }
  
  /**
   * *Jnario Specs* helps you write less boilerplate code in your
   * specifications. In the following example, `describe Calculator`
   * references the existing Java type `Calculator`.
   * Using this information Jnario will automatically create and instantiate a field `subject`,
   * which you can use in your specification. It is even possible to use
   * [Google Guice](http://code.google.com/p/google-guice/) to instantiate your subjects.
   * 
   * @filter(\.executesSuccessfully|''')
   */
  @Test
  @Named("Implicit subject creation")
  @Order(3)
  public void _implicitSubjectCreation() throws Exception {
    this._specExecutor.executesSuccessfully("package bootstrap\n\nimport java.util.ArrayList\n\ndescribe ArrayList{\n\n  fact \"should automatically create an instance of ArrayList called subject\"{\n    subject should be typeof(ArrayList)\n  }\n\n}\n");
  }
}
