package org.jnario.maven;

import static org.apache.maven.plugins.annotations.LifecyclePhase.PROCESS_TEST_CLASSES;
import static org.apache.maven.plugins.annotations.ResolutionScope.COMPILE;

import java.io.File;
import java.util.List;

import org.apache.maven.plugins.annotations.Mojo;

import com.google.common.collect.Multimap;

/**
 * Goal which installs debug information into Java class files that have been generated from Jnario.
 * Legacy class for tests still searching for the xtend-test-install-debug-info goal
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 */
@Mojo(name = "xtend-test-install-debug-info", defaultPhase = PROCESS_TEST_CLASSES, requiresDependencyResolution = COMPILE)
@Deprecated
public class XtendTestInstallDebugInfo extends JnarioTestInstallDebugInfo {
}
