/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import org.eclipse.xtext.generator.IFileSystemAccess
import org.jnario.JnarioTypeDeclaration

import static org.jnario.doc.DocOutputConfigurationProvider.*

import static extension org.jnario.util.Strings.*
import static extension org.jnario.util.XtendTypes.*

class HtmlFileBuilder {
	
	def generate(JnarioTypeDeclaration context, IFileSystemAccess fsa, HtmlFile htmlFile){
		if(htmlFile.name == null) return
		val content = htmlFile.toText
		fsa.generateFile(filePath(context, htmlFile), DOC_OUTPUT, content)
	}
	
	def toHtmlFileName(CharSequence nameWithoutExtension){
		var result = nameWithoutExtension?.toString
		return result.trim("_") + ".html"
	}
	
	def private filePath(JnarioTypeDeclaration xtendClass, HtmlFile htmlFile){
		val fileName = "/" + htmlFile.name?.toHtmlFileName
		if(xtendClass.packageName == null){
			return fileName
		}
		return "/" + xtendClass.packageName.replaceAll("\\.", "/") + fileName
	}
	
}