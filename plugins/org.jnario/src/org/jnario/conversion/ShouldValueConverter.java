/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class ShouldValueConverter implements IValueConverter<String> {

	public String toValue(String string, INode node)
			throws ValueConverterException {
		return "should_" + string.substring(string.lastIndexOf(' ') + 1);
	}

	public String toString(String value) throws ValueConverterException {
		return value.replace("_", " ");
	}

}
