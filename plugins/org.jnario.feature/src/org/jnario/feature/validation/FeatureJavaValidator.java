/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.validation;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.jnario.ExampleTable;
import org.jnario.JnarioField;
import org.jnario.JnarioPackage;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.validation.JnarioJavaValidator;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
@ComposedChecks(validators={JnarioJavaValidator.class, NamesAreUniqueValidator.class})
public class FeatureJavaValidator extends AbstractFeatureJavaValidator {
	
	@Inject StepNameProvider nameProvider;
	@Inject FeatureClassNameProvider classNameProvider;

	// TODO NO_XTEND
//	@Check
//	protected void checkModifiers(JnarioClass xtendClass) {
//		if (!(xtendClass instanceof Scenario)) {
//			super.checkModifiers(xtendClass);
//		}
//	}
	
	@Check(CheckType.FAST)
	public void checkFeaturesHaveAName(Feature feature){
		if(isNullOrEmpty(feature.getName())){
			error("Features should have a description", JnarioPackage.Literals.JNARIO_TYPE_DECLARATION__NAME);
		}
	}
	
//	@Check(CheckType.FAST)
//	public void checkDuplicateScenarioNames(Feature feature){
//		Set<String> names = newHashSet();
//		for (Scenario scenario : feature.getScenarios()) {
//			if(!names.add(classNameProvider.toJavaClassName(scenario))){
//				error("Duplicate scenario: '" + scenario.getName() + "'", JnarioPackage.Literals.XTEND_TYPE_DECLARATION__NAME);
//			}
//		}
//	}
//	
	public String removeKeywords(String string){
		return nameProvider.removeKeywords(string).trim();
	}
	
	@Check(CheckType.FAST)
	public void checkFeaturesHaveAName(Scenario scenario){
		if (scenario instanceof Background) {
			return;
		}
		String name = removeKeywords(scenario.getName());
		if(isNullOrEmpty(name)){
			error("Scenarios should have a description", JnarioPackage.Literals.JNARIO_TYPE_DECLARATION__NAME);
		}
	}
	
	@Check(CheckType.FAST)
	public void checkStepsHaveAName(Step step){
		String name = nameProvider.nameOf(step);
		name = nameProvider.removeKeywords(name);
		if(isNullOrEmpty(name)){
			error("Steps should have a description", JnarioPackage.Literals.JNARIO_FUNCTION__NAME);
		}
	}
	
	@Override
	public void checkVariableDeclaration(XVariableDeclaration declaration) {
		if(getContainerOfType(declaration, ExampleTable.class) == null){
			super.checkVariableDeclaration(declaration);
		}
	}
	
	
	@Override
	public  void checkLocalUsageOfDeclared(XVariableDeclaration variableDeclaration) {
	}
	
	protected void warning(String message, EObject source, EStructuralFeature feature, String code, String... issueData) {
		// avoids overriding the whole method
		if("The use of wildcard imports is deprecated.".equals(message)){
			return;
		}
		getMessageAcceptor().acceptWarning(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, code, issueData);
	}

	// TODO NO_XTEND
//	@Check
//	public void checkAbstract(JnarioFunction function) {
//		if (function instanceof Step) {
//			return;
//		}
//		super.checkAbstract(function);
//	}
	
	protected void error(String message, EObject source, EStructuralFeature feature, int index, String code, String... issueData) {
		if(NodeModelUtils.getNode(source) == null){
			source = EcoreUtil2.getContainerOfType(source, Step.class);
			feature = JnarioPackage.Literals.JNARIO_FUNCTION__NAME;
		}
		getMessageAcceptor().acceptError(message, source, feature, index, code, issueData);
	}
	
	
	@Check
	public void checkConflictingFields(Scenario scenario){
		
		Iterable<JnarioField> fields = filter(scenario.getMembers(), JnarioField.class);
		Set<String> names = new HashSet<String>();
		for (JnarioField jnarioField : fields) {
			if(names.contains(jnarioField.getName())){
				
			}else{
				names.add(jnarioField.getName());
			}
		}
	}
	
	// TODO NO_XTEND
//	@Override
//	@Check
//	public void checkDuplicateAndOverriddenFunctions(
//			JnarioTypeDeclaration jnarioType) {
//	}
	
	@Override
	protected void addIssue(String message, EObject source, String issueCode) {
		if(IssueCodes.IMPORT_WILDCARD_DEPRECATED == issueCode){
			return;
		}
		super.addIssue(message, source, issueCode);
	}
}
