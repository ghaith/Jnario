package org.jnario.xbase.richstring.util;

import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.jnario.xbase.richstring.xbasewithrichstring.RichString;
import org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf;

@SuppressWarnings("all")
public class XbaseWithRichstringExpressionHelper extends XExpressionHelper {
  @Override
  public boolean hasSideEffects(final XExpression expr) {
    boolean _xblockexpression = false;
    {
      if ((expr instanceof RichString)) {
        return false;
      }
      _xblockexpression = super.hasSideEffects(expr);
    }
    return _xblockexpression;
  }
  
  public boolean isLiteral(final XExpression expr) {
    return ((((((((expr instanceof XClosure) || (expr instanceof XStringLiteral)) || (expr instanceof XTypeLiteral)) || (expr instanceof XBooleanLiteral)) || (expr instanceof XNumberLiteral)) || (expr instanceof XNullLiteral)) || (expr instanceof XAnnotation)) || (expr instanceof RichStringIf));
  }
}
