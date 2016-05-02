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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.Executable;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioClass;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.impl.SpecificationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.jnario.impl.SpecificationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.jnario.impl.SpecificationImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.jnario.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.impl.SpecificationImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.jnario.impl.SpecificationImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends EObjectImpl implements Specification {
	private EList<Executable> children;

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
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<XAnnotation>(XAnnotation.class, this, JnarioPackage.SPECIFICATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeEList<String>(String.class, this, JnarioPackage.SPECIFICATION__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioAnnotationTarget getAnnotationInfo() {
		return annotationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo, NotificationChain msgs) {
		JnarioAnnotationTarget oldAnnotationInfo = annotationInfo;
		annotationInfo = newAnnotationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JnarioPackage.SPECIFICATION__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo) {
		if (newAnnotationInfo != annotationInfo) {
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.SPECIFICATION__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.SPECIFICATION__ANNOTATION_INFO, null, msgs);
			msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.SPECIFICATION__ANNOTATION_INFO, newAnnotationInfo, newAnnotationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JnarioMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<JnarioMember>(JnarioMember.class, this, JnarioPackage.SPECIFICATION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(JvmTypeReference newExtends, NotificationChain msgs) {
		JvmTypeReference oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JnarioPackage.SPECIFICATION__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(JvmTypeReference newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.SPECIFICATION__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.SPECIFICATION__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.SPECIFICATION__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStatic() {
		for(String modifier: getModifiers()) { 
			if(equal(modifier, "strictfp")) 
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JvmVisibility getVisibility() {
		JvmVisibility declaredVisibility = getDeclaredVisibility();
		return declaredVisibility == null ? getDefaultVisibility() : declaredVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JvmVisibility getDeclaredVisibility() {
		for(String modifier: getModifiers()) {
			if(equal(modifier, "public")) 
				return JvmVisibility.PUBLIC;
			if(equal(modifier, "package")) 
				return JvmVisibility.DEFAULT;
			if(equal(modifier, "protected")) 
				return JvmVisibility.PROTECTED;
			if(equal(modifier, "private")) 
				return JvmVisibility.PRIVATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JvmVisibility getDefaultVisibility() {
		return JvmVisibility.PUBLIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinal() {
		for(String modifier: getModifiers()) { 
			if(equal(modifier, "abstract")) 
				return false;
			if(equal(modifier, "final")) 
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPending() {
		for (Executable child : getChildren()) {
			if(child.isPending()){
				return true;
			}
		}
		return false;
	}
	
	public EList<Executable> getChildren(){
		if(children == null){
			children = calculateChildren();
		}
		return children;
	}

	protected EList<Executable> calculateChildren() {
		return ECollections.emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JnarioPackage.SPECIFICATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case JnarioPackage.SPECIFICATION__ANNOTATION_INFO:
				return basicSetAnnotationInfo(null, msgs);
			case JnarioPackage.SPECIFICATION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case JnarioPackage.SPECIFICATION__EXTENDS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JnarioPackage.SPECIFICATION__ANNOTATIONS:
				return getAnnotations();
			case JnarioPackage.SPECIFICATION__MODIFIERS:
				return getModifiers();
			case JnarioPackage.SPECIFICATION__ANNOTATION_INFO:
				return getAnnotationInfo();
			case JnarioPackage.SPECIFICATION__NAME:
				return getName();
			case JnarioPackage.SPECIFICATION__MEMBERS:
				return getMembers();
			case JnarioPackage.SPECIFICATION__EXTENDS:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JnarioPackage.SPECIFICATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XAnnotation>)newValue);
				return;
			case JnarioPackage.SPECIFICATION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case JnarioPackage.SPECIFICATION__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)newValue);
				return;
			case JnarioPackage.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case JnarioPackage.SPECIFICATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends JnarioMember>)newValue);
				return;
			case JnarioPackage.SPECIFICATION__EXTENDS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case JnarioPackage.SPECIFICATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JnarioPackage.SPECIFICATION__MODIFIERS:
				getModifiers().clear();
				return;
			case JnarioPackage.SPECIFICATION__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)null);
				return;
			case JnarioPackage.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JnarioPackage.SPECIFICATION__MEMBERS:
				getMembers().clear();
				return;
			case JnarioPackage.SPECIFICATION__EXTENDS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JnarioPackage.SPECIFICATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JnarioPackage.SPECIFICATION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case JnarioPackage.SPECIFICATION__ANNOTATION_INFO:
				return annotationInfo != null;
			case JnarioPackage.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JnarioPackage.SPECIFICATION__MEMBERS:
				return members != null && !members.isEmpty();
			case JnarioPackage.SPECIFICATION__EXTENDS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == JnarioAnnotationTarget.class) {
			switch (derivedFeatureID) {
				case JnarioPackage.SPECIFICATION__ANNOTATIONS: return JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class) {
			switch (derivedFeatureID) {
				case JnarioPackage.SPECIFICATION__MODIFIERS: return JnarioPackage.JNARIO_MEMBER__MODIFIERS;
				case JnarioPackage.SPECIFICATION__ANNOTATION_INFO: return JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO;
				default: return -1;
			}
		}
		if (baseClass == JnarioTypeDeclaration.class) {
			switch (derivedFeatureID) {
				case JnarioPackage.SPECIFICATION__NAME: return JnarioPackage.JNARIO_TYPE_DECLARATION__NAME;
				case JnarioPackage.SPECIFICATION__MEMBERS: return JnarioPackage.JNARIO_TYPE_DECLARATION__MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == JnarioClass.class) {
			switch (derivedFeatureID) {
				case JnarioPackage.SPECIFICATION__EXTENDS: return JnarioPackage.JNARIO_CLASS__EXTENDS;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == JnarioAnnotationTarget.class) {
			switch (baseFeatureID) {
				case JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS: return JnarioPackage.SPECIFICATION__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class) {
			switch (baseFeatureID) {
				case JnarioPackage.JNARIO_MEMBER__MODIFIERS: return JnarioPackage.SPECIFICATION__MODIFIERS;
				case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO: return JnarioPackage.SPECIFICATION__ANNOTATION_INFO;
				default: return -1;
			}
		}
		if (baseClass == JnarioTypeDeclaration.class) {
			switch (baseFeatureID) {
				case JnarioPackage.JNARIO_TYPE_DECLARATION__NAME: return JnarioPackage.SPECIFICATION__NAME;
				case JnarioPackage.JNARIO_TYPE_DECLARATION__MEMBERS: return JnarioPackage.SPECIFICATION__MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == JnarioClass.class) {
			switch (baseFeatureID) {
				case JnarioPackage.JNARIO_CLASS__EXTENDS: return JnarioPackage.SPECIFICATION__EXTENDS;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modifiers: ");
		result.append(modifiers);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
