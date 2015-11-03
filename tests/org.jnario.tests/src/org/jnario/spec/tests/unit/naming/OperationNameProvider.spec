/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.naming

import com.google.inject.Inject
import java.util.Map
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.spec.naming.OperationNameProvider
import org.junit.Before
import org.eclipse.xtext.common.types.access.impl.TypeResourceServices

@CreateWith(typeof(SpecTestCreator))
describe OperationNameProvider{
	
	@Inject OperationNameProvider subject
	
	@Inject TypeResourceServices services
	
	@Inject	ClasspathTypeProviderFactory typeProviderFactory = new ClasspathTypeProviderFactory(getClass().classLoader, services)
	
	Map<String, JvmOperation> operations
	
	@Inject extension ModelStore 
	
	@Before
	def void setup(){
		val typeProvider = typeProviderFactory.createTypeProvider
		val type = typeProvider.findTypeByName(typeof(OperationNamesExample).name) as JvmGenericType
		val jvmOperations = type.members.filter(typeof(JvmOperation))
		operations = jvmOperations.toMap[simpleName]
	}
	
	describe "should name methods similar to JavaDoc links"{
		fact nameOf("simpleOperation") => "simpleOperation"
		fact nameOf("operationWithSingleArgument") => "operationWithSingleArgument(String)"
		fact nameOf("operationWithMultipleArguments") => "operationWithMultipleArguments(String, Object, int)"
		fact nameOf("operationWithTypedArguments") => "operationWithTypedArguments(List<String>, List<? extends String>)"
		fact nameOf("operationWithVarArg") => "operationWithVarArg(String[])"
	}
	
	def String nameOf(String operationName){
		val op = operations.get(operationName)
		subject.apply(op).toString
	}
	
}