package org.jnario.feature.linking;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.jnario.feature.feature.StepReference;
import org.jnario.linking.JnarioLinkingDiagnosticMessageProvider;


public class FeatureLinkingDiagnosticMessageProvider extends JnarioLinkingDiagnosticMessageProvider {
	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		if(context.getContext() instanceof StepReference){
			return null;
		}
		return super.getUnresolvedProxyMessage(context);
	}
}
