/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioClass;
import org.jnario.JnarioField;
import org.jnario.JnarioFile;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.lib.ExampleTableRow;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.jvmmodel.ImplicitSubject;
import org.jnario.spec.jvmmodel.SpecIgnoringXtendJvmModelInferrer;
import org.jnario.spec.jvmmodel.SpecSyntheticNameClashResolver;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  @Extension
  private ImplicitSubject _implicitSubject;
  
  @Inject
  @Extension
  private SpecSyntheticNameClashResolver _specSyntheticNameClashResolver;
  
  @Inject
  @Extension
  private TypesFactory typesFactory;
  
  @Inject
  private SpecIgnoringXtendJvmModelInferrer xtendJvmModelInferrer;
  
  @Inject
  private IJvmModelAssociator modelAssociator;
  
  private int exampleIndex = 0;
  
  private int index = 0;
  
  @Override
  public void doInfer(final EObject object, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if ((!(object instanceof JnarioFile))) {
      return;
    }
    final JnarioFile jnarioFile = ((JnarioFile) object);
    this.xtendJvmModelInferrer.infer(object, acceptor, preIndexingPhase);
    final ArrayList<Runnable> doLater = CollectionLiterals.<Runnable>newArrayList();
    EList<JnarioTypeDeclaration> _xtendTypes = jnarioFile.getXtendTypes();
    Iterable<ExampleGroup> _filter = Iterables.<ExampleGroup>filter(_xtendTypes, ExampleGroup.class);
    for (final ExampleGroup declaration : _filter) {
      this.infer(acceptor, declaration, null, doLater, preIndexingPhase);
    }
    this.exampleIndex = 0;
    if ((!preIndexingPhase)) {
      for (final Runnable runnable : doLater) {
        runnable.run();
      }
    }
  }
  
  public JvmGenericType infer(final IJvmDeclaredTypeAcceptor acceptor, final ExampleGroup exampleGroup, final JvmGenericType superType, final List<Runnable> doLater, final boolean preIndexingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(superType, null));
      if (_notEquals) {
        JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(superType);
        exampleGroup.setExtends(_createTypeRef);
      } else {
        this.addSuperClass(exampleGroup);
      }
      final JvmGenericType javaType = this.typesFactory.createJvmGenericType();
      JnarioFile _jnarioFile = this.jnarioFile(exampleGroup);
      this.setNameAndAssociate(_jnarioFile, exampleGroup, javaType);
      acceptor.<JvmGenericType>accept(javaType);
      if ((!preIndexingPhase)) {
        final Runnable _function = new Runnable() {
          @Override
          public void run() {
            SpecJvmModelInferrer.this.initialize(exampleGroup, javaType);
          }
        };
        doLater.add(_function);
      }
      final ArrayList<JvmGenericType> children = CollectionLiterals.<JvmGenericType>newArrayList();
      EList<JnarioMember> _members = exampleGroup.getMembers();
      Iterable<ExampleGroup> _filter = Iterables.<ExampleGroup>filter(_members, ExampleGroup.class);
      final Consumer<ExampleGroup> _function_1 = new Consumer<ExampleGroup>() {
        @Override
        public void accept(final ExampleGroup child) {
          JvmGenericType _infer = SpecJvmModelInferrer.this.infer(acceptor, child, javaType, doLater, preIndexingPhase);
          children.add(_infer);
        }
      };
      _filter.forEach(_function_1);
      boolean _isEmpty = children.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        TestRuntimeSupport _testRuntime = this.getTestRuntime();
        final Function1<JvmGenericType, JvmTypeReference> _function_2 = new Function1<JvmGenericType, JvmTypeReference>() {
          @Override
          public JvmTypeReference apply(final JvmGenericType it) {
            return SpecJvmModelInferrer.this._typeReferences.createTypeRef(it);
          }
        };
        List<JvmTypeReference> _map = ListExtensions.<JvmGenericType, JvmTypeReference>map(children, _function_2);
        _testRuntime.addChildren(exampleGroup, javaType, _map);
      }
      _xblockexpression = javaType;
    }
    return _xblockexpression;
  }
  
  @Override
  public void initialize(final JnarioClass source, final JvmGenericType inferredJvmType) {
    inferredJvmType.setVisibility(JvmVisibility.PUBLIC);
    EList<XAnnotation> _annotations = source.getAnnotations();
    final Function1<XAnnotation, Boolean> _function = new Function1<XAnnotation, Boolean>() {
      @Override
      public Boolean apply(final XAnnotation it) {
        JvmType _annotationType = null;
        if (it!=null) {
          _annotationType=it.getAnnotationType();
        }
        return Boolean.valueOf((!Objects.equal(_annotationType, null)));
      }
    };
    Iterable<XAnnotation> _filter = IterableExtensions.<XAnnotation>filter(_annotations, _function);
    this._extendedJvmTypesBuilder.addAnnotations(inferredJvmType, _filter);
    EList<JvmAnnotationReference> _annotations_1 = inferredJvmType.getAnnotations();
    String _describe = this._exampleNameProvider.describe(source);
    JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotationRef);
    JvmTypeReference _extends = source.getExtends();
    boolean _equals = Objects.equal(_extends, null);
    if (_equals) {
      final JvmTypeReference typeRefToObject = this._typeReferences.getTypeForName(Object.class, source);
      boolean _notEquals = (!Objects.equal(typeRefToObject, null));
      if (_notEquals) {
        EList<JvmTypeReference> _superTypes = inferredJvmType.getSuperTypes();
        _superTypes.add(typeRefToObject);
      }
    } else {
      EList<JvmTypeReference> _superTypes_1 = inferredJvmType.getSuperTypes();
      JvmTypeReference _extends_1 = source.getExtends();
      JvmTypeReference _cloneWithProxies = this._extendedJvmTypesBuilder.cloneWithProxies(_extends_1);
      _superTypes_1.add(_cloneWithProxies);
    }
    TestRuntimeSupport _testRuntime = this.getTestRuntime();
    _testRuntime.updateExampleGroup(source, inferredJvmType);
    this.exampleIndex = 0;
    EList<JnarioMember> _members = source.getMembers();
    for (final JnarioMember member : _members) {
      this.transform(member, inferredJvmType);
    }
    this._implicitSubject.addImplicitSubject(inferredJvmType, ((ExampleGroup) source));
    this._extendedJvmTypesBuilder.copyDocumentationTo(source, inferredJvmType);
    this._specSyntheticNameClashResolver.resolveNameClashes(inferredJvmType);
  }
  
  protected void _transform(final Example element, final JvmGenericType container) {
    this.exampleIndex = (this.exampleIndex + 1);
    XExpression _expression = element.getExpression();
    boolean _equals = Objects.equal(_expression, null);
    if (_equals) {
      XBlockExpression _createXBlockExpression = XbaseFactory.eINSTANCE.createXBlockExpression();
      element.setExpression(_createXBlockExpression);
    }
    final JvmOperation method = this.toMethod(element, container);
    TestRuntimeSupport _testRuntime = this.getTestRuntime();
    _testRuntime.markAsTestMethod(element, method);
    boolean _isPending = element.isPending();
    if (_isPending) {
      TestRuntimeSupport _testRuntime_1 = this.getTestRuntime();
      _testRuntime_1.markAsPending(element, method);
    }
    EList<JvmAnnotationReference> _annotations = method.getAnnotations();
    String _describe = this._exampleNameProvider.describe(element);
    JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
    EList<JvmAnnotationReference> _annotations_1 = method.getAnnotations();
    JvmAnnotationReference _annotationRef_1 = this._annotationTypesBuilder.annotationRef(Order.class);
    final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
      @Override
      public void apply(final JvmAnnotationReference it) {
        EList<JvmAnnotationValue> _explicitValues = it.getExplicitValues();
        JvmIntAnnotationValue _createJvmIntAnnotationValue = SpecJvmModelInferrer.this.typesFactory.createJvmIntAnnotationValue();
        final Procedure1<JvmIntAnnotationValue> _function = new Procedure1<JvmIntAnnotationValue>() {
          @Override
          public void apply(final JvmIntAnnotationValue it) {
            EList<Integer> _values = it.getValues();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<Integer>operator_add(_values, Integer.valueOf(SpecJvmModelInferrer.this.exampleIndex));
          }
        };
        JvmIntAnnotationValue _doubleArrow = ObjectExtensions.<JvmIntAnnotationValue>operator_doubleArrow(_createJvmIntAnnotationValue, _function);
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationValue>operator_add(_explicitValues, _doubleArrow);
      }
    };
    JvmAnnotationReference _doubleArrow = ObjectExtensions.<JvmAnnotationReference>operator_doubleArrow(_annotationRef_1, _function);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _doubleArrow);
    EList<JvmMember> _members = container.getMembers();
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, method);
    this.modelAssociator.associatePrimary(element, method);
  }
  
  protected void _transform(final Before element, final JvmGenericType container) {
    final Procedure2<JnarioMember, JvmOperation> _function = new Procedure2<JnarioMember, JvmOperation>() {
      @Override
      public void apply(final JnarioMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.beforeMethod(e, m);
      }
    };
    final Procedure2<JnarioMember, JvmOperation> _function_1 = new Procedure2<JnarioMember, JvmOperation>() {
      @Override
      public void apply(final JnarioMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.beforeAllMethod(e, m);
      }
    };
    this.transformAround(element, container, _function, _function_1);
  }
  
  protected void _transform(final After element, final JvmGenericType container) {
    final Procedure2<JnarioMember, JvmOperation> _function = new Procedure2<JnarioMember, JvmOperation>() {
      @Override
      public void apply(final JnarioMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.afterMethod(e, m);
      }
    };
    final Procedure2<JnarioMember, JvmOperation> _function_1 = new Procedure2<JnarioMember, JvmOperation>() {
      @Override
      public void apply(final JnarioMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.afterAllMethod(e, m);
      }
    };
    this.transformAround(element, container, _function, _function_1);
  }
  
  public boolean transformAround(final TestFunction element, final JvmGenericType container, final Procedure2<JnarioMember, JvmOperation> around, final Procedure2<JnarioMember, JvmOperation> aroundAll) {
    boolean _xblockexpression = false;
    {
      final JvmOperation afterMethod = this.toMethod(element, container);
      boolean _isStatic = element.isStatic();
      if (_isStatic) {
        aroundAll.apply(((JnarioMember) element), afterMethod);
      } else {
        around.apply(element, afterMethod);
      }
      EList<JvmMember> _members = container.getMembers();
      _xblockexpression = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, afterMethod);
    }
    return _xblockexpression;
  }
  
  @Override
  protected void _transform(final JnarioMember source, final JvmGenericType container) {
  }
  
  public JvmOperation toMethod(final TestFunction element, final JvmGenericType container) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, element);
      element.setReturnType(_typeForName);
      JvmOperation _createJvmOperation = this.typesFactory.createJvmOperation();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          String _methodName = SpecJvmModelInferrer.this._exampleNameProvider.toMethodName(element);
          it.setSimpleName(_methodName);
          it.setVisibility(JvmVisibility.PUBLIC);
          boolean _isStatic = element.isStatic();
          it.setStatic(_isStatic);
          JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
          it.setReturnType(_typeForName);
        }
      };
      final JvmOperation operation = ObjectExtensions.<JvmOperation>operator_doubleArrow(_createJvmOperation, _function);
      XExpression _expression = element.getExpression();
      this._extendedJvmTypesBuilder.setBody(operation, _expression);
      EList<XAnnotation> _annotations = element.getAnnotations();
      final Function1<XAnnotation, Boolean> _function_1 = new Function1<XAnnotation, Boolean>() {
        @Override
        public Boolean apply(final XAnnotation it) {
          JvmType _annotationType = null;
          if (it!=null) {
            _annotationType=it.getAnnotationType();
          }
          return Boolean.valueOf((!Objects.equal(_annotationType, null)));
        }
      };
      Iterable<XAnnotation> _filter = IterableExtensions.<XAnnotation>filter(_annotations, _function_1);
      this._extendedJvmTypesBuilder.addAnnotations(operation, _filter);
      this._extendedJvmTypesBuilder.copyDocumentationTo(element, operation);
      EList<JvmMember> _members = container.getMembers();
      _members.add(operation);
      EList<JvmTypeReference> _exceptions = operation.getExceptions();
      JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName(Exception.class, element);
      this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName_1);
      _xblockexpression = operation;
    }
    return _xblockexpression;
  }
  
  public void configureWith(final JvmGenericType type, final EObject source, final JnarioFile spec) {
    Resource _eResource = spec.eResource();
    EList<EObject> _contents = _eResource.getContents();
    this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, type);
    String _package = spec.getPackage();
    type.setPackageName(_package);
    String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
    this._extendedJvmTypesBuilder.setDocumentation(type, _documentation);
  }
  
  protected void _transform(final ExampleTable table, final JvmGenericType specType) {
    this.associateTableWithSpec(specType, table);
    JnarioFile _jnarioFile = this.jnarioFile(table);
    String _javaClassName = this._exampleNameProvider.toJavaClassName(table);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType exampleTableType) {
        EList<JvmTypeReference> _superTypes = exampleTableType.getSuperTypes();
        JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(ExampleTableRow.class, table);
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        JnarioFile _jnarioFile = SpecJvmModelInferrer.this.jnarioFile(table);
        SpecJvmModelInferrer.this.configureWith(exampleTableType, table, _jnarioFile);
        JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(exampleTableType);
        final JvmTypeReference type = SpecJvmModelInferrer.this._typeReferences.getTypeForName(org.jnario.lib.ExampleTable.class, table, _createTypeRef);
        String _javaClassName = SpecJvmModelInferrer.this._exampleNameProvider.toJavaClassName(table);
        final String initMethodName = ("_init" + _javaClassName);
        EList<JvmMember> _members = specType.getMembers();
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              @Override
              public void apply(final ITreeAppendable a) {
                it.setDeclaringType(specType);
                SpecJvmModelInferrer.this.generateInitializationMethod(table, a);
              }
            };
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        };
        JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, initMethodName, type, _function);
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<JvmMember> _members_1 = specType.getMembers();
        String _fieldName = SpecJvmModelInferrer.this._exampleNameProvider.toFieldName(table);
        final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
          @Override
          public void apply(final JvmField it) {
            it.setVisibility(JvmVisibility.PROTECTED);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              @Override
              public void apply(final ITreeAppendable it) {
                ITreeAppendable _append = it.append(initMethodName);
                _append.append("()");
              }
            };
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setInitializer(it, _function);
          }
        };
        JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(table, _fieldName, type, _function_1);
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
        final Procedure1<JvmConstructor> _function_2 = new Procedure1<JvmConstructor>() {
          @Override
          public void apply(final JvmConstructor it) {
            String _simpleName = exampleTableType.getSimpleName();
            it.setSimpleName(_simpleName);
          }
        };
        final JvmConstructor constructor = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toConstructor(table, _function_2);
        EList<JvmMember> _members_2 = exampleTableType.getMembers();
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_2, constructor);
        final ArrayList<String> assignments = CollectionLiterals.<String>newArrayList();
        final JvmTypeReference stringType = SpecJvmModelInferrer.this._typeReferences.getTypeForName(String.class, table);
        final JvmTypeReference listType = SpecJvmModelInferrer.this._typeReferences.getTypeForName(List.class, table, stringType);
        final JvmFormalParameter cellNames = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
        cellNames.setName("cellNames");
        cellNames.setParameterType(listType);
        EList<JvmFormalParameter> _parameters = constructor.getParameters();
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, cellNames);
        assignments.add("super(cellNames);");
        SpecJvmModelInferrer.this.index = 0;
        EList<ExampleColumn> _columns = table.getColumns();
        final Consumer<ExampleColumn> _function_3 = new Consumer<ExampleColumn>() {
          @Override
          public void accept(final ExampleColumn column) {
            JvmTypeReference _xifexpression = null;
            JvmTypeReference _type = column.getType();
            boolean _notEquals = (!Objects.equal(_type, null));
            if (_notEquals) {
              _xifexpression = column.getType();
            } else {
              _xifexpression = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.inferredType();
            }
            final JvmTypeReference columnType = _xifexpression;
            EList<JvmMember> _members = exampleTableType.getMembers();
            String _name = column.getName();
            JvmTypeReference _cloneWithProxies = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(columnType);
            JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(column, _name, _cloneWithProxies);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
            String _name_1 = column.getName();
            JvmTypeReference _cloneWithProxies_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(columnType);
            final JvmFormalParameter param = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toParameter(column, _name_1, _cloneWithProxies_1);
            EList<JvmFormalParameter> _parameters = constructor.getParameters();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, param);
            String _name_2 = column.getName();
            JvmTypeReference _cloneWithProxies_2 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(columnType);
            final JvmOperation getter = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toGetter(column, _name_2, _cloneWithProxies_2);
            EList<JvmMember> _members_1 = exampleTableType.getMembers();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, getter);
            String _name_3 = column.getName();
            String _plus = ("this." + _name_3);
            String _plus_1 = (_plus + " = ");
            String _name_4 = column.getName();
            String _plus_2 = (_plus_1 + _name_4);
            String _plus_3 = (_plus_2 + ";");
            assignments.add(_plus_3);
          }
        };
        _columns.forEach(_function_3);
        EList<ExampleRow> _rows = table.getRows();
        final Consumer<ExampleRow> _function_4 = new Consumer<ExampleRow>() {
          @Override
          public void accept(final ExampleRow it) {
            EList<ExampleCell> _cells = it.getCells();
            final Consumer<ExampleCell> _function = new Consumer<ExampleCell>() {
              @Override
              public void accept(final ExampleCell it) {
                String _initMethodName = SpecJvmModelInferrer.this.initMethodName(table, SpecJvmModelInferrer.this.index);
                SpecJvmModelInferrer.this.generateCellInitializerMethod(specType, _initMethodName, it);
                SpecJvmModelInferrer.this.index = (SpecJvmModelInferrer.this.index + 1);
              }
            };
            _cells.forEach(_function);
          }
        };
        _rows.forEach(_function_4);
        final Procedure1<ITreeAppendable> _function_5 = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable a) {
            final Consumer<String> _function = new Consumer<String>() {
              @Override
              public void accept(final String it) {
                ITreeAppendable _append = a.append(it);
                _append.newLine();
              }
            };
            assignments.forEach(_function);
          }
        };
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(constructor, _function_5);
      }
    };
    this._extendedJvmTypesBuilder.toClass(_jnarioFile, _javaClassName, _function);
  }
  
  public void generateInitializationMethod(final ExampleTable exampleTable, final ITreeAppendable appendable) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Arrays.class, exampleTable);
    final JvmType arraysType = _typeForName.getType();
    String _fieldName = this._exampleNameProvider.toFieldName(exampleTable);
    String _plus = ("return ExampleTable.create(\"" + _fieldName);
    String _plus_1 = (_plus + "\", \n");
    appendable.append(_plus_1);
    ITreeAppendable _append = appendable.append("  ");
    ITreeAppendable _append_1 = _append.append(arraysType);
    ITreeAppendable _append_2 = _append_1.append(".asList(\"");
    List<String> _columnNames = this.columnNames(exampleTable);
    String _join = IterableExtensions.join(_columnNames, "\", \"");
    String _plus_2 = (_join + "\"), ");
    _append_2.append(_plus_2);
    appendable.increaseIndentation();
    appendable.append("\n");
    this.index = 0;
    EList<ExampleRow> _rows = exampleTable.getRows();
    for (final ExampleRow row : _rows) {
      {
        ITreeAppendable _append_3 = appendable.append("new ");
        String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleTable);
        ITreeAppendable _append_4 = _append_3.append(_javaClassName);
        _append_4.append("(");
        ITreeAppendable _append_5 = appendable.append("  ");
        ITreeAppendable _append_6 = _append_5.append(arraysType);
        EList<ExampleCell> _cells = row.getCells();
        final Function1<ExampleCell, String> _function = new Function1<ExampleCell, String>() {
          @Override
          public String apply(final ExampleCell it) {
            String _serialize = SpecJvmModelInferrer.this.serialize(it);
            String _trim = _serialize.trim();
            return Strings.convertToJavaString(_trim);
          }
        };
        List<String> _map = ListExtensions.<ExampleCell, String>map(_cells, _function);
        String _join_1 = IterableExtensions.join(_map, "\", \"");
        String _plus_3 = (".asList(\"" + _join_1);
        String _plus_4 = (_plus_3 + "\"), ");
        _append_6.append(_plus_4);
        EList<ExampleCell> _cells_1 = row.getCells();
        for (final ExampleCell cell : _cells_1) {
          {
            XExpression _expression = cell.getExpression();
            if ((_expression instanceof XNullLiteral)) {
              appendable.append("null");
            } else {
              String _initMethodName = this.initMethodName(exampleTable, this.index);
              String _plus_5 = (_initMethodName + "()");
              appendable.append(_plus_5);
            }
            this.index = (this.index + 1);
            EList<ExampleCell> _cells_2 = row.getCells();
            ExampleCell _last = IterableExtensions.<ExampleCell>last(_cells_2);
            boolean _notEquals = (!Objects.equal(_last, cell));
            if (_notEquals) {
              appendable.append(", ");
            }
          }
        }
        appendable.append(")");
        EList<ExampleRow> _rows_1 = exampleTable.getRows();
        ExampleRow _last = IterableExtensions.<ExampleRow>last(_rows_1);
        boolean _notEquals = (!Objects.equal(_last, row));
        if (_notEquals) {
          appendable.append(",\n");
        }
      }
    }
    appendable.decreaseIndentation();
    appendable.append("\n);");
  }
  
  public void associateTableWithSpec(final JvmGenericType type, final ExampleTable table) {
    EList<ExampleRow> _rows = table.getRows();
    for (final ExampleRow row : _rows) {
      this._extendedJvmTypesBuilder.<JvmGenericType>associate(row, type);
    }
  }
  
  public String initMethodName(final ExampleTable exampleTable, final int i) {
    String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleTable);
    String _plus = ("_init" + _javaClassName);
    String _plus_1 = (_plus + "Cell");
    return (_plus_1 + Integer.valueOf(i));
  }
  
  public boolean generateCellInitializerMethod(final JvmGenericType specType, final String name, final ExampleCell cell) {
    EList<JvmMember> _members = specType.getMembers();
    JvmTypeReference _inferredType = this._extendedJvmTypesBuilder.inferredType();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        it.setDeclaringType(specType);
        XExpression _expression = cell.getExpression();
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _expression);
      }
    };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(cell, name, _inferredType, _function);
    return this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
  }
  
  public List<String> columnNames(final ExampleTable exampleTable) {
    EList<ExampleColumn> _columns = exampleTable.getColumns();
    final Function1<ExampleColumn, String> _function = new Function1<ExampleColumn, String>() {
      @Override
      public String apply(final ExampleColumn it) {
        String _name = null;
        if (it!=null) {
          _name=it.getName();
        }
        return _name;
      }
    };
    return ListExtensions.<ExampleColumn, String>map(_columns, _function);
  }
  
  protected void transform(final JnarioMember element, final JvmGenericType container) {
    if (element instanceof After) {
      _transform((After)element, container);
      return;
    } else if (element instanceof Before) {
      _transform((Before)element, container);
      return;
    } else if (element instanceof Example) {
      _transform((Example)element, container);
      return;
    } else if (element instanceof ExampleTable) {
      _transform((ExampleTable)element, container);
      return;
    } else if (element instanceof JnarioField) {
      _transform((JnarioField)element, container);
      return;
    } else if (element instanceof JnarioFunction) {
      _transform((JnarioFunction)element, container);
      return;
    } else if (element != null) {
      _transform(element, container);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, container).toString());
    }
  }
}
