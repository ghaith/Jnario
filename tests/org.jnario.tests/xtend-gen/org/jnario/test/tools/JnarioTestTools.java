package org.jnario.test.tools;

import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class JnarioTestTools {
  public static void assertOKWithMessage(final AssertableDiagnostics it) {
    Diagnostic _diagnostic = it.getDiagnostic();
    List<Diagnostic> _children = _diagnostic.getChildren();
    int _size = _children.size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      InputOutput.<String>println("Diagnostics:");
      Diagnostic _diagnostic_1 = it.getDiagnostic();
      List<Diagnostic> _children_1 = _diagnostic_1.getChildren();
      final Consumer<Diagnostic> _function = new Consumer<Diagnostic>() {
        @Override
        public void accept(final Diagnostic it) {
          String _message = it.getMessage();
          String _plus = ("- " + _message);
          InputOutput.<String>println(_plus);
        }
      };
      _children_1.forEach(_function);
      it.fail("There are expected to be no diagnostics.");
    }
  }
}
