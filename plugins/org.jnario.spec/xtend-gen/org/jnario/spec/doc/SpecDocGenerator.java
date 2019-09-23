/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleTable;
import org.jnario.JnarioClass;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.Filter;
import org.jnario.doc.FilterExtractor;
import org.jnario.doc.FilteringResult;
import org.jnario.doc.HtmlFile;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecDocGenerator extends AbstractDocGenerator {
  @Inject
  @Extension
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  @Extension
  private FilterExtractor _filterExtractor;
  
  @Override
  public HtmlFile createHtmlFile(final JnarioClass xtendClass) {
    HtmlFile _xblockexpression = null;
    {
      if ((!(xtendClass instanceof ExampleGroup))) {
        return HtmlFile.EMPTY_FILE;
      }
      final ExampleGroup exampleGroup = ((ExampleGroup) xtendClass);
      final Procedure1<HtmlFile> _function = (HtmlFile it) -> {
        it.setName(this._exampleNameProvider.toJavaClassName(exampleGroup));
        it.setTitle(this.asTitle(exampleGroup));
        it.setContent(this.generateContent(exampleGroup));
        it.setRootFolder(this.root(exampleGroup));
        it.setSourceCode(this.pre(xtendClass.eContainer(), "lang-spec"));
        it.setFileName(this.fileName(xtendClass));
        it.setExecutionStatus(this.executionStateClass(exampleGroup));
      };
      _xblockexpression = HtmlFile.newHtmlFile(_function);
    }
    return _xblockexpression;
  }
  
  private CharSequence generateContent(final ExampleGroup exampleGroup) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc);
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, 1);
    _builder.append(_generateMembers);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private StringConcatenation generateMembers(final ExampleGroup exampleGroup, final int level) {
    final StringConcatenation result = new StringConcatenation();
    boolean inList = false;
    final Function1<JnarioMember, Boolean> _function = (JnarioMember it) -> {
      return Boolean.valueOf((((it instanceof Example) || (it instanceof ExampleGroup)) || (it instanceof ExampleTable)));
    };
    final Iterable<JnarioMember> members = IterableExtensions.<JnarioMember>filter(exampleGroup.getMembers(), _function);
    for (final JnarioMember member : members) {
      {
        final boolean isExampleGroup = (member instanceof ExampleGroup);
        if ((inList && (!isExampleGroup))) {
          result.append("<li>");
          result.append(this.generate(member, level));
          result.append("</li>");
        } else {
          if (((!inList) && (!isExampleGroup))) {
            result.append("<ul>");
            result.append("<li>");
            result.append(this.generate(member, level));
            result.append("</li>");
            inList = true;
          } else {
            if ((inList && isExampleGroup)) {
              result.append("</ul>");
              result.append(this.generate(member, level));
              inList = false;
            } else {
              if (((!inList) && isExampleGroup)) {
                result.append(this.generate(member, level));
              }
            }
          }
        }
      }
    }
    if (inList) {
      result.append("</ul>");
    }
    return result;
  }
  
  private CharSequence generateDoc(final EObject eObject) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _documentation = this.documentation(eObject);
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        String _markdown2Html = this.markdown2Html(this.documentation(eObject));
        _builder.append(_markdown2Html);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final JnarioMember member, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final Example example, final int level) {
    CharSequence _xblockexpression = null;
    {
      String docString = this.documentation(example);
      List<Filter> filters = CollectionLiterals.<Filter>emptyList();
      boolean _notEquals = (!Objects.equal(docString, null));
      if (_notEquals) {
        final FilteringResult filterResult = this._filterExtractor.apply(docString);
        filters = filterResult.getFilters();
        docString = filterResult.getString();
        docString = this.markdown2Html(docString);
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        String _name = example.getName();
        boolean _notEquals_1 = (!Objects.equal(_name, null));
        if (_notEquals_1) {
          _builder.append("<p");
          String _id = this.id(example.getName());
          _builder.append(_id);
          _builder.append(" class=\"example ");
          String _executionStateClass = this.executionStateClass(example);
          _builder.append(_executionStateClass);
          _builder.append("\"><strong>");
          String _decode = this.decode(this._exampleNameProvider.describe(example));
          _builder.append(_decode);
          _builder.append("</strong></p>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append(docString);
      _builder.newLineIfNotEmpty();
      {
        if (((!example.isPending()) && example.eIsSet(JnarioPackage.Literals.JNARIO_FUNCTION__EXPRESSION))) {
          CharSequence _codeBlock = this.toCodeBlock(example, filters);
          _builder.append(_codeBlock);
          _builder.newLineIfNotEmpty();
        }
      }
      String _errorMessage = this.errorMessage(example);
      _builder.append(_errorMessage);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence toCodeBlock(final Example example, final List<Filter> filters) {
    CharSequence _xblockexpression = null;
    {
      String prefix = "<pre class=\"prettyprint lang-spec linenums\">";
      prefix = this.apply(filters, prefix);
      final String code = this.serialize(example.getExpression(), filters);
      int _length = code.length();
      boolean _equals = (_length == 0);
      if (_equals) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(prefix);
      _builder.newLineIfNotEmpty();
      _builder.append(code);
      _builder.append("</pre>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final ExampleTable table, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p");
    String _id = this.id(this._exampleNameProvider.toFieldName(table));
    _builder.append(_id);
    _builder.append("><strong>");
    String _title = this.toTitle(this._exampleNameProvider.toFieldName(table));
    _builder.append(_title);
    _builder.append("</strong></p>");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(table);
    _builder.append(_generateDoc);
    _builder.newLineIfNotEmpty();
    CharSequence _generate = super.generate(table);
    _builder.append(_generate);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final ExampleGroup exampleGroup, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((level > 1)) {
        _builder.append("<div class=\"level\">");
        _builder.newLine();
      }
    }
    _builder.append("<h");
    String _header = this.header(exampleGroup, level);
    _builder.append(_header);
    _builder.append(" class=\"exampleGroup ");
    String _executionStateClass = this.executionStateClass(exampleGroup);
    _builder.append(_executionStateClass);
    _builder.append("\" ");
    String _id = this.id(this._exampleNameProvider.describe(exampleGroup));
    _builder.append(_id);
    _builder.append(">");
    String _asTitle = this.asTitle(exampleGroup);
    _builder.append(_asTitle);
    _builder.append("</h");
    String _header_1 = this.header(exampleGroup, level);
    _builder.append(_header_1);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc);
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, (level + 1));
    _builder.append(_generateMembers);
    _builder.newLineIfNotEmpty();
    {
      if ((level > 1)) {
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private String header(final ExampleGroup exampleGroup, final int level) {
    String _xifexpression = null;
    if ((level <= 1)) {
      _xifexpression = "3";
    } else {
      String _xifexpression_1 = null;
      if ((level == 2)) {
        _xifexpression_1 = "4";
      } else {
        _xifexpression_1 = "5";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected String _asTitle(final ExampleGroup exampleGroup) {
    return this.toTitle(this._exampleNameProvider.describe(exampleGroup));
  }
  
  protected String _asTitle(final Example example) {
    return this.toTitle(this._exampleNameProvider.describe(example));
  }
  
  public CharSequence generate(final JnarioMember exampleGroup, final int level) {
    if (exampleGroup instanceof ExampleGroup) {
      return _generate((ExampleGroup)exampleGroup, level);
    } else if (exampleGroup instanceof Example) {
      return _generate((Example)exampleGroup, level);
    } else if (exampleGroup instanceof ExampleTable) {
      return _generate((ExampleTable)exampleGroup, level);
    } else if (exampleGroup != null) {
      return _generate(exampleGroup, level);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exampleGroup, level).toString());
    }
  }
  
  public String asTitle(final EObject exampleGroup) {
    if (exampleGroup instanceof ExampleGroup) {
      return _asTitle((ExampleGroup)exampleGroup);
    } else if (exampleGroup instanceof Example) {
      return _asTitle((Example)exampleGroup);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exampleGroup).toString());
    }
  }
}
