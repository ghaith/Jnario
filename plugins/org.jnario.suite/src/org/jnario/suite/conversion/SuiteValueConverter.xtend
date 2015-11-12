/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.conversion

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

import static extension org.jnario.util.Strings.*

class SuiteValueConverter implements IValueConverter<String> {
	
	val char prefix
	
	new(char prefix) {
		this.prefix = prefix
	}

	override toString(String value) throws ValueConverterException {
		if(value == null) return null
		val begin = value.lastIndexOfPrefix(prefix)
		val prefix = value.substring(0, begin)
		prefix + value.substring(begin).replace("-", "\\-").replace("#", "\\#")
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		if(string == null) return null
		val begin = string.lastIndexOfPrefix(prefix)
		val prefix = string.substring(0, begin)
		prefix + string.substring(begin).replace("\\-", "-").replace("\\#", "#")
	}
	
}