/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel;

import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.descriptions.JvmDeclaredTypeSignatureHashProvider.SignatureHashBuilder;

public class JnarioSignatureHashBuilder extends SignatureHashBuilder {

	/*
	 * FIXME remove when feature step implementation is migrated
	 */
	protected SignatureHashBuilder appendSignature(JvmField field) {
		if(field.getSimpleName() == null){
			return this;
		}
		appendVisibility(field.getVisibility());
		append(" ");
		if (field.isStatic())
			append("static ");
		if (field.isFinal())
			append("final ");
		appendType(field.getType());
		append(" ");
		append(field.getSimpleName());
		return this;
	}
	
}
