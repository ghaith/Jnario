package org.jnario.feature.ui.validator;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.ui.validation.XbaseUIValidator;
import org.jnario.feature.feature.FeaturePackage;

public class FeatureUIValidator extends XbaseUIValidator {
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> packages = super.getEPackages();
		packages.add(FeaturePackage.eINSTANCE);
		return packages;
	}
}
