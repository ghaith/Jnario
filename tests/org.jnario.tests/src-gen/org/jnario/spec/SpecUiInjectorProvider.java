/*
 * generated by Xtext
 */
package org.jnario.spec;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SpecUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.jnario.spec.ui.internal.SpecActivator.getInstance().getInjector("org.jnario.spec.Spec");
	}
	
}
