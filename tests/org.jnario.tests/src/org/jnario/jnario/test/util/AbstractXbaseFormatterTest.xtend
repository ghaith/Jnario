package org.jnario.jnario.test.util;

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys
import org.eclipse.xtext.junit4.formatter.FormatterTester
import org.eclipse.xtext.preferences.MapBasedPreferenceValues

abstract class AbstractXbaseFormatterTest {
	@Inject extension FormatterTester

	def assertFormatted(CharSequence toBeFormatted) {
		assertFormatted(toBeFormatted, toBeFormatted)
	}

	def assertFormattedExpression((MapBasedPreferenceValues)=>void cfg, CharSequence toBeFormatted) {
		assertFormattedExpression(cfg, toBeFormatted, toBeFormatted)
	}

	def assertFormattedExpression(CharSequence toBeFormatted) {
		assertFormattedExpression(null, toBeFormatted, toBeFormatted)
	}

	def assertFormattedExpression(String expectation, CharSequence toBeFormatted) {
		assertFormattedExpression(null, expectation, toBeFormatted)
	}

	def assertFormattedExpression((MapBasedPreferenceValues)=>void cfg, CharSequence expectation,
		CharSequence toBeFormatted) {
		assertFormattedExpression(cfg, expectation, toBeFormatted, false)
	}

	def assertFormattedExpression((MapBasedPreferenceValues)=>void cfg, CharSequence expectation,
		CharSequence toBeFormatted, boolean allowErrors) {
		assertFormatted(
			cfg,
			expectation.toString.trim.indent("\t"),
			toBeFormatted.toString.trim.indent("\t"),
			"{\n\t",
			"\n}",
			allowErrors
		)
	}

	def protected String indent(String string, String indent) {
		string.split("\\r?\\n").map[if(it == "") it else indent + it].join("\n")
	}

	def assertFormatted((MapBasedPreferenceValues)=>void cfg, CharSequence expectation) {
		assertFormatted(cfg, expectation, expectation)
	}

	def assertFormatted(CharSequence expectation, CharSequence toBeFormatted) {
		assertFormatted(null, expectation, toBeFormatted)
	}

	def assertFormatted((MapBasedPreferenceValues)=>void cfg, CharSequence expectation, CharSequence toBeFormatted) {
		assertFormatted(cfg, expectation, toBeFormatted, "", "", true)
	}

	def assertFormatted(
		(MapBasedPreferenceValues)=>void cfg,
		CharSequence expectation,
		CharSequence toBeFormatted,
		String prefix,
		String postfix,
		boolean allowErrors
	) {
		assertFormatted [
		    preferences [
		        put(FormatterPreferenceKeys.maxLineWidth, 80.toString)
		        cfg?.apply(it)
		    ]
			it.expectation = prefix + expectation + postfix
			it.toBeFormatted = prefix + toBeFormatted + postfix
			it.allowSyntaxErrors = allowErrors
		]
	}
}