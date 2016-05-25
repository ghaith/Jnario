package org.jnario.ui.findrefs;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.findrefs.DefaultReferenceFinder;
import org.eclipse.xtext.ui.editor.findrefs.IReferenceFinder;
import org.eclipse.xtext.util.IAcceptor;

@SuppressWarnings("all")
public class XtendReferenceFinder extends DefaultReferenceFinder implements IReferenceFinder {
  private IQualifiedNameConverter nameConverter;
  
  @Inject
  public XtendReferenceFinder(final IResourceDescriptions indexData, final IResourceServiceProvider.Registry serviceProviderRegistry, final IQualifiedNameConverter nameConverter) {
    super(indexData, serviceProviderRegistry);
    this.nameConverter = nameConverter;
  }
  
  @Override
  public void findReferences(final Set<URI> targetURIs, final IResourceDescription resourceDescription, final IAcceptor<IReferenceDescription> acceptor, final IProgressMonitor monitor, final IReferenceFinder.ILocalResourceAccess localResourceAccess) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Set<URI> to Predicate<URI>");
  }
}
