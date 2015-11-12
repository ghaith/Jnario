package org.jnario.ui.validator;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.ui.validation.XbaseUIValidator;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.jnario.JnarioFile;
import org.jnario.JnarioPackage;

public class JnarioUIValidator extends XbaseUIValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> packages = super.getEPackages();
		packages.add(JnarioPackage.eINSTANCE);
		return packages;
	}
	
	@Override
	@Check
	public void checkRestrictedType(JvmTypeReference typeReference) {
	}
	
	@Override
	@Check
	public void checkRestrictedType(XConstructorCall constructorCall) {
	}
	
	@Override
	@Check
	public void checkRestrictedType(XImportDeclaration importDeclaration) {
		super.checkRestrictedType(importDeclaration);
	}
	
// TODO NO_XTEND
//	@Override
//	@Check
//	public void checkFileNamingConventions(JnarioFile jnarioFile) {
//		super.checkFileNamingConventions(jnarioFile);
//	}
}
