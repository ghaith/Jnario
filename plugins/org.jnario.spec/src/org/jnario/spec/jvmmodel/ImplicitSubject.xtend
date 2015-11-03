/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.jvmmodel

import com.google.inject.Inject
import java.util.Iterator
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XbasePackage
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.runner.Subject
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.TestFunction
import org.jnario.util.Nodes

import static org.eclipse.xtext.EcoreUtil2.*
import static org.jnario.spec.jvmmodel.Constants.*

import static extension com.google.common.collect.Iterables.*
import static extension com.google.common.collect.Iterators.*
import org.jnario.JnarioFunction

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class ImplicitSubject {
	
	@Inject extension ExtendedJvmTypesBuilder

	def void addImplicitSubject(JvmGenericType type, ExampleGroup exampleGroup){
		val targetType = exampleGroup.resolveTargetType()
		if(targetType == null || targetType.eIsProxy()) return;
		if(type.hasSubject()) return;
		if(exampleGroup.neverUsesSubject()) return;
		
		type.members.add(0, exampleGroup.toField(SUBJECT_FIELD_NAME, targetType)[
			if(exampleGroup.doesNotInitializeSubject){
				annotations += exampleGroup.toAnnotation(Subject)
			}
			visibility = JvmVisibility::PUBLIC
		])
	}
	
	def JvmTypeReference resolveTargetType(ExampleGroup exampleGroup){
		if(exampleGroup.targetType != null){
			return exampleGroup.targetType.cloneWithProxies
		}
		val parentGroup = exampleGroup.parent
		if(parentGroup == null){
			return null
		}
		return resolveTargetType(parentGroup)
	}
	
	
	def parent(ExampleGroup exampleGroup){
		getContainerOfType(exampleGroup.eContainer, typeof(ExampleGroup))
	}
	
	def boolean hasSubject(JvmGenericType type){
		val fields = type.members.filter(typeof(JvmField))
		val subjectField = fields.findFirst[simpleName == SUBJECT_FIELD_NAME]
		if(subjectField != null){
			return true
		}
		val extendedClass = type.extendedClass?.type
		if(extendedClass == null){
			return false
		}
		return hasSubject(extendedClass as JvmGenericType)		
	}
	
	def neverUsesSubject(ExampleGroup exampleGroup){
		var Iterator<XAbstractFeatureCall> allFeatureCalls = emptyIterator
		val members = exampleGroup.members
		for(example : members.filter(typeof(JnarioFunction)) + members.filter(typeof(TestFunction))){
			allFeatureCalls = concat(allFeatureCalls, example.eAllContents.filter(typeof(XAbstractFeatureCall)))
		}
		return null == allFeatureCalls.findFirst[it.concreteSyntaxFeatureName == SUBJECT_FIELD_NAME]
	}
	
	def doesNotInitializeSubject(ExampleGroup exampleGroup){
		var Iterator<XAssignment> allAssignments = emptyIterator
		val members = exampleGroup.members
		for(example : members.filter(typeof(JnarioFunction)) + members.filter(typeof(TestFunction))){
			allAssignments = concat(allAssignments, example.eAllContents.filter(typeof(XAssignment)))
		}
		return null == allAssignments.findFirst[
			val assignable = Nodes::textForFeature(it, XbasePackage::eINSTANCE.XAbstractFeatureCall_Feature)
			return assignable == SUBJECT_FIELD_NAME
		]
	}
	
}