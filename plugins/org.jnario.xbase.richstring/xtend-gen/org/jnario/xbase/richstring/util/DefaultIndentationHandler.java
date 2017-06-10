package org.jnario.xbase.richstring.util;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.xbase.richstring.util.IRichStringIndentationHandler;
import org.jnario.xbase.richstring.util.IRichStringPartAcceptor;

/**
 * Default indentation handler for rich strings. Tries to be graceful with
 * inconsistent indentation.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class DefaultIndentationHandler implements IRichStringIndentationHandler {
  protected static abstract class IndentationData {
    protected CharSequence value;
    
    protected IndentationData(final CharSequence value) {
      this.value = value;
    }
    
    protected abstract void accept(final IRichStringPartAcceptor acceptor);
    
    @Override
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      String _simpleName = this.getClass().getSimpleName();
      _builder.append(_simpleName);
      _builder.append(" [");
      _builder.append(this.value);
      _builder.append("]");
      return _builder.toString();
    }
  }
  
  protected static class SemanticIndentationData extends DefaultIndentationHandler.IndentationData {
    protected SemanticIndentationData(final CharSequence value) {
      super(value);
    }
    
    @Override
    protected void accept(final IRichStringPartAcceptor acceptor) {
      acceptor.acceptSemanticText(this.value, null);
    }
  }
  
  protected static class TemplateIndentationData extends DefaultIndentationHandler.IndentationData {
    protected TemplateIndentationData(final CharSequence value) {
      super(value);
    }
    
    @Override
    protected void accept(final IRichStringPartAcceptor acceptor) {
      acceptor.acceptTemplateText(this.value, null);
    }
  }
  
  private LinkedList<DefaultIndentationHandler.IndentationData> indentationData;
  
  private LinkedList<LinkedList<DefaultIndentationHandler.IndentationData>> indentationDataStack;
  
  public DefaultIndentationHandler() {
    this.indentationData = Lists.<DefaultIndentationHandler.IndentationData>newLinkedList();
    this.indentationDataStack = Lists.<LinkedList<DefaultIndentationHandler.IndentationData>>newLinkedList();
    this.indentationDataStack.add(this.indentationData);
  }
  
  @Override
  public void popIndentation() {
    this.indentationData.removeLast();
    if ((this.indentationData.isEmpty() && (this.indentationDataStack.size() > 1))) {
      this.indentationDataStack.removeLast();
      this.indentationData = this.indentationDataStack.getLast();
    }
  }
  
  @Override
  public void pushTemplateIndentation(final CharSequence indentation) {
    boolean _isEmpty = this.indentationData.isEmpty();
    if (_isEmpty) {
      DefaultIndentationHandler.TemplateIndentationData _templateIndentationData = new DefaultIndentationHandler.TemplateIndentationData(indentation);
      this.indentationData.add(_templateIndentationData);
    } else {
      String currentIndentation = this.getTotalIndentation();
      boolean _startsWith = indentation.toString().startsWith(currentIndentation);
      if (_startsWith) {
        String trimmedIndentation = indentation.toString().substring(currentIndentation.length());
        DefaultIndentationHandler.TemplateIndentationData _templateIndentationData_1 = new DefaultIndentationHandler.TemplateIndentationData(trimmedIndentation);
        this.indentationData.add(_templateIndentationData_1);
      } else {
        LinkedList<DefaultIndentationHandler.IndentationData> newIndentationData = Lists.<DefaultIndentationHandler.IndentationData>newLinkedList();
        DefaultIndentationHandler.TemplateIndentationData _templateIndentationData_2 = new DefaultIndentationHandler.TemplateIndentationData(indentation);
        newIndentationData.add(_templateIndentationData_2);
        this.indentationDataStack.add(newIndentationData);
        this.indentationData = newIndentationData;
      }
    }
  }
  
  @Override
  public void pushSemanticIndentation(final CharSequence indentation) {
    boolean _isEmpty = this.indentationData.isEmpty();
    if (_isEmpty) {
      DefaultIndentationHandler.SemanticIndentationData _semanticIndentationData = new DefaultIndentationHandler.SemanticIndentationData(indentation);
      this.indentationData.add(_semanticIndentationData);
    } else {
      String currentIndentation = this.getTotalIndentation();
      boolean _startsWith = indentation.toString().startsWith(currentIndentation);
      if (_startsWith) {
        String trimmedIndentation = indentation.toString().substring(currentIndentation.length());
        DefaultIndentationHandler.SemanticIndentationData _semanticIndentationData_1 = new DefaultIndentationHandler.SemanticIndentationData(trimmedIndentation);
        this.indentationData.add(_semanticIndentationData_1);
      } else {
        LinkedList<DefaultIndentationHandler.IndentationData> newIndentationData = Lists.<DefaultIndentationHandler.IndentationData>newLinkedList();
        DefaultIndentationHandler.SemanticIndentationData _semanticIndentationData_2 = new DefaultIndentationHandler.SemanticIndentationData(indentation);
        newIndentationData.add(_semanticIndentationData_2);
        this.indentationDataStack.add(newIndentationData);
        this.indentationData = newIndentationData;
      }
    }
  }
  
  @Override
  public CharSequence getTotalSemanticIndentation() {
    StringBuilder result = new StringBuilder();
    for (final DefaultIndentationHandler.IndentationData data : this.indentationData) {
      if ((data instanceof DefaultIndentationHandler.SemanticIndentationData)) {
        result.append(((DefaultIndentationHandler.SemanticIndentationData)data).value);
      }
    }
    return result.toString();
  }
  
  @Override
  public String getTotalIndentation() {
    StringBuilder result = new StringBuilder();
    for (final DefaultIndentationHandler.IndentationData data : this.indentationData) {
      result.append(data.value);
    }
    return result.toString();
  }
  
  @Override
  public void accept(final IRichStringPartAcceptor acceptor) {
    for (final DefaultIndentationHandler.IndentationData data : this.indentationData) {
      data.accept(acceptor);
    }
  }
}
