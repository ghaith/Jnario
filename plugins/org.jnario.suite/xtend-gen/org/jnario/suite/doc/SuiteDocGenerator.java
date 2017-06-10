/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jnario.JnarioClass;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.Specification;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.HtmlFileBuilder;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;
import org.jnario.util.Strings;
import org.jnario.util.XtendTypes;

@SuppressWarnings("all")
public class SuiteDocGenerator extends AbstractDocGenerator {
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  @Extension
  private SpecResolver _specResolver;
  
  @Inject
  @Extension
  private HtmlFileBuilder _htmlFileBuilder;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa, final Executable2ResultMapping spec2ResultMapping) {
    this.initResultMapping(spec2ResultMapping);
    final Consumer<SuiteFile> _function = new Consumer<SuiteFile>() {
      @Override
      public void accept(final SuiteFile it) {
        final HtmlFile htmlFile = SuiteDocGenerator.this.createHtmlFile(it);
        SuiteDocGenerator.this._htmlFileBuilder.generate(IterableExtensions.<JnarioTypeDeclaration>head(it.getXtendTypes()), fsa, htmlFile);
      }
    };
    Iterables.<SuiteFile>filter(input.getContents(), SuiteFile.class).forEach(_function);
  }
  
  public HtmlFile createHtmlFile(final SuiteFile file) {
    HtmlFile _xblockexpression = null;
    {
      final Iterable<Suite> suites = Iterables.<Suite>filter(file.getXtendTypes(), Suite.class);
      boolean _isEmpty = IterableExtensions.isEmpty(suites);
      if (_isEmpty) {
        return HtmlFile.EMPTY_FILE;
      }
      final Suite rootSuite = IterableExtensions.<Suite>head(suites);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        @Override
        public void apply(final HtmlFile it) {
          it.setName(SuiteDocGenerator.this._suiteClassNameProvider.toJavaClassName(rootSuite));
          it.setTitle(SuiteDocGenerator.this.decode(SuiteDocGenerator.this._suiteClassNameProvider.describe(rootSuite)));
          it.setContent(SuiteDocGenerator.this.generateContent(suites));
          it.setRootFolder(SuiteDocGenerator.this.root(rootSuite));
          it.setSourceCode(SuiteDocGenerator.this.pre(file, "lang-suite"));
          it.setFileName(SuiteDocGenerator.this.fileName(file));
          it.setExecutionStatus(SuiteDocGenerator.this.executionStateClass(rootSuite));
        }
      };
      _xblockexpression = HtmlFile.newHtmlFile(_function);
    }
    return _xblockexpression;
  }
  
  @Override
  public HtmlFile createHtmlFile(final JnarioClass file) {
    HtmlFile _xblockexpression = null;
    {
      final Suite suite = ((Suite) file);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        @Override
        public void apply(final HtmlFile it) {
          it.setName(SuiteDocGenerator.this._suiteClassNameProvider.toJavaClassName(suite));
          it.setTitle(SuiteDocGenerator.this.decode(SuiteDocGenerator.this._suiteClassNameProvider.describe(suite)));
          it.setContent(SuiteDocGenerator.this.generateContent(suite));
          it.setRootFolder(SuiteDocGenerator.this.root(suite));
          it.setSourceCode(SuiteDocGenerator.this.pre(file, "lang-suite"));
          it.setFileName(SuiteDocGenerator.this.fileName(file));
          it.setExecutionStatus(SuiteDocGenerator.this.executionStateClass(suite));
        }
      };
      _xblockexpression = HtmlFile.newHtmlFile(_function);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateContent(final Iterable<Suite> suites) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Suite suite : suites) {
        {
          Suite _head = IterableExtensions.<Suite>head(suites);
          boolean _equals = Objects.equal(suite, _head);
          boolean _not = (!_equals);
          if (_not) {
            CharSequence _title = this.title(suite);
            _builder.append(_title);
            _builder.newLineIfNotEmpty();
          }
        }
        CharSequence _generateContent = this.generateContent(suite);
        _builder.append(_generateContent);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence title(final Suite suite) {
    StringConcatenation _builder = new StringConcatenation();
    final String title = Strings.firstLine(suite.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("<span");
    String _id = this.id(title);
    _builder.append(_id);
    _builder.append(" class=\"suite ");
    String _executionStateClass = this.executionStateClass(suite);
    _builder.append(_executionStateClass);
    _builder.append("\">");
    String _markdown2Html = this.markdown2Html(title);
    _builder.append(_markdown2Html);
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String desc(final Suite suite) {
    return this.markdown2Html(Strings.trimFirstLine(suite.getName()));
  }
  
  public CharSequence generateContent(final Suite suite) {
    StringConcatenation _builder = new StringConcatenation();
    String _desc = this.desc(suite);
    _builder.append(_desc);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = suite.getElements().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("<ul>");
        _builder.newLine();
        {
          EList<Reference> _elements = suite.getElements();
          for(final Reference spec : _elements) {
            _builder.append("\t");
            CharSequence _generate = this.generate(spec);
            _builder.append(_generate, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</ul>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generate(final Reference ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Specification> _resolveSpecs = this._specResolver.resolveSpecs(ref);
      for(final Specification spec : _resolveSpecs) {
        _builder.append("<li><a class=\"specref ");
        String _executionStateClass = this.executionStateClass(spec);
        _builder.append(_executionStateClass);
        _builder.append("\" href=\"");
        String _linkTo = this.linkTo(ref, spec);
        _builder.append(_linkTo);
        _builder.append("\">");
        String _describe = this._suiteClassNameProvider.describe(spec);
        _builder.append(_describe);
        _builder.append("</a>");
        String _executionState = this.executionState(spec);
        _builder.append(_executionState);
        String _text = this.text(ref);
        _builder.append(_text);
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String linkTo(final EObject context, final Specification spec) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      String _packageName = XtendTypes.packageName(spec);
      boolean _equals = Objects.equal(_packageName, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        _xifexpression = XtendTypes.packageName(spec).replace(".", "/");
      }
      final String path = _xifexpression;
      String _root = this.root(context);
      String _plus = (_root + path);
      String _plus_1 = (_plus + "/");
      String _htmlFileName = this.htmlFileName(this._suiteClassNameProvider.toJavaClassName(spec));
      _xblockexpression = (_plus_1 + _htmlFileName);
    }
    return _xblockexpression;
  }
  
  public String text(final Reference ref) {
    boolean _matched = false;
    if (ref instanceof SpecReference) {
      String _text = ((SpecReference)ref).getText();
      String _trim = null;
      if (_text!=null) {
        _trim=_text.trim();
      }
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_trim);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _matched=true;
        String result = this.markdown2Html(((SpecReference)ref).getText());
        int _length = result.length();
        int _minus = (_length - 4);
        result = result.substring(3, _minus);
        return (": " + result);
      }
    }
    return "";
  }
}
