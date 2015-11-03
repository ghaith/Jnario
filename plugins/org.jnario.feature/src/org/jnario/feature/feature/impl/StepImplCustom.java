/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 package org.jnario.feature.feature.impl;

import org.eclipse.xtext.xbase.XBlockExpression;

public class StepImplCustom extends StepImpl {

	@Override
	public boolean isPending() {
		if(getExpression() == null){
			return true;
		}
		return ((XBlockExpression)getExpression()).getExpressions().isEmpty();
	}
	
}
