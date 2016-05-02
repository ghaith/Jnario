package org.jnario.formatter

import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter
import org.eclipse.xtext.formatting2.regionaccess.ITextSegment
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter
import org.jnario.ExampleColumn
import org.jnario.ExampleRow
import org.jnario.ExampleTable
import org.jnario.JnarioPackage

/**
 * TODO NO_XTEND - Verify implementation
 * @author Sebastian Benz - Initial contribution and API
 */
class JnarioFormatter extends XbaseWithAnnotationsFormatter {
	def private void formatRows(EList<ExampleRow> rows, extension IFormattableDocument format) {
		rows.forEach [
		    append[newLine]
		]
	}

	def private void formatColumns(EList<ExampleColumn> columns, extension IFormattableDocument format) {
		columns.forEach [
			val nameNode = regionFor.feature(JnarioPackage.Literals.EXAMPLE_COLUMN__NAME)
			val typeNode = type
			val headerLength = if (typeNode == null) {
					nameNode.length
				} else {
					nameNode.offset + nameNode.length - typeNode.regionForEObject.offset
				}
			val maxExprLength = cells.map[getMultilineLength(format, expression.regionForEObject)].reduce[p1, p2|
				Math.max(p1, p2)] ?: 0
			val maxLength = Math.max(headerLength, maxExprLength)
			val columnLength = 1 + maxLength - headerLength
			prepend[oneSpace]
			regionFor.keyword("|").prepend[spaces(columnLength)]
			cells.forEach [
				expression.prepend[oneSpace]
				val length = 1 + maxLength - getMultilineLastSegmentLength(format, expression.regionForEObject)
				expression.append[spaces(length)]
			]
		]
		columns.last.append[newLine]
	}

	def spaces(IHiddenRegionFormatter init, int i) {
		init.space = (1 .. i).fold("", [p1, p2|p1 + " "])
	}

	def private getSplittedMultilineCell(IFormattableDocument format, ITextSegment segment) {
		format.region.text.substring(
		    segment.offset - format.region.offset,
		    segment.offset + segment.length - format.region.offset
		).split("\r?\n")
	}

	def private getMultilineLastSegmentLength(IFormattableDocument format, ITextSegment segment) {
		getSplittedMultilineCell(format, segment).last.trim.length
	}

	def private getMultilineLength(IFormattableDocument format, ITextSegment segment) {
		getSplittedMultilineCell(format, segment).map[trim.length].reduce[p1, p2|Math.max(p1, p2)]
	}

    // TODO NO_XTEND get it to work
    // Current state: NullPointerException in formatColumns()
    // Run 'fact "calculates cells based on table"' in the second Eclipse instance to reproduce
//	def dispatch void format(ExampleTable table, extension IFormattableDocument format) {
//		val open = table.regionFor.keyword("{").append[newLine]
//		val close = table.regionFor.keyword("}").prepend[newLine]
//		
//		interior(open, close) [indent]
//		
//		formatRows(table.rows, format)
//		formatColumns(table.columns, format)
//	}

	/**
	 * Hack: No node for type Void - prevent NullPointerException
	 */
	override public dispatch void format(JvmParameterizedTypeReference type, IFormattableDocument format) {
	    // TODO NO_XTEND Do we still need it?
		if (NodeModelUtils.findActualNodeFor(type) != null) {
			super._format(type, format)
		}
	}
}
