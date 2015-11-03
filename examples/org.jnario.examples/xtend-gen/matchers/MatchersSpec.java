package matchers;

import matchers.Person;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Matchers")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class MatchersSpec {
  @Test
  @Named("Using Hamcrest")
  @Order(1)
  public void _usingHamcrest() throws Exception {
    final Person personOfAgeFour = new Person("Frodo", 4);
    final Person personOfAgeFive = new Person("Bilbo", 5);
    Function1<Person, Boolean> _underAge = this.underAge();
    Boolean _should_be = this.<Person>should_be(personOfAgeFour, _underAge);
    Assert.assertFalse("\nExpected personOfAgeFour should not be underAge but"
     + "\n     personOfAgeFour is " + new org.hamcrest.StringDescription().appendValue(personOfAgeFour).toString() + "\n", _should_be);
    
    Function1<Person, Boolean> _olderThan = this.olderThan(personOfAgeFive);
    Assert.assertTrue("\nExpected personOfAgeFour should be olderThan(personOfAgeFive) but"
     + "\n     personOfAgeFour is " + new org.hamcrest.StringDescription().appendValue(personOfAgeFour).toString()
     + "\n     personOfAgeFive is " + new org.hamcrest.StringDescription().appendValue(personOfAgeFive).toString() + "\n", this.<Person>should_be(personOfAgeFour, _olderThan));
    
  }
  
  public Function1<Person, Boolean> olderThan(@Extension final Person p) {
    final Function1<Person, Boolean> _function = new Function1<Person, Boolean>() {
      @Override
      public Boolean apply(final Person other) {
        int _age = other.getAge();
        int _age_1 = p.getAge();
        return Boolean.valueOf((_age > _age_1));
      }
    };
    return _function;
  }
  
  public Function1<Person, Boolean> underAge() {
    final Function1<Person, Boolean> _function = new Function1<Person, Boolean>() {
      @Override
      public Boolean apply(final Person p) {
        int _age = p.getAge();
        return Boolean.valueOf((_age < 18));
      }
    };
    return _function;
  }
  
  public <T extends Object> Boolean should_be(@Extension final T obj, @Extension final Function1<T, Boolean> func) {
    return func.apply(obj);
  }
}
