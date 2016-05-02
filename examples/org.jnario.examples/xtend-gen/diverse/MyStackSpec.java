package diverse;

import diverse.MyStackEmptySpec;
import diverse.MyStackNotEmptySpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ MyStackEmptySpec.class, MyStackNotEmptySpec.class })
@Named("MyStack")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class MyStackSpec {
}
