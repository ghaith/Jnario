package org.jnario.ui.findrefs;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.findReferences.ReferenceFinder;
import org.eclipse.xtext.findReferences.TargetURIs;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class XtendReferenceFinder extends ReferenceFinder {
  private IQualifiedNameConverter nameConverter;
  
  @Inject
  public XtendReferenceFinder(final IResourceServiceProvider.Registry serviceProviderRegistry, final IQualifiedNameConverter nameConverter) {
    super(serviceProviderRegistry);
    this.nameConverter = nameConverter;
  }
  
  @Override
  protected void findReferencesInDescription(final TargetURIs targetURIs, final IResourceDescription resourceDescription, final IReferenceFinder.IResourceAccess resourceAccess, final IReferenceFinder.Acceptor acceptor, final IProgressMonitor monitor) {
    final Function1<URI, URI> _function = new Function1<URI, URI>() {
      @Override
      public URI apply(final URI it) {
        return it.trimFragment();
      }
    };
    Iterable<URI> _map = IterableExtensions.<URI, URI>map(targetURIs, _function);
    final Function1<URI, Boolean> _function_1 = new Function1<URI, Boolean>() {
      @Override
      public Boolean apply(final URI it) {
        URI _uRI = resourceDescription.getURI();
        return Boolean.valueOf(Objects.equal(it, _uRI));
      }
    };
    boolean _exists = IterableExtensions.<URI>exists(_map, _function_1);
    if (_exists) {
      return;
    }
    final HashSet<QualifiedName> names = CollectionLiterals.<QualifiedName>newHashSet();
    final Consumer<URI> _function_2 = new Consumer<URI>() {
      @Override
      public void accept(final URI uri) {
        final IUnitOfWork<Boolean, ResourceSet> _function = new IUnitOfWork<Boolean, ResourceSet>() {
          @Override
          public Boolean exec(final ResourceSet it) throws Exception {
            boolean _xblockexpression = false;
            {
              EObject _eObject = it.getEObject(uri, true);
              final JvmType obj = EcoreUtil2.<JvmType>getContainerOfType(_eObject, JvmType.class);
              boolean _xifexpression = false;
              boolean _notEquals = (!Objects.equal(obj, null));
              if (_notEquals) {
                String _identifier = obj.getIdentifier();
                String _lowerCase = _identifier.toLowerCase();
                QualifiedName _qualifiedName = XtendReferenceFinder.this.nameConverter.toQualifiedName(_lowerCase);
                _xifexpression = names.add(_qualifiedName);
              }
              _xblockexpression = _xifexpression;
            }
            return Boolean.valueOf(_xblockexpression);
          }
        };
        resourceAccess.<Boolean>readOnly(uri, _function);
        Iterable<QualifiedName> _importedNames = resourceDescription.getImportedNames();
        final Function1<QualifiedName, QualifiedName> _function_1 = new Function1<QualifiedName, QualifiedName>() {
          @Override
          public QualifiedName apply(final QualifiedName it) {
            return it.toLowerCase();
          }
        };
        Iterable<QualifiedName> _map = IterableExtensions.<QualifiedName, QualifiedName>map(_importedNames, _function_1);
        final Set<QualifiedName> importedNames = IterableExtensions.<QualifiedName>toSet(_map);
        final Function1<QualifiedName, Boolean> _function_2 = new Function1<QualifiedName, Boolean>() {
          @Override
          public Boolean apply(final QualifiedName it) {
            return Boolean.valueOf(importedNames.contains(it));
          }
        };
        boolean _exists = IterableExtensions.<QualifiedName>exists(names, _function_2);
        if (_exists) {
          URI _uRI = resourceDescription.getURI();
          final IUnitOfWork<Object, ResourceSet> _function_3 = new IUnitOfWork<Object, ResourceSet>() {
            @Override
            public Object exec(final ResourceSet it) throws Exception {
              URI _uRI = resourceDescription.getURI();
              Resource _resource = it.getResource(_uRI, true);
              XtendReferenceFinder.this.findReferences(targetURIs, _resource, acceptor, monitor);
              return null;
            }
          };
          resourceAccess.<Object>readOnly(_uRI, _function_3);
        }
      }
    };
    targetURIs.forEach(_function_2);
  }
}
