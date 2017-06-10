package gameoflife;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import gameoflife.CellLocation;
import java.util.ArrayList;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class World {
  private final Set<CellLocation> livingCells;
  
  public static World parseWorld(final CharSequence grid) {
    World _xblockexpression = null;
    {
      final ArrayList<CellLocation> cells = CollectionLiterals.<CellLocation>newArrayList();
      final Procedure2<String, Integer> _function = new Procedure2<String, Integer>() {
        @Override
        public void apply(final String line, final Integer x) {
          final Procedure2<Character, Integer> _function = new Procedure2<Character, Integer>() {
            @Override
            public void apply(final Character c, final Integer y) {
              String _string = c.toString();
              boolean _equals = Objects.equal(_string, "X");
              if (_equals) {
                cells.add(CellLocation.cell((x).intValue(), (y).intValue()));
              }
            }
          };
          IterableExtensions.<Character>forEach(((Iterable<Character>)Conversions.doWrapArray(line.toCharArray())), _function);
        }
      };
      IterableExtensions.<String>forEach(((Iterable<String>)Conversions.doWrapArray(grid.toString().split("\r?\n"))), _function);
      _xblockexpression = World.worldWith(cells);
    }
    return _xblockexpression;
  }
  
  public static World worldWith(final Iterable<CellLocation> cells) {
    Set<CellLocation> _set = IterableExtensions.<CellLocation>toSet(cells);
    return new World(_set);
  }
  
  public Set<CellLocation> deadCells() {
    final Function1<CellLocation, Set<CellLocation>> _function = new Function1<CellLocation, Set<CellLocation>>() {
      @Override
      public Set<CellLocation> apply(final CellLocation it) {
        return it.neighbours();
      }
    };
    final Function1<CellLocation, Boolean> _function_1 = new Function1<CellLocation, Boolean>() {
      @Override
      public Boolean apply(final CellLocation it) {
        boolean _contains = World.this.livingCells.contains(it);
        return Boolean.valueOf((!_contains));
      }
    };
    return IterableExtensions.<CellLocation>toSet(IterableExtensions.<CellLocation>filter(Iterables.<CellLocation>concat(IterableExtensions.<CellLocation, Set<CellLocation>>map(this.livingCells, _function)), _function_1));
  }
  
  public int livingNeighbours(final CellLocation cell) {
    final Function1<CellLocation, Boolean> _function = new Function1<CellLocation, Boolean>() {
      @Override
      public Boolean apply(final CellLocation it) {
        return Boolean.valueOf(World.this.livingCells.contains(it));
      }
    };
    return IterableExtensions.size(IterableExtensions.<CellLocation>filter(cell.neighbours(), _function));
  }
  
  public World(final Set<CellLocation> livingCells) {
    super();
    this.livingCells = livingCells;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.livingCells== null) ? 0 : this.livingCells.hashCode());
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
    World other = (World) obj;
    if (this.livingCells == null) {
      if (other.livingCells != null)
        return false;
    } else if (!this.livingCells.equals(other.livingCells))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("livingCells", this.livingCells);
    return b.toString();
  }
  
  @Pure
  public Set<CellLocation> getLivingCells() {
    return this.livingCells;
  }
}
