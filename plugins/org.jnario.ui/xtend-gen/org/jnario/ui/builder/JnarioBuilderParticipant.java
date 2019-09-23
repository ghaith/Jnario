/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.ui.builder;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.function.Consumer;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.EclipseSourceFolderProvider;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.doc.HtmlAssets;
import org.jnario.ui.builder.NullFileCallBack;

@SuppressWarnings("all")
public class JnarioBuilderParticipant extends BuilderParticipant {
  @Inject
  private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;
  
  @Inject
  private HtmlAssets htmlAssets;
  
  @Inject
  private EclipseSourceFolderProvider sourceFolders;
  
  @Override
  public void build(final IXtextBuilderParticipant.IBuildContext context, final IProgressMonitor monitor) throws CoreException {
    super.build(context, monitor);
    final Consumer<IContainer> _function = new Consumer<IContainer>() {
      @Override
      public void accept(final IContainer source) {
        final Function1<IResourceDescription.Delta, Boolean> _function = new Function1<IResourceDescription.Delta, Boolean>() {
          @Override
          public Boolean apply(final IResourceDescription.Delta it) {
            return Boolean.valueOf(it.getUri().toString().contains(JnarioBuilderParticipant.this.makeProjectRelative(source)));
          }
        };
        boolean _exists = IterableExtensions.<IResourceDescription.Delta>exists(JnarioBuilderParticipant.this.getRelevantDeltas(context), _function);
        if (_exists) {
          JnarioBuilderParticipant.this.htmlAssets.generate(JnarioBuilderParticipant.this.createFsa(context, source));
        }
      }
    };
    this.sourceFolders.getSourceFolders(context.getBuiltProject()).forEach(_function);
  }
  
  private EclipseResourceFileSystemAccess2 createFsa(final IXtextBuilderParticipant.IBuildContext context, final IContainer source) {
    final EclipseResourceFileSystemAccess2 fsa = this.fileSystemAccessProvider.get();
    final IProject builtProject = context.getBuiltProject();
    fsa.setProject(builtProject);
    fsa.setOutputConfigurations(this.getOutputConfigurations(context));
    NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
    fsa.setMonitor(_nullProgressMonitor);
    NullFileCallBack _nullFileCallBack = new NullFileCallBack();
    fsa.setPostProcessor(_nullFileCallBack);
    fsa.setCurrentSource(this.makeProjectRelative(source));
    return fsa;
  }
  
  private String makeProjectRelative(final IContainer source) {
    return source.getFullPath().makeRelativeTo(source.getProject().getFullPath()).toString();
  }
}
