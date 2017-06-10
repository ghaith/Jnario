/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.JnarioClass;
import org.jnario.JnarioField;
import org.jnario.JnarioMember;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.ExpressionCopier;
import org.jnario.feature.jvmmodel.VisibleMembersCalculator;
import org.jnario.util.SourceAdapter;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepReferenceFieldCreator {
  @Inject
  @Extension
  private VisibleMembersCalculator _visibleMembersCalculator;
  
  @Inject
  @Extension
  private ExpressionCopier _expressionCopier;
  
  public void copyJnarioMemberForReferences(final Scenario scenario) {
    final Function1<StepReference, Boolean> _function = new Function1<StepReference, Boolean>() {
      @Override
      public Boolean apply(final StepReference it) {
        StepImplementation _reference = it.getReference();
        XExpression _expression = null;
        if (_reference!=null) {
          _expression=_reference.getExpression();
        }
        return Boolean.valueOf((!Objects.equal(_expression, null)));
      }
    };
    final Iterable<StepReference> refs = IterableExtensions.<StepReference>filter(Iterables.<StepReference>filter(scenario.getSteps(), StepReference.class), _function);
    final Set<String> fieldNames = this.getExistingFieldNamesForContainerOfStepReference(scenario);
    for (final StepReference ref : refs) {
      {
        final Iterable<JnarioMember> members = this._visibleMembersCalculator.allVisibleMembers(ref.getReference());
        this.copyFields(scenario, members, fieldNames);
      }
    }
  }
  
  private Set<String> getExistingFieldNamesForContainerOfStepReference(final Scenario scenario) {
    return this.getExistingFieldNames(this._visibleMembersCalculator.allVisibleMembers(scenario));
  }
  
  private Set<String> getExistingFieldNames(final Iterable<JnarioMember> members) {
    final Function1<JnarioField, Boolean> _function = new Function1<JnarioField, Boolean>() {
      @Override
      public Boolean apply(final JnarioField it) {
        return Boolean.valueOf((!Objects.equal(it, null)));
      }
    };
    final Function1<JnarioField, String> _function_1 = new Function1<JnarioField, String>() {
      @Override
      public String apply(final JnarioField it) {
        return it.getName();
      }
    };
    return IterableExtensions.<String>toSet(IterableExtensions.<JnarioField, String>map(IterableExtensions.<JnarioField>filter(Iterables.<JnarioField>filter(members, JnarioField.class), _function), _function_1));
  }
  
  private void copyFields(final EObject objectWithReference, final Iterable<JnarioMember> members, final Set<String> fieldNames) {
    if ((!(objectWithReference instanceof JnarioClass))) {
      return;
    }
    final JnarioClass type = ((JnarioClass) objectWithReference);
    final ArrayList<JnarioField> newFields = CollectionLiterals.<JnarioField>newArrayList();
    Iterable<JnarioField> _filter = Iterables.<JnarioField>filter(members, JnarioField.class);
    for (final JnarioField field : _filter) {
      boolean _contains = fieldNames.contains(field.getName());
      boolean _not = (!_contains);
      if (_not) {
        final JnarioField copiedMember = this._expressionCopier.<JnarioField>cloneWithProxies(field);
        SourceAdapter.adapt(copiedMember, field);
        newFields.add(((JnarioField) copiedMember));
        String _name = field.getName();
        fieldNames.add(_name);
      }
    }
    type.getMembers().addAll(newFields);
  }
}
