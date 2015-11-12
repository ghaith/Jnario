/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.isEmpty;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.jnario.JnarioFile;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz 
 */
public class FeatureQualifiedNameProvider extends XbaseQualifiedNameProvider {

	private StepNameProvider stepNameProvider;
	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	@Inject
	public FeatureQualifiedNameProvider(StepNameProvider stepNameProvider) {
		this.stepNameProvider = stepNameProvider;
	}
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Step) {
			return getStepName((Step) obj);
		}
		if(obj instanceof Scenario){
			return qualifiedNameFromName(obj, ((Scenario)obj).getName());
		}
		if (obj instanceof Feature) {
			return qualifiedNameFromName(obj, ((Feature)obj).getName());
		}
		else{
			return super.getFullyQualifiedName(obj);
		}
	}

	private QualifiedName qualifiedNameFromName(EObject obj, String typeName) {
		if (typeName == null)
			return null;
		String packageName = getPackageName(obj);
		if (packageName != null) {
			return getConverter().toQualifiedName(packageName).append(typeName);
		}
		return QualifiedName.create(typeName);
	}

	public QualifiedName getStepName(final Step step) {
		return cache.get(step, step.eResource(), new Provider<QualifiedName>() {
			public QualifiedName get() {
				String name = null;
				if (step instanceof StepReference) {
					name = stepNameProvider.nameOf((StepReference)step);
					name = stepNameProvider.removeKeywords(name);
				}else{
					name = step.getName();
				}
				if(isEmpty(name)){
					return null;
				}else{
					String formattedName = format(name);
					return toQualifiedName(step, formattedName);
				}
			}
		});
		
	}

	private QualifiedName toQualifiedName(EObject obj, String name) {
		String packageName = getPackageName(obj);
		if(isEmpty(packageName)){
			return QualifiedName.create(name);
		}
		List<String> segments = new LinkedList<String>();
		StringBuilder segment = new StringBuilder();
		for(int i = 0; i < packageName.length(); i++){
			char c = packageName.charAt(i);
			if(c == '.'){
				segments.add(segment.toString());
				segment = new StringBuilder();
			}else{
				segment.append(c);
			}
		}
		if(segment.length() > 0){
			segments.add(segment.toString());
		}
		segments.add(name);
		return QualifiedName.create(segments);
	}

	public String getPackageName(EObject obj) {
		JnarioFile file = getContainerOfType(obj, JnarioFile.class);
		return file.getPackage();
	}

	private String format(String name) {
		name = stepNameProvider.removeArguments(name);
		if(name.endsWith(".")){
			name = name.substring(0, name.length()-1);
		}
		return name;
	}
	
}
