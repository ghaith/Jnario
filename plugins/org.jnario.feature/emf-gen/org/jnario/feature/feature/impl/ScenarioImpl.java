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

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioClass;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.JnarioTypeDeclaration;

import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.impl.ScenarioImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.ScenarioImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.ScenarioImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.ScenarioImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.ScenarioImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<JnarioMember> members;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl()
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
		return FeaturePackage.Literals.SCENARIO;
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
			annotations = new EObjectContainmentEList<XAnnotation>(XAnnotation.class, this, FeaturePackage.SCENARIO__ANNOTATIONS);
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
			modifiers = new EDataTypeEList<String>(String.class, this, FeaturePackage.SCENARIO__MODIFIERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.SCENARIO__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
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
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.SCENARIO__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.SCENARIO__ANNOTATION_INFO, null, msgs);
			msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.SCENARIO__ANNOTATION_INFO, newAnnotationInfo, newAnnotationInfo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JnarioMember> getMembers()
	{
		if (members == null)
		{
			members = new EObjectContainmentEList<JnarioMember>(JnarioMember.class, this, FeaturePackage.SCENARIO__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getExtends()
	{
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(JvmTypeReference newExtends, NotificationChain msgs)
	{
		JvmTypeReference oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.SCENARIO__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(JvmTypeReference newExtends)
	{
		if (newExtends != extends_)
		{
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.SCENARIO__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.SCENARIO__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.SCENARIO__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps()
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
	public EList<Step> getPendingSteps()
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
			case FeaturePackage.SCENARIO__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case FeaturePackage.SCENARIO__ANNOTATION_INFO:
				return basicSetAnnotationInfo(null, msgs);
			case FeaturePackage.SCENARIO__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case FeaturePackage.SCENARIO__EXTENDS:
				return basicSetExtends(null, msgs);
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
			case FeaturePackage.SCENARIO__ANNOTATIONS:
				return getAnnotations();
			case FeaturePackage.SCENARIO__MODIFIERS:
				return getModifiers();
			case FeaturePackage.SCENARIO__ANNOTATION_INFO:
				return getAnnotationInfo();
			case FeaturePackage.SCENARIO__NAME:
				return getName();
			case FeaturePackage.SCENARIO__MEMBERS:
				return getMembers();
			case FeaturePackage.SCENARIO__EXTENDS:
				return getExtends();
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
			case FeaturePackage.SCENARIO__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XAnnotation>)newValue);
				return;
			case FeaturePackage.SCENARIO__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case FeaturePackage.SCENARIO__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)newValue);
				return;
			case FeaturePackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case FeaturePackage.SCENARIO__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends JnarioMember>)newValue);
				return;
			case FeaturePackage.SCENARIO__EXTENDS:
				setExtends((JvmTypeReference)newValue);
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
			case FeaturePackage.SCENARIO__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case FeaturePackage.SCENARIO__MODIFIERS:
				getModifiers().clear();
				return;
			case FeaturePackage.SCENARIO__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)null);
				return;
			case FeaturePackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturePackage.SCENARIO__MEMBERS:
				getMembers().clear();
				return;
			case FeaturePackage.SCENARIO__EXTENDS:
				setExtends((JvmTypeReference)null);
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
			case FeaturePackage.SCENARIO__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case FeaturePackage.SCENARIO__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case FeaturePackage.SCENARIO__ANNOTATION_INFO:
				return annotationInfo != null;
			case FeaturePackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturePackage.SCENARIO__MEMBERS:
				return members != null && !members.isEmpty();
			case FeaturePackage.SCENARIO__EXTENDS:
				return extends_ != null;
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
				case FeaturePackage.SCENARIO__ANNOTATIONS: return JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class)
		{
			switch (derivedFeatureID)
			{
				case FeaturePackage.SCENARIO__MODIFIERS: return JnarioPackage.JNARIO_MEMBER__MODIFIERS;
				case FeaturePackage.SCENARIO__ANNOTATION_INFO: return JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO;
				default: return -1;
			}
		}
		if (baseClass == JnarioTypeDeclaration.class)
		{
			switch (derivedFeatureID)
			{
				case FeaturePackage.SCENARIO__NAME: return JnarioPackage.JNARIO_TYPE_DECLARATION__NAME;
				case FeaturePackage.SCENARIO__MEMBERS: return JnarioPackage.JNARIO_TYPE_DECLARATION__MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == JnarioClass.class)
		{
			switch (derivedFeatureID)
			{
				case FeaturePackage.SCENARIO__EXTENDS: return JnarioPackage.JNARIO_CLASS__EXTENDS;
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
				case JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS: return FeaturePackage.SCENARIO__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class)
		{
			switch (baseFeatureID)
			{
				case JnarioPackage.JNARIO_MEMBER__MODIFIERS: return FeaturePackage.SCENARIO__MODIFIERS;
				case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO: return FeaturePackage.SCENARIO__ANNOTATION_INFO;
				default: return -1;
			}
		}
		if (baseClass == JnarioTypeDeclaration.class)
		{
			switch (baseFeatureID)
			{
				case JnarioPackage.JNARIO_TYPE_DECLARATION__NAME: return FeaturePackage.SCENARIO__NAME;
				case JnarioPackage.JNARIO_TYPE_DECLARATION__MEMBERS: return FeaturePackage.SCENARIO__MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == JnarioClass.class)
		{
			switch (baseFeatureID)
			{
				case JnarioPackage.JNARIO_CLASS__EXTENDS: return FeaturePackage.SCENARIO__EXTENDS;
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

} //ScenarioImpl
