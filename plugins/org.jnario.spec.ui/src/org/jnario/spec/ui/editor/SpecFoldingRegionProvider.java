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
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.JnarioPackage;
import org.jnario.spec.spec.SpecFile;
import org.jnario.spec.spec.SpecPackage;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SpecFoldingRegionProvider extends DefaultFoldingRegionProvider {

	@Override
	protected boolean isHandled(EObject object) {
		EClass clazz = object.eClass();
		return clazz == SpecPackage.Literals.SPEC_FILE 
				|| clazz == SpecPackage.Literals.EXAMPLE_GROUP
				|| clazz == SpecPackage.Literals.EXAMPLE
				|| clazz == SpecPackage.Literals.AFTER
				|| clazz == SpecPackage.Literals.BEFORE
				|| clazz == SpecPackage.Literals.TEST_FUNCTION
				|| clazz == JnarioPackage.Literals.JNARIO_FUNCTION
		;
	}
	
	@Override
	protected boolean shouldProcessContent(EObject object) {
		return true;
	}
	
	@Override
	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		EClass clazz = eObject.eClass();
		if(clazz == SpecPackage.Literals.SPEC_FILE) {
            XImportSection importSection = ((SpecFile)eObject).getImportSection();
            if (importSection != null) {
                super.computeObjectFolding(importSection, foldingRegionAcceptor, true);
                return;
            }
		}
        super.computeObjectFolding(eObject, foldingRegionAcceptor);
	}
}
