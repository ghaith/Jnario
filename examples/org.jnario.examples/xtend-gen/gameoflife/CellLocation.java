package gameoflife;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/* @Data */@SuppressWarnings("all")
public class CellLocation {
  private static final HashSet<CellLocation> NEIGHBOUR_OFFSETS = CollectionLiterals.<CellLocation>newHashSet(
    CellLocation.cell(1, 0), CellLocation.cell(1, 1), CellLocation.cell(0, 1), CellLocation.cell((-1), (-1)), CellLocation.cell((-1), 0), CellLocation.cell((-1), 1), CellLocation.cell(0, (-1)), CellLocation.cell(1, (-1)));
  
  public static CellLocation cell(final int x, final int y) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor CellLocation() is not applicable for the arguments (int,int)");
  }
  
  private int x;
  
  private int y;
  
  public Set<CellLocation> neighbours() {
    final Function1<CellLocation, CellLocation> _function = new Function1<CellLocation, CellLocation>() {
      @Override
      public CellLocation apply(final CellLocation it) {
        return CellLocation.this.plus(it);
      }
    };
    return IterableExtensions.<CellLocation>toSet(IterableExtensions.<CellLocation, CellLocation>map(CellLocation.NEIGHBOUR_OFFSETS, _function));
  }
  
  public CellLocation plus(final CellLocation other) {
    return CellLocation.cell((this.x + other.x), (this.y + other.y));
  }
}
