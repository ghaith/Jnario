package gameoflife;

import gameoflife.CellLocation;
import gameoflife.Rule;
import gameoflife.World;

/* @Data */@SuppressWarnings("all")
public class Evolution {
  public static Evolution gameOfLife() {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor Evolution() is not applicable for the arguments (EvolveLiveCells,EvolveDeadCells)");
  }
  
  private Rule staysAlive;
  
  private Rule becomesAlive;
  
  public World evolve(final World world) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getStaysAlive is undefined"
      + "\nThe method or field getBecomesAlive is undefined"
      + "\nThe field livingCells is not visible"
      + "\napply cannot be resolved"
      + "\napply cannot be resolved");
  }
  
  private boolean apply(final Rule rule, final World world, final CellLocation cell) {
    return rule.becomesAlive(world.livingNeighbours(cell));
  }
}
