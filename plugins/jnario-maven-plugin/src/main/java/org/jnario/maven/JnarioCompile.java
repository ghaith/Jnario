package org.jnario.maven;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_SOURCES;
import static org.apache.maven.plugins.annotations.ResolutionScope.COMPILE;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Most of the code copied from the Xtext/Xtend projects.
 * 
 * @author Boris Brodski
 */
@Mojo(name = "compile", defaultPhase = GENERATE_SOURCES, requiresDependencyResolution = COMPILE)
public class JnarioCompile extends AbstractJnarioCompilerMojo {
	/**
	 * Location of the generated test files.
	 */
	@Parameter(defaultValue = "${basedir}/src/main/generated-sources/jnario", required = true)
	private String outputDirectory;
	
	/**
	 * Location of the temporary compiler directory.
	 */
	@Parameter(defaultValue = "${project.build.directory}/jnario", required = true)
	private String tempDirectory;

	/**
	 * If true, the output directory will not be automatically added to the test source directories.
	 */
	@Parameter(defaultValue = "false", required = true)
	private boolean doNotAddSourceDirectory;
	
	@Override
	protected void internalExecute() throws MojoExecutionException {
		final String defaultValue = project.getBasedir() + "/src/main/generated-sources/jnario";
		getLog().debug("Output directory '" + outputDirectory + "'");
		getLog().debug("Default directory '" + defaultValue + "'");
		if (defaultValue.equals(outputDirectory)) {
			readJnarioEclipseSetting(project.getBuild().getSourceDirectory(), new Procedure1<String>() {
				public void apply(String jnarioOutputDir) {
					outputDirectory = jnarioOutputDir;
					getLog().info("Using Jnario output directory '" + outputDirectory + "'");
				}
			});
		}
		outputDirectory = resolveToBaseDir(outputDirectory);
		List<String> compileSourceRoots = Lists.newArrayList(project.getCompileSourceRoots());
		compileSourceRoots.remove(outputDirectory);
		String classPath = concat(File.pathSeparator, getClassPath());
		if (!doNotAddSourceDirectory) {
			project.addCompileSourceRoot(outputDirectory);
		}
		compile(getBatchCompiler(), classPath, compileSourceRoots, outputDirectory);
	}

	@SuppressWarnings("deprecation")
	protected List<String> getClassPath() {
		Set<String> classPath = Sets.newLinkedHashSet();
		classPath.add(project.getBuild().getSourceDirectory());
		try {
			classPath.addAll(project.getCompileClasspathElements());
		} catch (DependencyResolutionRequiredException e) {
			throw new WrappedException(e);
		}
		addDependencies(classPath, project.getCompileArtifacts());
		classPath.remove(project.getBuild().getOutputDirectory());
		return newArrayList(filter(classPath, FILE_EXISTS));
	}

	@Override
	protected String getTempDirectory() {
		return tempDirectory;
	}


}
