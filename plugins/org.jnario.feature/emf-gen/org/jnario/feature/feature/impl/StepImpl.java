/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.JnarioParameter;

import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<XAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;

	/**
	 * The cached value of the '{@link #getAnnotationInfo() <em>Annotation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationInfo()
	 * @generated
	 * @ordered
	 */
	protected JnarioAnnotationTarget annotationInfo;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression expression;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference returnType;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeReference> exceptions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JnarioParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FeaturePackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XAnnotation> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentEList<XAnnotation>(XAnnotation.class, this, FeaturePackage.STEP__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModifiers()
	{
		if (modifiers == null)
		{
			modifiers = new EDataTypeEList<String>(String.class, this, FeaturePackage.STEP__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioAnnotationTarget getAnnotationInfo()
	{
		return annotationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo, NotificationChain msgs)
	{
		JnarioAnnotationTarget oldAnnotationInfo = annotationInfo;
		annotationInfo = newAnnotationInfo;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo)
	{
		if (newAnnotationInfo != annotationInfo)
		{
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__ANNOTATION_INFO, null, msgs);
			msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__ANNOTATION_INFO, newAnnotationInfo, newAnnotationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
	{
		XExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(XExpression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeParameter> getTypeParameters()
	{
		if (typeParameters == null)
		{
			typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, FeaturePackage.STEP__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getReturnType()
	{
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(JvmTypeReference newReturnType, NotificationChain msgs)
	{
		JvmTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(JvmTypeReference newReturnType)
	{
		if (newReturnType != returnType)
		{
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeReference> getExceptions()
	{
		if (exceptions == null)
		{
			exceptions = new EObjectContainmentEList<JvmTypeReference>(JvmTypeReference.class, this, FeaturePackage.STEP__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JnarioParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<JnarioParameter>(JnarioParameter.class, this, FeaturePackage.STEP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmVisibility getVisibility()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmVisibility getDeclaredVisibility()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmVisibility getDefaultVisibility()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPending()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case FeaturePackage.STEP__ANNOTATION_INFO:
				return basicSetAnnotationInfo(null, msgs);
			case FeaturePackage.STEP__EXPRESSION:
				return basicSetExpression(null, msgs);
			case FeaturePackage.STEP__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case FeaturePackage.STEP__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case FeaturePackage.STEP__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
			case FeaturePackage.STEP__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP__ANNOTATIONS:
				return getAnnotations();
			case FeaturePackage.STEP__MODIFIERS:
				return getModifiers();
			case FeaturePackage.STEP__ANNOTATION_INFO:
				return getAnnotationInfo();
			case FeaturePackage.STEP__NAME:
				return getName();
			case FeaturePackage.STEP__EXPRESSION:
				return getExpression();
			case FeaturePackage.STEP__TYPE_PARAMETERS:
				return getTypeParameters();
			case FeaturePackage.STEP__RETURN_TYPE:
				return getReturnType();
			case FeaturePackage.STEP__EXCEPTIONS:
				return getExceptions();
			case FeaturePackage.STEP__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XAnnotation>)newValue);
				return;
			case FeaturePackage.STEP__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case FeaturePackage.STEP__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)newValue);
				return;
			case FeaturePackage.STEP__NAME:
				setName((String)newValue);
				return;
			case FeaturePackage.STEP__EXPRESSION:
				setExpression((XExpression)newValue);
				return;
			case FeaturePackage.STEP__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
				return;
			case FeaturePackage.STEP__RETURN_TYPE:
				setReturnType((JvmTypeReference)newValue);
				return;
			case FeaturePackage.STEP__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends JvmTypeReference>)newValue);
				return;
			case FeaturePackage.STEP__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JnarioParameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case FeaturePackage.STEP__MODIFIERS:
				getModifiers().clear();
				return;
			case FeaturePackage.STEP__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)null);
				return;
			case FeaturePackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturePackage.STEP__EXPRESSION:
				setExpression((XExpression)null);
				return;
			case FeaturePackage.STEP__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case FeaturePackage.STEP__RETURN_TYPE:
				setReturnType((JvmTypeReference)null);
				return;
			case FeaturePackage.STEP__EXCEPTIONS:
				getExceptions().clear();
				return;
			case FeaturePackage.STEP__PARAMETERS:
				getParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case FeaturePackage.STEP__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case FeaturePackage.STEP__ANNOTATION_INFO:
				return annotationInfo != null;
			case FeaturePackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturePackage.STEP__EXPRESSION:
				return expression != null;
			case FeaturePackage.STEP__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case FeaturePackage.STEP__RETURN_TYPE:
				return returnType != null;
			case FeaturePackage.STEP__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case FeaturePackage.STEP__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == JnarioAnnotationTarget.class)
		{
			switch (derivedFeatureID)
			{
				case FeaturePackage.STEP__ANNOTATIONS: return JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class)
		{
			switch (derivedFeatureID)
			{
				case FeaturePackage.STEP__MODIFIERS: return JnarioPackage.JNARIO_MEMBER__MODIFIERS;
				case FeaturePackage.STEP__ANNOTATION_INFO: return JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO;
				default: return -1;
			}
		}
		if (baseClass == JnarioFunction.class)
		{
			switch (derivedFeatureID)
			{
				case FeaturePackage.STEP__NAME: return JnarioPackage.JNARIO_FUNCTION__NAME;
				case FeaturePackage.STEP__EXPRESSION: return JnarioPackage.JNARIO_FUNCTION__EXPRESSION;
				case FeaturePackage.STEP__TYPE_PARAMETERS: return JnarioPackage.JNARIO_FUNCTION__TYPE_PARAMETERS;
				case FeaturePackage.STEP__RETURN_TYPE: return JnarioPackage.JNARIO_FUNCTION__RETURN_TYPE;
				case FeaturePackage.STEP__EXCEPTIONS: return JnarioPackage.JNARIO_FUNCTION__EXCEPTIONS;
				case FeaturePackage.STEP__PARAMETERS: return JnarioPackage.JNARIO_FUNCTION__PARAMETERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == JnarioAnnotationTarget.class)
		{
			switch (baseFeatureID)
			{
				case JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS: return FeaturePackage.STEP__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class)
		{
			switch (baseFeatureID)
			{
				case JnarioPackage.JNARIO_MEMBER__MODIFIERS: return FeaturePackage.STEP__MODIFIERS;
				case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO: return FeaturePackage.STEP__ANNOTATION_INFO;
				default: return -1;
			}
		}
		if (baseClass == JnarioFunction.class)
		{
			switch (baseFeatureID)
			{
				case JnarioPackage.JNARIO_FUNCTION__NAME: return FeaturePackage.STEP__NAME;
				case JnarioPackage.JNARIO_FUNCTION__EXPRESSION: return FeaturePackage.STEP__EXPRESSION;
				case JnarioPackage.JNARIO_FUNCTION__TYPE_PARAMETERS: return FeaturePackage.STEP__TYPE_PARAMETERS;
				case JnarioPackage.JNARIO_FUNCTION__RETURN_TYPE: return FeaturePackage.STEP__RETURN_TYPE;
				case JnarioPackage.JNARIO_FUNCTION__EXCEPTIONS: return FeaturePackage.STEP__EXCEPTIONS;
				case JnarioPackage.JNARIO_FUNCTION__PARAMETERS: return FeaturePackage.STEP__PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modifiers: ");
		result.append(modifiers);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepImpl
