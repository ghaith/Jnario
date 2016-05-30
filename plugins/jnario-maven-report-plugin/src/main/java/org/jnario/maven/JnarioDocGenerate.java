package org.jnario.maven;

import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;
import static org.apache.maven.plugins.annotations.ResolutionScope.TEST;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ISetup;
import org.jnario.compiler.AbstractBatchCompiler;
import org.jnario.compiler.HtmlAssetsCompiler;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.compiler.JnarioStandaloneCompiler;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.SpecResultParser;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * Goal which generates Jnario documentation.
 *
 * @author Sebastian Benz - Initial contribution and API
 */
@Mojo(name ="generate", requiresDependencyResolution = TEST)
public class JnarioDocGenerate extends JnarioTestCompile {

	private final class XmlFiles implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return name.endsWith("xml");
		}
	}

	/**
	 * Location of the generated documentation.
	 */
	@Parameter(defaultValue = "${basedir}/target/jnario-doc", required = true)
	private String docOutputDirectory;

	/**
	 * Location of the generated JUnit XML reports.
	 */
	@Parameter(defaultValue = "${basedir}/target/surefire-reports", required = true)
	private String reportsDirectory;

	/**
	 * Location of the generated JUnit XML reports.
	 */
	@Parameter
	private String sourceDirectory;

	/**
	 * Location of the temporary compiler directory.
	 */
	@Parameter(defaultValue = "${project.build.directory}/jnario-report-tmp", required = true)
	private String testTempDirectory;

	private ResourceSet resourceSet;
	
	@Override
	protected void internalExecute() throws MojoExecutionException {
		getLog().info("Generating Jnario reports to " + docOutputDirectory);

		MavenProjectResourceSetProvider resourceSetProvider = new MavenProjectResourceSetProvider(project);
		resourceSet = resourceSetProvider.get();

		// the order is important, the suite compiler must be executed last
		List<Injector> injectors = createInjectors(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());
		generateCssAndJsFiles(injectors);

		HashBasedSpec2ResultMapping resultMapping = createSpec2ResultMapping(injectors);
		for (Injector injector : injectors) {
			generateDoc(injector, resultMapping);
		}
	}

	protected HashBasedSpec2ResultMapping createSpec2ResultMapping(List<Injector> injectors) throws MojoExecutionException {
		HashBasedSpec2ResultMapping resultMapping = injectors.get(2).getInstance(HashBasedSpec2ResultMapping.class);
		File reportFolder = new File(reportsDirectory);
		if (reportFolder.exists()) {
			addExecutionResults(resultMapping, reportFolder);
		} else {
			throw new MojoExecutionException("Surefire Report folder does not exist");
		}
		return resultMapping;
	}

	protected void generateCssAndJsFiles(List<Injector> injectors) {
		HtmlAssetsCompiler assetsCompiler = injectors.get(0).getInstance(HtmlAssetsCompiler.class);
		assetsCompiler.setOutputPath(docOutputDirectory);
		getLog().info("Generating HTML assets to " + docOutputDirectory);
		assetsCompiler.compile();
	}

	protected void addExecutionResults(HashBasedSpec2ResultMapping resultMapping, File reportFolder) throws MojoExecutionException {
		SpecResultParser specResultParser = new SpecResultParser();
		for (File file : reportFolder.listFiles(new XmlFiles())) {
			FileInputStream is = null;
			try {
				is = new FileInputStream(file);
				specResultParser.parse(is, resultMapping);
			} catch (Exception e) {
				throw new MojoExecutionException("Exception while parsing spec for: " + file, e);
			} finally {
				try {
					is.close();
				} catch (IOException e) {
				}
			}

		}
	}

	protected void compileTestSources(JnarioDocCompiler xtend2BatchCompiler) throws MojoExecutionException {
		List<String> testCompileSourceRoots = Lists.newArrayList(project.getTestCompileSourceRoots());
		String testClassPath = concat(File.pathSeparator, getTestClassPath());
		if (sourceDirectory != null) {
			testCompileSourceRoots = Collections.singletonList(sourceDirectory);
		}
		getLog().debug("source folders: " + testCompileSourceRoots);
		compile(xtend2BatchCompiler, testClassPath, testCompileSourceRoots, docOutputDirectory);
	}

	protected AbstractBatchCompiler getBatchCompiler() {
		return JnarioStandaloneCompiler.create();
	}

	private void generateDoc(Injector injector, Executable2ResultMapping resultMapping) throws MojoExecutionException {
		JnarioDocCompiler docCompiler = injector.getInstance(JnarioDocCompiler.class);
		docCompiler.setExecutable2ResultMapping(resultMapping);
		compileTestSources(docCompiler);
	}

	private List<Injector> createInjectors(ISetup... setups) {
		return transform(asList(setups), new Function<ISetup, Injector>() {
			public Injector apply(ISetup input) {
				return input.createInjectorAndDoEMFRegistration();
			}
		});
	}

	@Override
	protected String getTempDirectory() {
		return testTempDirectory;
	}

	protected Provider<ResourceSet> getResourceSet() {
		return new Provider<ResourceSet>() {

			@Override
			public ResourceSet get() {
				return resourceSet;
			}
			
		};
	}
}