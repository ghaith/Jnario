package org.jnario.maven;

import static org.apache.maven.plugins.annotations.LifecyclePhase.PROCESS_CLASSES;
import static org.apache.maven.plugins.annotations.ResolutionScope.COMPILE;

import java.io.File;
import java.util.List;

import org.apache.maven.plugins.annotations.Mojo;

import com.google.common.collect.Multimap;

/**
 * Goal which installs debug information into Java class files that have been generated from Jnario.
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 */
@Mojo(name = "jnario-install-debug-info", defaultPhase = PROCESS_CLASSES, requiresDependencyResolution = COMPILE)
public class JnarioInstallDebugInfo extends AbstractJnarioInstallDebugInfoMojo {
	@Override
	protected void internalExecute() {
		List<String> compileSourceRoots = project.getCompileSourceRoots();
		String outputDirectory = project.getBuild().getOutputDirectory();
		Multimap<File, File> trace2class = createTraceToClassFileMap(compileSourceRoots, outputDirectory);
		logStatus(outputDirectory, trace2class);
		installTraces(trace2class);
	}
}
