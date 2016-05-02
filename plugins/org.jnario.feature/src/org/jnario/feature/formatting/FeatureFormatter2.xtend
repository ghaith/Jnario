package org.jnario.feature.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Scenario
import org.jnario.feature.services.FeatureGrammarAccess
import org.jnario.formatter.JnarioFormatter

class FeatureFormatter2 extends JnarioFormatter {
	
    @Inject extension FeatureGrammarAccess

// TODO NO_XTEND	
//	def dispatch void format(Scenario scenario, extension IFormattableDocument format) { 
//		scenario.regionFor.ruleCallTo(scenarioRule).prepend[increaseIndentation]
//	}
//
//	def dispatch void format(Background background, extension IFormattableDocument format) { 
//		background.regionFor.ruleCallTo(scenarioRule).prepend[increaseIndentation]
//	}
}