package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.JnarioMember;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;

@SuppressWarnings("all")
public class VisibleMembersCalculator {
  public Iterable<JnarioMember> allVisibleMembers(final Step step) {
    Iterable<JnarioMember> _xblockexpression = null;
    {
      final Scenario scenario = EcoreUtil2.<Scenario>getContainerOfType(step, Scenario.class);
      boolean _equals = Objects.equal(scenario, null);
      if (_equals) {
        return CollectionLiterals.<JnarioMember>emptyList();
      }
      _xblockexpression = this.allVisibleMembers(scenario);
    }
    return _xblockexpression;
  }
  
  public Iterable<JnarioMember> allVisibleMembers(final Scenario scenario) {
    EList<JnarioMember> members = scenario.getMembers();
    if ((scenario instanceof Background)) {
      return members;
    }
    final Feature feature = EcoreUtil2.<Feature>getContainerOfType(scenario, Feature.class);
    Background _background = feature.getBackground();
    boolean _equals = Objects.equal(_background, null);
    if (_equals) {
      return members;
    }
    EList<JnarioMember> _members = feature.getBackground().getMembers();
    return Iterables.<JnarioMember>concat(members, _members);
  }
}
