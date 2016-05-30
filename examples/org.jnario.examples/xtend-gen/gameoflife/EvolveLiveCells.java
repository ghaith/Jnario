package gameoflife;

import gameoflife.Rule;

@SuppressWarnings("all")
public class EvolveLiveCells implements Rule {
  @Override
  public boolean becomesAlive(final int neighbourCount) {
    return ((!this.underPopulated(neighbourCount)) && (!this.overPopulated(neighbourCount)));
  }
  
  public boolean underPopulated(final int neighbourCount) {
    return (neighbourCount < 2);
  }
  
  public boolean overPopulated(final int neighbourCount) {
    return (neighbourCount > 3);
  }
}
