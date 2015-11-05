package org.jnario.jnario.tests.unit.report;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.jnario.test.util.Strings;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("SpecResultParser")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecResultParserSpec {
  @Subject
  public SpecResultParser subject;
  
  final static String CLASSNAME = "demo.CalculatorSpec";
  
  final static String NAME = "adding values";
  
  final static double EXECUTION_TIME = 0.01;
  
  final static String FAILURE_MESSAGE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a message");
      _builder.newLine();
      _builder.append("withnewline");
      
      String _platformIndependent = Strings.platformIndependent(_builder.toString());
      return _platformIndependent;
    }
  }.apply();
  
  final static String FAILURE_TYPE = "java.lang.AssertionError";
  
  final static String STACKTRACE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
      _builder.newLine();
      _builder.append("at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)");
      _builder.newLine();
      _builder.append("at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)");
      _builder.newLine();
      _builder.append("at java.lang.reflect.Constructor.newInstance(Constructor.java:513)");
      _builder.newLine();
      
      String _platformIndependent = Strings.platformIndependent(
        _builder.toString());
      return _platformIndependent;
    }
  }.apply();
  
  final static String XML_STACKTRACE = ((SpecResultParserSpec.FAILURE_MESSAGE + "\n") + SpecResultParserSpec.STACKTRACE);
  
  @Test
  @Named("parses successfull specs from xml")
  @Order(1)
  public void _parsesSuccessfullSpecsFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"");
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _plus_4 = (_plus_3 + SpecResultParserSpec.NAME);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\"/>");
    _builder_3.newLine();
    
    String _plus_5 = (_plus_4 + _builder_3.toString());
    String _xml = this.toXml(_plus_5);
    Passed _passingSpec = this.passingSpec();
    this.parse(_xml, _passingSpec);
  }
  
  @Test
  @Named("parses specs with failure from xml")
  @Order(2)
  public void _parsesSpecsWithFailureFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"");
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _plus_4 = (_plus_3 + SpecResultParserSpec.NAME);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\">");
    _builder_3.newLine();
    _builder_3.append("		   <failure message=\"");
    
    String _plus_5 = (_plus_4 + _builder_3.toString());
    String _plus_6 = (_plus_5 + SpecResultParserSpec.FAILURE_MESSAGE);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("\" type=\"");
    
    String _plus_7 = (_plus_6 + _builder_4.toString());
    String _plus_8 = (_plus_7 + SpecResultParserSpec.FAILURE_TYPE);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\">");
    
    String _plus_9 = (_plus_8 + _builder_5.toString());
    String _plus_10 = (_plus_9 + SpecResultParserSpec.XML_STACKTRACE);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("</failure>");
    _builder_6.newLine();
    _builder_6.append("		   </testcase>");
    _builder_6.newLine();
    
    String _plus_11 = (_plus_10 + _builder_6.toString());
    String _xml = this.toXml(_plus_11);
    Failed _failingSpec = this.failingSpec();
    this.parse(_xml, _failingSpec);
  }
  
  @Test
  @Named("parses specs with error from xml")
  @Order(3)
  public void _parsesSpecsWithErrorFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"");
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _plus_4 = (_plus_3 + SpecResultParserSpec.NAME);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\">");
    _builder_3.newLine();
    _builder_3.append("		   <error message=\"");
    
    String _plus_5 = (_plus_4 + _builder_3.toString());
    String _plus_6 = (_plus_5 + SpecResultParserSpec.FAILURE_MESSAGE);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("\" type=\"");
    
    String _plus_7 = (_plus_6 + _builder_4.toString());
    String _plus_8 = (_plus_7 + SpecResultParserSpec.FAILURE_TYPE);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\">");
    
    String _plus_9 = (_plus_8 + _builder_5.toString());
    String _plus_10 = (_plus_9 + SpecResultParserSpec.XML_STACKTRACE);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("</error>");
    _builder_6.newLine();
    _builder_6.append("		   </testcase>");
    _builder_6.newLine();
    
    String _plus_11 = (_plus_10 + _builder_6.toString());
    String _xml = this.toXml(_plus_11);
    Failed _failingSpec = this.failingSpec();
    this.parse(_xml, _failingSpec);
  }
  
  @Test
  @Named("parses multiple spec results")
  @Order(4)
  public void _parsesMultipleSpecResults() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"");
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _plus_4 = (_plus_3 + SpecResultParserSpec.NAME);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\"/>");
    _builder_3.newLine();
    _builder_3.append("		   <testcase time=\"");
    
    String _plus_5 = (_plus_4 + _builder_3.toString());
    String _plus_6 = (_plus_5 + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("\" classname=\"");
    
    String _plus_7 = (_plus_6 + _builder_4.toString());
    String _plus_8 = (_plus_7 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\" name=\"");
    
    String _plus_9 = (_plus_8 + _builder_5.toString());
    String _plus_10 = (_plus_9 + SpecResultParserSpec.NAME);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("\">");
    _builder_6.newLine();
    _builder_6.append("		   <error message=\"");
    
    String _plus_11 = (_plus_10 + _builder_6.toString());
    String _plus_12 = (_plus_11 + SpecResultParserSpec.FAILURE_MESSAGE);
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append("\" type=\"");
    
    String _plus_13 = (_plus_12 + _builder_7.toString());
    String _plus_14 = (_plus_13 + SpecResultParserSpec.FAILURE_TYPE);
    StringConcatenation _builder_8 = new StringConcatenation();
    _builder_8.append("\">");
    
    String _plus_15 = (_plus_14 + _builder_8.toString());
    String _plus_16 = (_plus_15 + SpecResultParserSpec.XML_STACKTRACE);
    StringConcatenation _builder_9 = new StringConcatenation();
    _builder_9.append("</error>");
    _builder_9.newLine();
    _builder_9.append("		   </testcase>");
    _builder_9.newLine();
    
    String _plus_17 = (_plus_16 + _builder_9.toString());
    String _xml = this.toXml(_plus_17);
    Passed _passingSpec = this.passingSpec();
    Failed _failingSpec = this.failingSpec();
    this.parse(_xml, _passingSpec, _failingSpec);
  }
  
  @Test
  @Named("created pending results")
  @Order(5)
  public void _createdPendingResults() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"");
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _plus_4 = (_plus_3 + SpecResultParserSpec.NAME);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\">");
    _builder_3.newLine();
    _builder_3.append("		    <skipped/>");
    _builder_3.newLine();
    _builder_3.append("		   </testcase>");
    _builder_3.newLine();
    
    String _plus_5 = (_plus_4 + _builder_3.toString());
    String _xml = this.toXml(_plus_5);
    Pending _pendingSpec = this.pendingSpec();
    this.parse(_xml, _pendingSpec);
  }
  
  @Test
  @Named("decodes escaped strings")
  @Order(6)
  public void _decodesEscapedStrings() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"When I entered \\&quot;50\\&quot; and \\&quot;70\\&quot;\"/>");
    _builder_2.newLine();
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _xml = this.toXml(_plus_3);
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "When I entered \"50\" and \"70\"", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  @Test
  @Named("removes \\\',\\\' from escaped strings")
  @Order(7)
  public void _removesFromEscapedStrings() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"cell[-1\u002C 1].plus[cell[3\u002C4]] =&gt; cell[2\u002C5]\"/>");
    _builder_2.newLine();
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _xml = this.toXml(_plus_3);
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "cell[-1, 1].plus[cell[3,4]] => cell[2,5]", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  @Test
  @Named("supports encoding")
  @Order(8)
  public void _supportsEncoding() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"L\u00D6sung\"/>");
    _builder_2.newLine();
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _xml = this.toXml(_plus_3);
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "L\u00D6sung", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  @Test
  @Named("supports escaped chars")
  @Order(9)
  public void _supportsEscapedChars() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    
    String _plus = (_builder.toString() + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" classname=\"");
    
    String _plus_1 = (_plus + _builder_1.toString());
    String _plus_2 = (_plus_1 + SpecResultParserSpec.CLASSNAME);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\" name=\"\\&quot;http:\\/\\/www.google.de\\&quot;\"/>");
    _builder_2.newLine();
    
    String _plus_3 = (_plus_2 + _builder_2.toString());
    String _xml = this.toXml(_plus_3);
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "\"http://www.google.de\"", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  public Passed passingSpec() {
    return new Passed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
  }
  
  public Pending pendingSpec() {
    return new Pending(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
  }
  
  public Failed failingSpec() {
    SpecFailure _specFailure = new SpecFailure(SpecResultParserSpec.FAILURE_MESSAGE, "java.lang.AssertionError", SpecResultParserSpec.STACKTRACE);
    ArrayList<SpecFailure> _newArrayList = CollectionLiterals.<SpecFailure>newArrayList(_specFailure);
    return new Failed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME, _newArrayList);
  }
  
  public String toXml(@Extension final CharSequence content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">");
    _builder.newLine();
    _builder.append("");
    _builder.append(content);
    _builder.append("");
    _builder.newLine();
    _builder.append("</testsuite>	");
    _builder.newLine();
    
    return _builder.toString();
  }
  
  public void parse(@Extension final CharSequence content, @Extension final SpecExecution... expected) {
    final Iterator<SpecExecution> i = ((List<SpecExecution>)Conversions.doWrapArray(expected)).iterator();
    String _string = content.toString();
    StringInputStream _stringInputStream = new StringInputStream(_string);
    final SpecExecutionAcceptor _function = new SpecExecutionAcceptor() {
      @Override
      public void accept(final SpecExecution it) {
        boolean _hasNext = i.hasNext();
        boolean _doubleArrow = Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_hasNext), true);
        Assert.assertTrue("\nExpected i.hasNext => true but"
         + "\n     i.hasNext is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_hasNext)).toString()
         + "\n     i is " + new org.hamcrest.StringDescription().appendValue(i).toString() + "\n", _doubleArrow);
        
        SpecExecution _next = i.next();
        String _string = _next.toString();
        String _string_1 = it.toString();
        org.junit.Assert.assertEquals(_string, _string_1);
      }
    };
    this.subject.parse(_stringInputStream, _function);
  }
}
