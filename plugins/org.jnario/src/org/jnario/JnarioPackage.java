/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.XbasePackage;

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
 * @see org.jnario.JnarioFactory
 * @model kind="package"
 * @generated
 */
public interface JnarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jnario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org/Jnario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jnario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JnarioPackage eINSTANCE = org.jnario.impl.JnarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleTableImpl <em>Example Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleTableImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleTable()
	 * @generated
	 */
	int EXAMPLE_TABLE = 0;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleRowImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleRow()
	 * @generated
	 */
	int EXAMPLE_ROW = 1;

	/**
	 * The meta object id for the '{@link org.jnario.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.AssertionImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 2;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleColumnImpl <em>Example Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleColumnImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleColumn()
	 * @generated
	 */
	int EXAMPLE_COLUMN = 3;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ShouldImpl <em>Should</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ShouldImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getShould()
	 * @generated
	 */
	int SHOULD = 4;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ShouldThrowImpl <em>Should Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ShouldThrowImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getShouldThrow()
	 * @generated
	 */
	int SHOULD_THROW = 5;

	/**
	 * The meta object id for the '{@link org.jnario.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.SpecificationImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 6;

	/**
	 * The meta object id for the '{@link org.jnario.Executable <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.Executable
	 * @see org.jnario.impl.JnarioPackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 7;

	/**
	 * The meta object id for the '{@link org.jnario.impl.MockLiteralImpl <em>Mock Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.MockLiteralImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getMockLiteral()
	 * @generated
	 */
	int MOCK_LITERAL = 8;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioAnnotationTargetImpl <em>Annotation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioAnnotationTargetImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioAnnotationTarget()
	 * @generated
	 */
	int JNARIO_ANNOTATION_TARGET = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_ANNOTATION_TARGET__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_ANNOTATION_TARGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioMemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioMemberImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioMember()
	 * @generated
	 */
	int JNARIO_MEMBER = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_MEMBER__ANNOTATIONS = JNARIO_ANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_MEMBER__MODIFIERS = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_MEMBER__ANNOTATION_INFO = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_MEMBER_FEATURE_COUNT = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATIONS = JNARIO_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__MODIFIERS = JNARIO_MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATION_INFO = JNARIO_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__NAME = JNARIO_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ROWS = JNARIO_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__COLUMNS = JNARIO_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Example Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_FEATURE_COUNT = JNARIO_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Example Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__CELLS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Example Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__FEATURE = XbasePackage.XBINARY_OPERATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__TYPE_ARGUMENTS = XbasePackage.XBINARY_OPERATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__IMPLICIT_RECEIVER = XbasePackage.XBINARY_OPERATION__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__INVALID_FEATURE_ISSUE_CODE = XbasePackage.XBINARY_OPERATION__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__VALID_FEATURE = XbasePackage.XBINARY_OPERATION__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__IMPLICIT_FIRST_ARGUMENT = XbasePackage.XBINARY_OPERATION__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__LEFT_OPERAND = XbasePackage.XBINARY_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__RIGHT_OPERAND = XbasePackage.XBINARY_OPERATION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Reassign First Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__REASSIGN_FIRST_ARGUMENT = XbasePackage.XBINARY_OPERATION__REASSIGN_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__NOT = XbasePackage.XBINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Should</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_FEATURE_COUNT = XbasePackage.XBINARY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_THROW__TYPE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_THROW__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Should Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_THROW_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ANNOTATIONS = EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MODIFIERS = EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ANNOTATION_INFO = EXECUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = EXECUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MEMBERS = EXECUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EXTENDS = EXECUTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = EXECUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_LITERAL__TYPE = XbasePackage.XTYPE_LITERAL__TYPE;

	/**
	 * The feature id for the '<em><b>Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_LITERAL__ARRAY_DIMENSIONS = XbasePackage.XTYPE_LITERAL__ARRAY_DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Mock Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_LITERAL_FEATURE_COUNT = XbasePackage.XTYPE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioFunctionImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioFunction()
	 * @generated
	 */
	int JNARIO_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__ANNOTATIONS = JNARIO_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__MODIFIERS = JNARIO_MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__ANNOTATION_INFO = JNARIO_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__NAME = JNARIO_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__EXPRESSION = JNARIO_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__TYPE_PARAMETERS = JNARIO_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__RETURN_TYPE = JNARIO_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__EXCEPTIONS = JNARIO_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION__PARAMETERS = JNARIO_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FUNCTION_FEATURE_COUNT = JNARIO_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleCellImpl <em>Example Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleCellImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleCell()
	 * @generated
	 */
	int EXAMPLE_CELL = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__ANNOTATIONS = JNARIO_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__MODIFIERS = JNARIO_FUNCTION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__ANNOTATION_INFO = JNARIO_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__NAME = JNARIO_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__EXPRESSION = JNARIO_FUNCTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__TYPE_PARAMETERS = JNARIO_FUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__RETURN_TYPE = JNARIO_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__EXCEPTIONS = JNARIO_FUNCTION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__PARAMETERS = JNARIO_FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Example Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL_FEATURE_COUNT = JNARIO_FUNCTION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioFileImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioFile()
	 * @generated
	 */
	int JNARIO_FILE = 10;

	/**
	 * The feature id for the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FILE__IMPORT_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Xtend Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FILE__XTEND_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FILE__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioTypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioTypeDeclarationImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioTypeDeclaration()
	 * @generated
	 */
	int JNARIO_TYPE_DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_TYPE_DECLARATION__ANNOTATIONS = JNARIO_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_TYPE_DECLARATION__MODIFIERS = JNARIO_MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_TYPE_DECLARATION__ANNOTATION_INFO = JNARIO_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_TYPE_DECLARATION__NAME = JNARIO_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_TYPE_DECLARATION__MEMBERS = JNARIO_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_TYPE_DECLARATION_FEATURE_COUNT = JNARIO_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioClassImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioClass()
	 * @generated
	 */
	int JNARIO_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS__ANNOTATIONS = JNARIO_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS__MODIFIERS = JNARIO_TYPE_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS__ANNOTATION_INFO = JNARIO_TYPE_DECLARATION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS__NAME = JNARIO_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS__MEMBERS = JNARIO_TYPE_DECLARATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS__EXTENDS = JNARIO_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_CLASS_FEATURE_COUNT = JNARIO_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioFieldImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioField()
	 * @generated
	 */
	int JNARIO_FIELD = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD__ANNOTATIONS = JNARIO_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD__MODIFIERS = JNARIO_MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD__ANNOTATION_INFO = JNARIO_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD__TYPE = JNARIO_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD__NAME = JNARIO_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD__INITIAL_VALUE = JNARIO_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FIELD_FEATURE_COUNT = JNARIO_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.jnario.impl.JnarioParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.JnarioParameterImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getJnarioParameter()
	 * @generated
	 */
	int JNARIO_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_PARAMETER__ANNOTATIONS = JNARIO_ANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_PARAMETER__NAME = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_PARAMETER__PARAMETER_TYPE = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_PARAMETER__VAR_ARG = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_PARAMETER__EXTENSION = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_PARAMETER_FEATURE_COUNT = JNARIO_ANNOTATION_TARGET_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.jnario.impl.RichStringImpl <em>Rich String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.RichStringImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getRichString()
	 * @generated
	 */
	int RICH_STRING = 18;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Rich String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.RichStringLiteralImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getRichStringLiteral()
	 * @generated
	 */
	int RICH_STRING_LITERAL = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL__VALUE = XbasePackage.XSTRING_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Rich String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Table</em>'.
	 * @see org.jnario.ExampleTable
	 * @generated
	 */
	EClass getExampleTable();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.ExampleTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.ExampleTable#getName()
	 * @see #getExampleTable()
	 * @generated
	 */
	EAttribute getExampleTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.jnario.ExampleTable#getRows()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.ExampleTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.jnario.ExampleTable#getColumns()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Columns();

	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleRow <em>Example Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Row</em>'.
	 * @see org.jnario.ExampleRow
	 * @generated
	 */
	EClass getExampleRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.ExampleRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.jnario.ExampleRow#getCells()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Cells();

	/**
	 * Returns the meta object for the container reference '{@link org.jnario.ExampleRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.jnario.ExampleRow#getTable()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Table();

	/**
	 * Returns the meta object for class '{@link org.jnario.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see org.jnario.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.Assertion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.jnario.Assertion#getExpression()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Expression();

	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleColumn <em>Example Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Column</em>'.
	 * @see org.jnario.ExampleColumn
	 * @generated
	 */
	EClass getExampleColumn();

	/**
	 * Returns the meta object for the container reference '{@link org.jnario.ExampleColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.jnario.ExampleColumn#getTable()
	 * @see #getExampleColumn()
	 * @generated
	 */
	EReference getExampleColumn_Table();

	/**
	 * Returns the meta object for the reference list '{@link org.jnario.ExampleColumn#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see org.jnario.ExampleColumn#getCells()
	 * @see #getExampleColumn()
	 * @generated
	 */
	EReference getExampleColumn_Cells();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.ExampleColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.ExampleColumn#getName()
	 * @see #getExampleColumn()
	 * @generated
	 */
	EAttribute getExampleColumn_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.ExampleColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.jnario.ExampleColumn#getType()
	 * @see #getExampleColumn()
	 * @generated
	 */
	EReference getExampleColumn_Type();

	/**
	 * Returns the meta object for class '{@link org.jnario.Should <em>Should</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Should</em>'.
	 * @see org.jnario.Should
	 * @generated
	 */
	EClass getShould();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.Should#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see org.jnario.Should#isNot()
	 * @see #getShould()
	 * @generated
	 */
	EAttribute getShould_Not();

	/**
	 * Returns the meta object for class '{@link org.jnario.ShouldThrow <em>Should Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Should Throw</em>'.
	 * @see org.jnario.ShouldThrow
	 * @generated
	 */
	EClass getShouldThrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.ShouldThrow#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.jnario.ShouldThrow#getType()
	 * @see #getShouldThrow()
	 * @generated
	 */
	EReference getShouldThrow_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.ShouldThrow#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.jnario.ShouldThrow#getExpression()
	 * @see #getShouldThrow()
	 * @generated
	 */
	EReference getShouldThrow_Expression();

	/**
	 * Returns the meta object for class '{@link org.jnario.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.jnario.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for class '{@link org.jnario.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see org.jnario.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for class '{@link org.jnario.MockLiteral <em>Mock Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mock Literal</em>'.
	 * @see org.jnario.MockLiteral
	 * @generated
	 */
	EClass getMockLiteral();

	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleCell <em>Example Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Cell</em>'.
	 * @see org.jnario.ExampleCell
	 * @generated
	 */
	EClass getExampleCell();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.jnario.JnarioFile
	 * @generated
	 */
	EClass getJnarioFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioFile#getImportSection <em>Import Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Section</em>'.
	 * @see org.jnario.JnarioFile#getImportSection()
	 * @see #getJnarioFile()
	 * @generated
	 */
	EReference getJnarioFile_ImportSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.JnarioFile#getXtendTypes <em>Xtend Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xtend Types</em>'.
	 * @see org.jnario.JnarioFile#getXtendTypes()
	 * @see #getJnarioFile()
	 * @generated
	 */
	EReference getJnarioFile_XtendTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.jnario.JnarioFile#getPackage()
	 * @see #getJnarioFile()
	 * @generated
	 */
	EAttribute getJnarioFile_Package();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.jnario.JnarioClass
	 * @generated
	 */
	EClass getJnarioClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends</em>'.
	 * @see org.jnario.JnarioClass#getExtends()
	 * @see #getJnarioClass()
	 * @generated
	 */
	EReference getJnarioClass_Extends();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.jnario.JnarioMember
	 * @generated
	 */
	EClass getJnarioMember();

	/**
	 * Returns the meta object for the attribute list '{@link org.jnario.JnarioMember#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.jnario.JnarioMember#getModifiers()
	 * @see #getJnarioMember()
	 * @generated
	 */
	EAttribute getJnarioMember_Modifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioMember#getAnnotationInfo <em>Annotation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Info</em>'.
	 * @see org.jnario.JnarioMember#getAnnotationInfo()
	 * @see #getJnarioMember()
	 * @generated
	 */
	EReference getJnarioMember_AnnotationInfo();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.jnario.JnarioFunction
	 * @generated
	 */
	EClass getJnarioFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.JnarioFunction#getName()
	 * @see #getJnarioFunction()
	 * @generated
	 */
	EAttribute getJnarioFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.jnario.JnarioFunction#getExpression()
	 * @see #getJnarioFunction()
	 * @generated
	 */
	EReference getJnarioFunction_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.JnarioFunction#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.jnario.JnarioFunction#getTypeParameters()
	 * @see #getJnarioFunction()
	 * @generated
	 */
	EReference getJnarioFunction_TypeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.jnario.JnarioFunction#getReturnType()
	 * @see #getJnarioFunction()
	 * @generated
	 */
	EReference getJnarioFunction_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.JnarioFunction#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.jnario.JnarioFunction#getExceptions()
	 * @see #getJnarioFunction()
	 * @generated
	 */
	EReference getJnarioFunction_Exceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.JnarioFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.jnario.JnarioFunction#getParameters()
	 * @see #getJnarioFunction()
	 * @generated
	 */
	EReference getJnarioFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.jnario.JnarioField
	 * @generated
	 */
	EClass getJnarioField();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.jnario.JnarioField#getType()
	 * @see #getJnarioField()
	 * @generated
	 */
	EReference getJnarioField_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.JnarioField#getName()
	 * @see #getJnarioField()
	 * @generated
	 */
	EAttribute getJnarioField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioField#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.jnario.JnarioField#getInitialValue()
	 * @see #getJnarioField()
	 * @generated
	 */
	EReference getJnarioField_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see org.jnario.JnarioTypeDeclaration
	 * @generated
	 */
	EClass getJnarioTypeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioTypeDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.JnarioTypeDeclaration#getName()
	 * @see #getJnarioTypeDeclaration()
	 * @generated
	 */
	EAttribute getJnarioTypeDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.JnarioTypeDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.jnario.JnarioTypeDeclaration#getMembers()
	 * @see #getJnarioTypeDeclaration()
	 * @generated
	 */
	EReference getJnarioTypeDeclaration_Members();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Target</em>'.
	 * @see org.jnario.JnarioAnnotationTarget
	 * @generated
	 */
	EClass getJnarioAnnotationTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.JnarioAnnotationTarget#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.jnario.JnarioAnnotationTarget#getAnnotations()
	 * @see #getJnarioAnnotationTarget()
	 * @generated
	 */
	EReference getJnarioAnnotationTarget_Annotations();

	/**
	 * Returns the meta object for class '{@link org.jnario.JnarioParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.jnario.JnarioParameter
	 * @generated
	 */
	EClass getJnarioParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.JnarioParameter#getName()
	 * @see #getJnarioParameter()
	 * @generated
	 */
	EAttribute getJnarioParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.JnarioParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see org.jnario.JnarioParameter#getParameterType()
	 * @see #getJnarioParameter()
	 * @generated
	 */
	EReference getJnarioParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioParameter#isVarArg <em>Var Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Arg</em>'.
	 * @see org.jnario.JnarioParameter#isVarArg()
	 * @see #getJnarioParameter()
	 * @generated
	 */
	EAttribute getJnarioParameter_VarArg();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.JnarioParameter#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.jnario.JnarioParameter#isExtension()
	 * @see #getJnarioParameter()
	 * @generated
	 */
	EAttribute getJnarioParameter_Extension();

	/**
	 * Returns the meta object for class '{@link org.jnario.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String</em>'.
	 * @see org.jnario.RichString
	 * @generated
	 */
	EClass getRichString();

	/**
	 * Returns the meta object for class '{@link org.jnario.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Literal</em>'.
	 * @see org.jnario.RichStringLiteral
	 * @generated
	 */
	EClass getRichStringLiteral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JnarioFactory getJnarioFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.jnario.impl.ExampleTableImpl <em>Example Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleTableImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleTable()
		 * @generated
		 */
		EClass EXAMPLE_TABLE = eINSTANCE.getExampleTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TABLE__NAME = eINSTANCE.getExampleTable_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__ROWS = eINSTANCE.getExampleTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__COLUMNS = eINSTANCE.getExampleTable_Columns();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleRowImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleRow()
		 * @generated
		 */
		EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__CELLS = eINSTANCE.getExampleRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__TABLE = eINSTANCE.getExampleRow_Table();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.AssertionImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__EXPRESSION = eINSTANCE.getAssertion_Expression();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ExampleColumnImpl <em>Example Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleColumnImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleColumn()
		 * @generated
		 */
		EClass EXAMPLE_COLUMN = eINSTANCE.getExampleColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_COLUMN__TABLE = eINSTANCE.getExampleColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_COLUMN__CELLS = eINSTANCE.getExampleColumn_Cells();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_COLUMN__NAME = eINSTANCE.getExampleColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_COLUMN__TYPE = eINSTANCE.getExampleColumn_Type();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ShouldImpl <em>Should</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ShouldImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getShould()
		 * @generated
		 */
		EClass SHOULD = eINSTANCE.getShould();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOULD__NOT = eINSTANCE.getShould_Not();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ShouldThrowImpl <em>Should Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ShouldThrowImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getShouldThrow()
		 * @generated
		 */
		EClass SHOULD_THROW = eINSTANCE.getShouldThrow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOULD_THROW__TYPE = eINSTANCE.getShouldThrow_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOULD_THROW__EXPRESSION = eINSTANCE.getShouldThrow_Expression();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.SpecificationImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '{@link org.jnario.Executable <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.Executable
		 * @see org.jnario.impl.JnarioPackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.MockLiteralImpl <em>Mock Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.MockLiteralImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getMockLiteral()
		 * @generated
		 */
		EClass MOCK_LITERAL = eINSTANCE.getMockLiteral();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ExampleCellImpl <em>Example Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleCellImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleCell()
		 * @generated
		 */
		EClass EXAMPLE_CELL = eINSTANCE.getExampleCell();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioFileImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioFile()
		 * @generated
		 */
		EClass JNARIO_FILE = eINSTANCE.getJnarioFile();

		/**
		 * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FILE__IMPORT_SECTION = eINSTANCE.getJnarioFile_ImportSection();

		/**
		 * The meta object literal for the '<em><b>Xtend Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FILE__XTEND_TYPES = eINSTANCE.getJnarioFile_XtendTypes();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_FILE__PACKAGE = eINSTANCE.getJnarioFile_Package();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioClassImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioClass()
		 * @generated
		 */
		EClass JNARIO_CLASS = eINSTANCE.getJnarioClass();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_CLASS__EXTENDS = eINSTANCE.getJnarioClass_Extends();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioMemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioMemberImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioMember()
		 * @generated
		 */
		EClass JNARIO_MEMBER = eINSTANCE.getJnarioMember();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_MEMBER__MODIFIERS = eINSTANCE.getJnarioMember_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_MEMBER__ANNOTATION_INFO = eINSTANCE.getJnarioMember_AnnotationInfo();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioFunctionImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioFunction()
		 * @generated
		 */
		EClass JNARIO_FUNCTION = eINSTANCE.getJnarioFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_FUNCTION__NAME = eINSTANCE.getJnarioFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FUNCTION__EXPRESSION = eINSTANCE.getJnarioFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FUNCTION__TYPE_PARAMETERS = eINSTANCE.getJnarioFunction_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FUNCTION__RETURN_TYPE = eINSTANCE.getJnarioFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FUNCTION__EXCEPTIONS = eINSTANCE.getJnarioFunction_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FUNCTION__PARAMETERS = eINSTANCE.getJnarioFunction_Parameters();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioFieldImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioField()
		 * @generated
		 */
		EClass JNARIO_FIELD = eINSTANCE.getJnarioField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FIELD__TYPE = eINSTANCE.getJnarioField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_FIELD__NAME = eINSTANCE.getJnarioField_Name();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_FIELD__INITIAL_VALUE = eINSTANCE.getJnarioField_InitialValue();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioTypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioTypeDeclarationImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioTypeDeclaration()
		 * @generated
		 */
		EClass JNARIO_TYPE_DECLARATION = eINSTANCE.getJnarioTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_TYPE_DECLARATION__NAME = eINSTANCE.getJnarioTypeDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_TYPE_DECLARATION__MEMBERS = eINSTANCE.getJnarioTypeDeclaration_Members();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioAnnotationTargetImpl <em>Annotation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioAnnotationTargetImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioAnnotationTarget()
		 * @generated
		 */
		EClass JNARIO_ANNOTATION_TARGET = eINSTANCE.getJnarioAnnotationTarget();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_ANNOTATION_TARGET__ANNOTATIONS = eINSTANCE.getJnarioAnnotationTarget_Annotations();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.JnarioParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.JnarioParameterImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getJnarioParameter()
		 * @generated
		 */
		EClass JNARIO_PARAMETER = eINSTANCE.getJnarioParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_PARAMETER__NAME = eINSTANCE.getJnarioParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JNARIO_PARAMETER__PARAMETER_TYPE = eINSTANCE.getJnarioParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_PARAMETER__VAR_ARG = eINSTANCE.getJnarioParameter_VarArg();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNARIO_PARAMETER__EXTENSION = eINSTANCE.getJnarioParameter_Extension();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.RichStringImpl <em>Rich String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.RichStringImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getRichString()
		 * @generated
		 */
		EClass RICH_STRING = eINSTANCE.getRichString();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.RichStringLiteralImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getRichStringLiteral()
		 * @generated
		 */
		EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

	}

} //JnarioPackage
