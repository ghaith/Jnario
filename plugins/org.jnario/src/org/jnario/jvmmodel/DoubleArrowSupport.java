/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel;

import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.Should;

public class DoubleArrowSupport {
	
	public static boolean isDoubleArrow(XExpression expr) {
		if (expr instanceof XAbstractFeatureCall) {
			return isDoubleArrow((XAbstractFeatureCall) expr);
		}
		return false;
	}

	public static boolean isDoubleArrow(XAbstractFeatureCall expr) {
		if(expr instanceof Should){
			return true;
		}
		if (!(expr instanceof XBinaryOperation)) {
			return false;
		}
		return "=>".equals(((XBinaryOperation)expr).getConcreteSyntaxFeatureName());
	}

}
