/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.internal;

import org.eclipse.xtext.util.Modules2;
import org.jnario.spec.ui.SpecUiModule;
import org.jnario.ui.JnarioSharedState;

import com.google.inject.Module;

public class SpecActivatorImpl extends SpecActivator {
	
	@Override
	protected Module getUiModule(String grammar) {
		return Modules2.mixin(new SpecUiModule(this), new JnarioSharedState());
	}
	
}
