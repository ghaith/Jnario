package org.jnario.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Holger Schill
 */
public class JnarioHighlightingConfiguration extends XbaseHighlightingConfiguration {

	public static final String RICH_TEXT_ID = "xtend.richText";
//	public static final String RICH_TEXT_DELIMITER_ID = "xtend.richText.delimiter";
//	public static final String INSIGNIFICANT_TEMPLATE_TEXT = "xtend.insignificant.template.text";
//	public static final String POTENTIAL_LINE_BREAK = "xtend.potential.line.break";
//	public static final String TEMPLATE_LINE_BREAK = "xtend.template.line.break";
//	public static final String ACTIVE_ANNOTATION = "xtend.active.annotation";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(RICH_TEXT_ID, "Template Text", richTextStyle());
//		acceptor.acceptDefaultHighlighting(RICH_TEXT_DELIMITER_ID, "Template Delimiter", richTextDelimiterStyle());
//		acceptor.acceptDefaultHighlighting(INSIGNIFICANT_TEMPLATE_TEXT, "Insignificant Template Text", insignificantTemplateTextStyle());
//		acceptor.acceptDefaultHighlighting(POTENTIAL_LINE_BREAK, "Potential Line Break (if line is not empty)", insignificantTemplateTextStyle());
//		acceptor.acceptDefaultHighlighting(TEMPLATE_LINE_BREAK, "Template Line Break", richTextStyle());
//		acceptor.acceptDefaultHighlighting(ACTIVE_ANNOTATION, "Active Annotation", activeAnnotationStyle());
	}
	
	private TextStyle richTextStyle() {
		TextStyle textStyle = stringTextStyle().copy();
		textStyle.setBackgroundColor(new RGB(220, 220, 220));
		return textStyle;
	}
	
//	private TextStyle richTextDelimiterStyle() {
//		TextStyle textStyle = defaultTextStyle().copy();
//		return textStyle;
//	}
//	
//	private TextStyle insignificantTemplateTextStyle() {
//		TextStyle textStyle = stringTextStyle().copy();
//		return textStyle;
//	}
//
//	private TextStyle activeAnnotationStyle() {
//		TextStyle textStyle = extensionMethodInvocation().copy();
//		return textStyle;
//	}

}
