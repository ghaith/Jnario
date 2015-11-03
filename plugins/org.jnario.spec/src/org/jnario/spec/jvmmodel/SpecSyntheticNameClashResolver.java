package org.jnario.spec.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.jnario.jvmmodel.JnarioSyntheticNameClashResolver;
import org.jnario.spec.spec.Example;

import com.google.inject.Inject;


public class SpecSyntheticNameClashResolver extends JnarioSyntheticNameClashResolver {
	
	@Inject
	private IJvmModelAssociations associations;
	
	@Override
	protected boolean isRenameable(JvmIdentifiableElement element) {
		if(super.isRenameable(element)){
			return true;
		}
		EObject source = associations.getPrimarySourceElement(element);
		return source instanceof Example;
	}

}
