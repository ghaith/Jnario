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
import org.eclipse.emf.common.util.EList;
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
import org.jnario.feature.feature.Step;
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
    EList<Step> _steps = scenario.getSteps();
    Iterable<StepReference> _filter = Iterables.<StepReference>filter(_steps, StepReference.class);
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
    final Iterable<StepReference> refs = IterableExtensions.<StepReference>filter(_filter, _function);
    final Set<String> fieldNames = this.getExistingFieldNamesForContainerOfStepReference(scenario);
    for (final StepReference ref : refs) {
      {
        StepImplementation _reference = ref.getReference();
        final Iterable<JnarioMember> members = this._visibleMembersCalculator.allVisibleMembers(_reference);
        this.copyFields(scenario, members, fieldNames);
      }
    }
  }
  
  private Set<String> getExistingFieldNamesForContainerOfStepReference(final Scenario scenario) {
    Iterable<JnarioMember> _allVisibleMembers = this._visibleMembersCalculator.allVisibleMembers(scenario);
    return this.getExistingFieldNames(_allVisibleMembers);
  }
  
  private Set<String> getExistingFieldNames(final Iterable<JnarioMember> members) {
    Iterable<JnarioField> _filter = Iterables.<JnarioField>filter(members, JnarioField.class);
    final Function1<JnarioField, Boolean> _function = new Function1<JnarioField, Boolean>() {
      @Override
      public Boolean apply(final JnarioField it) {
        return Boolean.valueOf((!Objects.equal(it, null)));
      }
    };
    Iterable<JnarioField> _filter_1 = IterableExtensions.<JnarioField>filter(_filter, _function);
    final Function1<JnarioField, String> _function_1 = new Function1<JnarioField, String>() {
      @Override
      public String apply(final JnarioField it) {
        return it.getName();
      }
    };
    Iterable<String> _map = IterableExtensions.<JnarioField, String>map(_filter_1, _function_1);
    return IterableExtensions.<String>toSet(_map);
  }
  
  private void copyFields(final EObject objectWithReference, final Iterable<JnarioMember> members, final Set<String> fieldNames) {
    if ((!(objectWithReference instanceof JnarioClass))) {
      return;
    }
    final JnarioClass type = ((JnarioClass) objectWithReference);
    final ArrayList<JnarioField> newFields = CollectionLiterals.<JnarioField>newArrayList();
    Iterable<JnarioField> _filter = Iterables.<JnarioField>filter(members, JnarioField.class);
    for (final JnarioField field : _filter) {
      String _name = field.getName();
      boolean _contains = fieldNames.contains(_name);
      boolean _not = (!_contains);
      if (_not) {
        final JnarioField copiedMember = this._expressionCopier.<JnarioField>cloneWithProxies(field);
        SourceAdapter.adapt(copiedMember, field);
        newFields.add(((JnarioField) copiedMember));
        String _name_1 = field.getName();
        fieldNames.add(_name_1);
      }
    }
    EList<JnarioMember> _members = type.getMembers();
    _members.addAll(newFields);
  }
}
