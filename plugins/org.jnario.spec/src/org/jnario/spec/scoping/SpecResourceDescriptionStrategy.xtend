/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.scoping

import com.google.common.collect.ImmutableMap
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceDescriptions.IContextAware
import org.jnario.scoping.JnarioResourceDescriptionStrategy
import org.jnario.spec.naming.OperationNameProvider
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.SpecPackage

import static java.lang.String.*
import static org.jnario.util.Nodes.textForFeature

class SpecResourceDescriptionStrategy extends JnarioResourceDescriptionStrategy {

	public static val ROOT_SPEC = "root"
	public static val TRUE = "1"
	public static val FALSE = "0"
	public static val EXAMPLE_TYPE = "type"
	public static val EXAMPLE_OPERATION = "operation"
	
	@Inject 
	OperationNameProvider operationNameProvider;

	override createUserData(EObject eObject, ImmutableMap.Builder<String, String> userData) {
		super.createUserData(eObject, userData);
		if (eObject instanceof ExampleGroup) {
			val exampleGroup = eObject as ExampleGroup
			userData.put(ROOT_SPEC, valueOf(exampleGroup.isRoot))
			userData.put(EXAMPLE_TYPE,getTargetName(exampleGroup))
			userData.put(EXAMPLE_OPERATION,getTargetOperation(exampleGroup))
		}
	}
	
	protected def String getTargetName(ExampleGroup exampleGroup) {
		return exampleGroup.retrieveNameFromNodeModel
	}
	
	protected def String getTargetOperation(ExampleGroup exampleGroup) {
		val targetOperation = exampleGroup.eGet(SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION,false) as JvmOperation
		if (targetOperation !== null && !targetOperation.eIsProxy) {
			return operationNameProvider.apply(targetOperation).toString
		}
		getTargetOperationFromNodeModel(exampleGroup);
	}
	
	protected def static String getTargetOperationFromNodeModel(ExampleGroup exampleGroup) {
		return textForFeature(exampleGroup, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION)
	}

	def isRoot(ExampleGroup exampleGroup) {
		if (!(exampleGroup.eContainer instanceof ExampleGroup)) {
			TRUE
		} else {
			FALSE
		}
	}

	static def String getTypeName(IEObjectDescription specDescription) {
		specDescription.getUserData(EXAMPLE_TYPE)
	}
	
    static def String getTargetOperation(IEObjectDescription specDescription) {
		specDescription.getUserData(EXAMPLE_OPERATION)
	}

	static def String getTypeName(IResourceDescriptions index, ExampleGroup exampleGroup) {
		val localizedIndex = index.getLocalizedIndex(exampleGroup)
		if (localizedIndex !== null) {
			val Iterable<IEObjectDescription> result = localizedIndex.getExportedObjectsByObject(exampleGroup)
			return result.map[typeName].head?:retrieveNameFromNodeModel(exampleGroup)
		}
		return retrieveNameFromNodeModel(exampleGroup)

	}
	static def QualifiedName getOperationName(IResourceDescriptions index, ExampleGroup exampleGroup) {
		val localizedIndex = index.getLocalizedIndex(exampleGroup)
		if (localizedIndex !== null) {
			val Iterable<IEObjectDescription> result = localizedIndex.getExportedObjectsByObject(exampleGroup)
			return QualifiedName.create(result.map[targetOperation].head?:getTargetOperationFromNodeModel(exampleGroup))
		}
		return QualifiedName.create(getTargetOperationFromNodeModel(exampleGroup))
	}
	
	private static def getLocalizedIndex(IResourceDescriptions index, EObject context) {
		if (index instanceof IContextAware) {
			// FIXME : Only for tests / non ui not sure why
			((index as IContextAware)).setContext(context)
		}
		return index.getResourceDescription(context.eResource().getURI())
	}

	def static private String retrieveNameFromNodeModel(ExampleGroup exampleGroup) {
		var String text = textForFeature(exampleGroup, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_TYPE)
		var int begin = Math.max(text.lastIndexOf(Character.valueOf('.').charValue),
			text.lastIndexOf(Character.valueOf('$').charValue)) + 1
		var int end = text.indexOf(Character.valueOf('<').charValue)
		if (end === -1) {
			end = text.length()
		}
		return text.substring(begin, end)
	}

}
