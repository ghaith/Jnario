package gameoflife;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import gameoflife.CellLocation;
import java.util.ArrayList;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/* @Data */@SuppressWarnings("all")
public class World {
  private Set<CellLocation> livingCells;
  
  public static World parseWorld(final CharSequence grid) {
    World _xblockexpression = null;
    {
      final ArrayList<CellLocation> cells = CollectionLiterals.<CellLocation>newArrayList();
      String _string = grid.toString();
      String[] _split = _string.split("\r?\n");
      final Procedure2<String, Integer> _function = new Procedure2<String, Integer>() {
        @Override
        public void apply(final String line, final Integer x) {
          char[] _charArray = line.toCharArray();
          final Procedure2<Character, Integer> _function = new Procedure2<Character, Integer>() {
            @Override
            public void apply(final Character c, final Integer y) {
              String _string = c.toString();
              boolean _equals = Objects.equal(_string, "X");
              if (_equals) {
                CellLocation _cell = CellLocation.cell((x).intValue(), (y).intValue());
                cells.add(_cell);
              }
            }
          };
          IterableExtensions.<Character>forEach(((Iterable<Character>)Conversions.doWrapArray(_charArray)), _function);
        }
      };
      IterableExtensions.<String>forEach(((Iterable<String>)Conversions.doWrapArray(_split)), _function);
      _xblockexpression = World.worldWith(cells);
    }
    return _xblockexpression;
  }
  
  public static World worldWith(final Iterable<CellLocation> cells) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor World() is not applicable for the arguments (Set<CellLocation>)");
  }
  
  public Set<CellLocation> deadCells() {
    final Function1<CellLocation, Set<CellLocation>> _function = new Function1<CellLocation, Set<CellLocation>>() {
      @Override
      public Set<CellLocation> apply(final CellLocation it) {
        return it.neighbours();
      }
    };
    Iterable<Set<CellLocation>> _map = IterableExtensions.<CellLocation, Set<CellLocation>>map(this.livingCells, _function);
    Iterable<CellLocation> _flatten = Iterables.<CellLocation>concat(_map);
    final Function1<CellLocation, Boolean> _function_1 = new Function1<CellLocation, Boolean>() {
      @Override
      public Boolean apply(final CellLocation it) {
        boolean _contains = World.this.livingCells.contains(it);
        return Boolean.valueOf((!_contains));
      }
    };
    Iterable<CellLocation> _filter = IterableExtensions.<CellLocation>filter(_flatten, _function_1);
    return IterableExtensions.<CellLocation>toSet(_filter);
  }
  
  public int livingNeighbours(final CellLocation cell) {
    Set<CellLocation> _neighbours = cell.neighbours();
    final Function1<CellLocation, Boolean> _function = new Function1<CellLocation, Boolean>() {
      @Override
      public Boolean apply(final CellLocation it) {
        return Boolean.valueOf(World.this.livingCells.contains(it));
      }
    };
    Iterable<CellLocation> _filter = IterableExtensions.<CellLocation>filter(_neighbours, _function);
    return IterableExtensions.size(_filter);
  }
}
