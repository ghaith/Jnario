package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.FeatureQualifiedNameProvider;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderPackageNameSpec;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderStepNameSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains({ FeatureQualifiedNameProviderPackageNameSpec.class, FeatureQualifiedNameProviderStepNameSpec.class })
@CreateWith(FeatureTestCreator.class)
@Named("FeatureQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureQualifiedNameProviderSpec {
  @Subject
  public FeatureQualifiedNameProvider subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Inject
  IQualifiedNameConverter converter;
  
  public String implementedStepName(@Extension final CharSequence s) {
    String _plus = (s + "\nval x = \"\"\n");
    return this.stepName(_plus);
  }
  
  public String stepName(@Extension final CharSequence s) {
    return this.stepName(s, "myPackage");
  }
  
  public String stepName(@Extension final CharSequence s, @Extension final String packageName) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(packageName, null));
      if (_notEquals) {
        _xifexpression = ("package " + packageName);
      } else {
        _xifexpression = "";
      }
      String _plus = (_xifexpression + "\nFeature: MyFeature\nScenario: The Scenario\n");
      String _plus_1 = (_plus + s);
      final String input = (_plus_1 + "\n\n");
      this._modelStore.parseScenario(input);
      Step _first = this._modelStore.<Step>first(Step.class);
      QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_first);
      _xblockexpression = this.converter.toString(_fullyQualifiedName);
    }
    return _xblockexpression;
  }
}
