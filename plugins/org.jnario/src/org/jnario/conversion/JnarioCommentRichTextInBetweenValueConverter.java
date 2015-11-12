/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;


/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class JnarioCommentRichTextInBetweenValueConverter extends AbstractLexerBasedConverter<String> {

	public String toValue(String string, INode node)
			throws ValueConverterException {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO NO_XTEND
//	@Override
//	protected String getTrailingTerminal() {
//		return "\u00AB";
//	}

}

