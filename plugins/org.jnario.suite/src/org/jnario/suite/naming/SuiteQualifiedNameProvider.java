/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.naming;

import static org.eclipse.xtext.util.Strings.isEmpty;
import static org.jnario.util.Strings.lastIndexOfPrefix;
import static org.jnario.util.XtendTypes.packageName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.util.Strings;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class SuiteQualifiedNameProvider extends XbaseQualifiedNameProvider {
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Suite) {
			Suite suite = (Suite)obj;
			String lastSegment = suite.getName();
			lastSegment = Strings.firstLine(lastSegment);
			lastSegment = trimPrefix(lastSegment);
			if(isEmpty(lastSegment)){
				return null;
			}
			final String qualifiedName = (packageName(suite) != null ? packageName(suite) + "." : "")
					+ lastSegment;
			return qualifiedNameConverter.toQualifiedName(qualifiedName);
		}
		return super.getFullyQualifiedName(obj);
	}

	private String trimPrefix(String lastSegment) {
		return lastSegment.substring(lastIndexOfPrefix(lastSegment, '#'));
	}
}
