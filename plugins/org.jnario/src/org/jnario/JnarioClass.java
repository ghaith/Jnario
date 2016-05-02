/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario;

import org.eclipse.xtext.common.types.JvmTypeReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.JnarioClass#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see org.jnario.JnarioPackage#getJnarioClass()
 * @model
 * @generated
 */
public interface JnarioClass extends JnarioTypeDeclaration {

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(JvmTypeReference)
	 * @see org.jnario.JnarioPackage#getJnarioClass_Extends()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getExtends();

	/**
	 * Sets the value of the '{@link org.jnario.JnarioClass#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(JvmTypeReference value);
} // JnarioClass
