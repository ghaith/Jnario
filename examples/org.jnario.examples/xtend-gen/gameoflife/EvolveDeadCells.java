package gameoflife;

import gameoflife.Rule;

@SuppressWarnings("all")
public class EvolveDeadCells implements Rule {
  @Override
  public boolean becomesAlive(final int neighbourCount) {
    return (neighbourCount == 3);
  }
}
