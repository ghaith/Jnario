/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.feature.ui.contentassist;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptySet;
import static org.eclipse.emf.ecore.util.EcoreUtil.resolve;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.jnario.feature.jvmmodel.StepTypeProvider.GIVEN;
import static org.jnario.feature.jvmmodel.StepTypeProvider.THEN;
import static org.jnario.feature.jvmmodel.StepTypeProvider.WHEN;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions;
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions.VariableType;
import org.eclipse.xtext.common.types.xtext.ui.TypeMatchFilters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.XbaseQualifiedNameConverter;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.conversion.XbaseQualifiedNameValueConverter;
import org.eclipse.xtext.xbase.imports.IImportsConfiguration;
import org.eclipse.xtext.xbase.imports.ImportSectionRegionUtil;
import org.eclipse.xtext.xbase.imports.RewritableImportSection;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.imports.ReplaceConverter;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.JnarioField;
import org.jnario.JnarioPackage;
import org.jnario.JnarioParameter;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.StepTypeProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.feature.services.FeatureGrammarAccess;
import org.jnario.ui.contentassist.ImportingTypesProposalProvider.FQNImporter;

import com.google.common.base.Strings;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureProposalProvider extends AbstractFeatureProposalProvider {
	
	public static class FeatureRewritableImportSection extends RewritableImportSection{

		public FeatureRewritableImportSection(XtextResource resource,
				IImportsConfiguration importsConfiguration,
				XImportSection originalImportSection, String lineSeparator,
				ImportSectionRegionUtil regionUtil,
				IValueConverter<String> nameConverter) {
			super(resource, importsConfiguration, originalImportSection, lineSeparator,
					regionUtil, nameConverter);
		}
		
	}
	
	private static final Logger LOG = Logger.getLogger(FeatureProposalProvider.class);
	@Inject private IResourceDescriptions resourceDescriptions;
	@Inject private IContainer.Manager containerManager;
	@Inject private StepNameProvider stepNameProvider;
	@Inject private RewritableImportSection.Factory importSectionFactory;
	@Inject	private ReplaceConverter replaceConverter;
	@Inject private StepTypeProvider stepTypeProvider;
	@Inject private IJvmModelAssociations associations;
	@Inject private FeatureGrammarAccess grammarAccess;
	
	@Inject
	private JdtVariableCompletions completions;
	@Override
	public void completeXAnnotation_AnnotationType(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeJavaTypes(context, XAnnotationsPackage.Literals.XANNOTATION__ANNOTATION_TYPE, 
				TypeMatchFilters.all(IJavaSearchConstants.ANNOTATION_TYPE), acceptor);
	}
	
//	@Override
//	public void completeMockLiteral_Type(EObject model, Assignment assignment,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		completeJavaTypes(context, XbasePackage.Literals.XTYPE_LITERAL__TYPE, 
//				TypeMatchFilters.all(IJavaSearchConstants.CLASS_AND_INTERFACE), acceptor);
//	}
	
	@Override
	public void completeAndReference_Reference(EObject model,
			Assignment assignment, ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
	}
	
	@Override
	public void completeGivenReference_Reference(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}
	
	@Override
	public void completeWhenReference_Reference(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}
	
	@Override
	public void completeThenReference_Reference(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}
	
	@Override
	public void completeButReference_Reference(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}

	protected IScope createStepScope(EObject model) {
		List<IEObjectDescription> scopedElements = newArrayList();
		for (IContainer container : visibleContainers(model)) {
			Iterable<IEObjectDescription> descs = container.getExportedObjectsByType(FeaturePackage.Literals.STEP_REFERENCE);
			addAll(scopedElements, descs);
		}
		IScope scope = new SimpleScope(scopedElements);
		return scope;
	}

	public void createProposal(ContentAssistContext context,
			ICompletionProposalAcceptor acceptor, String stepPrefix,
			StepReference ref) {
		String name = stepNameProvider.nameOf(ref);
		name = stepNameProvider.removeKeywords(name);
		name = stepNameProvider.removeArguments(name);
		if(Strings.isNullOrEmpty(name)){
			return;
		}
		String proposal = stepPrefix + " " + name;
		acceptor.accept(createCompletionProposal(proposal, name, getLabelProvider().getImage(ref) , context));
	}

	public List<IContainer> visibleContainers(EObject model) {
		IResourceDescription.Manager resourceDescManager = ((XtextResource)model.eResource()).getResourceServiceProvider().getResourceDescriptionManager();
		IResourceDescription resourceDescription = resourceDescManager.getResourceDescription(model.eResource());
		List<IContainer> visibleContainers = containerManager.getVisibleContainers(resourceDescription, resourceDescriptions);
		return visibleContainers;
	}

	@Override
	public void completeKeyword(Keyword keyword,
			ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		if("import".equals(keyword.getValue()) && contentAssistContext.getPreviousModel() instanceof Feature){
			return;
		}
		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	
	@Override
	public void complete_FEATURE_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal = "Feature: ";
		if (context.getPreviousModel() instanceof Feature) {
			complete_BACKGROUND_TEXT(model, ruleCall, context, acceptor);
			complete_SCENARIO_TEXT(model, ruleCall, context, acceptor);
		}else{
			acceptor.accept(createCompletionProposal(proposal, proposal, getLabelProvider().getImage(model), context));
		}
	}
	
	@Override
	public void complete_BACKGROUND_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal = "Background: ";
		acceptor.accept(createCompletionProposal(proposal, proposal, getLabelProvider().getImage(model), context));
	}
	
	
	@Override
	public void complete_SCENARIO_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal = "Scenario: ";
		acceptor.accept(createCompletionProposal(proposal, proposal, getLabelProvider().getImage(model), context));
	}
	
	@Override
	public void complete_GIVEN_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeStepReference(acceptor, context, "Given", GIVEN);
	}
	
	@Override
	public void complete_WHEN_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeStepReference(acceptor, context, "When", WHEN);
	}
	
	@Override
	public void complete_THEN_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeStepReference(acceptor, context, "Then", THEN);
	}
	
	@Override
	public void complete_BUT_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeStepReference(acceptor, context, "But", getExpectedTypes(context));
	}
	
	@Override
	public void complete_AND_TEXT(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeStepReference(acceptor, context, "And", getExpectedTypes(context));
	}
	
	public void completeStepReference(ICompletionProposalAcceptor acceptor, ContentAssistContext context, String prefix, Set<EClass> expected) {
		prefix = prefix + " ";
		acceptor.accept(createCompletionProposal(prefix, prefix, getLabelProvider().getImage("step.png"), context));
		IScope scope = getScopeProvider().getScope(context.getCurrentModel(), FeaturePackage.Literals.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE);
		for (IEObjectDescription desc : scope.getAllElements()) {
			Step step = (Step) resolve(desc.getEObjectOrProxy(), context.getCurrentModel());
			Scenario scenario = getContainerOfType(step, Scenario.class);
			String proposal = getQualifiedNameConverter().toString(desc.getQualifiedName().skipLast(1)) + "." + prefix + desc.getName().getLastSegment();
			
			if(expected.contains(stepTypeProvider.getActualType(step)) && context.getMatcher().isCandidateMatchingPrefix(proposal, context.getPrefix())){
				acceptor = createStepFqnShorterner(context, acceptor, scope, desc.getQualifiedName(), scenario);
				String displayString = proposal;
				StyledString styledDisplayString = getStyledDisplayString(step, displayString, scenario.getName());
				acceptor.accept(doCreateProposal(proposal, styledDisplayString, getLabelProvider().getImage(step), 1000, context));
			}
		}
	}

	public Set<EClass> getExpectedTypes(ContentAssistContext context) {
		EObject model = context.getLastCompleteNode().getSemanticElement();
		model = getContainerOfType(model, Step.class);
		if(model == null){
			return emptySet();
		}
		return stepTypeProvider.getExpectedTypes((Step) model);
	}
	
	@Override
	protected void lookupCrossReference(CrossReference crossReference, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(crossReference, contentAssistContext, acceptor, getFeatureDescriptionPredicate(contentAssistContext));
	}
	
	protected StyledString getStyledDisplayString(EObject element, String qualifiedName, String shortName) {
		return new StyledString(getDisplayString(element, qualifiedName, shortName));
	}
	
	public ICompletionProposalAcceptor createStepFqnShorterner(final ContentAssistContext context, ICompletionProposalAcceptor acceptor, final IScope scope, final QualifiedName qualifiedName, Scenario scenario) {
		XbaseQualifiedNameValueConverter qualifiedNameValueConverter = new XbaseQualifiedNameValueConverter(){
			@Override
			public String toString(String value) {
				int end = value.lastIndexOf('.');
				String result = value.substring(0, end) + ".*";
				return result;
			}
		};
		final IQualifiedNameConverter qualifiedNameConverter = new XbaseQualifiedNameConverter(){
			@Override
			public QualifiedName toQualifiedName(String qualifiedNameAsString) {
				return new QualifiedName(qualifiedNameAsString.split("\\.")){
					public String getLastSegment() {
						return super.getLastSegment();
					};
				};
			}
		};
		
		final FQNImporter fqnImporter = new FQNImporter(context.getResource(), context.getViewer(), scope, qualifiedNameConverter, null, qualifiedNameValueConverter);
		final ICompletionProposalAcceptor scopeAware = new ICompletionProposalAcceptor.Delegate(acceptor) {
			@Override
			public void accept(ICompletionProposal proposal) {
				if (proposal instanceof ConfigurableCompletionProposal) {
					ConfigurableCompletionProposal configurableCompletionProposal = (ConfigurableCompletionProposal) proposal;
					configurableCompletionProposal.setTextApplier(fqnImporter);
				}
				super.accept(proposal);
			}
		};
		return scopeAware;
	}
	
