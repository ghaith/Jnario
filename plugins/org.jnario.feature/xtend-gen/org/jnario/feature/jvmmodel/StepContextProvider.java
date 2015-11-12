package org.jnario.feature.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.util.XbaseUsageCrossReferencer;
import org.jnario.JnarioField;
import org.jnario.JnarioMember;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.feature.jvmmodel.VisibleMembersCalculator;

@SuppressWarnings("all")
public class StepContextProvider {
  @Inject
  @Extension
  private StepExpressionProvider _stepExpressionProvider;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private VisibleMembersCalculator _visibleMembersCalculator;
  
  public Set<JnarioField> usedFields(final Step step) {
    Set<JnarioField> _xblockexpression = null;
    {
      final XExpression expr = this._stepExpressionProvider.expressionOf(step);
      Iterable<JnarioMember> _allVisibleMembers = this._visibleMembersCalculator.allVisibleMembers(step);
      Iterable<JnarioField> _filter = Iterables.<JnarioField>filter(_allVisibleMembers, JnarioField.class);
      final Function1<JnarioField, Boolean> _function = new Function1<JnarioField, Boolean>() {
        @Override
        public Boolean apply(final JnarioField it) {
          boolean _xblockexpression = false;
          {
            Set<EObject> _jvmElements = StepContextProvider.this._iJvmModelAssociations.getJvmElements(it);
            Iterable<JvmField> _filter = Iterables.<JvmField>filter(_jvmElements, JvmField.class);
            Iterator<JvmField> _iterator = _filter.iterator();
            final JvmField field = _iterator.next();
            ArrayList<XExpression> _newArrayList = CollectionLiterals.<XExpression>newArrayList(expr);
            final Collection<EStructuralFeature.Setting> usages = XbaseUsageCrossReferencer.find(field, _newArrayList);
            boolean _isEmpty = usages.isEmpty();
            _xblockexpression = (!_isEmpty);
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      Iterable<JnarioField> _filter_1 = IterableExtensions.<JnarioField>filter(_filter, _function);
      _xblockexpression = IterableExtensions.<JnarioField>toSet(_filter_1);
    }
    return _xblockexpression;
  }
}
