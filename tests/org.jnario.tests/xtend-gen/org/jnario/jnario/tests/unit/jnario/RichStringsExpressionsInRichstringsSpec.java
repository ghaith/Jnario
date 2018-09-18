package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.jnario.RichStringsSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("expressions in richstrings")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsExpressionsInRichstringsSpec extends RichStringsSpec {
  @Test
  @Named("a variable")
  @Order(1)
  public void _aVariable() throws Exception {
    final String x = "value";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre ");
    _builder.append(x, "");
    _builder.append(" post");
    Assert.assertTrue("\nExpected \'\'\'pre \u00ABx\u00BB post\'\'\' should be \"pre value post\" but"
     + "\n     \'\'\'pre \u00ABx\u00BB post\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString() + "\n", Should.should_be(_builder.toString(), "pre value post"));
    
  }
  
  @Test
  @Named("multiple variables")
  @Order(2)
  public void _multipleVariables() throws Exception {
    final String x = "value";
    final String y = "value2";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre ");
    _builder.append(x, "");
    _builder.append(" ");
    _builder.append(y, "");
    _builder.append(" post");
    Assert.assertTrue("\nExpected \'\'\'pre \u00ABx\u00BB \u00ABy\u00BB post\'\'\' should be \"pre value value2 post\" but"
     + "\n     \'\'\'pre \u00ABx\u00BB \u00ABy\u00BB post\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
     + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", Should.should_be(_builder.toString(), "pre value value2 post"));
    
  }
  
  @Test
  @Named("multiple variables in new lines")
  @Order(3)
  public void _multipleVariablesInNewLines() throws Exception {
    final String x = "value";
    final String y = "value2";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre");
    _builder.newLine();
    _builder.append(x, "");
    _builder.newLineIfNotEmpty();
    _builder.append(y, "");
    _builder.newLineIfNotEmpty();
    _builder.append("post");
    String _lineSeparator = System.lineSeparator();
    String _plus = ("pre" + _lineSeparator);
    String _plus_1 = (_plus + "value");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    String _plus_3 = (_plus_2 + "value2");
    String _lineSeparator_2 = System.lineSeparator();
    String _plus_4 = (_plus_3 + _lineSeparator_2);
    String _plus_5 = (_plus_4 + "post");
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\t\t\tpre\r\n\t\t\t\t\u00ABx\u00BB\r\n\t\t\t\t\u00ABy\u00BB\r\n\t\t\t\tpost\'\'\' should be \"pre\"+System.lineSeparator()+\"value\"+System.lineSeparator()+\"value2\"+System.lineSeparator()+\"post\" but"
     + "\n     \'\'\'\r\n\t\t\t\tpre\r\n\t\t\t\t\u00ABx\u00BB\r\n\t\t\t\t\u00ABy\u00BB\r\n\t\t\t\tpost\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
     + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString()
     + "\n     \"pre\"+System.lineSeparator()+\"value\"+System.lineSeparator()+\"value2\"+System.lineSeparator()+\"post\" is " + new org.hamcrest.StringDescription().appendValue(_plus_5).toString()
     + "\n     \"pre\"+System.lineSeparator()+\"value\"+System.lineSeparator()+\"value2\"+System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_plus_4).toString()
     + "\n     \"pre\"+System.lineSeparator()+\"value\"+System.lineSeparator()+\"value2\" is " + new org.hamcrest.StringDescription().appendValue(_plus_3).toString()
     + "\n     \"pre\"+System.lineSeparator()+\"value\"+System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_plus_2).toString()
     + "\n     \"pre\"+System.lineSeparator()+\"value\" is " + new org.hamcrest.StringDescription().appendValue(_plus_1).toString()
     + "\n     \"pre\"+System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
     + "\n     System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_lineSeparator).toString()
     + "\n     System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", Should.should_be(_builder.toString(), _plus_5));
    
  }
  
  @Test
  @Named("expression")
  @Order(4)
  public void _expression() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("1 + 2 = ");
    _builder.append((1 + 2), "");
    Assert.assertTrue("\nExpected \'\'\'1 + 2 = \u00AB1+2\u00BB\'\'\' should be \"1 + 2 = 3\" but"
     + "\n     \'\'\'1 + 2 = \u00AB1+2\u00BB\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     1+2 is " + new org.hamcrest.StringDescription().appendValue((1 + 2)).toString() + "\n", Should.should_be(_builder.toString(), "1 + 2 = 3"));
    
  }
  
  @Test
  @Named("expression with variables")
  @Order(5)
  public void _expressionWithVariables() throws Exception {
    final int a = 1;
    final int b = 2;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(a, "");
    _builder.append(" + ");
    _builder.append(b, "");
    _builder.append(" = ");
    _builder.append((a + b), "");
    Assert.assertTrue("\nExpected \'\'\'\u00ABa\u00BB + \u00ABb\u00BB = \u00ABa + b\u00BB\'\'\' should be \"1 + 2 = 3\" but"
     + "\n     \'\'\'\u00ABa\u00BB + \u00ABb\u00BB = \u00ABa + b\u00BB\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     a is " + new org.hamcrest.StringDescription().appendValue(a).toString()
     + "\n     b is " + new org.hamcrest.StringDescription().appendValue(b).toString()
     + "\n     a + b is " + new org.hamcrest.StringDescription().appendValue((a + b)).toString() + "\n", Should.should_be(_builder.toString(), "1 + 2 = 3"));
    
  }
}
