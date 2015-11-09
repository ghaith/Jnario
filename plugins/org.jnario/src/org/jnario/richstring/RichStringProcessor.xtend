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
import java.util.Arrays

class RichStringProcessor {

	static val PLACEHOLDER_OPEN = '«'
	static val PLACEHOLDER_CLOSE = '»'
	static val RICHSTRING_TAG = "'''"

	static class RichStringAcceptor {

		List<Procedure2<ITreeAppendable, String>> toBeAppended = newArrayList;

		val lineInformation = <Pair<String, Boolean>>newArrayList()

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
			var fixIndentation = true;
			var value = literal.value
			if (value.startsWith(RICHSTRING_TAG)) {
				value = value.substring(3)
			}
			if (value.startsWith(PLACEHOLDER_CLOSE)) {
				value = value.substring(1)
				fixIndentation = false
			}
			if (value.endsWith(PLACEHOLDER_OPEN)) {
				value = value.substring(0, value.length - 1)
			}
			if (value.endsWith(RICHSTRING_TAG)) {
				value = value.substring(0, value.length - 3)
			}

			val lines = Splitter.on(Pattern.compile("\r?\n")).split(value)
			val shouldFixIndentation = fixIndentation
			lines.forEach [ it, index |
				if (shouldFixIndentation || index != 0) {
					val currentIndentation = it.indentation
					lineInformation.add(currentIndentation -> (it.trim.length > 0))
				}

				toBeAppended.add([ appendable, variableName |
					appendable.append('''«variableName».append("« 
						if (shouldFixIndentation || index != 0) {
							it.correctIndentation.escape
						} else {
							it.escape
						}
					»");'''
					)
					appendable.newLine
					if (index < lines.size - 1) {
						appendable.append('''«variableName».newLine();''')
						appendable.newLine
					}
				])
			]

		}

		def escape(String string) {
			return string.replace("\\","\\\\").replace("\"","\\\"").replace("\\\\u","\\u")
		}

		def appendTo(ITreeAppendable appendable, String variableName) {
			//Don't destroy the originals incase clearEmptyFirst.. fails
			//Mostly for debug reasons
			val lineInformation = this.lineInformation.toList
			val toBeAppended = this.toBeAppended.toList
			clearEmptyFirstAndLastLines(lineInformation, toBeAppended);
			indentation = calculateIndentation(lineInformation)

			toBeAppended.forEach [
				it.apply(appendable, variableName)
			]
		}

		def clearEmptyFirstAndLastLines(List<Pair<String, Boolean>> lineInformation,
			List<Procedure2<ITreeAppendable, String>> toBeAppended) {
			val first = lineInformation.head
			if (!(lineInformation.nullOrEmpty || first.value)) { // its empty
				lineInformation.remove(0)
				toBeAppended.remove(0)
			} else {
				lineInformation.remove(0)
				lineInformation.add(0,''->true)
			}

			val last = lineInformation.last
			if (!(lineInformation.nullOrEmpty || last.value)) { // its empty
				lineInformation.remove(lineInformation.size - 1)
				toBeAppended.remove(toBeAppended.length - 1)
			}

		}

		def calculateIndentation(List<Pair<String, Boolean>> lineInformation) {
			if (!lineInformation.nullOrEmpty) {
				return lineInformation.minBy [
					if (it.value) {
						return it.key.length
					}
					return Integer.MAX_VALUE //for empty lines we assume maximum indentation
				].key
			}
			return ''
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