// TODO NO_XTEND
//	@Override
//	public void complete_RICH_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeInRichString(model, ruleCall, context, acceptor);
//	}
//
//	@Override
//	public void complete_RICH_TEXT_START(EObject model, RuleCall ruleCall, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeInRichString(model, ruleCall, context, acceptor);
//	}
//
//	@Override
//	public void complete_RICH_TEXT_END(EObject model, RuleCall ruleCall, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeInRichString(model, ruleCall, context, acceptor);
//	}
//
//	@Override
//	public void complete_RICH_TEXT_INBETWEEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeInRichString(model, ruleCall, context, acceptor);
//	}
//
//	@Override
//	public void complete_COMMENT_RICH_TEXT_END(EObject model, RuleCall ruleCall, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeInRichString(model, ruleCall, context, acceptor);
//	}
//
//	@Override
//	public void complete_COMMENT_RICH_TEXT_INBETWEEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeInRichString(model, ruleCall, context, acceptor);
//	}
//	
	@Override
	public void completeParameter_Name(final EObject model, Assignment assignment, final ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
		if (model instanceof JnarioParameter) {
			final List<JnarioParameter> siblings = EcoreUtil2.getSiblingsOfType(model, JnarioParameter.class);
			Set<String> alreadyTaken = Sets.newHashSet();
			for(JnarioParameter sibling: siblings) {
				alreadyTaken.add(sibling.getName());
			}
			alreadyTaken.addAll(getAllKeywords());
			completions.getVariableProposals(model, JnarioPackage.Literals.JNARIO_PARAMETER__PARAMETER_TYPE,
					VariableType.PARAMETER, alreadyTaken, new JdtVariableCompletions.CompletionDataAcceptor() {
						public void accept(String replaceText, StyledString label, Image img) {
							acceptor.accept(createCompletionProposal(replaceText, label, img, context));
						}
					});
		} else {
			super.completeParameter_Name(model, assignment, context, acceptor);
		}
	}
	
	@Override
	public void completeMember_Type(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof JnarioField) {
			// don't propose types everywhere but only if there's already an indicator for fields, e.g. static, extension, var, val
			completeJavaTypes(context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, true,
					getQualifiedNameValueConverter(), new TypeMatchFilters.All(IJavaSearchConstants.TYPE), acceptor);
		}
	}
