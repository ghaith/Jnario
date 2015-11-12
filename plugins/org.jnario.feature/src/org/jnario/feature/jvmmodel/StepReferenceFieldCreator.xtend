/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.jnario.JnarioClass
import org.jnario.JnarioField
import org.jnario.JnarioMember
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.StepReference
import org.jnario.util.SourceAdapter

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class StepReferenceFieldCreator {

	@Inject extension VisibleMembersCalculator
	@Inject extension ExpressionCopier

	def copyJnarioMemberForReferences(Scenario scenario){
		val refs = scenario.steps.filter(typeof(StepReference)).filter[reference?.expression != null]
		val fieldNames = scenario.existingFieldNamesForContainerOfStepReference
		for(ref: refs){
			val members = ref.reference.allVisibleMembers
			scenario.copyFields(members, fieldNames)					
		}
   	}
   	
   	def private getExistingFieldNamesForContainerOfStepReference(Scenario scenario){
   		scenario.allVisibleMembers.existingFieldNames
   	}
   	
   	def private getExistingFieldNames(Iterable<JnarioMember> members){
   		members.filter(typeof(JnarioField)).filter[it != null].map[name].toSet
   	}
   	
   	def private void copyFields(EObject objectWithReference, Iterable<JnarioMember> members, Set<String> fieldNames){
   		if(!(objectWithReference instanceof JnarioClass)){
   			return
   		}
   		val type = objectWithReference as JnarioClass
   		val newFields = <JnarioField>newArrayList
   		for(field: members.filter(typeof(JnarioField))){
			if(!fieldNames.contains(field.name)){
				val copiedMember = cloneWithProxies(field)
				SourceAdapter::adapt(copiedMember, field);
				newFields += copiedMember as JnarioField
				fieldNames += field.name
			}
		}
		type.members.addAll(newFields)
   	}
}