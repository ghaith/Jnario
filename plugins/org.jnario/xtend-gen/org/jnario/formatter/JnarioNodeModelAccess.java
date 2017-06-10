package org.jnario.formatter;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.formatting.NodeModelAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JnarioNodeModelAccess extends NodeModelAccess {
  @Override
  public Iterable<ILeafNode> nodesForKeyword(final EObject obj, final String kw) {
    List<ILeafNode> _xblockexpression = null;
    {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(obj);
      boolean _equals = Objects.equal(node, null);
      if (_equals) {
        return Collections.<ILeafNode>unmodifiableList(CollectionLiterals.<ILeafNode>newArrayList());
      }
      final Function1<INode, Boolean> _function = new Function1<INode, Boolean>() {
        @Override
        public Boolean apply(final INode it) {
          return Boolean.valueOf(((Objects.equal(it.getSemanticElement(), obj) && (it.getGrammarElement() instanceof Keyword)) && Objects.equal(it.getText(), kw)));
        }
      };
      INode _findFirst = IterableExtensions.<INode>findFirst(node.getAsTreeIterable(), _function);
      final ILeafNode leafNode = ((ILeafNode) _findFirst);
      List<ILeafNode> _xifexpression = null;
      if ((leafNode == null)) {
        _xifexpression = Collections.<ILeafNode>unmodifiableList(CollectionLiterals.<ILeafNode>newArrayList());
      } else {
        _xifexpression = Collections.<ILeafNode>unmodifiableList(CollectionLiterals.<ILeafNode>newArrayList(leafNode));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
