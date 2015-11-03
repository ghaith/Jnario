package org.jnario.feature.jvmmodel

import org.jnario.JnarioMember
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step

import static org.eclipse.xtext.EcoreUtil2.*

class VisibleMembersCalculator {
	
	def allVisibleMembers(Step step){
   		val scenario = getContainerOfType(step, typeof(Scenario))
		if(scenario == null){
			return <JnarioMember>emptyList
		}
		allVisibleMembers(scenario)
   	}

	def allVisibleMembers(Scenario scenario) {
		var members = scenario.members
		if(scenario instanceof Background){
			return members
		}
		val feature = getContainerOfType(scenario, typeof(Feature))
		if(feature.background == null){
			return members
		}
		return members + feature.background.members
	}
	
}