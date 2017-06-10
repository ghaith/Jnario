/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.documentation.IFileHeaderProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.JnarioClass;
import org.jnario.JnarioField;
import org.jnario.JnarioFile;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioParameter;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.jvmmodel.TestRuntimeProvider;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.runner.Extends;

/**
 * TODO NO_XTEND - verify all methods. Remove unused.
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public abstract class JnarioJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private IJvmModelAssociator modelAssociator;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private IFileHeaderProvider _iFileHeaderProvider;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  public XbaseCompiler compiler;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  private TestRuntimeProvider runtime;
  
  @Inject
  @Extension
  private JnarioNameProvider _jnarioNameProvider;
  
  private TestRuntimeSupport testRuntime;
  
  @Inject
  @Extension
  private TypesFactory typesFactory;
  
  @Override
  public void infer(final EObject obj, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    try {
      this.testRuntime = this.runtime.get(obj);
    } catch (final Throwable _t) {
      if (_t instanceof NoSuchElementException) {
        final NoSuchElementException ex = (NoSuchElementException)_t;
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    this.doInfer(obj, acceptor, preIndexingPhase);
  }
  
  public void doInfer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    throw new UnsupportedOperationException();
  }
  
  public String serialize(final EObject obj) {
    ICompositeNode _node = NodeModelUtils.getNode(obj);
    String _text = null;
    if (_node!=null) {
      _text=_node.getText();
    }
    return _text;
  }
  
  public JnarioFile jnarioFile(final EObject obj) {
    return EcoreUtil2.<JnarioFile>getContainerOfType(obj, JnarioFile.class);
  }
  
  public String packageName(final EObject obj) {
    JnarioFile _jnarioFile = this.jnarioFile(obj);
    String _package = null;
    if (_jnarioFile!=null) {
      _package=_jnarioFile.getPackage();
    }
    return _package;
  }
  
  protected TestRuntimeSupport getTestRuntime() {
    return this.testRuntime;
  }
  
  protected void addSuperClass(final JnarioClass jnarioClass) {
    EObject xtendType = jnarioClass;
    while (((!Objects.equal(xtendType, null)) && (xtendType instanceof JnarioClass))) {
      {
        final JnarioClass current = ((JnarioClass) xtendType);
        final Function1<XAnnotation, Boolean> _function = new Function1<XAnnotation, Boolean>() {
          @Override
          public Boolean apply(final XAnnotation it) {
            return Boolean.valueOf(JnarioJvmModelInferrer.this.hasExtendsAnnotation(it));
          }
        };
        final Function1<XAnnotation, XTypeLiteral> _function_1 = new Function1<XAnnotation, XTypeLiteral>() {
          @Override
          public XTypeLiteral apply(final XAnnotation it) {
            XExpression _value = it.getValue();
            return ((XTypeLiteral) _value);
          }
        };
        Iterable<XTypeLiteral> _map = IterableExtensions.<XAnnotation, XTypeLiteral>map(IterableExtensions.<XAnnotation>filter(current.getAnnotations(), _function), _function_1);
        for (final XTypeLiteral extendedType : _map) {
          JvmType _type = extendedType.getType();
          boolean _notEquals = (!Objects.equal(_type, null));
          if (_notEquals) {
            jnarioClass.setExtends(this._typeReferences.createTypeRef(extendedType.getType()));
            return;
          }
        }
        xtendType = xtendType.eContainer();
      }
    }
  }
  
  protected boolean hasExtendsAnnotation(final XAnnotation annotation) {
    boolean _and = false;
    JvmType _annotationType = annotation.getAnnotationType();
    String _qualifiedName = null;
    if (_annotationType!=null) {
      _qualifiedName=_annotationType.getQualifiedName();
    }
    String _name = Extends.class.getName();
    boolean _equals = Objects.equal(_qualifiedName, _name);
    if (!_equals) {
      _and = false;
    } else {
      XExpression _value = annotation.getValue();
      _and = (_value instanceof XTypeLiteral);
    }
    return _and;
  }
  
  protected void setNameAndAssociate(final JnarioFile file, final JnarioTypeDeclaration jnarioType, final JvmDeclaredType javaType) {
    javaType.setPackageName(file.getPackage());
    javaType.setSimpleName(this._jnarioNameProvider.toJavaClassName(jnarioType));
    javaType.setVisibility(JvmVisibility.PUBLIC);
    this.setFileHeader(file, javaType);
    this.modelAssociator.associatePrimary(jnarioType, javaType);
  }
  
  protected void setFileHeader(final JnarioFile jnarioFile, final JvmDeclaredType jvmDeclaredType) {
    this._jvmTypesBuilder.setFileHeader(jvmDeclaredType, this._iFileHeaderProvider.getFileHeader(jnarioFile.eResource()));
  }
  
  protected void initialize(final JnarioClass source, final JvmGenericType inferredJvmType) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        it.setVisibility(JvmVisibility.PUBLIC);
        it.setStatic(source.isStatic());
      }
    };
    ObjectExtensions.<JvmGenericType>operator_doubleArrow(inferredJvmType, _function);
    this.translateAnnotations(inferredJvmType, source.getAnnotations());
    final JvmTypeReference extendsClause = source.getExtends();
    if ((Objects.equal(extendsClause, null) || Objects.equal(extendsClause.getType(), null))) {
      inferredJvmType.getSuperTypes().add(this._typeReferences.getTypeForName(Object.class, source));
    } else {
      inferredJvmType.getSuperTypes().add(this._jvmTypesBuilder.cloneWithProxies(extendsClause));
    }
    EList<JnarioMember> _members = source.getMembers();
    for (final JnarioMember member : _members) {
      if (((member instanceof JnarioField) || ((member instanceof JnarioFunction) && (!Objects.equal(((JnarioFunction) member).getName(), null))))) {
        this.transform(member, inferredJvmType);
      }
    }
    this._jvmTypesBuilder.copyDocumentationTo(source, inferredJvmType);
  }
  
  protected void _transform(final JnarioField source, final JvmGenericType container) {
    if (((source.isExtension() && (!Objects.equal(source.getType(), null))) || (!Objects.equal(source.getName(), null)))) {
      JvmField _createJvmField = this.typesFactory.createJvmField();
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        @Override
        public void apply(final JvmField it) {
          it.setSimpleName(JnarioJvmModelInferrer.this.computeFieldName(source));
          it.setVisibility(source.getVisibility());
          it.setStatic(source.isStatic());
          it.setTransient(source.isTransient());
          it.setVolatile(source.isVolatile());
          it.setFinal(source.isFinal());
          EList<JvmMember> _members = container.getMembers();
          JnarioJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, it);
          JvmTypeReference _type = source.getType();
          boolean _notEquals = (!Objects.equal(_type, null));
          if (_notEquals) {
            it.setType(JnarioJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(source.getType()));
          } else {
            XExpression _initialValue = source.getInitialValue();
            boolean _notEquals_1 = (!Objects.equal(_initialValue, null));
            if (_notEquals_1) {
              it.setType(JnarioJvmModelInferrer.this._jvmTypesBuilder.inferredType(source.getInitialValue()));
            }
          }
          JvmVisibility _visibility = it.getVisibility();
          boolean _equals = Objects.equal(_visibility, JvmVisibility.PRIVATE);
          if (_equals) {
            it.setVisibility(JvmVisibility.DEFAULT);
          }
          boolean _isExtension = source.isExtension();
          if (_isExtension) {
            it.setVisibility(JvmVisibility.PUBLIC);
            JnarioJvmModelInferrer.this.addAnnotationIfFound(it.getAnnotations(), Extension.class, source);
            JnarioJvmModelInferrer.this.addAnnotationIfFound(it.getAnnotations(), org.jnario.runner.Extension.class, source);
          }
          JnarioJvmModelInferrer.this.translateAnnotations(it, source.getAnnotations());
          JnarioJvmModelInferrer.this.modelAssociator.associatePrimary(source, it);
          JnarioJvmModelInferrer.this._jvmTypesBuilder.copyDocumentationTo(source, it);
          JnarioJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, source.getInitialValue());
        }
      };
      ObjectExtensions.<JvmField>operator_doubleArrow(_createJvmField, _function);
    }
  }
  
  public boolean addAnnotationIfFound(final List<JvmAnnotationReference> annotations, final Class<? extends Annotation> annotationType, final Notifier context) {
    boolean _xblockexpression = false;
    {
      final JvmType jvmType = this._typeReferences.findDeclaredType(annotationType, context);
      boolean _xifexpression = false;
      if ((jvmType instanceof JvmAnnotationType)) {
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(annotationType);
        _xifexpression = annotations.add(_annotationRef);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected void _transform(final JnarioFunction source, final JvmGenericType container) {
    final JvmOperation operation = this.typesFactory.createJvmOperation();
    operation.setAbstract(false);
    operation.setNative(false);
    operation.setSynchronized(false);
    operation.setStrictFloatingPoint(false);
    boolean _isAbstract = operation.isAbstract();
    boolean _not = (!_isAbstract);
    if (_not) {
      operation.setFinal(source.isFinal());
    }
    container.getMembers().add(operation);
    this.modelAssociator.associatePrimary(source, operation);
    final String sourceName = source.getName();
    final JvmVisibility visibility = source.getVisibility();
    operation.setSimpleName(sourceName);
    operation.setVisibility(visibility);
    operation.setStatic(source.isStatic());
    if ((((!operation.isAbstract()) && (!operation.isStatic())) && container.isInterface())) {
      operation.setDefault(true);
    }
    EList<JnarioParameter> _parameters = source.getParameters();
    for (final JnarioParameter parameter : _parameters) {
      this.translateParameter(operation, parameter);
    }
    final XExpression expression = source.getExpression();
    JvmTypeReference returnType = null;
    JvmTypeReference _returnType = source.getReturnType();
    boolean _notEquals = (!Objects.equal(_returnType, null));
    if (_notEquals) {
      returnType = this._jvmTypesBuilder.cloneWithProxies(source.getReturnType());
    } else {
      boolean _notEquals_1 = (!Objects.equal(expression, null));
      if (_notEquals_1) {
        returnType = this._jvmTypesBuilder.inferredType(expression);
      } else {
        returnType = this._jvmTypesBuilder.inferredType();
      }
    }
    operation.setReturnType(returnType);
    this.copyAndFixTypeParameters(source.getTypeParameters(), operation);
    EList<JvmTypeReference> _exceptions = source.getExceptions();
    for (final JvmTypeReference exception : _exceptions) {
      EList<JvmTypeReference> _exceptions_1 = operation.getExceptions();
      JvmTypeReference _cloneWithProxies = this._jvmTypesBuilder.cloneWithProxies(exception);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions_1, _cloneWithProxies);
    }
    this.translateAnnotations(operation, source.getAnnotations());
    this._jvmTypesBuilder.setBody(operation, expression);
    this._jvmTypesBuilder.copyDocumentationTo(source, operation);
  }
  
  protected void translateParameter(final JvmExecutable executable, final JnarioParameter parameter) {
    final JvmFormalParameter jvmParam = this.typesFactory.createJvmFormalParameter();
    jvmParam.setName(parameter.getName());
    boolean _isVarArg = parameter.isVarArg();
    if (_isVarArg) {
      executable.setVarArgs(true);
      final JvmGenericArrayTypeReference arrayType = this._typeReferences.createArrayType(this._jvmTypesBuilder.cloneWithProxies(parameter.getParameterType()));
      jvmParam.setParameterType(arrayType);
    } else {
      jvmParam.setParameterType(this._jvmTypesBuilder.cloneWithProxies(parameter.getParameterType()));
    }
    this.modelAssociator.associate(parameter, jvmParam);
    this.translateAnnotations(jvmParam, parameter.getAnnotations());
    this.addAnnotationIfFound(jvmParam.getAnnotations(), Extension.class, parameter);
    EList<JvmFormalParameter> _parameters = executable.getParameters();
    this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, jvmParam);
  }
  
  protected void copyAndFixTypeParameters(final List<JvmTypeParameter> typeParameters, final JvmTypeParameterDeclarator target) {
    this.copyTypeParameters(typeParameters, target);
    this.fixTypeParameters(target);
  }
  
  protected void copyTypeParameters(final List<JvmTypeParameter> typeParameters, final JvmTypeParameterDeclarator target) {
    for (final JvmTypeParameter typeParameter : typeParameters) {
      {
        final JvmTypeParameter clonedTypeParameter = this._jvmTypesBuilder.<JvmTypeParameter>cloneWithProxies(typeParameter);
        boolean _notEquals = (!Objects.equal(clonedTypeParameter, null));
        if (_notEquals) {
          target.getTypeParameters().add(clonedTypeParameter);
          this.modelAssociator.associate(typeParameter, clonedTypeParameter);
        }
      }
    }
  }
  
  protected void fixTypeParameters(final JvmTypeParameterDeclarator target) {
    EList<JvmTypeParameter> _typeParameters = target.getTypeParameters();
    for (final JvmTypeParameter typeParameter : _typeParameters) {
      boolean _isEmpty = IterableExtensions.isEmpty(Iterables.<JvmUpperBound>filter(typeParameter.getConstraints(), JvmUpperBound.class));
      if (_isEmpty) {
        final JvmUpperBound upperBound = this.typesFactory.createJvmUpperBound();
        upperBound.setTypeReference(this._typeReferences.getTypeForName(Object.class, target));
        EList<JvmTypeConstraint> _constraints = typeParameter.getConstraints();
        this._jvmTypesBuilder.<JvmUpperBound>operator_add(_constraints, upperBound);
      }
    }
  }
  
  protected void _transform(final JnarioMember source, final JvmGenericType container) {
    EClass _eClass = source.eClass();
    String _plus = ("Not implemented for type: " + _eClass);
    throw new RuntimeException(_plus);
  }
  
  protected String computeFieldName(final JnarioField field) {
    String _xblockexpression = null;
    {
      String _name = field.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        return field.getName();
      }
      JvmTypeReference type = field.getType();
      String name = null;
      boolean _notEquals_1 = (!Objects.equal(type, null));
      if (_notEquals_1) {
        while ((type instanceof JvmGenericArrayTypeReference)) {
          type = ((JvmGenericArrayTypeReference)type).getComponentType();
        }
        if ((type instanceof JvmParameterizedTypeReference)) {
          final List<INode> nodes = NodeModelUtils.findNodesForFeature(type, 
            TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
          boolean _isEmpty = nodes.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            String typeName = nodes.get(0).getText().trim();
            final int lastDot = typeName.lastIndexOf(".");
            if ((lastDot != (-1))) {
              typeName = typeName.substring((lastDot + 1));
            }
            String _firstLower = Strings.toFirstLower(typeName);
            String _plus = ("_" + _firstLower);
            name = _plus;
          }
        }
      }
      _xblockexpression = name;
    }
    return _xblockexpression;
  }
  
  /**
   * Prevents error message
   * <code>Cannot root object twice: JvmGenericType: org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns ...</pre>.
   * <br>
   * <br>
   * This solution developed by Lorenzo BettiniFriend and published here
   * https://www.eclipse.org/forums/index.php/t/864890/
   * <br>
   * Thank you very much!
   */
  protected void translateAnnotations(final JvmAnnotationTarget target, final List<XAnnotation> annotations) {
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
    Iterable<XAnnotation> annotationsToAdd = IterableExtensions.<XAnnotation>filter(annotations, _function);
    for (final XAnnotation a : annotationsToAdd) {
      {
        final JvmAnnotationReference annotationReference = this._jvmTypesBuilder.getJvmAnnotationReference(a);
        boolean _notEquals = (!Objects.equal(annotationReference, null));
        if (_notEquals) {
          final Function1<EObject, Boolean> _function_1 = new Function1<EObject, Boolean>() {
            @Override
            public Boolean apply(final EObject it) {
              return Boolean.valueOf((it != annotationReference));
            }
          };
          final List<EObject> associatedElements = IterableExtensions.<EObject>toList(IterableExtensions.<EObject>filter(this._iJvmModelAssociations.getJvmElements(a), _function_1));
          boolean _isEmpty = associatedElements.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            final Consumer<EObject> _function_2 = new Consumer<EObject>() {
              @Override
              public void accept(final EObject assoc) {
                JnarioJvmModelInferrer.this.modelAssociator.removeAllAssociation(assoc);
              }
            };
            associatedElements.forEach(_function_2);
          }
          EList<JvmAnnotationReference> _annotations = target.getAnnotations();
          this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, annotationReference);
        }
      }
    }
  }
  
  protected void transform(final JnarioMember source, final JvmGenericType container) {
    if (source instanceof JnarioField) {
      _transform((JnarioField)source, container);
      return;
    } else if (source instanceof JnarioFunction) {
      _transform((JnarioFunction)source, container);
      return;
    } else if (source != null) {
      _transform(source, container);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(source, container).toString());
    }
  }
}
