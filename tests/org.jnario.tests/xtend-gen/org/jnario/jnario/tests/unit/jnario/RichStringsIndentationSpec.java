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

@Named("indentation")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsIndentationSpec extends RichStringsSpec {
  @Test
  @Named("no indentation")
  @Order(1)
  public void _noIndentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a");
    _builder.newLine();
    _builder.append("b");
    String _lineSeparator = System.lineSeparator();
    String _plus = ("a" + _lineSeparator);
    String _plus_1 = (_plus + "b");
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\t\ta\r\n\t\t\tb\'\'\' should be \"a\"+System.lineSeparator()+\"b\" but"
     + "\n     \'\'\'\r\n\t\t\ta\r\n\t\t\tb\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"a\"+System.lineSeparator()+\"b\" is " + new org.hamcrest.StringDescription().appendValue(_plus_1).toString()
     + "\n     \"a\"+System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
     + "\n     System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_lineSeparator).toString()
     + "\n     System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", Should.should_be(_builder.toString(), _plus_1));
    
  }
  
  @Test
  @Named("with indentation")
  @Order(2)
  public void _withIndentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("b");
    String _lineSeparator = System.lineSeparator();
    String _plus = ("a" + _lineSeparator);
    String _plus_1 = (_plus + "\tb");
    boolean _should_be = Should.should_be(_builder.toString(), _plus_1);
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\t\ta\r\n\t\t\t\tb\'\'\' should be \"a\"+System.lineSeparator()+\"\\tb\" but"
     + "\n     \'\'\'\r\n\t\t\ta\r\n\t\t\t\tb\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"a\"+System.lineSeparator()+\"\\tb\" is " + new org.hamcrest.StringDescription().appendValue(_plus_1).toString()
     + "\n     \"a\"+System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
     + "\n     System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_lineSeparator).toString()
     + "\n     System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", _should_be);
    
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\t");
    _builder_1.append("a");
    _builder_1.newLine();
    _builder_1.append("b");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = ("\ta" + _lineSeparator_1);
    String _plus_3 = (_plus_2 + "b");
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\t\t\ta\r\n\t\t\tb\'\'\' should be \"\\ta\"+System.lineSeparator()+\"b\" but"
     + "\n     \'\'\'\r\n\t\t\t\ta\r\n\t\t\tb\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString()
     + "\n     \"\\ta\"+System.lineSeparator()+\"b\" is " + new org.hamcrest.StringDescription().appendValue(_plus_3).toString()
     + "\n     \"\\ta\"+System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_plus_2).toString()
     + "\n     System.lineSeparator() is " + new org.hamcrest.StringDescription().appendValue(_lineSeparator_1).toString()
     + "\n     System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", Should.should_be(_builder_1.toString(), _plus_3));
    
  }
}
