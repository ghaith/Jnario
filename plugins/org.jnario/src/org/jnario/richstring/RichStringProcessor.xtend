package org.jnario.richstring

import org.jnario.RichString
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.jnario.RichStringLiteral
import com.google.common.base.Splitter
import java.util.regex.Pattern
import java.util.List
import org.eclipse.emf.ecore.EObject
import java.util.function.Consumer
import java.util.function.BiConsumer
import org.eclipse.xtext.xbase.XExpression
import org.jnario.compiler.JnarioCompiler
import org.eclipse.xtext.xbase.XBlockExpression

class RichStringProcessor {

	static val PLACEHOLDER_OPEN = '«'
	static val PLACEHOLDER_CLOSE = '»'
	static val RICHSTRING_TAG = "'''"

	static class RichStringAcceptor {

		List<BiConsumer<ITreeAppendable, String>> toBeAppended = newArrayList;
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
					appendable.append('''«variableName».append("«it.correctIndentation»");''')
					appendable.newLine
					if (index < lines.size - 1) {
						appendable.append('''«variableName».newLine();''')
						appendable.newLine
					}
				])

			]

		}

		def dispatch accept(EObject obj) {
			toBeAppended.add [ appendable, variableName |
				appendable.
					append('''«variableName».append(«'''"A nice String, greetings from Ghaith and Mathias"'''»);''')
				appendable.newLine
			]
		}

		def appendTo(ITreeAppendable appendable, String variableName) {
			toBeAppended.forEach [
				it.accept(appendable, variableName)
			]
//			if (i.hasNext) {
//			var v = i.next;
//			indentation = v.getIndentation()
//
//			do {
//				// Get leading \ts
//				if (!v.isEmpty) {
//					appendable.append('''«variableName».append("«v»");''')
//				}
//
//				if (i.hasNext) {
//					appendable.newLine
//					appendable.append('''«variableName».newLine();''')
//					appendable.newLine
//				}
//				if(i.hasNext) v = i.next
//			} while (i.hasNext)
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