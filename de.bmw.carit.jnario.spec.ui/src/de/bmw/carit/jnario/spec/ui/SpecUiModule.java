/*
 * generated by Xtext
 */
package de.bmw.carit.jnario.spec.ui;

import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.builder.navigation.IDerivedMemberAwareEditorOpener;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.actions.IActionContributor;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategy;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.doubleClicking.DoubleClickStrategyProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingStructureProvider;
import org.eclipse.xtext.ui.editor.formatting.IContentFormatterFactory;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapper;
import org.eclipse.xtext.ui.editor.occurrences.IOccurrenceComputer;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IComparator;
import org.eclipse.xtext.ui.editor.outline.quickoutline.QuickOutlineFilterAndSorter;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.toggleComments.ISingleLineCommentHelper;
import org.eclipse.xtext.ui.editor.toggleComments.ToggleSLCommentAction;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.RenameElementProcessor;
import org.eclipse.xtext.ui.resource.IResourceUIServiceProvider;
import org.eclipse.xtext.xbase.ui.jvmmodel.navigation.DerivedMemberAwareEditorOpener;
import org.eclipse.xtext.xtend2.ui.XtendResourceUiServiceProvider;
import org.eclipse.xtext.xtend2.ui.autoedit.AutoEditStrategyProvider;
import org.eclipse.xtext.xtend2.ui.autoedit.TokenTypeToPartitionMapper;
import org.eclipse.xtext.xtend2.ui.builder.SourceRelativeFileSystemAccess;
import org.eclipse.xtext.xtend2.ui.builder.XtendBuilderParticipant;
import org.eclipse.xtext.xtend2.ui.contentassist.ImportingTypesProposalProvider;
import org.eclipse.xtext.xtend2.ui.editor.InitiallyCollapsableAwareFoldingStructureProvider;
import org.eclipse.xtext.xtend2.ui.editor.OccurrenceComputer;
import org.eclipse.xtext.xtend2.ui.editor.RichStringAwareSourceViewer;
import org.eclipse.xtext.xtend2.ui.editor.RichStringAwareToggleCommentAction;
import org.eclipse.xtext.xtend2.ui.editor.SingleLineCommentHelper;
import org.eclipse.xtext.xtend2.ui.editor.Xtend2DoubleClickStrategyProvider;
import org.eclipse.xtext.xtend2.ui.editor.XtendNatureAddingEditorCallback;
import org.eclipse.xtext.xtend2.ui.highlighting.RichStringAwareTokenScanner;
import org.eclipse.xtext.xtend2.ui.highlighting.ShowWhitespaceCharactersActionContributor;
import org.eclipse.xtext.xtend2.ui.highlighting.TokenToAttributeIdMapper;
import org.eclipse.xtext.xtend2.ui.highlighting.XtendHighlightingConfiguration;
import org.eclipse.xtext.xtend2.ui.hover.XtendHoverProvider;
import org.eclipse.xtext.xtend2.ui.hyperlinking.XtendHyperlinkHelper;
import org.eclipse.xtext.xtend2.ui.outline.Xtend2OutlineNodeComparator;
import org.eclipse.xtext.xtend2.ui.outline.Xtend2OutlinePage;
import org.eclipse.xtext.xtend2.ui.outline.Xtend2QuickOutlineFilterAndSorter;
import org.eclipse.xtext.xtend2.ui.refactoring.Xtend2RenameElementProcessor;
import org.eclipse.xtext.xtend2.ui.refactoring.Xtend2RenameStrategy;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import de.bmw.carit.jnario.spec.ui.editor.SpecFoldingRegionProvider;
import de.bmw.carit.jnario.spec.ui.highlighting.SpecHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class SpecUiModule extends de.bmw.carit.jnario.spec.ui.AbstractSpecUiModule {
	public SpecUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	

	public void configureDebugMode(Binder binder) {
		if (Boolean.getBoolean("org.eclipse.xtext.xtend.debug")) {
			binder.bindConstant().annotatedWith(Names.named(AbstractEditStrategy.DEBUG)).to(true);
		}
		// matches ID of org.eclipse.ui.contexts extension registered in plugin.xml
		binder.bindConstant().annotatedWith(Names.named(XtextEditor.KEY_BINDING_SCOPE)).to("de.bmw.carit.jnario.spec.ui.SpecEditorScope");
	}

	@Override
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return XtendHighlightingConfiguration.class;
	}
	
	@Override
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return TokenToAttributeIdMapper.class;
	}

	@Override
	public Class<? extends ITokenScanner> bindITokenScanner() {
		return RichStringAwareTokenScanner.class;
	}

	public void configureIShowWhitespaceCharactersActionContributor(Binder binder) {
		binder.bind(IActionContributor.class).annotatedWith(Names.named("Show Whitespace"))
				.to(ShowWhitespaceCharactersActionContributor.class);
	}
	
	@Override
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SpecHighlightingCalculator.class;
	}

	public Class<? extends ITokenTypeToPartitionTypeMapper> bindITokenTypeToPartitionTypeMapper() {
		return TokenTypeToPartitionMapper.class;
	}

	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return AutoEditStrategyProvider.class;
	}

	public Class<? extends DoubleClickStrategyProvider> bindDoubleClickStrategyProvider() {
		return Xtend2DoubleClickStrategyProvider.class;
	}

	@Override
	public Class<? extends IComparator> bindOutlineFilterAndSorter$IComparator() {
		return Xtend2OutlineNodeComparator.class;
	}

	public Class<? extends QuickOutlineFilterAndSorter> bindQuickOutlineFilterAndSorter() {
		return Xtend2QuickOutlineFilterAndSorter.class;
	}

	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return SpecFoldingRegionProvider.class;
	}

	@Override
	public Class<? extends ITypesProposalProvider> bindITypesProposalProvider() {
		return ImportingTypesProposalProvider.class;
	}

	@Override
	public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
		return Xtend2OutlinePage.class;
	}

	@Override
	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return XtendHyperlinkHelper.class;
	}

	@Override
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return XtendHoverProvider.class;
	}
	
	public Class<? extends EclipseResourceFileSystemAccess2> bindEclipseResourceFileSystemAccess2() {
		return SourceRelativeFileSystemAccess.class;
	}
	
	@Override
	public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return XtendBuilderParticipant.class;
	}
	
	@Override
	public Class<? extends ISingleLineCommentHelper> bindISingleLineCommentHelper() {
		return SingleLineCommentHelper.class;
	}
	
	
	public Class<? extends IFoldingStructureProvider> bindIFoldingStructureProvider(){
		return InitiallyCollapsableAwareFoldingStructureProvider.class;
	}
	
	@Override
	public Class<? extends IContentFormatterFactory> bindIContentFormatterFactory() {
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=361385
		return null;
	}
	
	public Class<? extends IOccurrenceComputer> bindDefaultOccurrenceComputer() {
		return OccurrenceComputer.class;
	}
	
	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return XtendNatureAddingEditorCallback.class;
	}
	
	public Class<? extends IResourceUIServiceProvider> bindIResourceUIServiceProvider() {
		return XtendResourceUiServiceProvider.class;
	}
	
	@Override
	public ICharacterPairMatcher bindICharacterPairMatcher() {
		return new DefaultCharacterPairMatcher(new char[] { '(', ')', '{', '}', '[', ']', '�', '�' });
	}
	
	public Class<? extends RenameElementProcessor> bindRenameElementProcessor() {
		return Xtend2RenameElementProcessor.class;
	}
	
	@Override
	public Class<? extends IRenameStrategy> bindIRenameStrategy() {
		return Xtend2RenameStrategy.class;
	}

	@Override
	public void configureLanguageSpecificURIEditorOpener(Binder binder) {
		if (PlatformUI.isWorkbenchRunning()) {
			binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class)
					.to(DerivedMemberAwareEditorOpener.class);
			binder.bind(IDerivedMemberAwareEditorOpener.class).to(DerivedMemberAwareEditorOpener.class);
		}
	}
	

	public Class<? extends XtextSourceViewer.Factory> bindSourceViewerFactory() {
		return RichStringAwareSourceViewer.Factory.class;
	}
	
	public Class<? extends ToggleSLCommentAction.Factory> bindToggleCommentFactory() {
		return RichStringAwareToggleCommentAction.Factory.class;
	}
	
}
