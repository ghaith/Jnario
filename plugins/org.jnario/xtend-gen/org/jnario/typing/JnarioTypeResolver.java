package org.jnario.typing;

import com.google.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator;
import org.eclipse.xtext.xbase.typesystem.conformance.TypeConformanceComputer;
import org.eclipse.xtext.xbase.typesystem.internal.LogicalContainerAwareReentrantTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.XtypeFactory;
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
      EList<JvmFormalParameter> _parameters = constructor.getParameters();
      final Consumer<JvmFormalParameter> _function = (JvmFormalParameter param) -> {
        EObject _primarySourceElement = this._iJvmModelAssociations.getPrimarySourceElement(param);
        final ExampleColumn column = ((ExampleColumn) _primarySourceElement);
        JvmTypeReference _parameterType = param.getParameterType();
        this.setColumnTypeProvider(_parameterType, constructor, resolvedTypes, session, column, resolvedTypesByContext);
      };
      _parameters.forEach(_function);
    }
  }
  
  @Override
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmField field, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    super._doPrepare(resolvedTypes, session, field, resolvedTypesByContext);
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(field);
    if ((source instanceof ExampleColumn)) {
      JvmTypeReference _type = field.getType();
      this.setColumnTypeProvider(_type, field, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
  }
  
  @Override
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmOperation operation, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    super._doPrepare(resolvedTypes, session, operation, resolvedTypesByContext);
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(operation);
    if ((source instanceof ExampleColumn)) {
      JvmTypeReference _returnType = operation.getReturnType();
      this.setColumnTypeProvider(_returnType, operation, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
  }
  
  public void setColumnTypeProvider(final JvmTypeReference typeRef, final JvmMember member, final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final ExampleColumn column, final Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
    boolean _isInferred = InferredTypeIndicator.isInferred(typeRef);
    boolean _not = (!_isInferred);
    if (_not) {
      return;
    }
    final XComputedTypeReference casted = ((XComputedTypeReference) typeRef);
    CommonTypeComputationServices _services = this.getServices();
    XtypeFactory _xtypeFactory = _services.getXtypeFactory();
    final XComputedTypeReference resultRef = _xtypeFactory.createXComputedTypeReference();
    final Function1<XComputedTypeReference, JvmTypeReference> _function = (XComputedTypeReference it) -> {
      EList<ExampleCell> _cells = column.getCells();
      final Function1<ExampleCell, Boolean> _function_1 = (ExampleCell it_1) -> {
        XExpression _expression = it_1.getExpression();
        return Boolean.valueOf((!(_expression instanceof XNullLiteral)));
      };
      Iterable<ExampleCell> _filter = IterableExtensions.<ExampleCell>filter(_cells, _function_1);
      final Function1<ExampleCell, LightweightTypeReference> _function_2 = (ExampleCell it_1) -> {
        LightweightTypeReference _xblockexpression = null;
        {
          Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(it_1);
          EObject _head = IterableExtensions.<EObject>head(_jvmElements);
          final JvmIdentifiableElement operation = ((JvmIdentifiableElement) _head);
          final LightweightTypeReference type = resolvedTypes.getActualType(operation);
          _xblockexpression = type;
        }
        return _xblockexpression;
      };
      final Iterable<LightweightTypeReference> types = IterableExtensions.<ExampleCell, LightweightTypeReference>map(_filter, _function_2);
      final ITypeReferenceOwner owner = resolvedTypes.getReferenceOwner();
      boolean _isEmpty = IterableExtensions.isEmpty(types);
      if (_isEmpty) {
        CommonTypeComputationServices _services_1 = this.getServices();
        TypeReferences _typeReferences = _services_1.getTypeReferences();
        CommonTypeComputationServices _services_2 = this.getServices();
        TypeReferences _typeReferences_1 = _services_2.getTypeReferences();
        JvmType _findDeclaredType = _typeReferences_1.findDeclaredType(Object.class, member);
        return _typeReferences.createTypeRef(_findDeclaredType);
      }
      CommonTypeComputationServices _services_3 = this.getServices();
      TypeConformanceComputer _typeConformanceComputer = _services_3.getTypeConformanceComputer();
      List<LightweightTypeReference> _list = IterableExtensions.<LightweightTypeReference>toList(types);
      LightweightTypeReference result = _typeConformanceComputer.getCommonSuperType(_list, owner);
      EList<ExampleCell> _cells_1 = column.getCells();
      int _size = _cells_1.size();
      int _size_1 = IterableExtensions.size(types);
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        LightweightTypeReference _wrapperTypeIfPrimitive = result.getWrapperTypeIfPrimitive();
        result = _wrapperTypeIfPrimitive;
      }
      return result.toJavaCompliantTypeReference();
    };
    ColumnTypeProvider _columnTypeProvider = new ColumnTypeProvider(_function);
    resultRef.setTypeProvider(_columnTypeProvider);
    casted.setEquivalent(resultRef);
  }
}
