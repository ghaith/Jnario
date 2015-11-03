/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If a class is annotated with {@link CreateWith}, the {@link ExampleGroupRunner} will 
 * use the given {@link SpecCreator} to instantiate the feature, spec and subject. 
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CreateWith {

	Class<? extends SpecCreator> value();
}
