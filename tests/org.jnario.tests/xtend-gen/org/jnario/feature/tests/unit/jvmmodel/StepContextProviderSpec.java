package org.jnario.feature.tests.unit.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.JnarioField;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.jvmmodel.StepContextProvider;
import org.jnario.feature.tests.unit.jvmmodel.StepContextProviderUsedFieldsSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains(StepContextProviderUsedFieldsSpec.class)
@CreateWith(FeatureTestCreator.class)
@Named("StepContextProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepContextProviderSpec {
  @Subject
  public StepContextProvider subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore m;
  
  public Set<JnarioField> fields(@Extension final String... names) {
    Set<JnarioField> _xblockexpression = null;
    {
      final Set<String> expected = IterableExtensions.<String>toSet(((Iterable<String>)Conversions.doWrapArray(names)));
      Iterable<JnarioField> _filter = Iterables.<JnarioField>filter(this.m, JnarioField.class);
      final Function1<JnarioField, Boolean> _function = new Function1<JnarioField, Boolean>() {
        @Override
        public Boolean apply(final JnarioField it) {
          String _name = it.getName();
          return Boolean.valueOf(expected.contains(_name));
        }
      };
      Iterable<JnarioField> _filter_1 = IterableExtensions.<JnarioField>filter(_filter, _function);
      _xblockexpression = IterableExtensions.<JnarioField>toSet(_filter_1);
    }
    return _xblockexpression;
  }
  
  public Set<JnarioField> usedFields(@Extension final CharSequence content) {
    Set<JnarioField> _xblockexpression = null;
    {
      this.m.parseScenario(content);
      final StepImplementation step = this.m.<StepImplementation>first(StepImplementation.class);
      _xblockexpression = this.subject.usedFields(step);
    }
    return _xblockexpression;
  }
}
