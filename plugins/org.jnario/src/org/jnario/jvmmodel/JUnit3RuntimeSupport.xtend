package org.jnario.jvmmodel

import com.google.inject.Inject
import java.util.Collection
import java.util.List
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.jnario.Executable
import org.jnario.JnarioClass
import org.jnario.JnarioFunction
import org.jnario.JnarioMember
import org.jnario.Specification

class JUnit3RuntimeSupport implements TestRuntimeSupport {
	
	@Inject extension TypeReferences
	@Inject extension JnarioNameProvider 
	@Inject extension ExtendedJvmTypesBuilder
	
	override afterAllMethod(JnarioMember before, JvmOperation operation) {
		// implement me
	}
	
	override afterMethod(JnarioMember before, JvmOperation operation) {
		// implement me
	}
	
	override beforeAllMethod(JnarioMember before, JvmOperation operation) {
		// implement me
	}
	
	override beforeMethod(JnarioMember before, JvmOperation operation) {
		// implement me
	}
	
	override markAsPending(Executable element, JvmOperation operation) {
		// implement me
	}
	
	override addChildren(Specification context, JvmGenericType parent, Collection<JvmTypeReference> children) {
		if(context.eClass.name == "Suite"){
			parent.addSuite(context, children.map[simpleName], emptyList)
		}
	}
	
	override updateExampleGroup(JnarioClass exampleGroup, JvmGenericType inferredType) {
		makeTestCase(exampleGroup, inferredType)
		inferredType.addTestCase(exampleGroup)
		inferredType.addSuite(exampleGroup, exampleGroup.children, exampleGroup.examples)
		generateSetup("setUp", exampleGroup, inferredType, exampleGroup.befores)
		generateSetup("tearDown", exampleGroup, inferredType, exampleGroup.afters)
	}
	
	def generateSetup(String methodName, JnarioClass exampleGroup, JvmGenericType type, Iterable<JnarioFunction> executables) {
		val voidType = getTypeForName(Void::TYPE, exampleGroup)
		type.members += exampleGroup.toMethod(methodName, voidType)[
			visibility = JvmVisibility::PUBLIC
			exceptions += getTypeForName(typeof(Exception), exampleGroup)
			setBody[it|
				append('''
					super.«methodName»();
					«FOR executable : executables»
					«executable.toMethodName»();
					«ENDFOR»
				''')
			]
		]
	}
	
	def private befores(JnarioClass exampleGroup){
		exampleGroup.members.filter(typeof(JnarioFunction)).filter[eClass.name == "Before"]
	}

	def private afters(JnarioClass exampleGroup){
		exampleGroup.members.filter(typeof(JnarioFunction)).filter[eClass.name == "After"]
	}
		
	def private addSuite(JvmGenericType it, JnarioClass context, Iterable<String> children, Iterable<Executable> tests){
		val testType = getTypeForName("junit.framework.Test", context)
		members += context.toMethod("suite", testType)[
			^static = true
			setBody[it|
				append('''
					org.jnario.junit3.JnarioTestSuite suite = new org.jnario.junit3.JnarioTestSuite("«context.describe»");
					«FOR test : tests»
					suite.addTest(new «context.toJavaClassName»("«test.testName»"));
					«ENDFOR»
					«FOR child : children»
					suite.addTest(«child».suite());
					«ENDFOR»
					return suite;
				''')
			]
		]
	}
	
	def private makeTestCase(JnarioClass exampleGroup, JvmGenericType inferredType){
		val stringType = getTypeForName("java.lang.String", exampleGroup)
		inferredType.members += exampleGroup.toField("__name", stringType)

		inferredType.members += exampleGroup.toConstructor[
			parameters += exampleGroup.toParameter("name", stringType)
			setBody[it|
				append('''
					setName(name);
					this.__name = name;''')
			]
		]
		inferredType.members += exampleGroup.toMethod("getName", stringType)[
			setBody[it|
				append('''
					return org.jnario.runner.NameProvider.create().nameOf(getClass(), __name);''')
			]
		]
	}
	
	def addTestCase(JvmGenericType inferredType, JnarioClass context) {
		if(inferredType.superTypes.empty){
			inferredType.superTypes += getTypeForName("junit.framework.TestCase", context)
		}else if(inferredType.superTypes.get(0).simpleName == "Object"){
			inferredType.superTypes.set(0, getTypeForName("junit.framework.TestCase", context))
		}
	}

	
	def private children(JnarioClass exampleGroup){
		exampleGroup.members.filter(typeof(Specification)).map[toJavaClassName]
	}

	def private examples(JnarioClass exampleGroup){
		exampleGroup.members.filter(typeof(Executable)).filter[!(it instanceof Specification)]
	}

	override markAsTestMethod(Executable element, JvmOperation operation) {
		operation.setSimpleName(element.testName)
	}
	
	def private testName(Executable e){
		"test" + toMethodName(e)
	}
	
	override updateFeature(JnarioClass feature, JvmGenericType inferredType, List<JvmTypeReference> scenarios) {
		inferredType.addTestCase(feature)
		inferredType.addSuite(feature, scenarios.map[simpleName], emptyList)
	}
	
	override updateScenario(JnarioClass scenario, JvmGenericType inferredType) {
		val testType = getTypeForName("junit.framework.Test", scenario)
		val tests = scenario.examples
		
		inferredType.members += scenario.toMethod("suite", testType)[
			^static = true
			setBody[it|
				append('''
					org.jnario.junit3.JnarioTestSuite suite = new org.jnario.junit3.JnarioTestSuite("«scenario.describe»");
					«scenario.toJavaClassName» scenario = new «scenario.toJavaClassName»(
					new org.jnario.junit3.TestQueue(
					«FOR test : tests SEPARATOR ', '»"«test.testName»"«ENDFOR»));
					«FOR test : tests»
					suite.addTest(new org.jnario.junit3.DelegatingTestCase("«test.describe»", scenario));
					«ENDFOR»
					return suite;
				''')
			]
			
		]
		
		val queueType = getTypeForName("org.jnario.junit3.TestQueue", scenario)
		inferredType.members += scenario.toField("testQueue", queueType);
		inferredType.members += scenario.toConstructor[
			parameters += scenario.toParameter("testQueue", queueType)
			setBody[it|
				append('''
					setName(testQueue.next());
					this.testQueue = testQueue;''')
			]
		]
		
		val voidType = getTypeForName(Void::TYPE, scenario)
		inferredType.members += scenario.toMethod("setUp", voidType)[
			visibility = JvmVisibility::PUBLIC
			exceptions += getTypeForName(typeof(Exception), scenario)
			setBody[it|
				append('''
					if(testQueue.isRunning()){
						return;
					}
					super.«"setUp"»();''')
			]
		]
		
		inferredType.members += scenario.toMethod("tearDown", voidType)[
			visibility = JvmVisibility::PUBLIC
			exceptions += getTypeForName(typeof(Exception), scenario)
			setBody[it|
				append('''
					if(testQueue.isDone()){
						super.«"tearDown"»();
					}else{
						setName(testQueue.next());
					}
				''')
			]
		]
	}

	override updateSuite(JnarioClass exampleGroup, JvmGenericType inferredType) {
		// implement me
	}
	
}