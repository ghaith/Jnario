/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.outline;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineMode;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeExtensions;
import org.jnario.ExampleTable;
import org.jnario.spec.spec.ExampleGroup;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SpecOutlineTreeProvider extends DefaultOutlineTreeProvider {

// TODO NO_XTEND
//	@Inject
//	private IXtendJvmAssociations associations;
	
	@Inject
	private JvmTypeExtensions typeExtensions;
	
// TODO NO_XTEND
//	@Inject
//	private XtendOutlineNodeFactory factory;
	
	
//	
//	@Override
//	protected XtendFeatureNode createNodeForFeature(IOutlineNode parentNode,
//			JvmDeclaredType inferredType, JvmFeature jvmFeature,
//			EObject semanticFeature, int inheritanceDepth) {
//		if(jvmFeature instanceof JvmConstructor){
//			return null;
//		}
//		EObject sourceElement = associations.getPrimarySourceElement(jvmFeature);
//		if(sourceElement instanceof ExampleTable && jvmFeature instanceof JvmOperation){
//			return null;
//		}
//		if(sourceElement instanceof ExampleCell){
//			return null;
//		}
//		if(sourceElement instanceof ExampleRow){
//			return null;
//		}
//		final boolean synthetic = typeExtensions.isSynthetic(jvmFeature);
//		Object text = getText(synthetic ? jvmFeature : semanticFeature);
//		ImageDescriptor image = getImageDescriptor(synthetic ? jvmFeature : semanticFeature);
//	   return factory.createXtendFeatureNode(parentNode, semanticFeature, image, text, true, synthetic, inheritanceDepth);
//	}
//	
//	protected boolean _isLeaf(ExampleTable element) {
//		return true;
//	}
//
//	protected boolean _isLeaf(ExampleGroup element) {
//		return element.getMembers().isEmpty();
//	}
}
