package org.jnario.jvmmodel;

import static org.eclipse.xtext.util.Strings.isEmpty;
import static org.eclipse.xtext.xbase.lib.CollectionLiterals.newArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.jnario.JnarioField;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

/**
 * Renames synthetic elements to avoid name clashes. Dispatch methods are handled by validation.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class JnarioSyntheticNameClashResolver {

	@Inject
	private IJvmModelAssociations associations;

	public void resolveNameClashes(JvmGenericType type) {
		Multimap<String, JvmIdentifiableElement> classScope = HashMultimap.create();
		List<JvmMember> renameableMembers = newArrayList();
		int i = 1;
		for (JvmMember member : type.getMembers()) {
			String simpleName = member.getSimpleName();
			if (simpleName != null) {
				if (!isRenameable(member))
					classScope.put(simpleName, member);
				else
					renameableMembers.add(member);
			}
			if (member instanceof JvmFeature) {
				for(JvmGenericType localType: ((JvmFeature) member).getLocalClasses()) {
					localType.setSimpleName(localType.getSimpleName() + '_' + (i++));
				}
			}
		}
		for (JvmMember renameable : renameableMembers) {
			String simpleName = renameable.getSimpleName();
			if (collides(renameable, simpleName, classScope)) {
				int count = 0;
				String currentName;
				do {
					if (count == Integer.MAX_VALUE)
						throw new IllegalStateException("Cannot find a collision-free name for "
								+ renameable.getIdentifier());
					currentName = simpleName + "_" + ++count;
				} while (collides(renameable, currentName, classScope));
				renameable.setSimpleName(currentName);
				classScope.put(currentName, renameable);
			} else {
				classScope.put(simpleName, renameable);
			}
		}
	}

	protected boolean collides(JvmIdentifiableElement element, String currentName,
			Multimap<String, JvmIdentifiableElement> scope) {
		if (scope.containsKey(currentName)) {
			if (element instanceof JvmOperation) {
				for (JvmIdentifiableElement other : scope.get(currentName)) {
					if (!(other instanceof JvmOperation)
							|| ((JvmOperation) element).getParameters().size() == ((JvmOperation) other)
									.getParameters().size())
						return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

	protected boolean isRenameable(JvmIdentifiableElement element) {
		String simpleName = element.getSimpleName();
		if (!simpleName.startsWith("_")) {
			return false;
		}
		EObject source = associations.getPrimarySourceElement(element);
		return isAnonymousExtensionField(source);
	}

	protected boolean isAnonymousExtensionField(EObject source) {
		return source instanceof JnarioField && ((JnarioField) source).isExtension()
				&& isEmpty(((JnarioField) source).getName());
	}
}
