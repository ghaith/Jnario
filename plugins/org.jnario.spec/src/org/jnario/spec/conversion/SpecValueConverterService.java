/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.jnario.conversion.JnarioValueConverterService;

import com.google.inject.Inject;
import com.google.inject.Singleton;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class SpecValueConverterService extends JnarioValueConverterService {

	@Inject
	private MethodNameConverter methodIDConverter;

	@ValueConverter(rule = "Method")
	public IValueConverter<String> getMethodConverter() {
		return methodIDConverter;
	}
}
