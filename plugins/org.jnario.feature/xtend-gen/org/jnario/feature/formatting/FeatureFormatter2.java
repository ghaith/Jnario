package org.jnario.feature.formatting;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.services.FeatureGrammarAccess;
import org.jnario.formatter.JnarioFormatter;

@SuppressWarnings("all")
public class FeatureFormatter2 extends JnarioFormatter {
  @Inject
  @Extension
  private FeatureGrammarAccess _featureGrammarAccess;
}
