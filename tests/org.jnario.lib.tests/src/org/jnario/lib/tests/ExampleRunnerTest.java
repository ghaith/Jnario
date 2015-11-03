/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.lib.tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.ExampleRunner;
import org.jnario.runner.NameProvider;
import org.jnario.runner.SimpleSpecCreator;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExampleRunnerTest {
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleBaseClass{
		
		@Test
		public void test() throws Exception{
		}
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleDerivedClass extends ExampleBaseClass{
		
		@Test
		public void test2() throws Exception{
		}
		
	}
	
	@Test
	public void shouldInstantiateTheDerivedClassForAnInheritedTestMethod() throws Exception {
		TestClass testClass = new TestClass(ExampleDerivedClass.class);
		List<FrameworkMethod> annotatedMethods = testClass.getAnnotatedMethods(Test.class);
		for(FrameworkMethod method: annotatedMethods) {
			ExampleRunner exampleRunner = new ExampleRunner(ExampleDerivedClass.class, method, new NameProvider(), new SimpleSpecCreator());
			Description desiredDescription = Description.createTestDescription(ExampleDerivedClass.class, method.getName());
			assertThat(exampleRunner.getDescription().getDisplayName(), is(desiredDescription.getDisplayName()));
		}
	}

}
