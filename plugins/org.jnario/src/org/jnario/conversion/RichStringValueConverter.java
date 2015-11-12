/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import java.util.List;

import org.apache.commons.lang.text.StrBuilder;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.TextRegion;
import org.jnario.richstring.JnarioRichStringProcessor;

import com.google.inject.Inject;

public class RichStringValueConverter extends STRINGValueConverter implements IValueConverter<String> {
	@Inject
	private JnarioRichStringProcessor jnarioRichStringProcessor;
	
	public String toValue(String string, INode node)
			throws ValueConverterException {
		
		List<TextRegion> regions = jnarioRichStringProcessor.process(string);
		if (regions != null) {
			StringBuilder stringBuilder = new StringBuilder();
			for (TextRegion textRegion : regions) {
				stringBuilder.append(string.substring(textRegion.getOffset(), textRegion.getOffset() + textRegion.getLength()));
			}
			return stringBuilder.toString();
		}
		
//		if (string.startsWith("'''")) {
//			int i = 0;
//			while (i < 3 && string.charAt(string.length() - 1 - i) == '\'') {
//				i++;
//			}
//			return correctIndentation(string.substring(3, string.length() - i));
//		}
		
		return super.toValue(string, node);
	}
	
//	private String correctIndentation(String string) {
//		
//		
//		int indentation = 0;
//		int minimalIndentation = Integer.MAX_VALUE;
//		boolean inIndentation = true;
//		int lineNumber = 0;
//		for (int i = 0; i < string.length(); i++) {
//			char c = string.charAt(i);
//			boolean newLine = false;
//			if(c == '\r') {
//				if(i+1 < string.length() && string.charAt(i+1) == '\n') {
//					i++;
//				}
//				newLine = true;
//			}
//			if(c == '\n') {
//				newLine = true;
//			}
//			if(newLine) {
//				inIndentation = true;
//				indentation=0;
//				lineNumber++;
//				continue;
//			}
//				
//			if(Character.isWhitespace(c) && inIndentation) {
//				indentation++;
//				continue;
//			}
//			if(inIndentation) {
//				if(lineNumber == 0) {
//					return trimRightToNewLine(string);
//				}
//				minimalIndentation = Math.min(minimalIndentation, indentation);
//				inIndentation = false;
//			}
//		}
//		boolean trimRight = inIndentation;
//		int lastLine = lineNumber;
//		if(minimalIndentation == Integer.MAX_VALUE) {
//			if (trimRight) {
//				return trimRightToNewLine(string);
//			}
//			return string;
//		}
//
//		indentation = 0;
//		inIndentation = true;
//		lineNumber = 0;
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < string.length(); i++) {
//			char c = string.charAt(i);
//			boolean newLine = false;
//			if(c == '\r') {
//				sb.append(c);
//				if(i+1 < string.length() && string.charAt(i+1) == '\n') {
//					i++;
//					sb.append('\n');
//				}
//				newLine = true;
//			}
//			if(c == '\n') {
//				sb.append(c);
//				newLine = true;
//			}
//			if(newLine) {
//				if(lineNumber == 0) {
//					sb.setLength(0);
//				}
//				inIndentation = true;
//				indentation=0;
//				lineNumber++;
//				if(lineNumber==lastLine && trimRight)
//					return sb.toString();
//				continue;
//			}
//			
//			if(Character.isWhitespace(c) && inIndentation) {
//				indentation++;
//				if(indentation>minimalIndentation)
//					sb.append(c);
//				continue;
//			}
//			sb.append(c);
//			if(inIndentation) {
//				if(lineNumber == 0)
//					return string;
//				minimalIndentation = Math.min(minimalIndentation, indentation);
//				inIndentation = false;
//			}
//		}
//		
//		return sb.toString();
//	}
//
//	private String trimRightToNewLine(String string) {
//		for (int i = string.length() - 1; i != -1; i--) {
//			char c = string.charAt(i);
//			if (!Character.isSpaceChar(c)) {
//				if (c == '\n' || c == '\r') {
//					return string.substring(0, i + 1);
//				}
//				return string;
//			}
//		}
//		return string;
//	}
//
//	public String toString(String value) throws ValueConverterException {
//		return super.toString(value);
//	}
}
