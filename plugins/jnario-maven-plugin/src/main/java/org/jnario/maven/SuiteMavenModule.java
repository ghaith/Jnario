package org.jnario.maven;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.jnario.suite.SuiteRuntimeModule;

public class SuiteMavenModule extends SuiteRuntimeModule {

	public Class<? extends ResourceDescriptionsProvider> bindResourceDescriptionsProvider() {
		return MavenProjectAwareResourceDescriptionsProvider.class;
	}
}