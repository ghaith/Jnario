/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jnario.Executable;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioClass;
import org.jnario.JnarioFile;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.Specification;

import org.jnario.feature.feature.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.feature.feature.FeaturePackage
 * @generated
 */
public class FeatureAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeaturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = FeaturePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSwitch<Adapter> modelSwitch =
		new FeatureSwitch<Adapter>()
		{
			@Override
			public Adapter caseFeature(Feature object)
			{
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseBackground(Background object)
			{
				return createBackgroundAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object)
			{
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseStep(Step object)
			{
				return createStepAdapter();
			}
			@Override
			public Adapter caseGiven(Given object)
			{
				return createGivenAdapter();
			}
			@Override
			public Adapter caseWhen(When object)
			{
				return createWhenAdapter();
			}
			@Override
			public Adapter caseThen(Then object)
			{
				return createThenAdapter();
			}
			@Override
			public Adapter caseAnd(And object)
			{
				return createAndAdapter();
			}
			@Override
			public Adapter caseFeatureFile(FeatureFile object)
			{
				return createFeatureFileAdapter();
			}
			@Override
			public Adapter caseGivenReference(GivenReference object)
			{
				return createGivenReferenceAdapter();
			}
			@Override
			public Adapter caseWhenReference(WhenReference object)
			{
				return createWhenReferenceAdapter();
			}
			@Override
			public Adapter caseThenReference(ThenReference object)
			{
				return createThenReferenceAdapter();
			}
			@Override
			public Adapter caseAndReference(AndReference object)
			{
				return createAndReferenceAdapter();
			}
			@Override
			public Adapter caseStepReference(StepReference object)
			{
				return createStepReferenceAdapter();
			}
			@Override
			public Adapter caseStepImplementation(StepImplementation object)
			{
				return createStepImplementationAdapter();
			}
			@Override
			public Adapter caseBut(But object)
			{
				return createButAdapter();
			}
			@Override
			public Adapter caseButReference(ButReference object)
			{
				return createButReferenceAdapter();
			}
			@Override
			public Adapter caseExecutable(Executable object)
			{
				return createExecutableAdapter();
			}
			@Override
			public Adapter caseJnarioAnnotationTarget(JnarioAnnotationTarget object)
			{
				return createJnarioAnnotationTargetAdapter();
			}
			@Override
			public Adapter caseJnarioMember(JnarioMember object)
			{
				return createJnarioMemberAdapter();
			}
			@Override
			public Adapter caseJnarioTypeDeclaration(JnarioTypeDeclaration object)
			{
				return createJnarioTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseJnarioClass(JnarioClass object)
			{
				return createJnarioClassAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object)
			{
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseJnarioFunction(JnarioFunction object)
			{
				return createJnarioFunctionAdapter();
			}
			@Override
			public Adapter caseJnarioFile(JnarioFile object)
			{
				return createJnarioFileAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.Background
	 * @generated
	 */
	public Adapter createBackgroundAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.Step
	 * @generated
	 */
	public Adapter createStepAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.Given
	 * @generated
	 */
	public Adapter createGivenAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.When
	 * @generated
	 */
	public Adapter createWhenAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.Then
	 * @generated
	 */
	public Adapter createThenAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.And
	 * @generated
	 */
	public Adapter createAndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.FeatureFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.FeatureFile
	 * @generated
	 */
	public Adapter createFeatureFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.GivenReference <em>Given Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.GivenReference
	 * @generated
	 */
	public Adapter createGivenReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.WhenReference <em>When Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.WhenReference
	 * @generated
	 */
	public Adapter createWhenReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.ThenReference <em>Then Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.ThenReference
	 * @generated
	 */
	public Adapter createThenReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.AndReference <em>And Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.AndReference
	 * @generated
	 */
	public Adapter createAndReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.StepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.StepReference
	 * @generated
	 */
	public Adapter createStepReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.StepImplementation <em>Step Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.StepImplementation
	 * @generated
	 */
	public Adapter createStepImplementationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.But <em>But</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.But
	 * @generated
	 */
	public Adapter createButAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.feature.feature.ButReference <em>But Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.feature.feature.ButReference
	 * @generated
	 */
	public Adapter createButReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.Executable
	 * @generated
	 */
	public Adapter createExecutableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioAnnotationTarget
	 * @generated
	 */
	public Adapter createJnarioAnnotationTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioMember
	 * @generated
	 */
	public Adapter createJnarioMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioTypeDeclaration
	 * @generated
	 */
	public Adapter createJnarioTypeDeclarationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioClass
	 * @generated
	 */
	public Adapter createJnarioClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioFunction
	 * @generated
	 */
	public Adapter createJnarioFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioFile
	 * @generated
	 */
	public Adapter createJnarioFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //FeatureAdapterFactory
