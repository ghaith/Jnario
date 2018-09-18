package org.jnario.spec.tests.unit.spec;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.jvmmodel.SpecExecutableProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("SpecExecutableProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecExecutableProviderSpec {
  @Subject
  public SpecExecutableProvider subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Test
  @Named("returns all examples")
  @Order(1)
  public void _returnsAllExamples() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 2\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    List<Executable> _executables = this.executables(this._modelStore.exampleGroup("Something"));
    List<Example> _list = JnarioCollectionLiterals.<Example>list(this._modelStore.example("fact 1"), this._modelStore.example("fact 2"));
    Assert.assertTrue("\nExpected exampleGroup(\"Something\").executables => list(example(\"fact 1\"), example(\"fact 2\")) but"
     + "\n     exampleGroup(\"Something\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     exampleGroup(\"Something\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("Something")).toString()
     + "\n     list(example(\"fact 1\"), example(\"fact 2\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     example(\"fact 1\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.example("fact 1")).toString()
     + "\n     example(\"fact 2\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.example("fact 2")).toString() + "\n", Should.operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns all sub example groups")
  @Order(2)
  public void _returnsAllSubExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 1\"{}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 2\"{}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    List<Executable> _executables = this.executables(this._modelStore.exampleGroup("Something"));
    List<ExampleGroup> _list = JnarioCollectionLiterals.<ExampleGroup>list(this._modelStore.exampleGroup("exampleGroup 1"), this._modelStore.exampleGroup("exampleGroup 2"));
    Assert.assertTrue("\nExpected exampleGroup(\"Something\").executables => list(exampleGroup(\"exampleGroup 1\"), exampleGroup(\"exampleGroup 2\")) but"
     + "\n     exampleGroup(\"Something\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     exampleGroup(\"Something\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("Something")).toString()
     + "\n     list(exampleGroup(\"exampleGroup 1\"), exampleGroup(\"exampleGroup 2\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     exampleGroup(\"exampleGroup 1\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("exampleGroup 1")).toString()
     + "\n     exampleGroup(\"exampleGroup 2\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("exampleGroup 2")).toString() + "\n", Should.operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns all facts in sub example groups")
  @Order(3)
  public void _returnsAllFactsInSubExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 1\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact \"fact 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 2\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact \"fact 2\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    Set<Executable> _set = IterableExtensions.<Executable>toSet(this.executables(this._modelStore.exampleGroup("Something")));
    Set<Executable> _set_1 = JnarioCollectionLiterals.<Executable>set(this._modelStore.exampleGroup("exampleGroup 1"), this._modelStore.example("fact 1"), this._modelStore.exampleGroup("exampleGroup 2"), this._modelStore.example("fact 2"));
    Assert.assertTrue("\nExpected exampleGroup(\"Something\").executables.toSet => <Executable>set(exampleGroup(\"exampleGroup 1\"), example(\"fact 1\"), exampleGroup(\"exampleGroup 2\"), example(\"fact 2\")) but"
     + "\n     exampleGroup(\"Something\").executables.toSet is " + new org.hamcrest.StringDescription().appendValue(_set).toString()
     + "\n     exampleGroup(\"Something\").executables is " + new org.hamcrest.StringDescription().appendValue(this.executables(this._modelStore.exampleGroup("Something"))).toString()
     + "\n     exampleGroup(\"Something\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("Something")).toString()
     + "\n     <Executable>set(exampleGroup(\"exampleGroup 1\"), example(\"fact 1\"), exampleGroup(\"exampleGroup 2\"), example(\"fact 2\")) is " + new org.hamcrest.StringDescription().appendValue(_set_1).toString()
     + "\n     exampleGroup(\"exampleGroup 1\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("exampleGroup 1")).toString()
     + "\n     example(\"fact 1\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.example("fact 1")).toString()
     + "\n     exampleGroup(\"exampleGroup 2\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.exampleGroup("exampleGroup 2")).toString()
     + "\n     example(\"fact 2\") is " + new org.hamcrest.StringDescription().appendValue(this._modelStore.example("fact 2")).toString() + "\n", Should.operator_doubleArrow(_set, _set_1));
    
  }
  
  public List<Executable> executables(@Extension final Executable spec) {
    return this.subject.getExecutables(spec);
  }
}
