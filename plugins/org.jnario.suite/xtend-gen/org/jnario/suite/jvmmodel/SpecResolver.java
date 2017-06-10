/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.JnarioPackage;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage;

@SuppressWarnings("all")
public class SpecResolver {
  @Inject
  @Extension
  private IScopeProvider scopeProvider;
  
  @Inject
  @Extension
  private IQualifiedNameConverter _iQualifiedNameConverter;
  
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  protected List<Specification> _resolveSpecs(final Suite suite) {
    final Function1<Reference, List<Specification>> _function = new Function1<Reference, List<Specification>>() {
      @Override
      public List<Specification> apply(final Reference it) {
        return SpecResolver.this.resolveSpecs(it);
      }
    };
    return this.sort(Iterables.<Specification>concat(ListExtensions.<Reference, List<Specification>>map(suite.getElements(), _function)));
  }
  
  protected List<Specification> _resolveSpecs(final SpecReference specRef) {
    return Collections.<Specification>singletonList(specRef.getSpec());
  }
  
  protected List<Specification> _resolveSpecs(final PatternReference specRef) {
    List<Specification> _xblockexpression = null;
    {
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(specRef.getPattern());
      if (_isNullOrEmpty) {
        return Collections.<Specification>emptyList();
      }
      final IScope scope = this.scopeProvider.getScope(specRef, SuitePackage.Literals.SPEC_REFERENCE__SPEC);
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        @Override
        public Boolean apply(final IEObjectDescription it) {
          return Boolean.valueOf(JnarioPackage.Literals.SPECIFICATION.isSuperTypeOf(it.getEClass()));
        }
      };
      Iterable<IEObjectDescription> specs = IterableExtensions.<IEObjectDescription>filter(scope.getAllElements(), _function);
      final Pattern pattern = Pattern.compile(specRef.getPattern());
      final Function1<IEObjectDescription, Boolean> _function_1 = new Function1<IEObjectDescription, Boolean>() {
        @Override
        public Boolean apply(final IEObjectDescription it) {
          return Boolean.valueOf(pattern.matcher(SpecResolver.this._iQualifiedNameConverter.toString(it.getQualifiedName())).matches());
        }
      };
      specs = IterableExtensions.<IEObjectDescription>filter(specs, _function_1);
      final Resource suiteResource = specRef.eResource();
      final Function1<IEObjectDescription, EObject> _function_2 = new Function1<IEObjectDescription, EObject>() {
        @Override
        public EObject apply(final IEObjectDescription it) {
          return EcoreUtil.resolve(it.getEObjectOrProxy(), specRef);
        }
      };
      final Iterable<Specification> resolvedSpecs = IterableExtensions.<Specification>filterNull(Iterables.<Specification>filter(IterableExtensions.<IEObjectDescription, EObject>map(specs, _function_2), Specification.class));
      final Function1<Specification, Boolean> _function_3 = new Function1<Specification, Boolean>() {
        @Override
        public Boolean apply(final Specification it) {
          Resource _eResource = it.eResource();
          return Boolean.valueOf((!Objects.equal(_eResource, suiteResource)));
        }
      };
      final Iterable<Specification> withoutSuites = IterableExtensions.<Specification>filter(resolvedSpecs, _function_3);
      final Function1<Specification, String> _function_4 = new Function1<Specification, String>() {
        @Override
        public String apply(final Specification it) {
          return SpecResolver.this._suiteClassNameProvider.toQualifiedJavaClassName(it);
        }
      };
      final Map<String, Specification> classNames = IterableExtensions.<String, Specification>toMap(withoutSuites, _function_4);
      _xblockexpression = this.sort(classNames.values());
    }
    return _xblockexpression;
  }
  
  private List<Specification> sort(final Iterable<Specification> specs) {
    final Function1<Specification, Boolean> _function = new Function1<Specification, Boolean>() {
      @Override
      public Boolean apply(final Specification it) {
        return Boolean.valueOf((!Objects.equal(it, null)));
      }
    };
    final Comparator<Specification> _function_1 = new Comparator<Specification>() {
      @Override
      public int compare(final Specification left, final Specification right) {
        int _xblockexpression = (int) 0;
        {
          final String leftName = SpecResolver.this._suiteClassNameProvider.describe(left);
          final String rightName = SpecResolver.this._suiteClassNameProvider.describe(right);
          if ((Objects.equal(leftName, null) || Objects.equal(rightName, null))) {
            return 0;
          }
          _xblockexpression = leftName.compareToIgnoreCase(rightName);
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<Specification>sortWith(IterableExtensions.<Specification>filter(specs, _function), _function_1);
  }
  
  public List<Specification> resolveSpecs(final Notifier suite) {
    if (suite instanceof Suite) {
      return _resolveSpecs((Suite)suite);
    } else if (suite instanceof PatternReference) {
      return _resolveSpecs((PatternReference)suite);
    } else if (suite instanceof SpecReference) {
      return _resolveSpecs((SpecReference)suite);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite).toString());
    }
  }
}
