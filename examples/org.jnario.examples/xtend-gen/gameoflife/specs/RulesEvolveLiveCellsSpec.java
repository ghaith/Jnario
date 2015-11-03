package gameoflife.specs;

import gameoflife.EvolveLiveCells;
import gameoflife.specs.RulesEvolveLiveCellsSpecLiveCells;
import gameoflife.specs.RulesSpec;
import java.util.Arrays;
import java.util.function.Consumer;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("EvolveLiveCells")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RulesEvolveLiveCellsSpec extends RulesSpec {
  @Subject
  public EvolveLiveCells subject;
  
  public ExampleTable<RulesEvolveLiveCellsSpecLiveCells> _initRulesEvolveLiveCellsSpecLiveCells() {
    return ExampleTable.create("liveCells", 
      Arrays.asList("liveNeighbourCount", "result"), 
      new RulesEvolveLiveCellsSpecLiveCells(  Arrays.asList("1", "false"), _initRulesEvolveLiveCellsSpecLiveCellsCell0(), _initRulesEvolveLiveCellsSpecLiveCellsCell1()),
      new RulesEvolveLiveCellsSpecLiveCells(  Arrays.asList("2", "true"), _initRulesEvolveLiveCellsSpecLiveCellsCell2(), _initRulesEvolveLiveCellsSpecLiveCellsCell3()),
      new RulesEvolveLiveCellsSpecLiveCells(  Arrays.asList("3", "true"), _initRulesEvolveLiveCellsSpecLiveCellsCell4(), _initRulesEvolveLiveCellsSpecLiveCellsCell5()),
      new RulesEvolveLiveCellsSpecLiveCells(  Arrays.asList("4", "false"), _initRulesEvolveLiveCellsSpecLiveCellsCell6(), _initRulesEvolveLiveCellsSpecLiveCellsCell7())
    );
  }
  
  protected ExampleTable<RulesEvolveLiveCellsSpecLiveCells> liveCells = _initRulesEvolveLiveCellsSpecLiveCells();
  
  public int _initRulesEvolveLiveCellsSpecLiveCellsCell0() {
    return 1;
  }
  
  public boolean _initRulesEvolveLiveCellsSpecLiveCellsCell1() {
    return false;
  }
  
  public int _initRulesEvolveLiveCellsSpecLiveCellsCell2() {
    return 2;
  }
  
  public boolean _initRulesEvolveLiveCellsSpecLiveCellsCell3() {
    return true;
  }
  
  public int _initRulesEvolveLiveCellsSpecLiveCellsCell4() {
    return 3;
  }
  
  public boolean _initRulesEvolveLiveCellsSpecLiveCellsCell5() {
    return true;
  }
  
  public int _initRulesEvolveLiveCellsSpecLiveCellsCell6() {
    return 4;
  }
  
  public boolean _initRulesEvolveLiveCellsSpecLiveCellsCell7() {
    return false;
  }
  
  @Test
  @Named("liveCells.forEach[ subject.becomesAlive[liveNeighbourCount] => result ]")
  @Order(1)
  public void _liveCellsForEachSubjectBecomesAliveLiveNeighbourCountResult() throws Exception {
    final Consumer<RulesEvolveLiveCellsSpecLiveCells> _function = new Consumer<RulesEvolveLiveCellsSpecLiveCells>() {
      @Override
      public void accept(final RulesEvolveLiveCellsSpecLiveCells it) {
        int _liveNeighbourCount = it.getLiveNeighbourCount();
        boolean _becomesAlive = RulesEvolveLiveCellsSpec.this.subject.becomesAlive(_liveNeighbourCount);
        boolean _result = it.getResult();
        Assert.assertTrue("\nExpected subject.becomesAlive(liveNeighbourCount) => result but"
         + "\n     subject.becomesAlive(liveNeighbourCount) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
         + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(RulesEvolveLiveCellsSpec.this.subject).toString()
         + "\n     liveNeighbourCount is " + new org.hamcrest.StringDescription().appendValue(_liveNeighbourCount).toString()
         + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_becomesAlive), _result));
        
      }
    };
    this.liveCells.forEach(_function);
  }
}
