package org.jnario.feature.formatting;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
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
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.services.FeatureGrammarAccess;
import org.jnario.formatter.JnarioFormatter;

@SuppressWarnings("all")
public class FeatureFormatter2 extends JnarioFormatter {
  @Inject
  @Extension
  private FeatureGrammarAccess _featureGrammarAccess;
  
  protected void _format(final Scenario scenario, @Extension final IFormattableDocument format) {
    ParserRule _scenarioRule = this._featureGrammarAccess.getScenarioRule();
    ISemanticRegion _regionForRuleCallTo = this.regionAccess.regionForRuleCallTo(scenario, _scenarioRule);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.increaseIndentation();
      }
    };
    format.prepend(_regionForRuleCallTo, _function);
  }
  
  protected void _format(final Background background, @Extension final IFormattableDocument format) {
    ParserRule _scenarioRule = this._featureGrammarAccess.getScenarioRule();
    ISemanticRegion _regionForRuleCallTo = this.regionAccess.regionForRuleCallTo(background, _scenarioRule);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.increaseIndentation();
      }
    };
    format.prepend(_regionForRuleCallTo, _function);
  }
  
  public void format(final Object background, final IFormattableDocument format) {
    if (background instanceof Background) {
      _format((Background)background, format);
      return;
    } else if (background instanceof Scenario) {
      _format((Scenario)background, format);
      return;
    } else if (background instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)background, format);
      return;
    } else if (background instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)background, format);
      return;
    } else if (background instanceof XtextResource) {
      _format((XtextResource)background, format);
      return;
    } else if (background instanceof XAssignment) {
      _format((XAssignment)background, format);
      return;
    } else if (background instanceof XBinaryOperation) {
      _format((XBinaryOperation)background, format);
      return;
    } else if (background instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)background, format);
      return;
    } else if (background instanceof XFeatureCall) {
      _format((XFeatureCall)background, format);
      return;
    } else if (background instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)background, format);
      return;
    } else if (background instanceof XPostfixOperation) {
      _format((XPostfixOperation)background, format);
      return;
    } else if (background instanceof XWhileExpression) {
      _format((XWhileExpression)background, format);
      return;
    } else if (background instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)background, format);
      return;
    } else if (background instanceof ExampleTable) {
      _format((ExampleTable)background, format);
      return;
    } else if (background instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)background, format);
      return;
    } else if (background instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)background, format);
      return;
    } else if (background instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)background, format);
      return;
    } else if (background instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)background, format);
      return;
    } else if (background instanceof XBlockExpression) {
      _format((XBlockExpression)background, format);
      return;
    } else if (background instanceof XCastedExpression) {
      _format((XCastedExpression)background, format);
      return;
    } else if (background instanceof XClosure) {
      _format((XClosure)background, format);
      return;
    } else if (background instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)background, format);
      return;
    } else if (background instanceof XConstructorCall) {
      _format((XConstructorCall)background, format);
      return;
    } else if (background instanceof XForLoopExpression) {
      _format((XForLoopExpression)background, format);
      return;
    } else if (background instanceof XIfExpression) {
      _format((XIfExpression)background, format);
      return;
    } else if (background instanceof XInstanceOfExpression) {
      _format((XInstanceOfExpression)background, format);
      return;
    } else if (background instanceof XReturnExpression) {
      _format((XReturnExpression)background, format);
      return;
    } else if (background instanceof XSwitchExpression) {
      _format((XSwitchExpression)background, format);
      return;
    } else if (background instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)background, format);
      return;
    } else if (background instanceof XThrowExpression) {
      _format((XThrowExpression)background, format);
      return;
    } else if (background instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)background, format);
      return;
    } else if (background instanceof XTypeLiteral) {
      _format((XTypeLiteral)background, format);
      return;
    } else if (background instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)background, format);
      return;
    } else if (background instanceof XAnnotation) {
      _format((XAnnotation)background, format);
      return;
    } else if (background instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)background, format);
      return;
    } else if (background instanceof XCatchClause) {
      _format((XCatchClause)background, format);
      return;
    } else if (background instanceof XExpression) {
      _format((XExpression)background, format);
      return;
    } else if (background instanceof XImportDeclaration) {
      _format((XImportDeclaration)background, format);
      return;
    } else if (background instanceof XImportSection) {
      _format((XImportSection)background, format);
      return;
    } else if (background == null) {
      _format((Void)null, format);
      return;
    } else if (background != null) {
      _format(background, format);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(background, format).toString());
    }
  }
}
