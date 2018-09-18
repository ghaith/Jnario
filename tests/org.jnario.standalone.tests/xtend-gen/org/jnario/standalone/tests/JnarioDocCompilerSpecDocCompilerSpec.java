/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.standalone.tests;

import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.standalone.tests.JnarioDocCompilerSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("SpecDocCompiler")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class JnarioDocCompilerSpecDocCompilerSpec extends JnarioDocCompilerSpec {
  @Test
  @Named("\\\"test/SpecExampleSpec.html\\\" should be generated")
  @Order(1)
  public void _testSpecExampleSpecHtmlShouldBeGenerated() throws Exception {
    Matcher<? super String> _generated = this.generated();
    boolean _should_be = Should.should_be("test/SpecExampleSpec.html", _generated);
    Assert.assertTrue("\nExpected \"test/SpecExampleSpec.html\" should be generated but"
     + "\n     generated is " + new org.hamcrest.StringDescription().appendValue(_generated).toString() + "\n", _should_be);
    
  }
}
