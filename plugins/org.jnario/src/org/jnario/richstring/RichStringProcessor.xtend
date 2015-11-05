package org.jnario.richstring

import org.jnario.RichString
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.jnario.RichStringLiteral
import com.google.common.base.Splitter
import java.util.regex.Pattern
import java.util.List
import org.eclipse.xtext.xbase.XExpression
import org.jnario.compiler.JnarioCompiler
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2
import com.google.common.escape.Escapers

class RichStringProcessor {

	static val PLACEHOLDER_OPEN = '«'
	static val PLACEHOLDER_CLOSE = '»'
	static val RICHSTRING_TAG = "'''"
	static val escaper = Escapers.builder.addEscape("\\",'\\\\').build

	static class RichStringAcceptor {

		List<Procedure2<ITreeAppendable, String>> toBeAppended = newArrayList;
		String indentation = null

		JnarioCompiler compiler

		new(JnarioCompiler compiler) {
			this.compiler = compiler
		}

		def dispatch accept(XBlockExpression block) {
			toBeAppended.add([ appendable, variableName |
				val blockName = compileBlock(block, appendable)
				if (blockName != null) {
					appendable.append('''«variableName».append(«blockName»);''')
					appendable.newLine
				}
			])
		}

		def compileBlock(XBlockExpression expression, ITreeAppendable appendable) {
			if (expression.expressions.size == 1) {
				compiler.toJavaStatement(expression, appendable, true)
				appendable.newLine
				return appendable.getName(expression.expressions.get(0))
			} else if (expression.expressions.size > 1) {
				// compile the block's result to a variable
				compiler.toJavaStatement(expression, appendable, true)
				appendable.newLine
				return appendable.getName(expression)
			}
			return null
		}

		def dispatch accept(XExpression literal) {
			toBeAppended.add([ appendable, name |
				appendable.append('''«name».append(''')
				compiler.toJavaExpression(literal, appendable)
				appendable.append(''');''')
				appendable.newLine
			])
		}
		
		def dispatch accept(RichStringLiteral literal) {
			var value = literal.value
			if (value.startsWith(RICHSTRING_TAG)) {
				value = value.substring(3)
			}
			if (value.startsWith(PLACEHOLDER_CLOSE)) {
				value = value.substring(1)
			}
			if (value.endsWith(PLACEHOLDER_OPEN)) {
				value = value.substring(0, value.length - 1)
			}
			if (value.endsWith(RICHSTRING_TAG)) {
				value = value.substring(0, value.length - 3)
			}

			val lines = Splitter.on(Pattern.compile("\r?\n")).split(value)

			lines.forEach [ it, index |
				if (indentation == null && it.empty) {
					// the very first empty line
					return
				}

				val currentIndentation = it.indentation
				if (indentation == null || currentIndentation.length < indentation.length) {
					indentation = currentIndentation
				}

				toBeAppended.add([ appendable, variableName |
					appendable.append('''«variableName».append("«it.correctIndentation.escape»");''')
					appendable.newLine
					if (index < lines.size - 1) {
						appendable.append('''«variableName».newLine();''')
						appendable.newLine
					}
				])

			]

		}
	
	def escape(String string) {
		return escaper.escape(string)
	}

		def appendTo(ITreeAppendable appendable, String variableName) {
			toBeAppended.forEach [
				it.apply(appendable, variableName)
			]
		}

		def correctIndentation(String string) {
			if (string.startsWith(indentation)) {
				return string.substring(indentation.length)
			}
			return string
		}

	}

	def void process(RichString richString, ITreeAppendable appendable, String variableName, JnarioCompiler compiler) {
		val acceptor = new org.jnario.richstring.RichStringProcessor.RichStringAcceptor(compiler)
		richString.expressions.forEach [ it, index |
			acceptor.accept(it)
		]
		acceptor.appendTo(appendable, variableName)
	}

	def static String getIndentation(String string) {
		val pattern = Pattern.compile("(\\s*).*")
		// Get first char that is not a whitespace
		val matcher = pattern.matcher(string)
		if (matcher.matches) {
			return matcher.group(1)
		}
		return ''
	}

}