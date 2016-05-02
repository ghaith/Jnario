package org.jnario.maven;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_TEST_SOURCES;
import static org.apache.maven.plugins.annotations.ResolutionScope.TEST;
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
@Mojo(name = "testCompile", defaultPhase = GENERATE_TEST_SOURCES, requiresDependencyResolution = TEST)
public class JnarioTestCompile extends AbstractJnarioCompilerMojo {
	/**
	 * Location of the generated test files.
	 */
	@Parameter(defaultValue = "${basedir}/src/test/generated-sources/jnario", required = true)
	private String testOutputDirectory;
	
	/**
	 * Location of the temporary compiler directory.
	 */
	@Parameter(defaultValue = "${project.build.directory}/jnario-test", required = true)
	private String testTempDirectory;

	/**
	 * If true, the output directory will not be automatically added to the test source directories.
	 */
	@Parameter(defaultValue = "false", required = true)
	private boolean doNotAddTestSourceDirectory;
	
	@Override
	protected void internalExecute() throws MojoExecutionException {
		final String defaultValue = project.getBasedir() + "/src/test/generated-sources/jnario";
		getLog().debug("Output directory '" + testOutputDirectory + "'");
		getLog().debug("Default directory '" + defaultValue + "'");
		if (defaultValue.equals(testOutputDirectory)) {
			readJnarioEclipseSetting(project.getBuild().getTestSourceDirectory(), new Procedure1<String>() {
				public void apply(String jnarioOutputDir) {
					testOutputDirectory = jnarioOutputDir;
					getLog().info("Using Jnario output directory '" + testOutputDirectory + "'");
				}
			});
		}
		testOutputDirectory = resolveToBaseDir(testOutputDirectory);
		List<String> testCompileSourceRoots = Lists.newArrayList(project.getTestCompileSourceRoots());
		testCompileSourceRoots.remove(testOutputDirectory);
		String testClassPath = concat(File.pathSeparator, getTestClassPath());
		if (!doNotAddTestSourceDirectory) {
			project.addTestCompileSourceRoot(testOutputDirectory);
		}
		compile(getBatchCompiler(), testClassPath, testCompileSourceRoots, testOutputDirectory);
	}

	@SuppressWarnings("deprecation")
	protected List<String> getTestClassPath() {
		Set<String> classPath = Sets.newLinkedHashSet();
		classPath.add(project.getBuild().getTestSourceDirectory());
		try {
			classPath.addAll(project.getTestClasspathElements());
		} catch (DependencyResolutionRequiredException e) {
			throw new WrappedException(e);
		}
		addDependencies(classPath, project.getTestArtifacts());
		classPath.remove(project.getBuild().getTestOutputDirectory());
		return newArrayList(filter(classPath, FILE_EXISTS));
	}

	@Override
	protected String getTempDirectory() {
		return testTempDirectory;
	}


}
