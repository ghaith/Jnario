/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.jnario.JnarioPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jnario.feature.feature.FeatureFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "feature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org/jnario/feature/Feature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "feature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturePackage eINSTANCE = org.jnario.feature.feature.impl.FeaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.FeatureImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ANNOTATIONS = JnarioPackage.SPECIFICATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MODIFIERS = JnarioPackage.SPECIFICATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ANNOTATION_INFO = JnarioPackage.SPECIFICATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = JnarioPackage.SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBERS = JnarioPackage.SPECIFICATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXTENDS = JnarioPackage.SPECIFICATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SCENARIOS = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BACKGROUND = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ScenarioImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ANNOTATIONS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MODIFIERS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ANNOTATION_INFO = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MEMBERS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__EXTENDS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.BackgroundImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__ANNOTATIONS = SCENARIO__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__MODIFIERS = SCENARIO__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__ANNOTATION_INFO = SCENARIO__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__NAME = SCENARIO__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__MEMBERS = SCENARIO__MEMBERS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__EXTENDS = SCENARIO__EXTENDS;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.StepImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ANNOTATIONS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MODIFIERS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ANNOTATION_INFO = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__EXPRESSION = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE_PARAMETERS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RETURN_TYPE = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__EXCEPTIONS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = JnarioPackage.EXECUTABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.StepImplementationImpl <em>Step Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.StepImplementationImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepImplementation()
	 * @generated
	 */
	int STEP_IMPLEMENTATION = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__MODIFIERS = STEP__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__EXPRESSION = STEP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__TYPE_PARAMETERS = STEP__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__RETURN_TYPE = STEP__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__EXCEPTIONS = STEP__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Step Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.GivenImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGiven()
	 * @generated
	 */
	int GIVEN = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__ANNOTATIONS = STEP_IMPLEMENTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__MODIFIERS = STEP_IMPLEMENTATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__ANNOTATION_INFO = STEP_IMPLEMENTATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__NAME = STEP_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__EXPRESSION = STEP_IMPLEMENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__TYPE_PARAMETERS = STEP_IMPLEMENTATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__RETURN_TYPE = STEP_IMPLEMENTATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__EXCEPTIONS = STEP_IMPLEMENTATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__PARAMETERS = STEP_IMPLEMENTATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = STEP_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.WhenImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ANNOTATIONS = STEP_IMPLEMENTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__MODIFIERS = STEP_IMPLEMENTATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ANNOTATION_INFO = STEP_IMPLEMENTATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__NAME = STEP_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__EXPRESSION = STEP_IMPLEMENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__TYPE_PARAMETERS = STEP_IMPLEMENTATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__RETURN_TYPE = STEP_IMPLEMENTATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__EXCEPTIONS = STEP_IMPLEMENTATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__PARAMETERS = STEP_IMPLEMENTATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = STEP_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ThenImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThen()
	 * @generated
	 */
	int THEN = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__ANNOTATIONS = STEP_IMPLEMENTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__MODIFIERS = STEP_IMPLEMENTATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__ANNOTATION_INFO = STEP_IMPLEMENTATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__NAME = STEP_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__EXPRESSION = STEP_IMPLEMENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__TYPE_PARAMETERS = STEP_IMPLEMENTATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__RETURN_TYPE = STEP_IMPLEMENTATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__EXCEPTIONS = STEP_IMPLEMENTATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__PARAMETERS = STEP_IMPLEMENTATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = STEP_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.AndImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ANNOTATIONS = STEP_IMPLEMENTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__MODIFIERS = STEP_IMPLEMENTATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ANNOTATION_INFO = STEP_IMPLEMENTATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = STEP_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPRESSION = STEP_IMPLEMENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__TYPE_PARAMETERS = STEP_IMPLEMENTATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RETURN_TYPE = STEP_IMPLEMENTATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXCEPTIONS = STEP_IMPLEMENTATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__PARAMETERS = STEP_IMPLEMENTATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = STEP_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.FeatureFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.FeatureFileImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeatureFile()
	 * @generated
	 */
	int FEATURE_FILE = 8;

	/**
	 * The feature id for the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE__IMPORT_SECTION = JnarioPackage.JNARIO_FILE__IMPORT_SECTION;

	/**
	 * The feature id for the '<em><b>Xtend Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE__XTEND_TYPES = JnarioPackage.JNARIO_FILE__XTEND_TYPES;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE__PACKAGE = JnarioPackage.JNARIO_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE_FEATURE_COUNT = JnarioPackage.JNARIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.StepReferenceImpl <em>Step Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.StepReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepReference()
	 * @generated
	 */
	int STEP_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__MODIFIERS = STEP__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__EXPRESSION = STEP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__TYPE_PARAMETERS = STEP__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__RETURN_TYPE = STEP__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__EXCEPTIONS = STEP__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__REFERENCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.GivenReferenceImpl <em>Given Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.GivenReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGivenReference()
	 * @generated
	 */
	int GIVEN_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__MODIFIERS = STEP_REFERENCE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__EXPRESSION = STEP_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__TYPE_PARAMETERS = STEP_REFERENCE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__RETURN_TYPE = STEP_REFERENCE__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__EXCEPTIONS = STEP_REFERENCE__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__PARAMETERS = STEP_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__SYNTHETIC_STEP_REFERENCE = STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE;

	/**
	 * The number of structural features of the '<em>Given Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.WhenReferenceImpl <em>When Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.WhenReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhenReference()
	 * @generated
	 */
	int WHEN_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__MODIFIERS = STEP_REFERENCE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__EXPRESSION = STEP_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__TYPE_PARAMETERS = STEP_REFERENCE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__RETURN_TYPE = STEP_REFERENCE__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__EXCEPTIONS = STEP_REFERENCE__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__PARAMETERS = STEP_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__SYNTHETIC_STEP_REFERENCE = STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE;

	/**
	 * The number of structural features of the '<em>When Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ThenReferenceImpl <em>Then Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ThenReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThenReference()
	 * @generated
	 */
	int THEN_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__MODIFIERS = STEP_REFERENCE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__EXPRESSION = STEP_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__TYPE_PARAMETERS = STEP_REFERENCE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__RETURN_TYPE = STEP_REFERENCE__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__EXCEPTIONS = STEP_REFERENCE__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__PARAMETERS = STEP_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__SYNTHETIC_STEP_REFERENCE = STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE;

	/**
	 * The number of structural features of the '<em>Then Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.AndReferenceImpl <em>And Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.AndReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAndReference()
	 * @generated
	 */
	int AND_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__MODIFIERS = STEP_REFERENCE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__EXPRESSION = STEP_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__TYPE_PARAMETERS = STEP_REFERENCE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__RETURN_TYPE = STEP_REFERENCE__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__EXCEPTIONS = STEP_REFERENCE__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__PARAMETERS = STEP_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__SYNTHETIC_STEP_REFERENCE = STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE;

	/**
	 * The number of structural features of the '<em>And Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ButImpl <em>But</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ButImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getBut()
	 * @generated
	 */
	int BUT = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__ANNOTATIONS = STEP_IMPLEMENTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__MODIFIERS = STEP_IMPLEMENTATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__ANNOTATION_INFO = STEP_IMPLEMENTATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__NAME = STEP_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__EXPRESSION = STEP_IMPLEMENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__TYPE_PARAMETERS = STEP_IMPLEMENTATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__RETURN_TYPE = STEP_IMPLEMENTATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__EXCEPTIONS = STEP_IMPLEMENTATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__PARAMETERS = STEP_IMPLEMENTATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_FEATURE_COUNT = STEP_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ButReferenceImpl <em>But Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ButReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getButReference()
	 * @generated
	 */
	int BUT_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__MODIFIERS = STEP_REFERENCE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__EXPRESSION = STEP_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__TYPE_PARAMETERS = STEP_REFERENCE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__RETURN_TYPE = STEP_REFERENCE__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__EXCEPTIONS = STEP_REFERENCE__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__PARAMETERS = STEP_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE__SYNTHETIC_STEP_REFERENCE = STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE;

	/**
	 * The number of structural features of the '<em>But Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.jnario.feature.feature.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.feature.feature.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.jnario.feature.feature.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.jnario.feature.feature.Feature#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenarios</em>'.
	 * @see org.jnario.feature.feature.Feature#getScenarios()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Scenarios();

	/**
	 * Returns the meta object for the reference '{@link org.jnario.feature.feature.Feature#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Background</em>'.
	 * @see org.jnario.feature.feature.Feature#getBackground()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Background();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see org.jnario.feature.feature.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.jnario.feature.feature.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.jnario.feature.feature.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see org.jnario.feature.feature.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see org.jnario.feature.feature.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see org.jnario.feature.feature.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.jnario.feature.feature.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.FeatureFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.jnario.feature.feature.FeatureFile
	 * @generated
	 */
	EClass getFeatureFile();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.GivenReference <em>Given Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given Reference</em>'.
	 * @see org.jnario.feature.feature.GivenReference
	 * @generated
	 */
	EClass getGivenReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.WhenReference <em>When Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Reference</em>'.
	 * @see org.jnario.feature.feature.WhenReference
	 * @generated
	 */
	EClass getWhenReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.ThenReference <em>Then Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then Reference</em>'.
	 * @see org.jnario.feature.feature.ThenReference
	 * @generated
	 */
	EClass getThenReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.AndReference <em>And Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Reference</em>'.
	 * @see org.jnario.feature.feature.AndReference
	 * @generated
	 */
	EClass getAndReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.StepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Reference</em>'.
	 * @see org.jnario.feature.feature.StepReference
	 * @generated
	 */
	EClass getStepReference();

	/**
	 * Returns the meta object for the reference '{@link org.jnario.feature.feature.StepReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.jnario.feature.feature.StepReference#getReference()
	 * @see #getStepReference()
	 * @generated
	 */
	EReference getStepReference_Reference();

	/**
	 * Returns the meta object for the reference '{@link org.jnario.feature.feature.StepReference#getSyntheticStepReference <em>Synthetic Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synthetic Step Reference</em>'.
	 * @see org.jnario.feature.feature.StepReference#getSyntheticStepReference()
	 * @see #getStepReference()
	 * @generated
	 */
	EReference getStepReference_SyntheticStepReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.StepImplementation <em>Step Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Implementation</em>'.
	 * @see org.jnario.feature.feature.StepImplementation
	 * @generated
	 */
	EClass getStepImplementation();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.But <em>But</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>But</em>'.
	 * @see org.jnario.feature.feature.But
	 * @generated
	 */
	EClass getBut();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.ButReference <em>But Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>But Reference</em>'.
	 * @see org.jnario.feature.feature.ButReference
	 * @generated
	 */
	EClass getButReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureFactory getFeatureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.FeatureImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SCENARIOS = eINSTANCE.getFeature_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BACKGROUND = eINSTANCE.getFeature_Background();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.BackgroundImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ScenarioImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.StepImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.GivenImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.WhenImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ThenImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.AndImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.FeatureFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.FeatureFileImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeatureFile()
		 * @generated
		 */
		EClass FEATURE_FILE = eINSTANCE.getFeatureFile();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.GivenReferenceImpl <em>Given Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.GivenReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGivenReference()
		 * @generated
		 */
		EClass GIVEN_REFERENCE = eINSTANCE.getGivenReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.WhenReferenceImpl <em>When Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.WhenReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhenReference()
		 * @generated
		 */
		EClass WHEN_REFERENCE = eINSTANCE.getWhenReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ThenReferenceImpl <em>Then Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ThenReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThenReference()
		 * @generated
		 */
		EClass THEN_REFERENCE = eINSTANCE.getThenReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.AndReferenceImpl <em>And Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.AndReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAndReference()
		 * @generated
		 */
		EClass AND_REFERENCE = eINSTANCE.getAndReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.StepReferenceImpl <em>Step Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.StepReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepReference()
		 * @generated
		 */
		EClass STEP_REFERENCE = eINSTANCE.getStepReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_REFERENCE__REFERENCE = eINSTANCE.getStepReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Synthetic Step Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE = eINSTANCE.getStepReference_SyntheticStepReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.StepImplementationImpl <em>Step Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.StepImplementationImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepImplementation()
		 * @generated
		 */
		EClass STEP_IMPLEMENTATION = eINSTANCE.getStepImplementation();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ButImpl <em>But</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ButImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getBut()
		 * @generated
		 */
		EClass BUT = eINSTANCE.getBut();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ButReferenceImpl <em>But Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ButReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getButReference()
		 * @generated
		 */
		EClass BUT_REFERENCE = eINSTANCE.getButReference();

	}

} //FeaturePackage
