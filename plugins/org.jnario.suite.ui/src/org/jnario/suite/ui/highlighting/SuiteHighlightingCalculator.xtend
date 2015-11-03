/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.highlighting

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator
import org.jnario.suite.suite.PatternReference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.SuitePackage

import static extension org.jnario.util.Strings.*
class SuiteHighlightingCalculator extends XbaseHighlightingCalculator{

	override searchAndHighlightElements(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		resource.getAllContents().forEach[it.highlight(acceptor)]
	}

	def dispatch highlight(SpecReference ref, IHighlightedPositionAcceptor acceptor){
		highlightObjectAtFeature(acceptor, ref, SuitePackage::eINSTANCE.specReference_Spec, SuiteHighlightingConfiguration::LINK_ID)
	}

	def dispatch highlight(PatternReference ref, IHighlightedPositionAcceptor acceptor){
		highlightObjectAtFeature(acceptor, ref, SuitePackage::eINSTANCE.patternReference_Pattern, SuiteHighlightingConfiguration::PATTERN_ID)
	}
	
	def dispatch highlight(Suite suite, IHighlightedPositionAcceptor acceptor){
		val node = NodeModelUtils::getNode(suite)
		var lineEnd = suite.name.indexOfNewLine
		if(lineEnd == -1){
			lineEnd = suite.name.length
		}
		acceptor.addPosition(node.offset, lineEnd, SuiteHighlightingConfiguration::SUITE_ID)
	}

	def dispatch Void highlight(EObject ref, IHighlightedPositionAcceptor acceptor){
	}

}