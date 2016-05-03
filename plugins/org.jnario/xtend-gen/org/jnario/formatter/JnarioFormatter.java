package org.jnario.formatter;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
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
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;

/**
 * TODO NO_XTEND - Verify implementation
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class JnarioFormatter extends XbaseWithAnnotationsFormatter {
  private void formatRows(final EList<ExampleRow> rows, @Extension final IFormattableDocument format) {
    final Consumer<ExampleRow> _function = new Consumer<ExampleRow>() {
      @Override
      public void accept(final ExampleRow it) {
        final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.newLine();
          }
        };
        format.<ExampleRow>append(it, _function);
      }
    };
    rows.forEach(_function);
  }
  
  private void formatColumns(final EList<ExampleColumn> columns, @Extension final IFormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method regionForFeature(EAttribute) is undefined"
      + "\nThe method regionForKeyword(String) is undefined"
      + "\nType mismatch: cannot convert from double to int"
      + "\nThe method getMultilineLength(IFormattableDocument, ITextSegment) from the type JnarioFormatter refers to the missing type ITextSegment"
      + "\nThe method getMultilineLastSegmentLength(IFormattableDocument, ITextSegment) from the type JnarioFormatter refers to the missing type ITextSegment"
      + "\nlength cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n- cannot be resolved"
      + "\nprepend cannot be resolved");
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
  
  private String[] getSplittedMultilineCell(final IFormattableDocument format, final /* ITextSegment */Object segment) {
    throw new Error("Unresolved compilation problems:"
      + "\noffset cannot be resolved"
      + "\n- cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n- cannot be resolved");
  }
  
  private int getMultilineLastSegmentLength(final IFormattableDocument format, final /* ITextSegment */Object segment) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getSplittedMultilineCell(IFormattableDocument, ITextSegment) from the type JnarioFormatter refers to the missing type ITextSegment");
  }
  
  private Integer getMultilineLength(final IFormattableDocument format, final /* ITextSegment */Object segment) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getSplittedMultilineCell(IFormattableDocument, ITextSegment) from the type JnarioFormatter refers to the missing type ITextSegment");
  }
  
  protected void _format(final ExampleTable table, @Extension final IFormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method regionForKeyword(String) is undefined for the type ExampleTable"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method regionForKeyword(String) is undefined for the type ExampleTable"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved");
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
    } else if (table instanceof XExpression) {
      _format((XExpression)table, format);
      return;
    } else if (table instanceof XImportDeclaration) {
      _format((XImportDeclaration)table, format);
      return;
    } else if (table instanceof XImportSection) {
      _format((XImportSection)table, format);
      return;
    } else if (table instanceof EObject) {
      _format((EObject)table, format);
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
