/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel

import com.google.inject.Inject
import java.util.List
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeParameter
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmUpperBound
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.documentation.IFileHeaderProvider
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.XTypeLiteral
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.jnario.JnarioClass
import org.jnario.JnarioField
import org.jnario.JnarioFile
import org.jnario.JnarioFunction
import org.jnario.JnarioMember
import org.jnario.JnarioParameter
import org.jnario.JnarioTypeDeclaration
import org.jnario.runner.Extends

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmAnnotationType
import java.lang.annotation.Annotation
import org.eclipse.emf.common.notify.Notifier

/**
 * TODO NO_XTEND - verify all methods. Remove unused.
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
abstract class JnarioJvmModelInferrer  extends AbstractModelInferrer {
    @Inject extension IJvmModelAssociator modelAssociator
    @Inject extension IJvmModelAssociations
    @Inject extension IFileHeaderProvider
    @Inject extension JvmTypesBuilder

	@Inject public XbaseCompiler compiler
	@Inject extension TypeReferences
//	@Inject extension IJvmModelAssociations
	@Inject TestRuntimeProvider runtime
	@Inject extension JnarioNameProvider
	TestRuntimeSupport testRuntime
//	@Inject	extension JvmTypesBuilder jvmTypesBuilder
    @Inject extension TypesFactory typesFactory


	override infer(EObject obj, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		try{
			testRuntime = runtime.get(obj)
		}catch(NoSuchElementException ex){
			return
		}
		doInfer(obj, acceptor, preIndexingPhase)
	}
	
	def doInfer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		throw new UnsupportedOperationException
	}
	
	
	def serialize(EObject obj){
		return obj.node?.text
	}
	
	def jnarioFile(EObject obj){
		EcoreUtil2::getContainerOfType(obj, JnarioFile)
	}
	
	def packageName(EObject obj){
		obj.jnarioFile?.^package
	}
	
	def protected getTestRuntime(){
		testRuntime
	}
	
	def protected void addSuperClass(JnarioClass jnarioClass){
		var EObject xtendType = jnarioClass
		while(xtendType != null && xtendType instanceof JnarioClass){
			val current = xtendType as JnarioClass
			for(extendedType : current.annotations.filter[it.hasExtendsAnnotation].map[value as XTypeLiteral]){
				if(/* current.^implements.empty && */ extendedType.type != null){
					jnarioClass.^extends = extendedType.type.createTypeRef()
					return
				}
			}	
			xtendType = xtendType.eContainer
		}
	}
	
	def protected hasExtendsAnnotation(XAnnotation annotation){
		annotation.annotationType?.qualifiedName == typeof(Extends).name && annotation.value instanceof XTypeLiteral
	}
	
	def protected void setNameAndAssociate(JnarioFile file, JnarioTypeDeclaration jnarioType, JvmDeclaredType javaType) {
        javaType.packageName = file.package
		javaType.simpleName = jnarioType.toJavaClassName
        javaType.visibility = JvmVisibility.PUBLIC
        file.setFileHeader(javaType)
        jnarioType.associatePrimary(javaType)
	}

    def protected void setFileHeader(JnarioFile jnarioFile, JvmDeclaredType jvmDeclaredType) {
        jvmDeclaredType.fileHeader = jnarioFile.eResource.fileHeader
    }


    def protected void initialize(JnarioClass source, JvmGenericType inferredJvmType) {
        inferredJvmType => [
            visibility = JvmVisibility.PUBLIC
            static = source.static
        ]
        
        inferredJvmType.translateAnnotations(source.annotations)
        
        val extendsClause = source.getExtends();
        if (extendsClause == null || extendsClause.getType() == null) {
            inferredJvmType.superTypes.add(Object.getTypeForName(source))
        } else {
            inferredJvmType.getSuperTypes().add(extendsClause.cloneWithProxies);
        }
        // for (JvmTypeReference intf : source.getImplements()) {
        //    inferredJvmType.getSuperTypes().add(jvmTypesBuilder.cloneWithProxies(intf));
        // }
        //fixTypeParameters(inferredJvmType);
        //addDefaultConstructor(source, inferredJvmType);
        for (JnarioMember member : source.getMembers()) {
            if (member instanceof JnarioField
                    || (member instanceof JnarioFunction && (member as JnarioFunction).getName() != null)) {
                transform(member, inferredJvmType);
            }
        }
        
        //appendSyntheticDispatchMethods(source, inferredJvmType);
        source.copyDocumentationTo(inferredJvmType);

        // TODO NO_XTEND
        //nameClashResolver.resolveNameClashes(inferredJvmType);
        
    }

    def protected dispatch void transform(JnarioField source, JvmGenericType container) {
        if ((source.isExtension() && source.getType() != null) || source.getName() != null) {
            typesFactory.createJvmField => [
                simpleName = computeFieldName(source)
                visibility = source.visibility
                static = source.static
                transient = source.transient
                volatile = source.volatile
                final = source.final
                
                container.members += it
                
                if (source.type!= null) {
                    type = source.type.cloneWithProxies
                } else if (source.initialValue != null) {
                    type = source.initialValue.inferredType;
                }
                
                if(visibility == JvmVisibility::PRIVATE){
                    visibility = JvmVisibility::DEFAULT
                }

                if (source.extension) {
                    visibility = JvmVisibility::PUBLIC
                    annotations.addAnnotationIfFound(org.eclipse.xtext.xbase.lib.Extension, source)
                    annotations.addAnnotationIfFound(org.jnario.runner.Extension, source)
                }
                translateAnnotations(source.annotations)
                
                
                source.associatePrimary(it);
                source.copyDocumentationTo(it)
                
                // TODO NO_XTEND
                // initializeLocalTypes(it, source.getInitialValue());
                initializer = source.initialValue
            ]
        }
    }
 
    def addAnnotationIfFound(List<JvmAnnotationReference> annotations, Class<? extends Annotation> annotationType, Notifier context) {
        val jvmType = annotationType.findDeclaredType(context)
        if (jvmType instanceof JvmAnnotationType) {
            annotations += annotationType.annotationRef
        }
    }
    
 
