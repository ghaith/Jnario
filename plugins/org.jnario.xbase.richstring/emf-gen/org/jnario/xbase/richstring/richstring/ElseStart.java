/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.xbase.richstring.richstring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.xbase.richstring.richstring.ElseStart#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getElseStart()
 * @model
 * @generated
 */
public interface ElseStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>If Condition Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.jnario.xbase.richstring.richstring.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition Start</em>' reference.
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getElseStart_IfConditionStart()
	 * @see org.jnario.xbase.richstring.richstring.IfConditionStart#getElseStart
	 * @model opposite="elseStart"
	 * @generated
	 */
	IfConditionStart getIfConditionStart();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.richstring.ElseStart#getIfConditionStart <em>If Condition Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition Start</em>' reference.
	 * @see #getIfConditionStart()
	 * @generated
	 */
	void setIfConditionStart(IfConditionStart value);

} // ElseStart
