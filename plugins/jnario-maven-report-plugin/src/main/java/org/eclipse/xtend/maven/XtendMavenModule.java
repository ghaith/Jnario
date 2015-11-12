package org.eclipse.xtend.maven;

import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.eclipse.xtext.xbase.XbaseRuntimeModule;

public class XtendMavenModule extends XbaseRuntimeModule {

	public Class<? extends ITraceURIConverter> bindITraceURIConverter() {
		return MavenTraceURIConverter.class;
	}

}
