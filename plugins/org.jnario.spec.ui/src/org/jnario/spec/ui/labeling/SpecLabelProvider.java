/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
* generated by Xtext
*/
package org.jnario.spec.ui.labeling;

import static org.eclipse.xtext.util.Strings.convertFromJavaString;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.ui.labeling.XbaseImageAdornments;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.jnario.ExampleTable;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;

import com.google.inject.Inject;


/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecLabelProvider extends XbaseLabelProvider {

	@Inject public SpecLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

//	@Inject
//	private XtendImages images;

	@Inject
	private ExampleNameProvider exampleNameProvider;

	@Inject
	private XbaseImageAdornments adornments;

//	@Inject
//	private IXtendJvmAssociations associations;
	
	// TODO NO_XTEND
//	  protected ImageDescriptor imageDescriptor(final Object operation) {
//		if (operation instanceof ExampleTable) {
//		  return _imageDescriptor((ExampleTable)operation);
//		}
//		if (operation instanceof ExampleGroup) {
//		  return _imageDescriptor((ExampleGroup)operation);
//		}
//		if (operation instanceof TestFunction) {
//		  return _imageDescriptor((TestFunction)operation);
//		}
//   	    return super.imageDescriptor(operation);
//	  }

	
		// TODO NO_XTEND
//	protected ImageDescriptor _imageDescriptor(ExampleTable element) {
//		return images.forField(JvmVisibility.PROTECTED, adornments.get((JvmIdentifiableElement) associations.getJvmElements(element).iterator().next()));
//	}
//	
//	protected ImageDescriptor _imageDescriptor(ExampleGroup element) {
//		return images.forClass(JvmVisibility.PUBLIC, adornments.get(associations.getInferredType(element)));
//	}

	// TODO NO_XTEND
	// protected ImageDescriptor _imageDescriptor(TestFunction element) {
	//	 return images.forOperation(JvmVisibility.PUBLIC, adornments.get(associations.getDirectlyInferredOperation(element)));
	// }

	protected String text(ExampleGroup element) {
		return convertFromJavaString(exampleNameProvider.describe(element), true);
	}
	
	protected String text(Example element) {
		return convertFromJavaString(exampleNameProvider.describe(element), true);
	}
	
	protected String text(ExampleTable element) {
		return exampleNameProvider.toFieldName(element);
	}
	
	protected String text(TestFunction element) {
		return exampleNameProvider.toMethodName(element);
	}
	
}