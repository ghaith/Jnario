package org.jnario.ui.findrefs

import com.google.inject.Inject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.findReferences.ReferenceFinder
import org.eclipse.xtext.findReferences.TargetURIs
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry

class XtendReferenceFinder extends ReferenceFinder  {
	IQualifiedNameConverter nameConverter

	@Inject new(Registry serviceProviderRegistry, IQualifiedNameConverter nameConverter) {
		super(serviceProviderRegistry)
		this.nameConverter = nameConverter
	}
	
	override protected findReferencesInDescription(TargetURIs targetURIs, IResourceDescription resourceDescription, IResourceAccess resourceAccess, Acceptor acceptor, IProgressMonitor monitor) {
		// don't check local resources
		if (targetURIs.map[trimFragment].exists[it == resourceDescription.getURI])
			return;
		val names = newHashSet()
		targetURIs.forEach[uri |
			resourceAccess.readOnly(uri) [
				val obj = EcoreUtil2::getContainerOfType(it.getEObject(uri, true), typeof(JvmType))
				if (obj!=null) {
					names += nameConverter.toQualifiedName(obj.identifier.toLowerCase)
				}
			]
		val importedNames = resourceDescription.importedNames.map[toLowerCase].toSet
		if (names.exists[
			importedNames.contains(it)
		]) {
			resourceAccess.readOnly(resourceDescription.getURI) [
				findReferences(targetURIs, getResource(resourceDescription.URI, true), acceptor, monitor)
				return null
			]
		} 
			
		]
	}
}
