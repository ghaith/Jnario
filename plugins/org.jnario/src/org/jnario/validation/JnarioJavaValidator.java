/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.validation;

import static org.jnario.JnarioPackage.Literals.JNARIO_TYPE_DECLARATION__NAME;
import static org.jnario.jvmmodel.DoubleArrowSupport.isDoubleArrow;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.jnario.ExampleCell;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioClass;
import org.jnario.JnarioPackage;
import org.jnario.MockLiteral;
import org.jnario.ShouldThrow;
import org.jnario.compiler.JnarioExpressionHelper;
import org.jnario.jvmmodel.TestRuntimeProvider;
import org.jnario.runner.Named;
import org.jnario.util.MockingSupport;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class JnarioJavaValidator extends AbstractDeclarativeValidator {

	private static final String ILLEGAL_ASSERTION_EXPRESSION = "invalid type: expecting boolean";
	
	@Inject
	private JnarioExpressionHelper expressionHelper;
	
	@Inject 
	private TypeReferences typeReferences;
	
	@Inject
	private TestRuntimeProvider runtimeProvider;
	
	@Inject
	private IBatchTypeResolver typeResolver;
	
	@Check
	public void checkShouldThrow(ShouldThrow shouldThrow){
		if(expressionHelper.isLiteral(shouldThrow.getExpression())){
			error("Literals cannot throw exceptions", null);
		}
	}
	
	@Check
	public void checkClassPath(MockLiteral clazz) {
		if (typeReferences.findDeclaredType(MockingSupport.CLASS_NAME, clazz) == null) {
			error("If you want to use mocking, you need the mandatory library bundle 'org.mockito' 0.1.0 or higher on the classpath.", clazz,
					null, JnarioIssueCodes.JNARIO_LIB_NOT_ON_CLASSPATH);
		}
	}
	
	@Check
	public void checkClassPath(JnarioClass clazz) {
		if (typeReferences.findDeclaredType(Named.class, clazz) == null) {
			error("Mandatory library bundle 'org.jnario.lib' 0.1.0 or higher not found on the classpath.", clazz,
					JNARIO_TYPE_DECLARATION__NAME, JnarioIssueCodes.JNARIO_LIB_NOT_ON_CLASSPATH);
		}
		
		try {
			runtimeProvider.get(clazz);
		} catch (Exception e) {
			error(e.getMessage(), clazz,
					JNARIO_TYPE_DECLARATION__NAME, JnarioIssueCodes.JUNIT_NOT_ON_CLASSPATH);
		}
	}
	
	@Check
	public void checkTypesForShould(XBinaryOperation should){
		if(!isDoubleArrow(should)){
			return;
		}
	}

	@Override
	protected List<EPackage> getEPackages() {
		return Lists.<EPackage>newArrayList(JnarioPackage.eINSTANCE);
	}
	
	@Check
	public void checkExpressionsInTableDoNotReturnVoid(ExampleRow row){
		for (ExampleCell cell : row.getCells()) {
			LightweightTypeReference actualType = typeResolver.resolveTypes(cell).getActualType(cell.getExpression());
			if(actualType.isPrimitiveVoid()){
				error("Expression must not be void", cell, null, 0);
			}
		}
	}
	
	@Check
	public void checkExampleHeaderAndRowsHaveSameColumnNumber(ExampleTable exampleTable){
		if(!exampleTable.isValid()){
			error("Examples rows have to have the same number of columns", JnarioPackage.Literals.EXAMPLE_TABLE__NAME);
		}
	}
	
}
