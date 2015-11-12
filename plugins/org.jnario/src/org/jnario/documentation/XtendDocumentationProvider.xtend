package org.jnario.documentation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.jnario.JnarioAnnotationTarget
import org.jnario.JnarioPackage

class XtendDocumentationProvider extends MultiLineCommentDocumentationProvider {
	
	override getDocumentation(EObject o) {
		if (!shouldBeHandeled(o)) {
			return null;
		}
		super.getDocumentation(o)
	}
	
	override getDocumentationNodes(EObject o) {
		if (!shouldBeHandeled(o)) {
			return emptyList;
		}
		super.getDocumentationNodes(o)
	}
	
	/**
	 * The Xtend parser constructs a synthetic nested AST element to hold annotations which should be ignored as a documentation provider
	 */
	def boolean shouldBeHandeled(EObject o) {
		!(o instanceof JnarioAnnotationTarget && o.eContainingFeature == JnarioPackage.Literals.JNARIO_MEMBER__ANNOTATION_INFO)
	}
	
}
