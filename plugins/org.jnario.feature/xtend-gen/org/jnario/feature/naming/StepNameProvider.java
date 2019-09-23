/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.naming;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.jnario.JnarioPackage;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.naming.ArgumentsHelper;
import org.jnario.util.Nodes;
import org.jnario.util.Strings;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
@SuppressWarnings("all")
public class StepNameProvider {
  protected String _nameOf(final Step step) {
    String _xblockexpression = null;
    {
      if ((Objects.equal(step, null) || Objects.equal(step.getName(), null))) {
        return null;
      }
      _xblockexpression = Nodes.textForFeature(step, JnarioPackage.eINSTANCE.getJnarioTypeDeclaration_Name());
    }
    return _xblockexpression;
  }
  
  protected String _nameOf(final StepReference ref) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(ref, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      _xifexpression = Nodes.textForFeature(ref, FeaturePackage.eINSTANCE.getStepReference_Reference());
    }
    return _xifexpression;
  }
  
  public String getMethodName(final Step step) {
    String originalName = Strings.firstLine(this.nameOf(step)).trim();
    return Strings.toMethodName(originalName);
  }
  
  public String describe(final Feature feature) {
    return Strings.makeJunitConform(feature.getName());
  }
  
  public String describe(final Scenario scenario) {
    return Strings.makeJunitConform(scenario.getName());
  }
  
  public String describe(final Step step) {
    String _nameOf = this.nameOf(step);
    StringBuilder name = new StringBuilder(_nameOf);
    boolean _isPending = step.isPending();
    if (_isPending) {
      Strings.markAsPending(name);
    }
    return Strings.makeJunitConform(Strings.firstLine(name.toString()));
  }
  
  public String removeKeywords(final String name) {
    boolean _isNullOrEmpty = com.google.common.base.Strings.isNullOrEmpty(name);
    if (_isNullOrEmpty) {
      return "";
    }
    int index = name.indexOf(" ");
    if ((index == (-1))) {
      return "";
    }
    return name.substring((index + 1));
  }
  
  public String removeArguments(final String text) {
    String _xblockexpression = null;
    {
      String name = Strings.firstLine(text);
      _xblockexpression = ArgumentsHelper.removeArgumentValues(name).trim();
    }
    return _xblockexpression;
  }
  
  public String nameOf(final Step ref) {
    if (ref instanceof StepReference) {
      return _nameOf((StepReference)ref);
    } else if (ref != null) {
      return _nameOf(ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref).toString());
    }
  }
}
