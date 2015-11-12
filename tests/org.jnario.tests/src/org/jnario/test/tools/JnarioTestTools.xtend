package org.jnario.test.tools

import org.eclipse.xtext.junit4.validation.AssertableDiagnostics

class JnarioTestTools {
	def static void assertOKWithMessage(AssertableDiagnostics it) {
		if (diagnostic.children.size() != 0) {
			println("Diagnostics:")
			diagnostic.children.forEach[println("- " + message)]
			fail("There are expected to be no diagnostics.");
		}
	}
}