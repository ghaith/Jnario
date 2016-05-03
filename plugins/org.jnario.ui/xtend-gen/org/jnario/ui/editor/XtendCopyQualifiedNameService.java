package org.jnario.ui.editor;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.ui.editor.copyqualifiedname.XbaseCopyQualifiedNameService;
import org.jnario.JnarioFunction;

@SuppressWarnings("all")
public class XtendCopyQualifiedNameService extends XbaseCopyQualifiedNameService {
  protected String _getQualifiedName(final JnarioFunction it, final EObject context) {
    return this.toQualifiedName(it);
  }
  
  protected String _getQualifiedName(final JnarioFunction it, final Void context) {
    return this.toQualifiedName(it);
  }
  
  protected String toQualifiedName(final JnarioFunction it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)");
    return _builder.toString();
  }
  
  public String getQualifiedName(final EObject it, final EObject context) {
    if (it instanceof JvmConstructor
         && context instanceof XConstructorCall) {
      return _getQualifiedName((JvmConstructor)it, (XConstructorCall)context);
    } else if (it instanceof JvmExecutable
         && context instanceof XAbstractFeatureCall) {
      return _getQualifiedName((JvmExecutable)it, (XAbstractFeatureCall)context);
    } else if (it instanceof JvmExecutable
         && context != null) {
      return _getQualifiedName((JvmExecutable)it, context);
    } else if (it instanceof JvmExecutable
         && context == null) {
      return _getQualifiedName((JvmExecutable)it, (Void)null);
    } else if (it instanceof JnarioFunction
         && context != null) {
      return _getQualifiedName((JnarioFunction)it, context);
    } else if (it instanceof JnarioFunction
         && context == null) {
      return _getQualifiedName((JnarioFunction)it, (Void)null);
    } else if (it != null
         && context != null) {
      return _getQualifiedName(it, context);
    } else if (it != null
         && context == null) {
      return _getQualifiedName(it, (Void)null);
    } else if (it == null
         && context != null) {
      return _getQualifiedName((Void)null, context);
    } else if (it == null
         && context == null) {
      return _getQualifiedName((Void)null, (Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, context).toString());
    }
  }
}
