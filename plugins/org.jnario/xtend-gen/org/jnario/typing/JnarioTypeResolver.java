package org.jnario.typing;

import com.google.inject.Inject;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator;
import org.eclipse.xtext.xbase.typesystem.internal.LogicalContainerAwareReentrantTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ExampleTable;
import org.jnario.typing.ColumnTypeProvider;

@SuppressWarnings("all")
public class JnarioTypeResolver extends LogicalContainerAwareReentrantTypeResolver {
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Override
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmConstructor constructor, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    super._doPrepare(resolvedTypes, session, constructor, resolvedTypesByContext);
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(constructor);
    if ((source instanceof ExampleTable)) {
      final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
        @Override
        public void accept(final JvmFormalParameter param) {
          EObject _primarySourceElement = JnarioTypeResolver.this._iJvmModelAssociations.getPrimarySourceElement(param);
          final ExampleColumn column = ((ExampleColumn) _primarySourceElement);
          JnarioTypeResolver.this.setColumnTypeProvider(param.getParameterType(), constructor, resolvedTypes, session, column, resolvedTypesByContext);
        }
      };
      constructor.getParameters().forEach(_function);
    }
  }
  
  @Override
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmField field, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    super._doPrepare(resolvedTypes, session, field, resolvedTypesByContext);
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(field);
    if ((source instanceof ExampleColumn)) {
      this.setColumnTypeProvider(field.getType(), field, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
  }
  
  @Override
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmOperation operation, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    super._doPrepare(resolvedTypes, session, operation, resolvedTypesByContext);
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(operation);
    if ((source instanceof ExampleColumn)) {
      this.setColumnTypeProvider(operation.getReturnType(), operation, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
  }
  
  public void setColumnTypeProvider(final JvmTypeReference typeRef, final JvmMember member, final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final ExampleColumn column, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    boolean _isInferred = InferredTypeIndicator.isInferred(typeRef);
    boolean _not = (!_isInferred);
    if (_not) {
      return;
    }
    final XComputedTypeReference casted = ((XComputedTypeReference) typeRef);
    final XComputedTypeReference resultRef = this.getServices().getXtypeFactory().createXComputedTypeReference();
    final Function1<XComputedTypeReference, JvmTypeReference> _function = new Function1<XComputedTypeReference, JvmTypeReference>() {
      @Override
      public JvmTypeReference apply(final XComputedTypeReference it) {
        final Function1<ExampleCell, Boolean> _function = new Function1<ExampleCell, Boolean>() {
          @Override
          public Boolean apply(final ExampleCell it) {
            XExpression _expression = it.getExpression();
            return Boolean.valueOf((!(_expression instanceof XNullLiteral)));
          }
        };
        final Function1<ExampleCell, LightweightTypeReference> _function_1 = new Function1<ExampleCell, LightweightTypeReference>() {
          @Override
          public LightweightTypeReference apply(final ExampleCell it) {
            LightweightTypeReference _xblockexpression = null;
            {
              EObject _head = IterableExtensions.<EObject>head(JnarioTypeResolver.this._iJvmModelAssociations.getJvmElements(it));
              final JvmIdentifiableElement operation = ((JvmIdentifiableElement) _head);
              final LightweightTypeReference type = resolvedTypes.getActualType(operation);
              _xblockexpression = type;
            }
            return _xblockexpression;
          }
        };
        final Iterable<LightweightTypeReference> types = IterableExtensions.<ExampleCell, LightweightTypeReference>map(IterableExtensions.<ExampleCell>filter(column.getCells(), _function), _function_1);
        final ITypeReferenceOwner owner = resolvedTypes.getReferenceOwner();
        boolean _isEmpty = IterableExtensions.isEmpty(types);
        if (_isEmpty) {
          return JnarioTypeResolver.this.getServices().getTypeReferences().createTypeRef(JnarioTypeResolver.this.getServices().getTypeReferences().findDeclaredType(Object.class, member));
        }
        LightweightTypeReference result = JnarioTypeResolver.this.getServices().getTypeConformanceComputer().getCommonSuperType(IterableExtensions.<LightweightTypeReference>toList(types), owner);
        int _size = column.getCells().size();
        int _size_1 = IterableExtensions.size(types);
        boolean _notEquals = (_size != _size_1);
        if (_notEquals) {
          result = result.getWrapperTypeIfPrimitive();
        }
        return result.toJavaCompliantTypeReference();
      }
    };
    ColumnTypeProvider _columnTypeProvider = new ColumnTypeProvider(_function);
    resultRef.setTypeProvider(_columnTypeProvider);
    casted.setEquivalent(resultRef);
  }
}
