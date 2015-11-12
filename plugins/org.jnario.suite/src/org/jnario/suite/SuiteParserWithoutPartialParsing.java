package org.jnario.suite;

import org.jnario.suite.parser.antlr.SuiteParser;

public class SuiteParserWithoutPartialParsing extends SuiteParser {
	
	@Override
	protected boolean isReparseSupported() {
		return false;
	}


}
