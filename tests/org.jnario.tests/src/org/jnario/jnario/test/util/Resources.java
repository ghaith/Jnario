/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;


import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.containers.DelegatingIAllContainerAdapter;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersState;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Resources {
	
	public static int nrOfParseAndLinkingErrors(Resource resource){
		link(resource);
		return resource.getErrors().size();
	}

	protected static void link(Resource resource) {
		addContainerStateAdapter(resource.getResourceSet());
		EcoreUtil.resolveAll(resource);
	}
	
	public static void hasNoParseAndLinkingErrors(Resource resource){
		link(resource);
		assertNoErrorsOrWarnings(resource);
	}

	public static void printErrors(Resource eResource) {
		for (Diagnostic error : eResource.getErrors()) {
			System.err.println(error.getLocation() + ": " + error.getMessage() + " in " + error.getLine());
		}
	}

	public static void printWarnings(Resource eResource) {
		for (Diagnostic warning : eResource.getWarnings()) {
			System.out.println(warning);
		}
	}

	public static void assertNoErrorsOrWarnings(Resource r) {
		EList<Diagnostic> errors = r.getErrors();
		EList<Diagnostic> warnings = r.getWarnings();
		Assert.assertTrue("Errors occured:\n" + Joiner.on("\n").join(errors), errors.isEmpty());
		Assert.assertTrue("Warnings occured:\n" + Joiner.on("\n").join(warnings), warnings.isEmpty());
	}

	public static ResourceSetBasedAllContainersState addContainerStateAdapter(final ResourceSet resourceSet) {
		clearExistingStateAdapters(resourceSet);
		ResourceSetBasedAllContainersState containersState = new ResourceSetBasedAllContainersState();
		String containerName = "all";
		HashMultimap<String, URI> newHashMultimap = HashMultimap.create();
		newHashMultimap.putAll(containerName, Iterables.transform(resourceSet.getResources(), new Function<Resource, URI>() {
			public URI apply(Resource from) {
				return resourceSet.getURIConverter().normalize(from.getURI());
			}
		}));
		containersState.configure(Collections.singletonList(containerName), newHashMultimap);
		resourceSet.eAdapters().add(new DelegatingIAllContainerAdapter(containersState));
		return containersState;
	}

	private static void clearExistingStateAdapters(final ResourceSet resourceSet) {
		Iterator<Adapter> existingAdapters = resourceSet.eAdapters().iterator();
		while (existingAdapters.hasNext()) {
			Adapter adapter = existingAdapters.next();
			if (adapter instanceof DelegatingIAllContainerAdapter) {
				existingAdapters.remove();
			}
		}
	}

	public static Resource fromString(URI uri, String content) {
		Resource resource = new ResourceSetImpl().getResource(uri, false);
		try {
			resource.load(new StringInputStream(content), Collections.emptyMap());
		} catch (IOException ex) {
			Assert.fail(ex.getMessage());
		}
		return resource;
	}

	public static <T extends EObject> T getRoot(Resource resource, final Class<T> type) {
		return type.cast(Iterables.find(resource.getContents(), new Predicate<EObject>() {

			public boolean apply(EObject input) {
				return type.isInstance(input);
			}
		}));
	}


	public static void removeNodes(Resource resource) {
		List<ICompositeNode> nodeAdapters = Lists.newArrayList();
		Iterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			EObject eObject = contents.next();
			Iterator<Adapter> adapters = eObject.eAdapters().iterator();
			while (adapters.hasNext()) {
				Adapter adapter = adapters.next();
				if (adapter instanceof ICompositeNode) {
					nodeAdapters.add((ICompositeNode) adapter);
				}
			}
		}
		for (ICompositeNode nodeAdapter : nodeAdapters) {
			nodeAdapter.getSemanticElement().eAdapters().remove(nodeAdapter);
		}
	}

	public static void checkForParseErrors(Resource resource) {
		String fileName = resource.getURI().lastSegment();
		Assert.assertTrue(fileName + ": " + Joiner.on("\n").join(resource.getErrors()), resource.getErrors().isEmpty());
	}
}