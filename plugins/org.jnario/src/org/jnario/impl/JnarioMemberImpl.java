/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.impl;

import static org.eclipse.xtext.util.Strings.equal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioFactory;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Member</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.jnario.impl.JnarioMemberImpl#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link org.jnario.impl.JnarioMemberImpl#getAnnotationInfo <em>Annotation
 * Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JnarioMemberImpl extends JnarioAnnotationTargetImpl implements
		JnarioMember {
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;

	/**
	 * The cached value of the '{@link #getAnnotationInfo()
	 * <em>Annotation Info</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAnnotationInfo()
	 * @generated
	 * @ordered
	 */
	protected JnarioAnnotationTarget annotationInfo;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected JnarioMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.JNARIO_MEMBER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeEList<String>(String.class, this,
					JnarioPackage.JNARIO_MEMBER__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JnarioAnnotationTarget getAnnotationInfo() {
		return annotationInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAnnotationInfo(
			JnarioAnnotationTarget newAnnotationInfo, NotificationChain msgs) {
		JnarioAnnotationTarget oldAnnotationInfo = annotationInfo;
		annotationInfo = newAnnotationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO,
					oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo) {
		if (newAnnotationInfo != annotationInfo) {
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject) annotationInfo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO,
						null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject) newAnnotationInfo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO,
						null, msgs);
			msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO,
					newAnnotationInfo, newAnnotationInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isStatic() {
		for (String modifier : getModifiers()) {
			if (equal(modifier, "static"))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO:
			return basicSetAnnotationInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JnarioPackage.JNARIO_MEMBER__MODIFIERS:
			return getModifiers();
		case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO:
			return getAnnotationInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JnarioPackage.JNARIO_MEMBER__MODIFIERS:
			getModifiers().clear();
			getModifiers().addAll((Collection<? extends String>) newValue);
			return;
		case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO:
			setAnnotationInfo((JnarioAnnotationTarget) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JnarioPackage.JNARIO_MEMBER__MODIFIERS:
			getModifiers().clear();
			return;
		case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO:
			setAnnotationInfo((JnarioAnnotationTarget) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JnarioPackage.JNARIO_MEMBER__MODIFIERS:
			return modifiers != null && !modifiers.isEmpty();
		case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO:
			return annotationInfo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modifiers: ");
		result.append(modifiers);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public JvmVisibility getDeclaredVisibility() {
		for (String modifier : getModifiers()) {
			if (equal(modifier, "public"))
				return JvmVisibility.PUBLIC;
			if (equal(modifier, "package"))
				return JvmVisibility.DEFAULT;
			if (equal(modifier, "protected"))
				return JvmVisibility.PROTECTED;
			if (equal(modifier, "private"))
				return JvmVisibility.PRIVATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public JvmVisibility getDefaultVisibility() {
		return JvmVisibility.PUBLIC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isTransient() {
		for (String modifier : getModifiers()) {
			if (equal(modifier, "abstract"))
				return false;
			if (equal(modifier, "final"))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isFinal() {
		for (String modifier : getModifiers()) {
			if (equal(modifier, "abstract"))
				return false;
			if (equal(modifier, "final"))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public JvmVisibility getVisibility() {
		JvmVisibility declaredVisibility = getDeclaredVisibility();
		return declaredVisibility == null ? getDefaultVisibility()
				: declaredVisibility;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<XAnnotation> getAnnotations() {
		if (getAnnotationInfo() == null) {
			setAnnotationInfo(JnarioFactory.eINSTANCE
					.createJnarioAnnotationTarget());
		}
		return getAnnotationInfo().getAnnotations();
	}

} // JnarioMemberImpl
