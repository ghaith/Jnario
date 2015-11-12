package org.jnario.util;

import org.eclipse.xtext.EcoreUtil2;
import org.jnario.JnarioFile;
import org.jnario.JnarioTypeDeclaration;

public class XtendTypes {

	public static String packageName(JnarioTypeDeclaration typeDeclaration){
		JnarioFile jnarioFile = EcoreUtil2.getContainerOfType(typeDeclaration, JnarioFile.class);
		if(jnarioFile == null){
			return null;
		}
		return jnarioFile.getPackage();
	}
	
}
