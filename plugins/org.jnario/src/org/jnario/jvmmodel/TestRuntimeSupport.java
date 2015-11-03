package org.jnario.jvmmodel;

import java.util.Collection;
import java.util.List;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.jnario.Executable;
import org.jnario.JnarioClass;
import org.jnario.JnarioMember;
import org.jnario.Specification;

public interface TestRuntimeSupport {
	
	void updateExampleGroup(JnarioClass exampleGroup, JvmGenericType inferredType);
	void updateSuite(JnarioClass suite, JvmGenericType inferredType);
	void updateFeature(JnarioClass feature, JvmGenericType inferredType, List<JvmTypeReference> scenarios);
	void updateScenario(JnarioClass scenario, JvmGenericType inferredType);
	void addChildren(Specification context, JvmGenericType parent, Collection<JvmTypeReference> children);

	void markAsTestMethod(Executable element, JvmOperation operation);
	void markAsPending(Executable element, JvmOperation operation);
	
	void beforeMethod(JnarioMember before, JvmOperation operation);
	void beforeAllMethod(JnarioMember before, JvmOperation operation);
	
	void afterMethod(JnarioMember after, JvmOperation operation);
	void afterAllMethod(JnarioMember afterAll, JvmOperation operation);

}
