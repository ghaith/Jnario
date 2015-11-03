package diverse;

import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Hello World")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class HelloWorldSpec {
  @Test
  @Named("\\\"Hello World\\\".length should be 11")
  @Order(1)
  public void _helloWorldLengthShouldBe11() throws Exception {
    int _length = "Hello World".length();
    boolean _should_be = Should.<Integer>should_be(Integer.valueOf(_length), Integer.valueOf(11));
    Assert.assertTrue("\nExpected \"Hello World\".length should be 11 but"
     + "\n     \"Hello World\".length is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_length)).toString() + "\n", _should_be);
    
  }
}
