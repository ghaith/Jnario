package org.jnario.report;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;
import org.jnario.report.SpecResultTags;
import org.jnario.util.Strings;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@SuppressWarnings("all")
public class SpecResultParser extends DefaultHandler {
  private double currentExecutionTime;
  
  private String currentClassName;
  
  private String currentName;
  
  private SpecExecutionAcceptor acceptor;
  
  private String currentFailureType;
  
  private StringBuilder currentFailureStacktrace = new StringBuilder();
  
  private boolean isPending = false;
  
  private List<SpecFailure> failures;
  
  public void parse(final InputStream stream, final SpecExecutionAcceptor acceptor) {
    try {
      this.acceptor = acceptor;
      final SAXParserFactory factory = SAXParserFactory.newInstance();
      final SAXParser saxParser = factory.newSAXParser();
      saxParser.parse(stream, this);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException {
    boolean _matched = false;
    if (Objects.equal(qName, SpecResultTags.NODE_TESTCASE)) {
      _matched=true;
      this.currentClassName = this.convertValue(attributes, SpecResultTags.ATTR_CLASSNAME);
      this.currentName = this.convertValue(attributes, SpecResultTags.ATTR_NAME);
      this.currentExecutionTime = this.readTime(attributes);
      this.failures = CollectionLiterals.<SpecFailure>newArrayList();
    }
    if (!_matched) {
      if (Objects.equal(qName, SpecResultTags.NODE_ERROR)) {
        _matched=true;
        this.saveFailureAttributes(attributes);
      }
    }
    if (!_matched) {
      if (Objects.equal(qName, SpecResultTags.NODE_FAILURE)) {
        _matched=true;
        this.saveFailureAttributes(attributes);
        StringBuilder _stringBuilder = new StringBuilder();
        this.currentFailureStacktrace = _stringBuilder;
      }
    }
    if (!_matched) {
      if (Objects.equal(qName, SpecResultTags.NODE_SKIPPED)) {
        _matched=true;
        this.isPending = true;
      }
    }
  }
  
  public String saveFailureAttributes(final Attributes attributes) {
    return this.currentFailureType = this.convertValue(attributes, SpecResultTags.ATTR_TYPE);
  }
  
  @Override
  public void endElement(final String uri, final String localName, final String qName) throws SAXException {
    boolean _matched = false;
    if (Objects.equal(qName, SpecResultTags.NODE_TESTCASE)) {
      _matched=true;
      this.acceptor.accept(this.newSpecExecution());
      this.currentClassName = null;
      this.currentName = null;
      this.currentExecutionTime = 0.0;
    }
    if (!_matched) {
      if (Objects.equal(qName, SpecResultTags.NODE_ERROR)) {
        _matched=true;
        this.addFailure();
      }
    }
    if (!_matched) {
      if (Objects.equal(qName, SpecResultTags.NODE_FAILURE)) {
        _matched=true;
        this.addFailure();
      }
    }
  }
  
  public StringBuilder addFailure() {
    StringBuilder _xblockexpression = null;
    {
      final String stacktrace = this.currentFailureStacktrace.toString();
      final Pair<String, String> errorMessage = this.extractMessage(stacktrace);
      String _key = errorMessage.getKey();
      String _value = errorMessage.getValue();
      SpecFailure _specFailure = new SpecFailure(_key, 
        this.currentFailureType, _value);
      this.failures.add(_specFailure);
      this.currentFailureType = null;
      StringBuilder _stringBuilder = new StringBuilder();
      _xblockexpression = this.currentFailureStacktrace = _stringBuilder;
    }
    return _xblockexpression;
  }
  
  private Pair<String, String> extractMessage(final String messageAndStacktrace) {
    Pair<String, String> _xblockexpression = null;
    {
      final int end = messageAndStacktrace.indexOf("\tat ");
      String message = "";
      String stacktrace = "";
      if ((end > (-1))) {
        message = messageAndStacktrace.substring(0, (end - 1));
        stacktrace = messageAndStacktrace.substring(end, messageAndStacktrace.length());
      }
      message = this.cleanUp(message.trim());
      String _cleanUp = this.cleanUp(stacktrace);
      _xblockexpression = Pair.<String, String>of(message, _cleanUp);
    }
    return _xblockexpression;
  }
  
  private String cleanUp(final String s) {
    return s.replaceAll("\n\t", "\n");
  }
  
  @Override
  public void characters(final char[] ch, final int start, final int length) throws SAXException {
    this.currentFailureStacktrace.append(String.valueOf(ch, start, length));
  }
  
  public SpecExecution newSpecExecution() {
    SpecExecution _xifexpression = null;
    if (this.isPending) {
      _xifexpression = new Pending(this.currentClassName, this.currentName, this.currentExecutionTime);
    } else {
      SpecExecution _xifexpression_1 = null;
      boolean _isEmpty = this.failures.isEmpty();
      if (_isEmpty) {
        _xifexpression_1 = new Passed(this.currentClassName, this.currentName, this.currentExecutionTime);
      } else {
        _xifexpression_1 = new Failed(this.currentClassName, this.currentName, this.currentExecutionTime, this.failures);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private double readTime(final Attributes attributes) {
    final String timeString = this.convertValue(attributes, SpecResultTags.ATTR_TIME);
    boolean _notEquals = (!Objects.equal(timeString, null));
    if (_notEquals) {
      try {
        return Double.parseDouble(timeString);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return 0.0;
  }
  
  public String convertValue(final Attributes attributes, final String key) {
    String _xblockexpression = null;
    {
      final String value = attributes.getValue(key).replace("\\/", "/");
      _xblockexpression = Strings.convertFromJavaString(value, true);
    }
    return _xblockexpression;
  }
}
