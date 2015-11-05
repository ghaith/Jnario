package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("");
    _builder.newLine();
    _builder.append("val x = \"\"");
    _builder.newLine();
    
    String _plus = (s + _builder.toString());
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
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("");
      _builder.newLine();
      _builder.append("Feature: MyFeature");
      _builder.newLine();
      _builder.append("Scenario: The Scenario");
      _builder.newLine();
      
      String _plus = (_xifexpression + _builder.toString());
      String _plus_1 = (_plus + s);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("");
      _builder_1.newLine();
      
      final String input = (_plus_1 + _builder_1.toString());
      this._modelStore.parseScenario(input);
      Step _first = this._modelStore.<Step>first(Step.class);
      QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_first);
      _xblockexpression = this.converter.toString(_fullyQualifiedName);
    }
    return _xblockexpression;
  }
}
