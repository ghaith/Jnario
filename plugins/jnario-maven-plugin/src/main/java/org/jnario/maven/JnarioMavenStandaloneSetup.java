package org.jnario.maven;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.annotations.XbaseWithAnnotationsStandaloneSetup;
import org.jnario.feature.FeatureStandaloneSetupGenerated;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.spec.SpecStandaloneSetupGenerated;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.suite.SuiteStandaloneSetupGenerated;
import org.jnario.suite.suite.SuitePackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class JnarioMavenStandaloneSetup {

	private static List<Injector> injectors = null;

	public List<Injector> createInjectorAndDoEMFRegistration() {
		if (injectors != null)
			return injectors;
		
		List<Injector> injectors = new ArrayList<Injector>();
		XbaseWithAnnotationsStandaloneSetup.doSetup();
		
		injectors.add(registerFeature());
		injectors.add(registerSpec());
		injectors.add(registerSuite());

		return injectors;
	}

	private Injector registerSpec() {
		EPackage.Registry.INSTANCE.put(SpecPackage.eINSTANCE.getNsURI(), SpecPackage.eINSTANCE);
		Injector injector = Guice.createInjector(new SpecMavenModule());
		new SpecStandaloneSetupGenerated().register(injector);
		return injector;
	}
	private Injector registerFeature() {
		EPackage.Registry.INSTANCE.put(FeaturePackage.eINSTANCE.getNsURI(), FeaturePackage.eINSTANCE);
		Injector injector = Guice.createInjector(new FeatureMavenModule());
		new FeatureStandaloneSetupGenerated().register(injector);
		return injector;
	}
	private Injector registerSuite() {
		EPackage.Registry.INSTANCE.put(SuitePackage.eINSTANCE.getNsURI(), SuitePackage.eINSTANCE);
		Injector injector = Guice.createInjector(new SuiteMavenModule());
		new SuiteStandaloneSetupGenerated().register(injector);
		return injector;
	}
	

}