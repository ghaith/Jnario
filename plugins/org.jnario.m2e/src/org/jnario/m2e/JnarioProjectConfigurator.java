package org.jnario.m2e;

import static org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.HIDE_LOCAL_SYNTHETIC_VARIABLES;
import static org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.INSTALL_DSL_AS_PRIMARY_SOURCE;
import static org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.USE_OUTPUT_PER_SOURCE_FOLDER;
import static org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.getKey;
import static org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.getOutputForSourceFolderKey;

import java.io.File;
import java.util.Set;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfiguration.SourceMapping;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.preferences.OptionsConfigurationBlock;
import org.eclipse.xtext.util.RuntimeIOException;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.osgi.service.prefs.BackingStoreException;

import com.google.common.base.CharMatcher;

public class JnarioProjectConfigurator extends AbstractProjectConfigurator {

	@Override
	public void configure(ProjectConfigurationRequest request,
			IProgressMonitor monitor) throws CoreException {
		addNature(request.getProject(), XtextProjectHelper.NATURE_ID, monitor);
		Set<OutputConfiguration> configurations = new DocOutputConfigurationProvider()
				.getOutputConfigurations();
		for (OutputConfiguration configuration : configurations) {
			for (MojoExecution execution : getMojoExecutions(request, monitor)) {
				String goal = execution.getGoal();
				if (goal.equals("generate")) {
					readDocGenerateSettings(configuration, request, execution);
				} else if (goal.equals("testCompile")) {
					readCompileSettings(configuration, request, execution);
				} else if (goal.equals("xtend-test-install-debug-info")) {
					readEnhanceSettings(configuration, request, execution);
				}
			}
		}

		writePreferences(configurations, request.getProject());
	}

	private void writePreferences(Set<OutputConfiguration> configurations,
			IProject project) {
		ProjectScope projectPreferences = new ProjectScope(project);
		IEclipsePreferences languagePreferences = projectPreferences
				.getNode("org.jnario.Jnario");
		for (OutputConfiguration configuration : configurations) {
			languagePreferences.putBoolean(
					OptionsConfigurationBlock.isProjectSpecificPropertyKey(null), true);
			if (isJavaOutput(configuration)) {
				languagePreferences.putBoolean(
						getKey(configuration, INSTALL_DSL_AS_PRIMARY_SOURCE),
						configuration.isInstallDslAsPrimarySource());
				languagePreferences.putBoolean(
						getKey(configuration, HIDE_LOCAL_SYNTHETIC_VARIABLES),
						configuration.isHideSyntheticLocalVariables());
			}
			languagePreferences.putBoolean(
					getKey(configuration, USE_OUTPUT_PER_SOURCE_FOLDER), true);
			for (SourceMapping sourceMapping : configuration
					.getSourceMappings()) {
				languagePreferences.put(
						getOutputForSourceFolderKey(configuration,
								sourceMapping.getSourceFolder()), sourceMapping
								.getOutputDirectory());
			}
			try {
				languagePreferences.flush();
			} catch (BackingStoreException e) {
				throw new RuntimeIOException(e);
			}
		}
	}

	private void readDocGenerateSettings(OutputConfiguration config,
			ProjectConfigurationRequest request, MojoExecution execution)
			throws CoreException {
		if (!isJavaOutput(config)) {
			for (String source : request.getMavenProject()
					.getTestCompileSourceRoots()) {
				SourceMapping mapping = new SourceMapping(makeProjectRelative(
						source, request));
				String docOutputDirectory = getParameterValue(
						request.getMavenProject(),
						"docOutputDirectory",
						String.class,
						execution,
						null);
				mapping.setOutputDirectory(makeProjectRelative(
						docOutputDirectory, request));
				config.getSourceMappings().add(mapping);
			}
		}
	}

	private void readCompileSettings(OutputConfiguration config,
			ProjectConfigurationRequest request, MojoExecution execution)
			throws CoreException {
		if (isJavaOutput(config)) {
			for (String source : request.getMavenProject()
					.getTestCompileSourceRoots()) {
				SourceMapping mapping = new SourceMapping(makeProjectRelative(
						source, request));
				String testOutputDirectory = getParameterValue(
						request.getMavenProject(),
						"testOutputDirectory",
						String.class,
						execution,
						null);
				mapping.setOutputDirectory(makeProjectRelative(
						testOutputDirectory, request));
				config.getSourceMappings().add(mapping);
			}
		}
	}

	private void readEnhanceSettings(OutputConfiguration config,
			ProjectConfigurationRequest request, MojoExecution execution)
			throws CoreException {
		if (isJavaOutput(config)) {
			config.setHideSyntheticLocalVariables(getParameterValue(
					request.getMavenProject(),
					"hideSyntheticVariables",
					Boolean.class,
					execution,
					null));
			config.setInstallDslAsPrimarySource(getParameterValue(
					request.getMavenProject(),
					"xtendAsPrimaryDebugSource",
					Boolean.class,
					execution,
					null));
		}
	}

	private boolean isJavaOutput(OutputConfiguration config) {
		return config.getName().equals(IFileSystemAccess.DEFAULT_OUTPUT);
	}

	private String makeProjectRelative(String fileName,
			ProjectConfigurationRequest request) {
		File baseDir = request.getMavenProject().getBasedir();
		File file = new File(fileName);
		String relativePath;
		if (file.isAbsolute()) {
			relativePath = baseDir.toURI().relativize(file.toURI()).getPath();
		} else {
			relativePath = file.getPath();
		}
		String unixDelimited = relativePath.replaceAll("\\\\", "/");
		return CharMatcher.is('/').trimFrom(unixDelimited);
	}

}
