package org.jnario.suite.suite.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.xtext.resource.XtextResource;
import org.jnario.Executable;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteExecutableProvider;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;

public class SuiteImplCustom extends SuiteImpl {
	@Override
	protected EList<Executable> calculateChildren() {
		if(eResource() == null){
			return super.calculateChildren();
		}
		SuiteExecutableProvider executableProvider = new SuiteExecutableProvider(get(SpecResolver.class), get(SuiteNodeBuilder.class));
		return new BasicInternalEList<Executable>(Executable.class, executableProvider.getExecutables(this));
	}

	protected <T> T get(Class<T> type) {
		return ((XtextResource)eResource()).getResourceServiceProvider().get(type);
	}
}
