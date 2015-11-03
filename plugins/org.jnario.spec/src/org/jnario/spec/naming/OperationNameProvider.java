/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.naming;

import static com.google.common.base.Joiner.on;
import static com.google.common.collect.Iterables.transform;

import java.util.List;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Function;
import com.google.inject.Singleton;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class OperationNameProvider implements Function<JvmOperation, QualifiedName>{

	private final class Param2Name implements
			Function<JvmFormalParameter, String> {
		public String apply(JvmFormalParameter from) {
			JvmTypeReference type = from.getParameterType();
			if(type == null){
				return "void";
			}
			return type.getSimpleName();
		}
	}
	private Param2Name param2Name = new Param2Name();

	public QualifiedName apply(JvmOperation from) {
		StringBuilder sb = new StringBuilder();
		sb.append(from.getSimpleName());
		appendParameters(sb, from.getParameters());
		return QualifiedName.create(sb.toString());
	}

	private void appendParameters(StringBuilder sb,	List<JvmFormalParameter> parameters) {
		if(parameters.isEmpty()){
			return;
		}
		sb.append("(");
		sb.append(on(", ").join(transform(parameters, param2Name)));
		sb.append(")");
	}

}
