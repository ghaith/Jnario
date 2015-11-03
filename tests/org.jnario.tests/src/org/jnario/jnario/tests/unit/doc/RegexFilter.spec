/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.doc

import org.jnario.doc.RegexFilter

describe RegexFilter {

	def filteringExamples{
		| string 						| regex 					| result 		|
		| "hello"						|"e"						| "hllo" 		|
		| "aabbaa"						|"b*"						| "aaaa" 		|
		| "aa.aa"						|"\\."						| "aaaa" 		|
		| "aa '''some code''' aa"		|"aa|'''"					| " some code " |
		| "\n'''.methodCall" 			| "\\.methodCall" 			| "\n'''" 		|
	}
	
	fact "removes all matched elements"{
		filteringExamples.forEach[
			val filter = RegexFilter::create(regex)
			filter.apply(string) => result
		]
	}

}