package org.jnario.maven;

import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.xtext.maven.MavenLog4JConfigurator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public abstract class AbstractJnarioMojo extends AbstractMojo {

	@Inject
	protected MavenLog4JConfigurator log4jConfigurator;

	/**
	 * The project itself. This parameter is set by maven.
	 */
	@Parameter(property = "project", required = true)
	protected MavenProject project;

	/**
	 * Set this to true to skip compiling Jnario sources.
	 */
	@Parameter(property = "skipJnario", defaultValue = "false")
	protected boolean skipJnario;

	private List<Injector> injectors;

	public AbstractJnarioMojo() {
		injectMembers();
	}
	
	public List<Injector> getInjectors() {
		return injectors;
	}

	public void execute() throws MojoExecutionException, MojoFailureException {
		if (isSkipped()) {
			getLog().info("skipped.");
		} else {
			log4jConfigurator.configureLog4j(getLog());
			internalExecute();
		}
	}

	protected void injectMembers() {
		injectors = new JnarioMavenStandaloneSetup().createInjectorAndDoEMFRegistration();
		injectors.get(0).injectMembers(this);
	}

	protected abstract void internalExecute() throws MojoExecutionException, MojoFailureException;

	protected boolean isSkipped() {
		return skipJnario;
	}

}