//    def protected dispatch void transform(JnarioField source, JvmGenericType container) {
//        if ((source.isExtension() && source.getType() != null) || source.getName() != null) {
//            val field = typesFactory.createJvmField => [
//                simpleName = computeFieldName(source)
//                visibility = source.visibility
//                static = source.static
//                transient = source.transient
//                volatile = source.volatile
//                final = source.final
//                if (source.type!= null) {
//                    type = source.type.cloneWithProxies
//                } else if (source.initialValue != null) {
//                    type = source.initialValue.inferredType;
//                }
//                
//                if (source.extension && Extension.findDeclaredType(source) != null) {
//                    annotations += Extension.annotationRef
//                }
//                
////                for (XAnnotation anno : source.getAnnotations()) {
////                    val annotationReference = anno.getJvmAnnotationReference
////                    if(annotationReference != null) {
////                        annotations.add(annotationReference)
////                    }
////                }
//                
//                setInitializer(source.initialValue)
//            ]
//            container.members.add(field);
//            source.associatePrimary(field);
//                
//            source.copyDocumentationTo(field)
//            
//            if(field.visibility == JvmVisibility::PRIVATE){
//                field.setVisibility(JvmVisibility::DEFAULT)
//            }
//        }
//    }
// 
    
    def protected dispatch void transform(JnarioFunction source, JvmGenericType container) {
        val operation = typesFactory.createJvmOperation();
        operation.setAbstract(false);
        operation.setNative(false);
        operation.setSynchronized(false);
        operation.setStrictFloatingPoint(false);
        if (!operation.isAbstract())
            operation.setFinal(source.isFinal());
        container.getMembers().add(operation);
        source.associatePrimary(operation);
        
        val sourceName = source.getName();
        val visibility = source.getVisibility();
        operation.setSimpleName(sourceName);
        operation.setVisibility(visibility);
        operation.setStatic(source.isStatic());
        if (!operation.isAbstract() && !operation.isStatic() && container.isInterface())
            operation.setDefault(true);
        for (JnarioParameter parameter : source.getParameters()) {
            translateParameter(operation, parameter);
        }
        val expression = source.getExpression();
        
        var JvmTypeReference returnType = null;
        if (source.getReturnType() != null) {
            returnType = source.getReturnType.cloneWithProxies
        } else if (expression != null) {
            returnType = expression.inferredType
        } else {
            returnType = inferredType
        }
        
        operation.setReturnType(returnType);
        copyAndFixTypeParameters(source.getTypeParameters(), operation);
        for (JvmTypeReference exception : source.getExceptions()) {
            operation.exceptions += exception.cloneWithProxies
        }
        operation.translateAnnotations(source.annotations)

//        if (source.isOverride() && generatorConfig.getJavaSourceVersion().isAtLeast(JAVA6)
//                && !containsAnnotation(operation, Override.class)
//                && typeReferences.findDeclaredType(Override.class, source) != null) {
//            operation.getAnnotations().add(_annotationTypesBuilder.annotationRef(Override));
//        }
        setBody(operation, expression);
        source.copyDocumentationTo(operation);
    }
    
    def protected void translateParameter(JvmExecutable executable, JnarioParameter parameter) {
        val jvmParam = typesFactory.createJvmFormalParameter();
        jvmParam.setName(parameter.getName());
        if (parameter.isVarArg()) {
            executable.setVarArgs(true);
            val arrayType = parameter.parameterType.cloneWithProxies.createArrayType
            jvmParam.parameterType = arrayType
        } else {
            jvmParam.parameterType = parameter.parameterType.cloneWithProxies
        }
        modelAssociator.associate(parameter, jvmParam)
        jvmParam.translateAnnotations(parameter.annotations)

        jvmParam.annotations.addAnnotationIfFound(org.eclipse.xtext.xbase.lib.Extension, parameter)
//        jvmParam.annotations.addAnnotationIfFound(org.jnario.runner.Extension, parameter)

        executable.parameters += jvmParam
    }

    def protected void copyAndFixTypeParameters(List<JvmTypeParameter> typeParameters, JvmTypeParameterDeclarator target) {
        copyTypeParameters(typeParameters, target);
        fixTypeParameters(target);
    }
    
    def protected void copyTypeParameters(List<JvmTypeParameter> typeParameters, JvmTypeParameterDeclarator target) {
        for (JvmTypeParameter typeParameter : typeParameters) {
            val clonedTypeParameter = typeParameter.cloneWithProxies
            if (clonedTypeParameter != null) {
                target.getTypeParameters().add(clonedTypeParameter);
                modelAssociator.associate(typeParameter, clonedTypeParameter);
            }
        }
    }
    
    def protected void fixTypeParameters(JvmTypeParameterDeclarator target) {
        for (JvmTypeParameter typeParameter : target.getTypeParameters()) {
            if (typeParameter.constraints.filter(JvmUpperBound).empty) {
                val upperBound = typesFactory.createJvmUpperBound();
                upperBound.typeReference = Object.getTypeForName(target)
                typeParameter.constraints += upperBound
            }
        }
    }


    def protected dispatch void transform(JnarioMember source, JvmGenericType container) {
        throw new RuntimeException("Not implemented for type: " + source.eClass)
    }
    
    def protected String computeFieldName(JnarioField field) {
        if (field.name != null)
            return field.name
            
        var type = field.getType();
        var String name = null;
        if (type != null) {
            while (type instanceof JvmGenericArrayTypeReference) {
                type = type.componentType
            }
            if (type instanceof JvmParameterizedTypeReference) {
                val nodes = NodeModelUtils.findNodesForFeature(type,
                        TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
                if (!nodes.isEmpty()) {
                    var typeName = nodes.get(0).getText().trim();
                    val lastDot = typeName.lastIndexOf('.');
                    if (lastDot != -1) {
                        typeName = typeName.substring(lastDot + 1);
                    }
                    name = "_" + Strings.toFirstLower(typeName)
                }
            }
        }
        name
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
     * 
     */
    def protected void translateAnnotations(JvmAnnotationTarget target, List<XAnnotation> annotations) {
        var annotationsToAdd = annotations.filter[it?.annotationType != null]

        for (a : annotationsToAdd) {
            val annotationReference = a.getJvmAnnotationReference
            if(annotationReference != null) {
                val associatedElements = a.jvmElements.filter[it !== annotationReference].toList
                if (!associatedElements.empty) {
                    // transform it to List to avoid concurrent modification exception
                    associatedElements.forEach[assoc|modelAssociator.removeAllAssociation(assoc)]
                }
                // println("Put annotation @" + a.annotationType.simpleName + " on " + target.simpleName)
                target.annotations += annotationReference
            }
        }
    }
}