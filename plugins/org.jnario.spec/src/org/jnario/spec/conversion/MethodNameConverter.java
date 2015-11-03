/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.conversion;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.Inject;

/**
 * 
 * @author Boris Brodski
 */
public class MethodNameConverter implements IValueConverter<String> {
	
	@Inject
	private IValueConverterService delegateConverterService;

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		String name = getName(string);
		return (String)delegateConverterService.toValue(name, "ValidID", node);
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		String name = getName(value);
		return delegateConverterService.toString(name, "ValidID");
	}

	private String getName(String string) {
		int index = string.indexOf("(");
		if (index == -1) {
			return string;
		}
		return string.substring(0, index);
	}


}
