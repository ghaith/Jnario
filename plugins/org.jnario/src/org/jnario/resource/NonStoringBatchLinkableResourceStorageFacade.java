package org.jnario.resource;

import org.eclipse.xtext.resource.persistence.StorageAwareResource;
import org.eclipse.xtext.xbase.resource.BatchLinkableResourceStorageFacade;

/**
 * disables the storage feature of the new {@link StorageAwareResource}
 * this is due to a missing NodeModel if the resource was loaded from storage
 * TODO NO_XTEND: This is meant as a temp solution. A real solution should remove the references to NodeModelUtils
 * (e.g. The suites will now fail to load the spec's type name if there is no symentic model attached to the resource)
 * see org.jnario.spec.naming.ExampleNameProvider#resolveProxyTypeName
 */
public class NonStoringBatchLinkableResourceStorageFacade extends BatchLinkableResourceStorageFacade {
	@Override
	public boolean shouldLoadFromStorage(StorageAwareResource resource) {
		return false;
	}
}
