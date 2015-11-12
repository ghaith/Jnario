package org.jnario.spec.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.resource.CompilerPhases;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.resource.BatchLinkableResource;
import org.jnario.JnarioFile;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.spec.spec.ExampleGroup;

import com.google.inject.Inject;

public class SpecIgnoringXtendJvmModelInferrer implements IJvmModelInferrer {

	private final static Logger logger = Logger
			.getLogger(SpecIgnoringXtendJvmModelInferrer.class);
	@Inject
	private TypesFactory typesFactory;

	@Inject
	private CompilerPhases compilerPhases;

	public void infer(EObject object, final IJvmDeclaredTypeAcceptor acceptor,
			boolean preIndexingPhase) {
		if (!(object instanceof JnarioFile))
			return;
		JnarioFile xtendFile = (JnarioFile) object;
		List<Runnable> doLater = newArrayList();
		for (final JnarioTypeDeclaration declaration : xtendFile.getXtendTypes()) {
			if (!(declaration instanceof ExampleGroup)) {
				// TODO NO_XTEND
				//				inferTypeSceleton(declaration, acceptor, preIndexingPhase,
//						xtendFile, doLater, null);
			}
		}
		BatchLinkableResource resource = (BatchLinkableResource) xtendFile
				.eResource();
		// TODO NO_XTEND Only needed for ActiveAnnotations?
//		try {
//			compilerPhases.setIndexing(xtendFile, true);
//			try {
//				contexts = contextProvider.computeContext(xtendFile);
//			} catch (Throwable t) {
//				logger.error("Couldn't create annotation contexts", t);
//				return;
//			}
//			try {
//				contexts.before(ActiveAnnotationContexts.AnnotationCallback.INDEXING);
//				for (ActiveAnnotationContext ctx : contexts.getContexts()
//						.values()) {
//					try {
//						annotationProcessor.indexingPhase(ctx, acceptor,
//								CancelIndicator.NullImpl);
//					} catch (Throwable t) {
//						ctx.handleProcessingError(xtendFile.eResource(), t);
//					}
//				}
//			} finally {
//				contexts.after(ActiveAnnotationContexts.AnnotationCallback.INDEXING);
//			}
//		} finally {
//			compilerPhases.setIndexing(xtendFile, false);
//			resource.getCache().clear(resource);
//		}

		if (!preIndexingPhase) {
			for (Runnable runnable : doLater) {
				runnable.run();
			}
			// TODO NO_XTEND Only needed for ActiveAnnotations?
//			try {
//				contexts.before(ActiveAnnotationContexts.AnnotationCallback.INFERENCE);
//				for (ActiveAnnotationContext ctx : contexts.getContexts()
//						.values()) {
//					try {
//						annotationProcessor.inferencePhase(ctx,
//								CancelIndicator.NullImpl);
//					} catch (Throwable t) {
//						ctx.handleProcessingError(xtendFile.eResource(), t);
//					}
//				}
//			} finally {
//				contexts.after(ActiveAnnotationContexts.AnnotationCallback.INFERENCE);
//			}
		}
	}

}
