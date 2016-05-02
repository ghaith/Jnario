/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.JnarioAnnotationTarget#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.jnario.JnarioPackage#getJnarioAnnotationTarget()
 * @model
 * @generated
 */
public interface JnarioAnnotationTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.jnario.JnarioPackage#getJnarioAnnotationTarget_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<XAnnotation> getAnnotations();

} // JnarioAnnotationTarget
