package org.jnario.maven;

import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.jnario.feature.FeatureRuntimeModule;

public class FeatureMavenModule extends FeatureRuntimeModule {

	public Class<? extends ResourceDescriptionsProvider> bindResourceDescriptionsProvider() {
		return MavenProjectAwareResourceDescriptionsProvider.class;
	}
}