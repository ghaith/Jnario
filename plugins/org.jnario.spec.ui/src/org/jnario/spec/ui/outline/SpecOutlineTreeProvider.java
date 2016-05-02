/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.outline;

import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.xbase.annotations.ui.outline.XbaseWithAnnotationsOutlineTreeProvider;
import org.jnario.ExampleTable;
import org.jnario.JnarioField;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.jnario.spec.spec.TestFunction;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SpecOutlineTreeProvider extends XbaseWithAnnotationsOutlineTreeProvider {
	protected boolean _isLeaf(JnarioMember m) {
		return true;
	}
	
	protected boolean _isLeaf(ExampleTable element) {
		return true;
	}

	protected boolean _isLeaf(ExampleGroup element) {
		return element.getMembers().isEmpty();
	}
	
	protected Image _image(ExampleTable modelElement) {
		return PlatformUI.getWorkbench().getSharedImages().getImage(org.eclipse.ui.ISharedImages.IMG_OBJ_FILE);
	}
	protected Image _image(JnarioFunction modelElement) {
		ISharedImages images = JavaUI.getSharedImages();
		return  images.getImage(ISharedImages.IMG_OBJS_PUBLIC);
	}
	protected Image _image(JnarioField modelElement) {
		ISharedImages images = JavaUI.getSharedImages();
		return  images.getImage(ISharedImages.IMG_FIELD_PRIVATE);
	}
	
	
	protected Image _image(ExampleGroup modelElement) {
		ISharedImages images = JavaUI.getSharedImages();
		return  images.getImage(ISharedImages.IMG_OBJS_CLASS);
	}
	protected Image _image(TestFunction modelElement) {
		return PlatformUI.getWorkbench().getSharedImages().getImage(org.eclipse.ui.ISharedImages.IMG_TOOL_FORWARD);
	}
	protected Image _image(Before modelElement) {
		ISharedImages images = JavaUI.getSharedImages();
		return  images.getImage(ISharedImages.IMG_OBJS_PUBLIC);
	}
	protected Image _image(After modelElement) {
		ISharedImages images = JavaUI.getSharedImages();
		return  images.getImage(ISharedImages.IMG_OBJS_PUBLIC);
	}
	
	protected void _createChildren(IOutlineNode parentNode, ExampleGroup exampleGroup) {
		for (JnarioMember jnarioMember : exampleGroup.getMembers()) {
			createNode(parentNode, jnarioMember);
		}
	}
	
	protected void _createChildren(DocumentRootNode parentNode, SpecFile specFile) {
		for (JnarioTypeDeclaration jnarioTypeDeclaration : specFile.getXtendTypes()) {
			createNode(parentNode, jnarioTypeDeclaration);
		}
	}
}