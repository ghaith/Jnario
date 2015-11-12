package org.jnario.ui.editor

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.ui.editor.copyqualifiedname.XbaseCopyQualifiedNameService
import org.jnario.JnarioFunction

class XtendCopyQualifiedNameService extends XbaseCopyQualifiedNameService {

	def dispatch String getQualifiedName(JnarioFunction it, EObject context) {
		toQualifiedName
	}

	def dispatch String getQualifiedName(JnarioFunction it, Void context) {
		toQualifiedName
	}

	protected def String toQualifiedName(JnarioFunction it) {
		'''´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)'''
	}

// TODO NO_XTEND
//	def dispatch String getQualifiedName(JnarioConstructor it, EObject context) {
//		toQualifiedName
//	}
//
//	def dispatch String getQualifiedName(JnarioConstructor it, Void context) {
//		toQualifiedName
//	}
//
//	protected def String toQualifiedName(JnarioConstructor it) {
//		'''´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)'''
//	}

}