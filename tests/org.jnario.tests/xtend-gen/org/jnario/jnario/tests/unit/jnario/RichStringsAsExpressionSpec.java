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

@Named("as expression")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsAsExpressionSpec extends RichStringsSpec {
  @Test
  @Named("richstring should be")
  @Order(1)
  public void _richstringShouldBe() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("abc");
    Assert.assertTrue("\nExpected //dont assign to variable, use directly\r\n\t\t\t\'\'\'abc\'\'\' should be \"abc\" but"
     + "\n     //dont assign to variable, use directly\r\n\t\t\t\'\'\'abc\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", Should.should_be(_builder.toString(), "abc"));
    
  }
  
  @Test
  @Named("richstring with if")
  @Order(2)
  public void _richstringWithIf() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a ");
    {
      if (true) {
        _builder.append("b");
      }
    }
    Assert.assertTrue("\nExpected \'\'\'a \u00ABIF true\u00BBb\u00ABENDIF\u00BB\'\'\' should be \"a b\" but"
     + "\n     \'\'\'a \u00ABIF true\u00BBb\u00ABENDIF\u00BB\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", Should.should_be(_builder.toString(), "a b"));
    
  }
}
