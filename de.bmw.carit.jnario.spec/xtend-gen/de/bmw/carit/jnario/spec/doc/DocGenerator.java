package de.bmw.carit.jnario.spec.doc;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.ExampleColumn;
import de.bmw.carit.jnario.common.ExampleRow;
import de.bmw.carit.jnario.common.ExampleTable;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.spec.doc.DocOutputConfigurationProvider;
import de.bmw.carit.jnario.spec.doc.WhiteSpaceNormalizer;
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import de.bmw.carit.jnario.spec.util.Strings;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;
import org.pegdown.PegDownProcessor;

@SuppressWarnings("all")
public class DocGenerator implements IGenerator {
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private ISerializer _iSerializer;
  
  @Inject
  private WhiteSpaceNormalizer _whiteSpaceNormalizer;
  
  @Inject
  private PegDownProcessor _pegDownProcessor;
  
  private List<String> cssFiles = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("bootstrap.min.css", "bootstrap-responsive.min.css", "custom.css", "prettify.css");
      return _newArrayList;
    }
  }.apply();
  
  private List<String> jsFiles = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("lang-xtend.js", "prettify.js");
      return _newArrayList;
    }
  }.apply();
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
      this.copy(fsa, "css", this.cssFiles);
      this.copy(fsa, "js", this.jsFiles);
      EList<EObject> _contents = input.getContents();
      Iterable<SpecFile> _filter = IterableExtensions.<SpecFile>filter(_contents, de.bmw.carit.jnario.spec.spec.SpecFile.class);
      for (final SpecFile spec : _filter) {
        {
          XtendClass _xtendClass = spec.getXtendClass();
          final ExampleGroup exampleGroup = ((ExampleGroup) _xtendClass);
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(exampleGroup, null);
          if (_operator_notEquals) {
            String _fileName = this.fileName(exampleGroup);
            CharSequence _generate = this.generate(exampleGroup);
            fsa.generateFile(_fileName, DocOutputConfigurationProvider.DOC_OUTPUT, _generate);
          }
        }
      }
  }
  
  public String fileName(final ExampleGroup exampleGroup) {
      String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleGroup);
      String _operator_plus = StringExtensions.operator_plus("/", _javaClassName);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".html");
      final String fileName = _operator_plus_1;
      String _packageName = exampleGroup.getPackageName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_packageName, null);
      if (_operator_equals) {
        return fileName;
      }
      String _packageName_1 = exampleGroup.getPackageName();
      String _replaceAll = _packageName_1.replaceAll("\\.", "/");
      String _operator_plus_2 = StringExtensions.operator_plus("/", _replaceAll);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, fileName);
      return _operator_plus_3;
  }
  
  public void copy(final IFileSystemAccess fsa, final String targetFolder, final Iterable<String> files) {
    for (final String file : files) {
      String _operator_plus = StringExtensions.operator_plus("/", targetFolder);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "/");
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, file);
      String _load = this.load(file);
      fsa.generateFile(_operator_plus_2, DocOutputConfigurationProvider.DOC_OUTPUT, _load);
    }
  }
  
  public String load(final String file) {
      Class<? extends Object> _class = this.getClass();
      InputStream _resourceAsStream = _class.getResourceAsStream(file);
      final InputStream inputStream = _resourceAsStream;
      String _convertStreamToString = Strings.convertStreamToString(inputStream);
      return _convertStreamToString;
  }
  
  public String folder(final String name, final ExampleGroup context) {
    String _root = this.root(context);
    String _operator_plus = StringExtensions.operator_plus(_root, name);
    return _operator_plus;
  }
  
  public String root(final ExampleGroup exampleGroup) {
      SpecFile _containerOfType = EcoreUtil2.<SpecFile>getContainerOfType(exampleGroup, de.bmw.carit.jnario.spec.spec.SpecFile.class);
      final SpecFile specFile = _containerOfType;
      XtendClass _xtendClass = specFile.getXtendClass();
      String _packageName = _xtendClass.getPackageName();
      final String packageName = _packageName;
      boolean _operator_equals = ObjectExtensions.operator_equals(packageName, null);
      if (_operator_equals) {
        return "";
      }
      String[] _split = packageName.split("\\.");
      final String[] fragments = _split;
      final String[] _typeConverted_fragments = (String[])fragments;
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String s) {
            return "../";
          }
        };
      List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_typeConverted_fragments)), _function);
      final List<String> path = _map;
      String _join = IterableExtensions.join(path, "");
      return _join;
  }
  
  public CharSequence generate(final ExampleGroup exampleGroup) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("<title>");
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    _builder.append(_describe, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("<meta name=\"description\" content=\"\">");
    _builder.newLine();
    _builder.append("<meta name=\"author\" content=\"Jnario\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->");
    _builder.newLine();
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le styles -->");
    _builder.newLine();
    {
      for(final String cssFile : this.cssFiles) {
        _builder.append("<link rel=\"stylesheet\" href=\"");
        String _folder = this.folder("css", exampleGroup);
        _builder.append(_folder, "");
        _builder.append("/");
        _builder.append(cssFile, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final String jsFile : this.jsFiles) {
        _builder.append("<script type=\"text/javascript\" src=\"");
        String _folder_1 = this.folder("js", exampleGroup);
        _builder.append(_folder_1, "");
        _builder.append("/");
        _builder.append(jsFile, "");
        _builder.append("\"></script>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body onload=\"prettyPrint()\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"content\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"page-header\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<h1>");
    String _describe_1 = this._exampleNameProvider.describe(exampleGroup);
    _builder.append(_describe_1, "				");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<div class=\"span6\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "					");
    _builder.newLineIfNotEmpty();
    {
      EList<XtendMember> _members = exampleGroup.getMembers();
      for(final XtendMember member : _members) {
        CharSequence _generate = this.generate(member, 1);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div> <!-- /content -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<footer>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>Generated by Jnario.</p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</footer>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- /container -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDoc(final EObject eObject) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _documentation = this._extendedJvmTypesBuilder.getDocumentation(eObject);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_documentation, null);
      if (_operator_notEquals) {
        String _documentation_1 = this._extendedJvmTypesBuilder.getDocumentation(eObject);
        String _markdownToHtml = this._pegDownProcessor.markdownToHtml(_documentation_1);
        _builder.append(_markdownToHtml, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final XtendMember member, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final Example example, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h4>");
    String _describe = this._exampleNameProvider.describe(example);
    String _convertFromJavaString = org.eclipse.xtext.util.Strings.convertFromJavaString(_describe, true);
    String _firstUpper = org.eclipse.xtext.util.Strings.toFirstUpper(_convertFromJavaString);
    _builder.append(_firstUpper, "");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(example);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _isPending = example.isPending();
      boolean _operator_not = BooleanExtensions.operator_not(_isPending);
      if (_operator_not) {
        _builder.append("<pre class=\"prettyprint\">");
        _builder.newLine();
        XExpression _body = example.getBody();
        String _xtendCode = this.toXtendCode(_body);
        _builder.append(_xtendCode, "");
        _builder.append("</pre>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final ExampleTable table, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h4>");
    String _fieldName = this._exampleNameProvider.toFieldName(table);
    String _firstUpper = org.eclipse.xtext.util.Strings.toFirstUpper(_fieldName);
    _builder.append(_firstUpper, "");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    _builder.append("<table class=\"table table-striped table-bordered table-condensed\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<ExampleColumn> _columns = table.getColumns();
      for(final ExampleColumn headingCell : _columns) {
        _builder.append("\t\t");
        _builder.append("<th>");
        String _name = headingCell.getName();
        _builder.append(_name, "		");
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      EList<ExampleRow> _rows = table.getRows();
      for(final ExampleRow row : _rows) {
        _builder.append("\t");
        _builder.append("<tr>");
        _builder.newLine();
        {
          EList<XExpression> _cells = row.getCells();
          for(final XExpression cell : _cells) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            String _xtendCode = this.toXtendCode(cell);
            _builder.append(_xtendCode, "		");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final ExampleGroup exampleGroup, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _heading = this.heading(level);
    _builder.append(_heading, "");
    _builder.append(">");
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    String _convertFromJavaString = org.eclipse.xtext.util.Strings.convertFromJavaString(_describe, true);
    _builder.append(_convertFromJavaString, "");
    _builder.append("</");
    String _heading_1 = this.heading(level);
    _builder.append(_heading_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"level\">");
    _builder.newLine();
    {
      EList<XtendMember> _members = exampleGroup.getMembers();
      for(final XtendMember member : _members) {
        int _operator_plus = IntegerExtensions.operator_plus(level, 1);
        CharSequence _generate = this.generate(member, _operator_plus);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  protected String _toXtendCode(final XExpression expr) {
    String _serialize = this._iSerializer.serialize(expr);
    String _trim = _serialize.trim();
    return _trim;
  }
  
  protected String _toXtendCode(final XBlockExpression expr) {
      String _serialize = this._iSerializer.serialize(expr);
      String _trim = _serialize.trim();
      String code = _trim;
      int _length = code.length();
      int _operator_minus = IntegerExtensions.operator_minus(_length, 2);
      String _substring = code.substring(1, _operator_minus);
      code = _substring;
      String _normalize = this._whiteSpaceNormalizer.normalize(code);
      return _normalize;
  }
  
  public String heading(final int level) {
    return "h3";
  }
  
  public CharSequence generate(final XtendMember example, final int level) {
    if (example instanceof Example) {
      return _generate((Example)example, level);
    } else if (example instanceof ExampleTable) {
      return _generate((ExampleTable)example, level);
    } else if (example instanceof ExampleGroup) {
      return _generate((ExampleGroup)example, level);
    } else if (example != null) {
      return _generate(example, level);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(example, level).toString());
    }
  }
  
  public String toXtendCode(final XExpression expr) {
    if (expr instanceof XBlockExpression) {
      return _toXtendCode((XBlockExpression)expr);
    } else if (expr != null) {
      return _toXtendCode(expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
