package org.jnario.maven;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.jnario.spec.SpecRuntimeModule;

public class SpecMavenModule extends SpecRuntimeModule {

	public Class<? extends ResourceDescriptionsProvider> bindResourceDescriptionsProvider() {
		return MavenProjectAwareResourceDescriptionsProvider.class;
	}
}