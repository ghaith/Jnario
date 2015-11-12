package org.eclipse.xtend.maven;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.XbaseStandaloneSetupGenerated;
import org.eclipse.xtext.xbase.annotations.XbaseWithAnnotationsStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class XtendMavenStandaloneSetup implements ISetup {

	private static Injector injector = null;

	public Injector createInjectorAndDoEMFRegistration() {
		if (injector != null) {
			return injector;
		}
		XbaseWithAnnotationsStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XbasePackage.eINSTANCE.getNsURI(), XbasePackage.eINSTANCE);
		injector = Guice.createInjector(new XtendMavenModule());
		new XbaseStandaloneSetupGenerated().register(injector);
		return injector;
	}

}
