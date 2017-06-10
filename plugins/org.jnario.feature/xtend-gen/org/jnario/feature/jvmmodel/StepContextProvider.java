package org.jnario.feature.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.Set;
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
      final Function1<JnarioField, Boolean> _function = new Function1<JnarioField, Boolean>() {
        @Override
        public Boolean apply(final JnarioField it) {
          boolean _xblockexpression = false;
          {
            final JvmField field = Iterables.<JvmField>filter(StepContextProvider.this._iJvmModelAssociations.getJvmElements(it), JvmField.class).iterator().next();
            final Collection<EStructuralFeature.Setting> usages = XbaseUsageCrossReferencer.find(field, CollectionLiterals.<XExpression>newArrayList(expr));
            boolean _isEmpty = usages.isEmpty();
            _xblockexpression = (!_isEmpty);
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      _xblockexpression = IterableExtensions.<JnarioField>toSet(IterableExtensions.<JnarioField>filter(Iterables.<JnarioField>filter(this._visibleMembersCalculator.allVisibleMembers(step), JnarioField.class), _function));
    }
    return _xblockexpression;
  }
}
