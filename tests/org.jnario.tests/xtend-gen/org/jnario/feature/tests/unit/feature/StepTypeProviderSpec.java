package org.jnario.feature.tests.unit.feature;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepTypeProvider;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("StepTypeProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepTypeProviderSpec {
  @Extension
  @org.jnario.runner.Extension
  public FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  public StepTypeProvider _stepTypeProvider = new StepTypeProvider();
  
  @Extension
  @org.jnario.runner.Extension
  public FeaturePackage pack = FeaturePackage.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Test
  @Named("createGiven.expectedTypes => GIVEN")
  @Order(1)
  public void _createGivenExpectedTypesGIVEN() throws Exception {
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(this.factory.createGiven());
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.GIVEN);
    Assert.assertTrue("\nExpected createGiven.expectedTypes => GIVEN but"
     + "\n     createGiven.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createGiven is " + new org.hamcrest.StringDescription().appendValue(this.factory.createGiven()).toString()
     + "\n     GIVEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.GIVEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createGivenReference.expectedTypes => GIVEN")
  @Order(2)
  public void _createGivenReferenceExpectedTypesGIVEN() throws Exception {
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(this.factory.createGivenReference());
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.GIVEN);
    Assert.assertTrue("\nExpected createGivenReference.expectedTypes => GIVEN but"
     + "\n     createGivenReference.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createGivenReference is " + new org.hamcrest.StringDescription().appendValue(this.factory.createGivenReference()).toString()
     + "\n     GIVEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.GIVEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createWhen.expectedTypes => WHEN")
  @Order(3)
  public void _createWhenExpectedTypesWHEN() throws Exception {
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(this.factory.createWhen());
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.WHEN);
    Assert.assertTrue("\nExpected createWhen.expectedTypes => WHEN but"
     + "\n     createWhen.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createWhen is " + new org.hamcrest.StringDescription().appendValue(this.factory.createWhen()).toString()
     + "\n     WHEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.WHEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createWhenReference.expectedTypes => WHEN")
  @Order(4)
  public void _createWhenReferenceExpectedTypesWHEN() throws Exception {
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(this.factory.createWhenReference());
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.WHEN);
    Assert.assertTrue("\nExpected createWhenReference.expectedTypes => WHEN but"
     + "\n     createWhenReference.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createWhenReference is " + new org.hamcrest.StringDescription().appendValue(this.factory.createWhenReference()).toString()
     + "\n     WHEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.WHEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createThen.expectedTypes => THEN")
  @Order(5)
  public void _createThenExpectedTypesTHEN() throws Exception {
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(this.factory.createThen());
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.THEN);
    Assert.assertTrue("\nExpected createThen.expectedTypes => THEN but"
     + "\n     createThen.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createThen is " + new org.hamcrest.StringDescription().appendValue(this.factory.createThen()).toString()
     + "\n     THEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.THEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createThenReference.expectedTypes => THEN")
  @Order(6)
  public void _createThenReferenceExpectedTypesTHEN() throws Exception {
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(this.factory.createThenReference());
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.THEN);
    Assert.assertTrue("\nExpected createThenReference.expectedTypes => THEN but"
     + "\n     createThenReference.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createThenReference is " + new org.hamcrest.StringDescription().appendValue(this.factory.createThenReference()).toString()
     + "\n     THEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.THEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Feature: something Scenario: scenario Given something And something else And something else \\\'\\\'\\\'.expectedTypes =>  GIVEN")
  @Order(7)
  public void _featureSomethingScenarioScenarioGivenSomethingAndSomethingElseAndSomethingElseExpectedTypesGIVEN() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: something");
    _builder.newLine();
    _builder.append("Scenario: scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And something else");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And something else");
    _builder.newLine();
    Set<EClass> _expectedTypes = this.expectedTypes(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, StepTypeProvider.GIVEN);
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\tFeature: something\r\n\t\tScenario: scenario\r\n\t\t\tGiven something\r\n\t\t\tAnd something else\r\n\t\t\tAnd something else\r\n\t\'\'\'.expectedTypes =>  GIVEN but"
     + "\n     \'\'\'\r\n\t\tFeature: something\r\n\t\tScenario: scenario\r\n\t\t\tGiven something\r\n\t\t\tAnd something else\r\n\t\t\tAnd something else\r\n\t\'\'\'.expectedTypes is " + new org.hamcrest.StringDescription().appendValue(_expectedTypes).toString()
     + "\n     \'\'\'\r\n\t\tFeature: something\r\n\t\tScenario: scenario\r\n\t\t\tGiven something\r\n\t\t\tAnd something else\r\n\t\t\tAnd something else\r\n\t\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder).toString()
     + "\n     GIVEN is " + new org.hamcrest.StringDescription().appendValue(StepTypeProvider.GIVEN).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("calculates actual type")
  @Order(8)
  public void _calculatesActualType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: something");
    _builder.newLine();
    _builder.append("Scenario: scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("But something else");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And something else");
    _builder.newLine();
    EClass _actualType = this.actualType(_builder);
    EClass _givenReference = this.pack.getGivenReference();
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\tFeature: something\r\n\t\tScenario: scenario\r\n\t\t\tGiven something\r\n\t\t\tBut something else\r\n\t\t\tAnd something else\r\n\t\'\'\'.actualType =>  givenReference but"
     + "\n     \'\'\'\r\n\t\tFeature: something\r\n\t\tScenario: scenario\r\n\t\t\tGiven something\r\n\t\t\tBut something else\r\n\t\t\tAnd something else\r\n\t\'\'\'.actualType is " + new org.hamcrest.StringDescription().appendValue(_actualType).toString()
     + "\n     \'\'\'\r\n\t\tFeature: something\r\n\t\tScenario: scenario\r\n\t\t\tGiven something\r\n\t\t\tBut something else\r\n\t\t\tAnd something else\r\n\t\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder).toString()
     + "\n     givenReference is " + new org.hamcrest.StringDescription().appendValue(_givenReference).toString() + "\n", Should.operator_doubleArrow(_actualType, _givenReference));
    
  }
  
  public EClass actualType(@Extension final CharSequence s) {
    EClass _xblockexpression = null;
    {
      this._modelStore.parseScenario(s);
      _xblockexpression = this._stepTypeProvider.getActualType(IterableExtensions.<Step>last(this._modelStore.firstScenario().getSteps()));
    }
    return _xblockexpression;
  }
  
  public Set<EClass> expectedTypes(@Extension final CharSequence s) {
    Set<EClass> _xblockexpression = null;
    {
      this._modelStore.parseScenario(s);
      _xblockexpression = this._stepTypeProvider.getExpectedTypes(IterableExtensions.<Step>last(this._modelStore.firstScenario().getSteps()));
    }
    return _xblockexpression;
  }
}
