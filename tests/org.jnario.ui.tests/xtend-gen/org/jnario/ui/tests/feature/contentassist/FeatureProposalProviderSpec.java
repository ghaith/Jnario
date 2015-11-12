package org.jnario.ui.tests.feature.contentassist;

import org.eclipse.xtext.ISetup;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extends;
import org.jnario.runner.Named;
import org.jnario.ui.tests.feature.contentassist.FeatureProposalProviderSameFileSpec;
import org.jnario.ui.tests.feature.contentassist.FeatureUiStandaloneSetup;
import org.jnario.ui.tests.util.AbstractContentAssistProcessorTest2;
import org.junit.runner.RunWith;

@Contains(FeatureProposalProviderSameFileSpec.class)
@Extends(AbstractContentAssistProcessorTest2.class)
@Named("FeatureProposalProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureProposalProviderSpec extends AbstractContentAssistProcessorTest2 {
  AbstractContentAssistProcessorTest2.ContentAssistProcessorTestBuilder2 builder;
  
  protected ISetup doGetSetup() {
    return new FeatureUiStandaloneSetup();
  }
}
