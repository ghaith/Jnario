/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.jnario.StringsMakeJunitConformSpecExamples;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("makeJunitConform")
public class StringsMakeJunitConformSpec extends StringsSpec {
  @Before
  public void _initStringsMakeJunitConformSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("string", "result"), 
      new StringsMakeJunitConformSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new StringsMakeJunitConformSpecExamples(  java.util.Arrays.asList("\"hello\"", "\"hello\""), "hello", "hello"),
      new StringsMakeJunitConformSpecExamples(  java.util.Arrays.asList("\"hello \"", "\"hello\""), "hello ", "hello"),
      new StringsMakeJunitConformSpecExamples(  java.util.Arrays.asList("\"hello\\n\\tworld\"", "\"hello world\""), "hello\n\tworld", "hello world"),
      new StringsMakeJunitConformSpecExamples(  java.util.Arrays.asList("\"hello(param)\"", "\"hello[param]\""), "hello(param)", "hello[param]"),
      new StringsMakeJunitConformSpecExamples(  java.util.Arrays.asList("\"hello #world#\"", "\"hello -world-\""), "hello #world#", "hello -world-")
    );
  }
  
  protected ExampleTable<StringsMakeJunitConformSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[string.makeJunitConform => result]")
  @Order(99)
  public void examplesForEachStringMakeJunitConformResult() throws Exception {
    final Procedure1<StringsMakeJunitConformSpecExamples> _function = new Procedure1<StringsMakeJunitConformSpecExamples>() {
        public void apply(final StringsMakeJunitConformSpecExamples it) {
          String _makeJunitConform = Strings.makeJunitConform(it.string);
          boolean _doubleArrow = Should.operator_doubleArrow(_makeJunitConform, it.result);
          Assert.assertTrue("\nExpected string.makeJunitConform => result but"
           + "\n     string.makeJunitConform is " + new StringDescription().appendValue(_makeJunitConform).toString()
           + "\n     string is " + new StringDescription().appendValue(it.string).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StringsMakeJunitConformSpecExamples>forEach(this.examples, _function);
  }
}