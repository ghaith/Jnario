package gameoflife.specs;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class RulesEvolveLiveCellsSpecLiveCells extends ExampleTableRow {
  public RulesEvolveLiveCellsSpecLiveCells(final List<String> cellNames, final int liveNeighbourCount, final boolean result) {
    super(cellNames);
    this.liveNeighbourCount = liveNeighbourCount;
    this.result = result;
    
  }
  
  private int liveNeighbourCount;
  
  public int getLiveNeighbourCount() {
    return this.liveNeighbourCount;
  }
  
  private boolean result;
  
  public boolean getResult() {
    return this.result;
  }
}
