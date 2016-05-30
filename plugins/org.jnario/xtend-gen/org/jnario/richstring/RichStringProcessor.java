package org.jnario.richstring;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.jnario.RichString;
import org.jnario.RichStringLiteral;
import org.jnario.compiler.JnarioCompiler;

@SuppressWarnings("all")
public class RichStringProcessor {
  public static class RichStringAcceptor {
    private List<Procedure2<ITreeAppendable, String>> toBeAppended = CollectionLiterals.<Procedure2<ITreeAppendable, String>>newArrayList();
    
    private final ArrayList<Pair<String, Boolean>> lineInformation = CollectionLiterals.<Pair<String, Boolean>>newArrayList();
    
    private String indentation = null;
    
    private JnarioCompiler compiler;
    
    public RichStringAcceptor(final JnarioCompiler compiler) {
      this.compiler = compiler;
    }
    
    protected Boolean _accept(final XBlockExpression block) {
      final Procedure2<ITreeAppendable, String> _function = new Procedure2<ITreeAppendable, String>() {
        @Override
        public void apply(final ITreeAppendable appendable, final String variableName) {
          final String blockName = RichStringAcceptor.this.compileBlock(block, appendable);
          boolean _notEquals = (!Objects.equal(blockName, null));
          if (_notEquals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(variableName, "");
            _builder.append(".append(");
            _builder.append(blockName, "");
            _builder.append(");");
            appendable.append(_builder);
            appendable.newLine();
          }
        }
      };
      return Boolean.valueOf(this.toBeAppended.add(_function));
    }
    
    public String compileBlock(final XBlockExpression expression, final ITreeAppendable appendable) {
      EList<XExpression> _expressions = expression.getExpressions();
      int _size = _expressions.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        this.compiler.toJavaStatement(expression, appendable, true);
        appendable.newLine();
        EList<XExpression> _expressions_1 = expression.getExpressions();
        XExpression _get = _expressions_1.get(0);
        return appendable.getName(_get);
      } else {
        EList<XExpression> _expressions_2 = expression.getExpressions();
        int _size_1 = _expressions_2.size();
        boolean _greaterThan = (_size_1 > 1);
        if (_greaterThan) {
          this.compiler.toJavaStatement(expression, appendable, true);
          appendable.newLine();
          return appendable.getName(expression);
        }
      }
      return null;
    }
    
