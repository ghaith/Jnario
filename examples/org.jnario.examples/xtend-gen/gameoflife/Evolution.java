package gameoflife;

import com.google.common.collect.Iterables;
import gameoflife.CellLocation;
import gameoflife.EvolveDeadCells;
import gameoflife.EvolveLiveCells;
import gameoflife.Rule;
import gameoflife.World;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Evolution {
  public static Evolution gameOfLife() {
    EvolveLiveCells _evolveLiveCells = new EvolveLiveCells();
    EvolveDeadCells _evolveDeadCells = new EvolveDeadCells();
    return new Evolution(_evolveLiveCells, _evolveDeadCells);
  }
  
  private final Rule staysAlive;
  
  private final Rule becomesAlive;
  
  public World evolve(final World world) {
    final Function1<CellLocation, Boolean> _function = new Function1<CellLocation, Boolean>() {
      @Override
      public Boolean apply(final CellLocation it) {
        return Boolean.valueOf(Evolution.this.apply(Evolution.this.getStaysAlive(), world, it));
      }
    };
    Iterable<CellLocation> _filter = IterableExtensions.<CellLocation>filter(world.getLivingCells(), _function);
    final Function1<CellLocation, Boolean> _function_1 = new Function1<CellLocation, Boolean>() {
      @Override
      public Boolean apply(final CellLocation it) {
        return Boolean.valueOf(Evolution.this.apply(Evolution.this.getBecomesAlive(), world, it));
      }
    };
    Iterable<CellLocation> _filter_1 = IterableExtensions.<CellLocation>filter(world.deadCells(), _function_1);
    Iterable<CellLocation> _plus = Iterables.<CellLocation>concat(_filter, _filter_1);
    return World.worldWith(_plus);
  }
  
  private boolean apply(final Rule rule, final World world, final CellLocation cell) {
    return rule.becomesAlive(world.livingNeighbours(cell));
  }
  
  public Evolution(final Rule staysAlive, final Rule becomesAlive) {
    super();
    this.staysAlive = staysAlive;
    this.becomesAlive = becomesAlive;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.staysAlive== null) ? 0 : this.staysAlive.hashCode());
    result = prime * result + ((this.becomesAlive== null) ? 0 : this.becomesAlive.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Evolution other = (Evolution) obj;
    if (this.staysAlive == null) {
      if (other.staysAlive != null)
        return false;
    } else if (!this.staysAlive.equals(other.staysAlive))
      return false;
    if (this.becomesAlive == null) {
      if (other.becomesAlive != null)
        return false;
    } else if (!this.becomesAlive.equals(other.becomesAlive))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("staysAlive", this.staysAlive);
    b.add("becomesAlive", this.becomesAlive);
    return b.toString();
  }
  
  @Pure
  public Rule getStaysAlive() {
    return this.staysAlive;
  }
  
  @Pure
  public Rule getBecomesAlive() {
    return this.becomesAlive;
  }
}
