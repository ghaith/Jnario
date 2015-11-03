/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XtypePackage;
import org.jnario.Assertion;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.Executable;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioClass;
import org.jnario.JnarioFactory;
import org.jnario.JnarioField;
import org.jnario.JnarioFile;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.JnarioParameter;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.MockLiteral;
import org.jnario.RichString;
import org.jnario.RichStringLiteral;
import org.jnario.Should;
import org.jnario.ShouldThrow;
import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JnarioPackageImpl extends EPackageImpl implements JnarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shouldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shouldThrowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mockLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioAnnotationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jnarioParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringLiteralEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.jnario.JnarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JnarioPackageImpl() {
		super(eNS_URI, JnarioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JnarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JnarioPackage init() {
		if (isInited) return (JnarioPackage)EPackage.Registry.INSTANCE.getEPackage(JnarioPackage.eNS_URI);

		// Obtain or create and register package
		JnarioPackageImpl theJnarioPackage = (JnarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JnarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JnarioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJnarioPackage.createPackageContents();

		// Initialize created meta-data
		theJnarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJnarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JnarioPackage.eNS_URI, theJnarioPackage);
		return theJnarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleTable() {
		return exampleTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleTable_Name() {
		return (EAttribute)exampleTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleTable_Rows() {
		return (EReference)exampleTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleTable_Columns() {
		return (EReference)exampleTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleRow() {
		return exampleRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleRow_Cells() {
		return (EReference)exampleRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleRow_Table() {
		return (EReference)exampleRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Expression() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleColumn() {
		return exampleColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleColumn_Table() {
		return (EReference)exampleColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleColumn_Cells() {
		return (EReference)exampleColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleColumn_Name() {
		return (EAttribute)exampleColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleColumn_Type() {
		return (EReference)exampleColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShould() {
		return shouldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShould_Not() {
		return (EAttribute)shouldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShouldThrow() {
		return shouldThrowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShouldThrow_Type() {
		return (EReference)shouldThrowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShouldThrow_Expression() {
		return (EReference)shouldThrowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutable() {
		return executableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMockLiteral() {
		return mockLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleCell() {
		return exampleCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioFile() {
		return jnarioFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFile_ImportSection() {
		return (EReference)jnarioFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFile_XtendTypes() {
		return (EReference)jnarioFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioFile_Package() {
		return (EAttribute)jnarioFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioClass() {
		return jnarioClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioClass_Extends() {
		return (EReference)jnarioClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioMember() {
		return jnarioMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioMember_Modifiers() {
		return (EAttribute)jnarioMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioMember_AnnotationInfo() {
		return (EReference)jnarioMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioFunction() {
		return jnarioFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioFunction_Name() {
		return (EAttribute)jnarioFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFunction_Expression() {
		return (EReference)jnarioFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFunction_TypeParameters() {
		return (EReference)jnarioFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFunction_ReturnType() {
		return (EReference)jnarioFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFunction_Exceptions() {
		return (EReference)jnarioFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioFunction_Parameters() {
		return (EReference)jnarioFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioField() {
		return jnarioFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioField_Type() {
		return (EReference)jnarioFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioField_Name() {
		return (EAttribute)jnarioFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioField_InitialValue() {
		return (EReference)jnarioFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioTypeDeclaration() {
		return jnarioTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioTypeDeclaration_Name() {
		return (EAttribute)jnarioTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioTypeDeclaration_Members() {
		return (EReference)jnarioTypeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioAnnotationTarget() {
		return jnarioAnnotationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioAnnotationTarget_Annotations() {
		return (EReference)jnarioAnnotationTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJnarioParameter() {
		return jnarioParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioParameter_Name() {
		return (EAttribute)jnarioParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJnarioParameter_ParameterType() {
		return (EReference)jnarioParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioParameter_VarArg() {
		return (EAttribute)jnarioParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJnarioParameter_Extension() {
		return (EAttribute)jnarioParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichString() {
		return richStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringLiteral() {
		return richStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioFactory getJnarioFactory() {
		return (JnarioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		exampleTableEClass = createEClass(EXAMPLE_TABLE);
		createEAttribute(exampleTableEClass, EXAMPLE_TABLE__NAME);
		createEReference(exampleTableEClass, EXAMPLE_TABLE__ROWS);
		createEReference(exampleTableEClass, EXAMPLE_TABLE__COLUMNS);

		exampleRowEClass = createEClass(EXAMPLE_ROW);
		createEReference(exampleRowEClass, EXAMPLE_ROW__CELLS);
		createEReference(exampleRowEClass, EXAMPLE_ROW__TABLE);

		assertionEClass = createEClass(ASSERTION);
		createEReference(assertionEClass, ASSERTION__EXPRESSION);

		exampleColumnEClass = createEClass(EXAMPLE_COLUMN);
		createEReference(exampleColumnEClass, EXAMPLE_COLUMN__TABLE);
		createEReference(exampleColumnEClass, EXAMPLE_COLUMN__CELLS);
		createEAttribute(exampleColumnEClass, EXAMPLE_COLUMN__NAME);
		createEReference(exampleColumnEClass, EXAMPLE_COLUMN__TYPE);

		shouldEClass = createEClass(SHOULD);
		createEAttribute(shouldEClass, SHOULD__NOT);

		shouldThrowEClass = createEClass(SHOULD_THROW);
		createEReference(shouldThrowEClass, SHOULD_THROW__TYPE);
		createEReference(shouldThrowEClass, SHOULD_THROW__EXPRESSION);

		specificationEClass = createEClass(SPECIFICATION);

		executableEClass = createEClass(EXECUTABLE);

		mockLiteralEClass = createEClass(MOCK_LITERAL);

		exampleCellEClass = createEClass(EXAMPLE_CELL);

		jnarioFileEClass = createEClass(JNARIO_FILE);
		createEReference(jnarioFileEClass, JNARIO_FILE__IMPORT_SECTION);
		createEReference(jnarioFileEClass, JNARIO_FILE__XTEND_TYPES);
		createEAttribute(jnarioFileEClass, JNARIO_FILE__PACKAGE);

		jnarioClassEClass = createEClass(JNARIO_CLASS);
		createEReference(jnarioClassEClass, JNARIO_CLASS__EXTENDS);

		jnarioMemberEClass = createEClass(JNARIO_MEMBER);
		createEAttribute(jnarioMemberEClass, JNARIO_MEMBER__MODIFIERS);
		createEReference(jnarioMemberEClass, JNARIO_MEMBER__ANNOTATION_INFO);

		jnarioFunctionEClass = createEClass(JNARIO_FUNCTION);
		createEAttribute(jnarioFunctionEClass, JNARIO_FUNCTION__NAME);
		createEReference(jnarioFunctionEClass, JNARIO_FUNCTION__EXPRESSION);
		createEReference(jnarioFunctionEClass, JNARIO_FUNCTION__TYPE_PARAMETERS);
		createEReference(jnarioFunctionEClass, JNARIO_FUNCTION__RETURN_TYPE);
		createEReference(jnarioFunctionEClass, JNARIO_FUNCTION__EXCEPTIONS);
		createEReference(jnarioFunctionEClass, JNARIO_FUNCTION__PARAMETERS);

		jnarioFieldEClass = createEClass(JNARIO_FIELD);
		createEReference(jnarioFieldEClass, JNARIO_FIELD__TYPE);
		createEAttribute(jnarioFieldEClass, JNARIO_FIELD__NAME);
		createEReference(jnarioFieldEClass, JNARIO_FIELD__INITIAL_VALUE);

		jnarioTypeDeclarationEClass = createEClass(JNARIO_TYPE_DECLARATION);
		createEAttribute(jnarioTypeDeclarationEClass, JNARIO_TYPE_DECLARATION__NAME);
		createEReference(jnarioTypeDeclarationEClass, JNARIO_TYPE_DECLARATION__MEMBERS);

		jnarioAnnotationTargetEClass = createEClass(JNARIO_ANNOTATION_TARGET);
		createEReference(jnarioAnnotationTargetEClass, JNARIO_ANNOTATION_TARGET__ANNOTATIONS);

		jnarioParameterEClass = createEClass(JNARIO_PARAMETER);
		createEAttribute(jnarioParameterEClass, JNARIO_PARAMETER__NAME);
		createEReference(jnarioParameterEClass, JNARIO_PARAMETER__PARAMETER_TYPE);
		createEAttribute(jnarioParameterEClass, JNARIO_PARAMETER__VAR_ARG);
		createEAttribute(jnarioParameterEClass, JNARIO_PARAMETER__EXTENSION);

		richStringEClass = createEClass(RICH_STRING);

		richStringLiteralEClass = createEClass(RICH_STRING_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
		XAnnotationsPackage theXAnnotationsPackage = (XAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exampleTableEClass.getESuperTypes().add(this.getJnarioMember());
		exampleTableEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		assertionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		shouldEClass.getESuperTypes().add(theXbasePackage.getXBinaryOperation());
		shouldThrowEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		specificationEClass.getESuperTypes().add(this.getExecutable());
		specificationEClass.getESuperTypes().add(this.getJnarioClass());
		mockLiteralEClass.getESuperTypes().add(theXbasePackage.getXTypeLiteral());
		exampleCellEClass.getESuperTypes().add(this.getJnarioFunction());
		jnarioClassEClass.getESuperTypes().add(this.getJnarioTypeDeclaration());
		jnarioMemberEClass.getESuperTypes().add(this.getJnarioAnnotationTarget());
		jnarioFunctionEClass.getESuperTypes().add(this.getJnarioMember());
		jnarioFieldEClass.getESuperTypes().add(this.getJnarioMember());
		jnarioTypeDeclarationEClass.getESuperTypes().add(this.getJnarioMember());
		jnarioParameterEClass.getESuperTypes().add(this.getJnarioAnnotationTarget());
		richStringEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
		richStringLiteralEClass.getESuperTypes().add(theXbasePackage.getXStringLiteral());

		// Initialize classes and features; add operations and parameters
		initEClass(exampleTableEClass, ExampleTable.class, "ExampleTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExampleTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExampleTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleTable_Rows(), this.getExampleRow(), this.getExampleRow_Table(), "rows", null, 0, -1, ExampleTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleTable_Columns(), this.getExampleColumn(), this.getExampleColumn_Table(), "columns", null, 0, -1, ExampleTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(exampleTableEClass, ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exampleRowEClass, ExampleRow.class, "ExampleRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleRow_Cells(), this.getExampleCell(), null, "cells", null, 0, -1, ExampleRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleRow_Table(), this.getExampleTable(), this.getExampleTable_Rows(), "table", null, 0, 1, ExampleRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertion_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleColumnEClass, ExampleColumn.class, "ExampleColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleColumn_Table(), this.getExampleTable(), this.getExampleTable_Columns(), "table", null, 0, 1, ExampleColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleColumn_Cells(), this.getExampleCell(), null, "cells", null, 0, -1, ExampleColumn.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExampleColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExampleColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleColumn_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, ExampleColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shouldEClass, Should.class, "Should", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShould_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, Should.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shouldThrowEClass, ShouldThrow.class, "ShouldThrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShouldThrow_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 1, 1, ShouldThrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShouldThrow_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 1, 1, ShouldThrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableEClass, Executable.class, "Executable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(executableEClass, ecorePackage.getEBoolean(), "isPending", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mockLiteralEClass, MockLiteral.class, "MockLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exampleCellEClass, ExampleCell.class, "ExampleCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jnarioFileEClass, JnarioFile.class, "JnarioFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJnarioFile_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, JnarioFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioFile_XtendTypes(), this.getJnarioTypeDeclaration(), null, "xtendTypes", null, 0, -1, JnarioFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJnarioFile_Package(), ecorePackage.getEString(), "package", null, 0, 1, JnarioFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jnarioClassEClass, JnarioClass.class, "JnarioClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJnarioClass_Extends(), theTypesPackage.getJvmTypeReference(), null, "extends", null, 0, 1, JnarioClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jnarioMemberEClass, JnarioMember.class, "JnarioMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJnarioMember_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, JnarioMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioMember_AnnotationInfo(), this.getJnarioAnnotationTarget(), null, "annotationInfo", null, 0, 1, JnarioMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jnarioMemberEClass, ecorePackage.getEBoolean(), "isStatic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jnarioMemberEClass, theTypesPackage.getJvmVisibility(), "getVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jnarioMemberEClass, theTypesPackage.getJvmVisibility(), "getDeclaredVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jnarioMemberEClass, theTypesPackage.getJvmVisibility(), "getDefaultVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jnarioMemberEClass, ecorePackage.getEBoolean(), "isFinal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jnarioFunctionEClass, JnarioFunction.class, "JnarioFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJnarioFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, JnarioFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioFunction_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, JnarioFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioFunction_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, JnarioFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioFunction_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, JnarioFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioFunction_Exceptions(), theTypesPackage.getJvmTypeReference(), null, "exceptions", null, 0, -1, JnarioFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioFunction_Parameters(), this.getJnarioParameter(), null, "parameters", null, 0, -1, JnarioFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jnarioFieldEClass, JnarioField.class, "JnarioField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJnarioField_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, JnarioField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJnarioField_Name(), ecorePackage.getEString(), "name", null, 0, 1, JnarioField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioField_InitialValue(), theXbasePackage.getXExpression(), null, "initialValue", null, 0, 1, JnarioField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jnarioFieldEClass, ecorePackage.getEBoolean(), "isTransient", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jnarioFieldEClass, ecorePackage.getEBoolean(), "isVolatile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jnarioFieldEClass, ecorePackage.getEBoolean(), "isExtension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jnarioTypeDeclarationEClass, JnarioTypeDeclaration.class, "JnarioTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJnarioTypeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, JnarioTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioTypeDeclaration_Members(), this.getJnarioMember(), null, "members", null, 0, -1, JnarioTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jnarioAnnotationTargetEClass, JnarioAnnotationTarget.class, "JnarioAnnotationTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJnarioAnnotationTarget_Annotations(), theXAnnotationsPackage.getXAnnotation(), null, "annotations", null, 0, -1, JnarioAnnotationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jnarioParameterEClass, JnarioParameter.class, "JnarioParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJnarioParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, JnarioParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJnarioParameter_ParameterType(), theTypesPackage.getJvmTypeReference(), null, "parameterType", null, 0, 1, JnarioParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJnarioParameter_VarArg(), ecorePackage.getEBoolean(), "varArg", null, 0, 1, JnarioParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJnarioParameter_Extension(), ecorePackage.getEBoolean(), "extension", null, 0, 1, JnarioParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringEClass, RichString.class, "RichString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringLiteralEClass, RichStringLiteral.class, "RichStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JnarioPackageImpl
