/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.scoping.SpecResourceDescriptionStrategy;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.suite.scoping.SuiteSpecFilter;
import org.jnario.suite.suite.SuitePackage;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("SuiteSpecFilter")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteSpecFilterSpec {
  @Subject
  public SuiteSpecFilter subject;
  
  @Extension
  @org.jnario.runner.Extension
  public SuitePackage _suitePackage = SuitePackage.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  public SpecPackage _specPackage = SpecPackage.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  public FeaturePackage _featurePackage = FeaturePackage.eINSTANCE;
  
  @Test
  @Named("Suites pass")
  @Order(1)
  public void _suitesPass() throws Exception {
    boolean _apply = this.subject.apply(this.desc(this._suitePackage.getSuite()));
    Assert.assertTrue("\nExpected subject.apply(desc(suite)) => true but"
     + "\n     subject.apply(desc(suite)) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     desc(suite) is " + new org.hamcrest.StringDescription().appendValue(this.desc(this._suitePackage.getSuite())).toString()
     + "\n     suite is " + new org.hamcrest.StringDescription().appendValue(this._suitePackage.getSuite()).toString() + "\n", Should.operator_doubleArrow(Boolean.valueOf(_apply), Boolean.valueOf(true)));
    
  }
  
  @Test
  @Named("Features pass")
  @Order(2)
  public void _featuresPass() throws Exception {
    boolean _apply = this.subject.apply(this.desc(this._featurePackage.getFeature()));
    Assert.assertTrue("\nExpected subject.apply(desc(feature)) => true but"
     + "\n     subject.apply(desc(feature)) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     desc(feature) is " + new org.hamcrest.StringDescription().appendValue(this.desc(this._featurePackage.getFeature())).toString()
     + "\n     feature is " + new org.hamcrest.StringDescription().appendValue(this._featurePackage.getFeature()).toString() + "\n", Should.operator_doubleArrow(Boolean.valueOf(_apply), Boolean.valueOf(true)));
    
  }
  
  @Test
  @Named("Root Specs pass")
  @Order(3)
  public void _rootSpecsPass() throws Exception {
    boolean _apply = this.subject.apply(this.rootSpec());
    Assert.assertTrue("\nExpected subject.apply(rootSpec) => true but"
     + "\n     subject.apply(rootSpec) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     rootSpec is " + new org.hamcrest.StringDescription().appendValue(this.rootSpec()).toString() + "\n", Should.operator_doubleArrow(Boolean.valueOf(_apply), Boolean.valueOf(true)));
    
  }
  
  @Test
  @Named("Child Specs fail")
  @Order(4)
  public void _childSpecsFail() throws Exception {
    boolean _apply = this.subject.apply(this.childSpec());
    Assert.assertTrue("\nExpected subject.apply(childSpec) => false but"
     + "\n     subject.apply(childSpec) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     childSpec is " + new org.hamcrest.StringDescription().appendValue(this.childSpec()).toString() + "\n", Should.operator_doubleArrow(Boolean.valueOf(_apply), Boolean.valueOf(false)));
    
  }
  
  public IEObjectDescription desc(@Extension final EClass type) {
    return EObjectDescription.create("name", Suites.suite("mySuite"));
  }
  
  public IEObjectDescription rootSpec() {
    return this.spec(SpecResourceDescriptionStrategy.TRUE);
  }
  
  public IEObjectDescription childSpec() {
    return this.spec(SpecResourceDescriptionStrategy.FALSE);
  }
  
  public IEObjectDescription spec(@Extension final String value) {
    IEObjectDescription _xblockexpression = null;
    {
      final ExampleGroup spec = Specs.exampleGroup("name");
      Pair<String, String> _mappedTo = Pair.<String, String>of(SpecResourceDescriptionStrategy.ROOT_SPEC, value);
      _xblockexpression = EObjectDescription.create("name", spec, JnarioCollectionLiterals.<String, String>map(_mappedTo));
    }
    return _xblockexpression;
  }
}
