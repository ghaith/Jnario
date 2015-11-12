package org.jnario.jvmmodel

import com.google.inject.Inject
import java.util.Collection
import java.util.List
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.jnario.Executable
import org.jnario.JnarioClass
import org.jnario.JnarioMember
import org.jnario.Specification
import org.jnario.runner.Contains
import org.jnario.runner.ExampleGroupRunner
import org.jnario.runner.FeatureRunner

class JUnit4RuntimeSupport implements TestRuntimeSupport {
	
	val static RUN_WITH = "org.junit.runner.RunWith"
	 
	@Inject extension JvmTypesBuilder 
	@Inject TypeReferences typeReferences
	
	override addChildren(Specification context, JvmGenericType parent, Collection<JvmTypeReference> children) {
		if(!children.empty){
			parent.annotations += context.toAnnotation(typeof(Contains), children);
		}
	}

	override afterAllMethod(JnarioMember after, JvmOperation operation) {
		operation.annotations += after.toAnnotation("org.junit.AfterClass")
	}
	
	override afterMethod(JnarioMember after, JvmOperation operation) {
		operation.annotations += after.toAnnotation("org.junit.After")
	}
	
	override beforeAllMethod(JnarioMember before, JvmOperation operation) {
		operation.annotations += before.toAnnotation("org.junit.BeforeClass")
	}
	
	override beforeMethod(JnarioMember before, JvmOperation operation) {
		operation.annotations += before.toAnnotation("org.junit.Before")
	}

	override markAsPending(Executable element, JvmOperation operation) {
		operation.annotations += element.toAnnotation("org.junit.Ignore")
	}

	override updateExampleGroup(JnarioClass exampleGroup, JvmGenericType inferredType) {
		inferredType.annotations += exampleGroup.toAnnotation(RUN_WITH, getTypeForName(ExampleGroupRunner, exampleGroup));
	}
	
	override markAsTestMethod(Executable element, JvmOperation operation) {
		operation.annotations += element.toAnnotation("org.junit.Test")
	}
	
	override updateFeature(JnarioClass feature, JvmGenericType inferredType, List<JvmTypeReference> scenarios) {
		inferredType.annotations += feature.toAnnotation(RUN_WITH, getTypeForName(FeatureRunner, feature));
	}
	
	override updateScenario(JnarioClass scenario, JvmGenericType inferredType) {
		inferredType.annotations += scenario.toAnnotation(RUN_WITH, getTypeForName(FeatureRunner, scenario));
	}

	override updateSuite(JnarioClass exampleGroup, JvmGenericType inferredType) {
		inferredType.annotations += exampleGroup.toAnnotation(RUN_WITH, getTypeForName(ExampleGroupRunner, exampleGroup));
	}

	def getTypeForName(Class<?> type, Notifier context) {
		val result = typeReferences.getTypeForName(type, context)
		if(result == null){
			throw new IllegalStateException("Jnario runtime could not be resolved: " + type.name)
		}
		result
	}

}