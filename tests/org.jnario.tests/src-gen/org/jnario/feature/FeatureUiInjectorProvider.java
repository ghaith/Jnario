/*
 * generated by Xtext
 */
package org.jnario.feature;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class FeatureUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.jnario.feature.ui.internal.FeatureActivator.getInstance().getInjector("org.jnario.feature.Feature");
	}
	
}
