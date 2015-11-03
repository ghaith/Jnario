package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.util.XbaseUsageCrossReferencer
import org.jnario.JnarioField
import org.jnario.feature.feature.Step

class StepContextProvider {

	@Inject extension StepExpressionProvider 
	@Inject extension IJvmModelAssociations
	@Inject extension VisibleMembersCalculator

	def usedFields(Step step){
		val expr = expressionOf(step)
		step.allVisibleMembers.filter(JnarioField).filter[
			val field = it.jvmElements.filter(JvmField).iterator.next
			val usages = XbaseUsageCrossReferencer::find(field, newArrayList(expr))
			!usages.empty
		].toSet
	} 	
}