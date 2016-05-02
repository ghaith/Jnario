/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xtext.xbase.impl.XStringLiteralImpl;

import org.jnario.JnarioPackage;
import org.jnario.RichStringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RichStringLiteralImpl extends XStringLiteralImpl implements RichStringLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.RICH_STRING_LITERAL;
	}

} //RichStringLiteralImpl
