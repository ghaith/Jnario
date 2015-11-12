package org.jnario.formatter;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.ITextSegment;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioPackage;

/**
 * TODO NO_XTEND - Verify implementation
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class JnarioFormatter extends XbaseWithAnnotationsFormatter {
  private void formatRows(final EList<ExampleRow> rows, @Extension final IFormattableDocument format) {
    final Procedure1<ExampleRow> _function = new Procedure1<ExampleRow>() {
      @Override
      public void apply(final ExampleRow it) {
        final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.newLine();
          }
        };
        format.<ExampleRow>append(it, _function);
      }
    };
    IterableExtensions.<ExampleRow>forEach(rows, _function);
  }
  
  private void formatColumns(final EList<ExampleColumn> columns, @Extension final IFormattableDocument format) {
    final Procedure1<ExampleColumn> _function = new Procedure1<ExampleColumn>() {
      @Override
      public void apply(final ExampleColumn it) {
        final ISemanticRegion nameNode = JnarioFormatter.this.regionAccess.regionForFeature(it, JnarioPackage.Literals.EXAMPLE_COLUMN__NAME);
        final JvmTypeReference typeNode = it.getType();
        int _xifexpression = (int) 0;
        boolean _equals = Objects.equal(typeNode, null);
        if (_equals) {
          _xifexpression = nameNode.getLength();
        } else {
          int _offset = nameNode.getOffset();
          int _length = nameNode.getLength();
          int _plus = (_offset + _length);
          ITextSegment _regionForEObject = JnarioFormatter.this.regionAccess.regionForEObject(typeNode);
          int _offset_1 = _regionForEObject.getOffset();
          _xifexpression = (_plus - _offset_1);
        }
        final int headerLength = _xifexpression;
        Integer _elvis = null;
        EList<ExampleCell> _cells = it.getCells();
        final Function1<ExampleCell, Integer> _function = new Function1<ExampleCell, Integer>() {
          @Override
          public Integer apply(final ExampleCell it) {
            XExpression _expression = it.getExpression();
            ITextSegment _regionForEObject = JnarioFormatter.this.regionAccess.regionForEObject(_expression);
            return JnarioFormatter.this.getMultilineLength(format, _regionForEObject);
          }
        };
        List<Integer> _map = ListExtensions.<ExampleCell, Integer>map(_cells, _function);
        final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
          @Override
          public Integer apply(final Integer p1, final Integer p2) {
            return Integer.valueOf(Math.max((p1).intValue(), (p2).intValue()));
          }
        };
        Integer _reduce = IterableExtensions.<Integer>reduce(_map, _function_1);
        if (_reduce != null) {
          _elvis = _reduce;
        } else {
          _elvis = Integer.valueOf(0);
        }
        final Integer maxExprLength = _elvis;
        final int maxLength = Math.max(headerLength, (maxExprLength).intValue());
        final int columnLength = ((1 + maxLength) - headerLength);
        final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.oneSpace();
          }
        };
        format.<ExampleColumn>prepend(it, _function_2);
        ISemanticRegion _regionForKeyword = JnarioFormatter.this.regionAccess.regionForKeyword(it, "|");
        final Procedure1<IHiddenRegionFormatter> _function_3 = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            JnarioFormatter.this.spaces(it, columnLength);
          }
        };
        format.prepend(_regionForKeyword, _function_3);
        EList<ExampleCell> _cells_1 = it.getCells();
        final Procedure1<ExampleCell> _function_4 = new Procedure1<ExampleCell>() {
          @Override
          public void apply(final ExampleCell it) {
            XExpression _expression = it.getExpression();
            final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
              @Override
              public void apply(final IHiddenRegionFormatter it) {
                it.oneSpace();
              }
            };
            format.<XExpression>prepend(_expression, _function);
            XExpression _expression_1 = it.getExpression();
            ITextSegment _regionForEObject = JnarioFormatter.this.regionAccess.regionForEObject(_expression_1);
            int _multilineLastSegmentLength = JnarioFormatter.this.getMultilineLastSegmentLength(format, _regionForEObject);
            final int length = ((1 + maxLength) - _multilineLastSegmentLength);
            XExpression _expression_2 = it.getExpression();
            final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
              @Override
              public void apply(final IHiddenRegionFormatter it) {
                JnarioFormatter.this.spaces(it, length);
              }
            };
            format.<XExpression>append(_expression_2, _function_1);
          }
        };
        IterableExtensions.<ExampleCell>forEach(_cells_1, _function_4);
      }
    };
    IterableExtensions.<ExampleColumn>forEach(columns, _function);
    ExampleColumn _last = IterableExtensions.<ExampleColumn>last(columns);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    format.<ExampleColumn>append(_last, _function_1);
  }
  
  public void spaces(final IHiddenRegionFormatter init, final int i) {
    IntegerRange _upTo = new IntegerRange(1, i);
    final Function2<String, Integer, String> _function = new Function2<String, Integer, String>() {
      @Override
      public String apply(final String p1, final Integer p2) {
        return (p1 + " ");
      }
    };
    String _fold = IterableExtensions.<Integer, String>fold(_upTo, "", _function);
    init.setSpace(_fold);
  }
  
  private String[] getSplittedMultilineCell(final IFormattableDocument format, final ITextSegment segment) {
    ITextSegment _region = format.getRegion();
    String _text = _region.getText();
    int _offset = segment.getOffset();
    ITextSegment _region_1 = format.getRegion();
    int _offset_1 = _region_1.getOffset();
    int _minus = (_offset - _offset_1);
    int _offset_2 = segment.getOffset();
    int _length = segment.getLength();
    int _plus = (_offset_2 + _length);
    ITextSegment _region_2 = format.getRegion();
    int _offset_3 = _region_2.getOffset();
    int _minus_1 = (_plus - _offset_3);
    String _substring = _text.substring(_minus, _minus_1);
    return _substring.split("\r?\n");
  }
  
  private int getMultilineLastSegmentLength(final IFormattableDocument format, final ITextSegment segment) {
    String[] _splittedMultilineCell = this.getSplittedMultilineCell(format, segment);
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_splittedMultilineCell)));
    String _trim = _last.trim();
    return _trim.length();
  }
  
  private Integer getMultilineLength(final IFormattableDocument format, final ITextSegment segment) {
    String[] _splittedMultilineCell = this.getSplittedMultilineCell(format, segment);
    final Function1<String, Integer> _function = new Function1<String, Integer>() {
      @Override
      public Integer apply(final String it) {
        String _trim = it.trim();
        return Integer.valueOf(_trim.length());
      }
    };
    List<Integer> _map = ListExtensions.<String, Integer>map(((List<String>)Conversions.doWrapArray(_splittedMultilineCell)), _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(Math.max((p1).intValue(), (p2).intValue()));
      }
    };
    return IterableExtensions.<Integer>reduce(_map, _function_1);
  }
  
  protected void _format(final ExampleTable table, @Extension final IFormattableDocument format) {
    ISemanticRegion _regionForKeyword = this.regionAccess.regionForKeyword(table, "{");
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.increaseIndentation();
        it.newLine();
      }
    };
    format.append(_regionForKeyword, _function);
    ISemanticRegion _regionForKeyword_1 = this.regionAccess.regionForKeyword(table, "}");
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.decreaseIndentation();
        it.newLine();
      }
    };
    format.prepend(_regionForKeyword_1, _function_1);
    EList<ExampleRow> _rows = table.getRows();
    this.formatRows(_rows, format);
    EList<ExampleColumn> _columns = table.getColumns();
    this.formatColumns(_columns, format);
  }
  
  /**
   * Hack: No node for type Void - prevent NullPointerException
   */
  @Override
  protected void _format(final JvmParameterizedTypeReference type, final IFormattableDocument format) {
    ICompositeNode _findActualNodeFor = NodeModelUtils.findActualNodeFor(type);
    boolean _notEquals = (!Objects.equal(_findActualNodeFor, null));
    if (_notEquals) {
      super._format(type, format);
    }
  }
  
  public void format(final Object table, final IFormattableDocument format) {
    if (table instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)table, format);
      return;
    } else if (table instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)table, format);
      return;
    } else if (table instanceof XtextResource) {
      _format((XtextResource)table, format);
      return;
    } else if (table instanceof XAssignment) {
      _format((XAssignment)table, format);
      return;
    } else if (table instanceof XBinaryOperation) {
      _format((XBinaryOperation)table, format);
      return;
    } else if (table instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)table, format);
      return;
    } else if (table instanceof XFeatureCall) {
      _format((XFeatureCall)table, format);
      return;
    } else if (table instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)table, format);
      return;
    } else if (table instanceof XPostfixOperation) {
      _format((XPostfixOperation)table, format);
      return;
    } else if (table instanceof XWhileExpression) {
      _format((XWhileExpression)table, format);
      return;
    } else if (table instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)table, format);
      return;
    } else if (table instanceof ExampleTable) {
      _format((ExampleTable)table, format);
      return;
    } else if (table instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)table, format);
      return;
    } else if (table instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)table, format);
      return;
    } else if (table instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)table, format);
      return;
    } else if (table instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)table, format);
      return;
    } else if (table instanceof XBlockExpression) {
      _format((XBlockExpression)table, format);
      return;
    } else if (table instanceof XCastedExpression) {
      _format((XCastedExpression)table, format);
      return;
    } else if (table instanceof XClosure) {
      _format((XClosure)table, format);
      return;
    } else if (table instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)table, format);
      return;
    } else if (table instanceof XConstructorCall) {
      _format((XConstructorCall)table, format);
      return;
    } else if (table instanceof XForLoopExpression) {
      _format((XForLoopExpression)table, format);
      return;
    } else if (table instanceof XIfExpression) {
      _format((XIfExpression)table, format);
      return;
    } else if (table instanceof XInstanceOfExpression) {
      _format((XInstanceOfExpression)table, format);
      return;
    } else if (table instanceof XReturnExpression) {
      _format((XReturnExpression)table, format);
      return;
    } else if (table instanceof XSwitchExpression) {
      _format((XSwitchExpression)table, format);
      return;
    } else if (table instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)table, format);
      return;
    } else if (table instanceof XThrowExpression) {
      _format((XThrowExpression)table, format);
      return;
    } else if (table instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)table, format);
      return;
    } else if (table instanceof XTypeLiteral) {
      _format((XTypeLiteral)table, format);
      return;
    } else if (table instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)table, format);
      return;
    } else if (table instanceof XAnnotation) {
      _format((XAnnotation)table, format);
      return;
    } else if (table instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)table, format);
      return;
    } else if (table instanceof XCatchClause) {
      _format((XCatchClause)table, format);
      return;
    } else if (table instanceof XExpression) {
      _format((XExpression)table, format);
      return;
    } else if (table instanceof XImportDeclaration) {
      _format((XImportDeclaration)table, format);
      return;
    } else if (table instanceof XImportSection) {
      _format((XImportSection)table, format);
      return;
    } else if (table == null) {
      _format((Void)null, format);
      return;
    } else if (table != null) {
      _format(table, format);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(table, format).toString());
    }
  }
}
