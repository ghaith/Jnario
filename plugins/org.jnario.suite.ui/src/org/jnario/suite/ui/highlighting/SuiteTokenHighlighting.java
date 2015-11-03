/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class SuiteTokenHighlighting extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_SUITE_NAME".equals(tokenName)) {
			return SuiteHighlightingConfiguration.TEXT_ID;
		}
		if ("RULE_PATTERN".equals(tokenName)) {
			return SuiteHighlightingConfiguration.TEXT_ID;
		}
		if ("RULE_LINK".equals(tokenName)) {
			return SuiteHighlightingConfiguration.TEXT_ID;
		}
		if ("RULE_TEXT".equals(tokenName)) {
			return SuiteHighlightingConfiguration.TEXT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