    protected Boolean _accept(final XExpression literal) {
      final Procedure2<ITreeAppendable, String> _function = new Procedure2<ITreeAppendable, String>() {
        @Override
        public void apply(final ITreeAppendable appendable, final String name) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(name, "");
          _builder.append(".append(");
          appendable.append(_builder);
          RichStringAcceptor.this.compiler.toJavaExpression(literal, appendable);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(");");
          appendable.append(_builder_1);
          appendable.newLine();
        }
      };
      return Boolean.valueOf(this.toBeAppended.add(_function));
    }
    
    protected Boolean _accept(final RichStringLiteral literal) {
      boolean fixIndentation = true;
      String value = literal.getValue();
      boolean _startsWith = value.startsWith(RichStringProcessor.RICHSTRING_TAG);
      if (_startsWith) {
        String _substring = value.substring(3);
        value = _substring;
      }
      boolean _startsWith_1 = value.startsWith(RichStringProcessor.PLACEHOLDER_CLOSE);
      if (_startsWith_1) {
        String _substring_1 = value.substring(1);
        value = _substring_1;
        fixIndentation = false;
      }
      boolean _endsWith = value.endsWith(RichStringProcessor.PLACEHOLDER_OPEN);
      if (_endsWith) {
        int _length = value.length();
        int _minus = (_length - 1);
        String _substring_2 = value.substring(0, _minus);
        value = _substring_2;
      }
      boolean _endsWith_1 = value.endsWith(RichStringProcessor.RICHSTRING_TAG);
      if (_endsWith_1) {
        int _length_1 = value.length();
        int _minus_1 = (_length_1 - 3);
        String _substring_3 = value.substring(0, _minus_1);
        value = _substring_3;
      }
      Pattern _compile = Pattern.compile("\r?\n");
      Splitter _on = Splitter.on(_compile);
      final Iterable<String> lines = _on.split(value);
      final boolean shouldFixIndentation = fixIndentation;
      final Procedure2<String, Integer> _function = new Procedure2<String, Integer>() {
        @Override
        public void apply(final String it, final Integer index) {
          if ((shouldFixIndentation || ((index).intValue() != 0))) {
            final String currentIndentation = RichStringProcessor.getIndentation(it);
            String _trim = it.trim();
            int _length = _trim.length();
            boolean _greaterThan = (_length > 0);
            Pair<String, Boolean> _mappedTo = Pair.<String, Boolean>of(currentIndentation, Boolean.valueOf(_greaterThan));
            RichStringAcceptor.this.lineInformation.add(_mappedTo);
          }
          final Procedure2<ITreeAppendable, String> _function = new Procedure2<ITreeAppendable, String>() {
            @Override
            public void apply(final ITreeAppendable appendable, final String variableName) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(variableName, "");
              _builder.append(".append(\"");
              String _xifexpression = null;
              if ((shouldFixIndentation || ((index).intValue() != 0))) {
                String _correctIndentation = RichStringAcceptor.this.correctIndentation(it);
                _xifexpression = RichStringAcceptor.this.escape(_correctIndentation);
              } else {
                _xifexpression = RichStringAcceptor.this.escape(it);
              }
              _builder.append(_xifexpression, "");
              _builder.append("\");");
              appendable.append(_builder);
              appendable.newLine();
              int _size = IterableExtensions.size(lines);
              int _minus = (_size - 1);
              boolean _lessThan = ((index).intValue() < _minus);
              if (_lessThan) {
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append(variableName, "");
                _builder_1.append(".newLine();");
                appendable.append(_builder_1);
                appendable.newLine();
              }
            }
          };
          RichStringAcceptor.this.toBeAppended.add(_function);
        }
      };
      IterableExtensions.<String>forEach(lines, _function);
      return null;
    }
    
    public String escape(final String string) {
      String _replace = string.replace("\\", "\\\\");
      String _replace_1 = _replace.replace("\"", "\\\"");
      return _replace_1.replace("\\\\u", "\\u");
    }
    
    public void appendTo(final ITreeAppendable appendable, final String variableName) {
      final List<Pair<String, Boolean>> lineInformation = IterableExtensions.<Pair<String, Boolean>>toList(this.lineInformation);
      final List<Procedure2<ITreeAppendable, String>> toBeAppended = IterableExtensions.<Procedure2<ITreeAppendable, String>>toList(this.toBeAppended);
      this.clearEmptyFirstAndLastLines(lineInformation, toBeAppended);
      String _calculateIndentation = this.calculateIndentation(lineInformation);
      this.indentation = _calculateIndentation;
      final Consumer<Procedure2<ITreeAppendable, String>> _function = new Consumer<Procedure2<ITreeAppendable, String>>() {
        @Override
        public void accept(final Procedure2<ITreeAppendable, String> it) {
          it.apply(appendable, variableName);
        }
      };
      toBeAppended.forEach(_function);
    }
    
    public Procedure2<ITreeAppendable, String> clearEmptyFirstAndLastLines(final List<Pair<String, Boolean>> lineInformation, final List<Procedure2<ITreeAppendable, String>> toBeAppended) {
      Procedure2<ITreeAppendable, String> _xblockexpression = null;
      {
        final Pair<String, Boolean> first = IterableExtensions.<Pair<String, Boolean>>head(lineInformation);
        boolean _not = (!(IterableExtensions.isNullOrEmpty(lineInformation) || (first.getValue()).booleanValue()));
        if (_not) {
          lineInformation.remove(0);
          toBeAppended.remove(0);
        } else {
          lineInformation.remove(0);
          Pair<String, Boolean> _mappedTo = Pair.<String, Boolean>of("", Boolean.valueOf(true));
          lineInformation.add(0, _mappedTo);
        }
        final Pair<String, Boolean> last = IterableExtensions.<Pair<String, Boolean>>last(lineInformation);
        Procedure2<ITreeAppendable, String> _xifexpression = null;
        boolean _not_1 = (!(IterableExtensions.isNullOrEmpty(lineInformation) || (last.getValue()).booleanValue()));
        if (_not_1) {
          Procedure2<ITreeAppendable, String> _xblockexpression_1 = null;
          {
            int _size = lineInformation.size();
            int _minus = (_size - 1);
            lineInformation.remove(_minus);
            int _length = ((Object[])Conversions.unwrapArray(toBeAppended, Object.class)).length;
            int _minus_1 = (_length - 1);
            _xblockexpression_1 = toBeAppended.remove(_minus_1);
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    }
    
    public String calculateIndentation(final List<Pair<String, Boolean>> lineInformation) {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(lineInformation);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        final Function1<Pair<String, Boolean>, Integer> _function = new Function1<Pair<String, Boolean>, Integer>() {
          @Override
          public Integer apply(final Pair<String, Boolean> it) {
            Boolean _value = it.getValue();
            if ((_value).booleanValue()) {
              String _key = it.getKey();
              return Integer.valueOf(_key.length());
            }
            return Integer.valueOf(Integer.MAX_VALUE);
          }
        };
        Pair<String, Boolean> _minBy = IterableExtensions.<Pair<String, Boolean>, Integer>minBy(lineInformation, _function);
        return _minBy.getKey();
      }
      return "";
    }
    
    public String correctIndentation(final String string) {
      boolean _startsWith = string.startsWith(this.indentation);
      if (_startsWith) {
        int _length = this.indentation.length();
        return string.substring(_length);
      }
      return string;
    }
    
    public Boolean accept(final XExpression literal) {
      if (literal instanceof RichStringLiteral) {
        return _accept((RichStringLiteral)literal);
      } else if (literal instanceof XBlockExpression) {
        return _accept((XBlockExpression)literal);
      } else if (literal != null) {
        return _accept(literal);
      } else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(literal).toString());
      }
    }
  }
  
  private final static String PLACEHOLDER_OPEN = "«";
  
  private final static String PLACEHOLDER_CLOSE = "»";
  
  private final static String RICHSTRING_TAG = "\'\'\'";
  
  public void process(final RichString richString, final ITreeAppendable appendable, final String variableName, final JnarioCompiler compiler) {
    final RichStringProcessor.RichStringAcceptor acceptor = new RichStringProcessor.RichStringAcceptor(compiler);
    EList<XExpression> _expressions = richString.getExpressions();
    final Procedure2<XExpression, Integer> _function = new Procedure2<XExpression, Integer>() {
      @Override
      public void apply(final XExpression it, final Integer index) {
        acceptor.accept(it);
      }
    };
    IterableExtensions.<XExpression>forEach(_expressions, _function);
    acceptor.appendTo(appendable, variableName);
  }
  
  public static String getIndentation(final String string) {
    final Pattern pattern = Pattern.compile("(\\s*).*");
    final Matcher matcher = pattern.matcher(string);
    boolean _matches = matcher.matches();
    if (_matches) {
      return matcher.group(1);
    }
    return "";
  }
}
