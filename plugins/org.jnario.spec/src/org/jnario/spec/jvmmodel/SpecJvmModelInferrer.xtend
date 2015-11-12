/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.jvmmodel

import com.google.inject.Inject
import java.util.Arrays
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XNullLiteral
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2
import org.jnario.ExampleCell
import org.jnario.ExampleTable
import org.jnario.JnarioClass
import org.jnario.JnarioFile
import org.jnario.JnarioMember
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.lib.ExampleTableRow
import org.jnario.runner.Named
import org.jnario.runner.Order
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.After
import org.jnario.spec.spec.Before
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.TestFunction

import static extension org.eclipse.xtext.util.Strings.*

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
	
	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension TypeReferences
	@Inject extension ExampleNameProvider
	@Inject extension ImplicitSubject 
	@Inject extension SpecSyntheticNameClashResolver
	@Inject extension TypesFactory typesFactory
	@Inject SpecIgnoringXtendJvmModelInferrer xtendJvmModelInferrer
    @Inject IJvmModelAssociator modelAssociator
	
    var exampleIndex = 0
	var index = 0
	
    override doInfer(EObject object, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!(object instanceof JnarioFile))
			return;
		val jnarioFile = object as JnarioFile

		xtendJvmModelInferrer.infer(object, acceptor, preIndexingPhase)

		val doLater = <Runnable>newArrayList()
		for (declaration: jnarioFile.getXtendTypes().filter(ExampleGroup)) {
			acceptor.infer(declaration, null, doLater, preIndexingPhase)
		}
		exampleIndex = 0
		if (!preIndexingPhase) {
			for (Runnable runnable : doLater) {
				runnable.run();
			}
		}
	}
	
	def JvmGenericType infer(IJvmDeclaredTypeAcceptor acceptor, ExampleGroup exampleGroup, JvmGenericType superType, List<Runnable> doLater, boolean preIndexingPhase){
		if(superType != null){
			exampleGroup.^extends = superType.createTypeRef
		}else{
			exampleGroup.addSuperClass
		}
		val javaType = typesFactory.createJvmGenericType();
		setNameAndAssociate(exampleGroup.jnarioFile, exampleGroup, javaType);
		acceptor.accept(javaType);
		if (!preIndexingPhase) {
			doLater.add([|initialize(exampleGroup, javaType)]);
		}
		val children = <JvmGenericType>newArrayList
		exampleGroup.members.filter(ExampleGroup).forEach[child |
			children += infer(acceptor, child, javaType, doLater, preIndexingPhase) 
		]
		if(!children.empty){
			testRuntime.addChildren(exampleGroup, javaType, children.map[createTypeRef])
		}
		javaType
	}

	
	override initialize(JnarioClass source, JvmGenericType inferredJvmType) {
	    // TODO NO_XTEND consider call super.initialize(...) here

		inferredJvmType.setVisibility(JvmVisibility::PUBLIC);
		inferredJvmType.addAnnotations(source.annotations.filter[it?.annotationType != null])
		inferredJvmType.annotations += Named.annotationRef(source.describe)
//		addDefaultConstructor(source, inferredJvmType);
		if (source.getExtends() == null) {
			val typeRefToObject = getTypeForName(typeof(Object), source);
			if (typeRefToObject != null)
				inferredJvmType.getSuperTypes().add(typeRefToObject);
		} else {
			inferredJvmType.getSuperTypes().add(cloneWithProxies(source.getExtends()));
		}
		testRuntime.updateExampleGroup(source, inferredJvmType)
//		for (intf : source.getImplements()) {
//			inferredJvmType.getSuperTypes().add(cloneWithProxies(intf));
//		}
//		fixTypeParameters(inferredJvmType);
		exampleIndex = 0
		for (member : source.getMembers()) {
			transform(member, inferredJvmType);
		}

      inferredJvmType.addImplicitSubject(source as ExampleGroup)

// TODO NO_XTEND Not sure about this one
//		appendSyntheticDispatchMethods(source, inferredJvmType);
		copyDocumentationTo(source, inferredJvmType);
		
		resolveNameClashes(inferredJvmType);
	}
	 
	
	
//	def protected transform(JnarioMember sourceMember, JvmGenericType container, boolean allowDispatch) {
//	  if(sourceMember.eContainer instanceof AnonymousClass){
//	    super.transform(sourceMember, container, allowDispatch)
//	  }else{
//		  // we use transformExamples instead
//	  }
//	}
	
	def protected dispatch void transform(Example element, JvmGenericType container) {
		exampleIndex = exampleIndex + 1
		if(element.expression == null){
			element.expression = XbaseFactory::eINSTANCE.createXBlockExpression
		}
		val method = toMethod(element, container)
		testRuntime.markAsTestMethod(element, method)
		if(element.pending){
			testRuntime.markAsPending(element, method) 
		}
		method.annotations += Named.annotationRef(element.describe)
		method.annotations += Order.annotationRef => [
                explicitValues += createJvmIntAnnotationValue => [
                    values += exampleIndex
                ]
            ]
		container.members += method
        modelAssociator.associatePrimary(element, method);
	}
	
	def protected dispatch void transform(Before element, JvmGenericType container) {
		transformAround(element, container, 
			[e, m | testRuntime.beforeMethod(e, m)], 
			[e, m | testRuntime.beforeAllMethod(e, m)]
		)
	}
	
	def protected dispatch void  transform(After element, JvmGenericType container) {
		transformAround(element, container, 
			[e, m | testRuntime.afterMethod(e, m)], 
			[e, m | testRuntime.afterAllMethod(e, m)]
		)
	}
	
	def transformAround(TestFunction element, JvmGenericType container, 
		Procedure2<JnarioMember, JvmOperation> around, Procedure2<JnarioMember, JvmOperation> aroundAll){
		val afterMethod = element.toMethod(container)
		if(element.isStatic){
//			container.members += element.addIsExecutedField
			aroundAll.apply(element as JnarioMember, afterMethod)
		}else{
			around.apply(element, afterMethod)
		}
	    container.members += afterMethod
	}
	
