/*
 * generated by Xtext
 */
package org.jnario.xbase.richstring.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.jnario.xbase.richstring.services.XbaseWithRichstringGrammarAccess;

public class XbaseWithRichstringParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XbaseWithRichstringGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.jnario.xbase.richstring.parser.antlr.internal.InternalXbaseWithRichstringParser createParser(XtextTokenStream stream) {
		return new org.jnario.xbase.richstring.parser.antlr.internal.InternalXbaseWithRichstringParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "XStringLiteral";
	}
	
	public XbaseWithRichstringGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XbaseWithRichstringGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
