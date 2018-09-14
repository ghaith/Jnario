package org.jnario.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.jnario.ui.internal.JnarioActivator;

/**
 * organize imports including jnario and xtend files
 *
 */
public class JnarioMultiOrganizeImportsHandler extends AbstractHandler {
	private static final String[] COMMAND_IDS = { //
			"org.eclipse.xtext.xbase.ui.multiOrganizeImports", // Xtend
			"org.jnario.feature.ui.multiOrganizeImports", //
			"org.jnario.spec.ui.multiOrganizeImports", //
			"org.jnario.suite.ui.multiOrganizeImports", //
			};

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
		IHandlerService handlerService = PlatformUI.getWorkbench().getService(IHandlerService.class);
		for (String commandId : COMMAND_IDS) {
			try {
				if (commandService .getCommand(commandId).isDefined()) {
					handlerService.executeCommand(commandId, new Event());
				}
			} catch (Exception e) {
				JnarioActivator.logError("Can't execute command. Id: " + commandId, e);
			}
		}
		return null;
	}

}
