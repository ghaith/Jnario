package diverse;

import diverse.TablesSpecAdditions;
import java.util.Arrays;
import java.util.function.Consumer;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Tables")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class TablesSpec {
  public ExampleTable<TablesSpecAdditions> _initTablesSpecAdditions() {
    return ExampleTable.create("additions", 
      Arrays.asList("a", "b", "sum"), 
      new TablesSpecAdditions(  Arrays.asList("1", "2", "3"), _initTablesSpecAdditionsCell0(), _initTablesSpecAdditionsCell1(), _initTablesSpecAdditionsCell2()),
      new TablesSpecAdditions(  Arrays.asList("4", "5", "9"), _initTablesSpecAdditionsCell3(), _initTablesSpecAdditionsCell4(), _initTablesSpecAdditionsCell5()),
      new TablesSpecAdditions(  Arrays.asList("10", "11", "21"), _initTablesSpecAdditionsCell6(), _initTablesSpecAdditionsCell7(), _initTablesSpecAdditionsCell8()),
      new TablesSpecAdditions(  Arrays.asList("21", "21", "42"), _initTablesSpecAdditionsCell9(), _initTablesSpecAdditionsCell10(), _initTablesSpecAdditionsCell11())
    );
  }
  
  protected ExampleTable<TablesSpecAdditions> additions = _initTablesSpecAdditions();
  
  public int _initTablesSpecAdditionsCell0() {
    return 1;
  }
  
  public int _initTablesSpecAdditionsCell1() {
    return 2;
  }
  
  public int _initTablesSpecAdditionsCell2() {
    return 3;
  }
  
  public int _initTablesSpecAdditionsCell3() {
    return 4;
  }
  
  public int _initTablesSpecAdditionsCell4() {
    return 5;
  }
  
  public int _initTablesSpecAdditionsCell5() {
    return 9;
  }
  
  public int _initTablesSpecAdditionsCell6() {
    return 10;
  }
  
  public int _initTablesSpecAdditionsCell7() {
    return 11;
  }
  
  public int _initTablesSpecAdditionsCell8() {
    return 21;
  }
  
  public int _initTablesSpecAdditionsCell9() {
    return 21;
  }
  
  public int _initTablesSpecAdditionsCell10() {
    return 21;
  }
  
  public int _initTablesSpecAdditionsCell11() {
    return 42;
  }
  
  @Test
  @Named("additions.forEach[ a + b => sum ]")
  @Order(1)
  public void _additionsForEachABSum() throws Exception {
    final Consumer<TablesSpecAdditions> _function = new Consumer<TablesSpecAdditions>() {
      @Override
      public void accept(final TablesSpecAdditions it) {
        int _a = it.getA();
        int _b = it.getB();
        int _plus = (_a + _b);
        int _sum = it.getSum();
        Assert.assertTrue("\nExpected a + b => sum but"
         + "\n     a + b is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_plus)).toString()
         + "\n     a is " + new org.hamcrest.StringDescription().appendValue(_a).toString()
         + "\n     b is " + new org.hamcrest.StringDescription().appendValue(_b).toString()
         + "\n     sum is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_sum)).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(_sum)));
        
      }
    };
    this.additions.forEach(_function);
  }
}