// TODO NO_XTEND	
//	@Override
//	public void completeMember_ReturnType(EObject model, Assignment assignment, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		completeJavaTypes(context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, true,
//				getQualifiedNameValueConverter(), new TypeMatchFilters.All(IJavaSearchConstants.TYPE), acceptor);
//	}
	
	@Override
	public void completeMember_Name(final EObject model, Assignment assignment, final ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
		if (model instanceof JnarioField) {
			//TODO go up type hierarchy and collect all local fields
			final List<JnarioField> siblings = EcoreUtil2.getSiblingsOfType(model, JnarioField.class);
			Set<String> alreadyTaken = Sets.newHashSet();
			for(JnarioField sibling: siblings) {
				alreadyTaken.add(sibling.getName());
			}
			alreadyTaken.addAll(getAllKeywords());
			completions.getVariableProposals(model, JnarioPackage.Literals.JNARIO_FIELD__TYPE,
					VariableType.INSTANCE_FIELD, alreadyTaken, new JdtVariableCompletions.CompletionDataAcceptor() {
						public void accept(String replaceText, StyledString label, Image img) {
							acceptor.accept(createCompletionProposal(replaceText, label, img, context));
						}
					});
		} else {
			super.completeMember_Name(model, assignment, context, acceptor);
		}
	}
	
	protected Set<String> getAllKeywords() {
		return GrammarUtil.getAllKeywords(grammarAccess.getGrammar());
	}
	
}
