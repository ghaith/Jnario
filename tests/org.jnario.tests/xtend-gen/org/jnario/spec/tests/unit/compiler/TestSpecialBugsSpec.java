package org.jnario.spec.tests.unit.compiler;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Test special bugs")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class TestSpecialBugsSpec {
  @Test
  @Named("Test error - TODO: import a functional handle on the type resolution that delegates to the best available")
  @Order(1)
  public void _testErrorTODOImportAFunctionalHandleOnTheTypeResolutionThatDelegatesToTheBestAvailable() throws Exception {
    final Procedure1<List<Integer>> _function = new Procedure1<List<Integer>>() {
      @Override
      public void apply(final List<Integer> it) {
        final Consumer<Integer> _function = new Consumer<Integer>() {
          @Override
          public void accept(final Integer it) {
            InputOutput.<Integer>println(it);
          }
        };
        it.forEach(_function);
      }
    };
    ObjectExtensions.<List<Integer>>operator_doubleArrow(
      Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3))), _function);
  }
}
