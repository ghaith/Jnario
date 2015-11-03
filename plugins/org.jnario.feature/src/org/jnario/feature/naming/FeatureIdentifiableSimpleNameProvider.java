/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.jnario.feature.feature.Step;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
	
	@Inject
	private StepNameProvider stepNameProvider;
	
	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if(element instanceof Step){
			Step step = (Step) element;
			return stepNameProvider.nameOf(step);
		}
		return super.getSimpleName(element);
	}

}
