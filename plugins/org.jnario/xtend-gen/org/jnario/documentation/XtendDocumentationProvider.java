package org.jnario.documentation;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioPackage;

@SuppressWarnings("all")
public class XtendDocumentationProvider extends MultiLineCommentDocumentationProvider {
  @Override
  public String getDocumentation(final EObject o) {
    String _xblockexpression = null;
    {
      boolean _shouldBeHandeled = this.shouldBeHandeled(o);
      boolean _not = (!_shouldBeHandeled);
      if (_not) {
        return null;
      }
      _xblockexpression = super.getDocumentation(o);
    }
    return _xblockexpression;
  }
  
  @Override
  public List<INode> getDocumentationNodes(final EObject o) {
    List<INode> _xblockexpression = null;
    {
      boolean _shouldBeHandeled = this.shouldBeHandeled(o);
      boolean _not = (!_shouldBeHandeled);
      if (_not) {
        return CollectionLiterals.<INode>emptyList();
      }
      _xblockexpression = super.getDocumentationNodes(o);
    }
    return _xblockexpression;
  }
  
  /**
   * The Xtend parser constructs a synthetic nested AST element to hold annotations which should be ignored as a documentation provider
   */
  public boolean shouldBeHandeled(final EObject o) {
    return (!((o instanceof JnarioAnnotationTarget) && Objects.equal(o.eContainingFeature(), JnarioPackage.Literals.JNARIO_MEMBER__ANNOTATION_INFO)));
  }
}
