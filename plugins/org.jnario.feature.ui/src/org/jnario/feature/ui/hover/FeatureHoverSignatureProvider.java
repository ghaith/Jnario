package org.jnario.feature.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.ui.hover.XbaseDeclarativeHoverSignatureProvider;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;

import com.google.inject.Inject;

public class FeatureHoverSignatureProvider extends XbaseDeclarativeHoverSignatureProvider {
	@Inject StepNameProvider stepNameProvider;  
	
	public String getSignature(EObject object) {
		if(object instanceof Step){
			return getSignature((Step)object);
		}else{
			return super.getSignature(object);
		}
	} 
	
	protected String getSignature(Step step){
		return stepNameProvider.nameOf(step);
	}	
}