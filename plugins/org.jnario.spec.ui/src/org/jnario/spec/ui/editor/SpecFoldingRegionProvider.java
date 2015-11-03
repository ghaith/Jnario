/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.editor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.jnario.spec.spec.SpecPackage;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecFoldingRegionProvider extends DefaultFoldingRegionProvider {

	@Override
	protected boolean isHandled(EObject object) {
		EClass clazz = object.eClass();
		return clazz == SpecPackage.Literals.EXAMPLE_GROUP || clazz == SpecPackage.Literals.EXAMPLE || super.isHandled(object);
	}
	
	@Override
	protected boolean shouldProcessContent(EObject object) {
		EClass clazz = object.eClass();
		return clazz == SpecPackage.Literals.EXAMPLE_GROUP || clazz == SpecPackage.Literals.EXAMPLE || super.isHandled(object);
	}
}