//	def addIsExecutedField(TestFunction element){
//		element.toField("_" + element.toMethodName + "IsExecuted", getTypeForName(typeof(Boolean), element))[
//			setInitializer[
//				append(" false")
//			]
//			^static = true
//		]
//	}
    override protected dispatch void transform(JnarioMember source, JvmGenericType container) {
        
    }
	
	def toMethod(TestFunction element, JvmGenericType container){
		element.setReturnType(getTypeForName(Void::TYPE, element))
		
        val operation = typesFactory.createJvmOperation => [
            simpleName = element.toMethodName
            visibility = JvmVisibility.PUBLIC
            ^static = element.isStatic
            returnType = getTypeForName(Void::TYPE, element)
        ]

        setBody(operation, element.expression)

        operation.addAnnotations(element.annotations.filter[it?.annotationType != null])
        element.copyDocumentationTo(operation)

        container.members.add(operation)

		operation.exceptions += Exception.getTypeForName(element)
		operation
	}
	
	def void configureWith(JvmGenericType type, EObject source, JnarioFile spec){
		spec.eResource.contents += type
		type.packageName = spec.^package
		type.documentation = source.documentation
	}
	 
	def protected dispatch void transform(ExampleTable table, JvmGenericType specType){
		associateTableWithSpec(specType, table)
		table.jnarioFile.toClass(table.toJavaClassName)[exampleTableType |
			exampleTableType.superTypes += getTypeForName(typeof(ExampleTableRow), table)
			exampleTableType.configureWith(table, table.jnarioFile)
			
			val type = getTypeForName(typeof(org.jnario.lib.ExampleTable), table, exampleTableType.createTypeRef)
			
			val initMethodName = "_init" + table.toJavaClassName
			
			specType.members += table.toMethod(initMethodName, type)[
				setBody[ITreeAppendable a |
					declaringType = specType
					generateInitializationMethod(table, a)	
				]
			]
			
			specType.members += table.toField(table.toFieldName, type)[
				visibility = JvmVisibility::PROTECTED
				setInitializer[
					append(initMethodName).append("()")
				]
			]
			
			val constructor = table.toConstructor[simpleName=exampleTableType.simpleName]
			exampleTableType.members += constructor
			val assignments = <String>newArrayList()
			
			val stringType = getTypeForName(typeof(String), table)
			val listType = getTypeForName(typeof(List), table, stringType)
			val cellNames = typesFactory.createJvmFormalParameter();
			cellNames.name = "cellNames"
			cellNames.setParameterType(listType);
			constructor.parameters += cellNames
			assignments += "super(cellNames);"
			
			index = 0
			table.columns.forEach[column | 
				val columnType = if(column.type != null) column.type else inferredType
				
				exampleTableType.members += column.toField(column.name, columnType.cloneWithProxies)
				
				val param = column.toParameter(column.name, columnType.cloneWithProxies)
				constructor.parameters += param
				
				val getter = column.toGetter(column.name, columnType.cloneWithProxies)
				exampleTableType.members += getter
			
				assignments += "this." + column.name + " = " + column.name + ";" 
			]
			
			table.rows.forEach[
				cells.forEach[
					generateCellInitializerMethod(specType, table.initMethodName(index), it)
					index = index + 1
				]
			]
			 
			constructor.setBody[ITreeAppendable a |
				assignments.forEach[a.append(it).newLine]
			]
			
		]
	} 
	
	def void generateInitializationMethod(ExampleTable exampleTable, ITreeAppendable appendable){
		val arraysType = getTypeForName(typeof(Arrays), exampleTable).type
		appendable.append("return ExampleTable.create(\"" + exampleTable.toFieldName + "\", \n")
		appendable.append('  ').append(arraysType).append('.asList("').append(exampleTable.columnNames.join('", "') + '"), ')
		appendable.increaseIndentation()
		appendable.append("\n")
		index = 0
		for(row : exampleTable.rows){
		 	appendable.append("new ").append(exampleTable.toJavaClassName).append("(")
		 	appendable.append('  ').append(arraysType).append('.asList("' + row.cells.map[serialize.trim.convertToJavaString].join('", "') + '"), ')
		 	for(cell :row.cells){
		 		if(cell.expression instanceof XNullLiteral){
		 			appendable.append("null")
		 		}else{
			 		appendable.append(exampleTable.initMethodName(index) + "()")
		 		}
		 		index = index + 1
		 		if(row.cells.last != cell){
			 		appendable.append(", ")
		 		}
			}
	 		appendable.append(")")
			if(exampleTable.rows.last != row){
			 	appendable.append(",\n")
		 	}
		}
		appendable.decreaseIndentation()
		appendable.append("\n);")
	}
	
	def associateTableWithSpec(JvmGenericType type, ExampleTable table){
		for(row : table.rows){
			associate(row, type)
		}
	}
	
	def initMethodName(ExampleTable exampleTable, int i){
		"_init" + exampleTable.toJavaClassName + "Cell" + i 
	}
	
	def generateCellInitializerMethod(JvmGenericType specType, String name, ExampleCell cell){
		specType.members += cell.toMethod(name, inferredType)[
			declaringType = specType
			setBody(cell.expression)
		] 
	}

	def columnNames(ExampleTable exampleTable){
		exampleTable.columns.map[it?.name]
	}

	
}
