/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static java.lang.Math.max;
import static java.lang.String.format;

import java.util.List;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.internal.RowFailed;
import org.jnario.lib.internal.RowPassed;
import org.jnario.lib.internal.RowResult;
import org.jnario.lib.internal.RowResults;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExampleTableIterators<T extends ExampleTableRow> {
	
	/**
	 * Performs an assertion on each row in an {@link ExampleTable}. All
	 * failures are collected and merged into a readable representation.
	 * 
	 * @param table a table with examples
	 * @param assertion a closure which performs an assertion on each row.
	 */
	public static <T extends ExampleTableRow> void forEach(ExampleTable<T> table, Procedure1<T> assertion) {
		new ExampleTableIterators<T>(table, assertion).perform();
	}
	
	private static final String INDENT = "        ";
	private final ExampleTable<T> table;
	private final Procedure1<T> assertion;

	protected ExampleTableIterators(ExampleTable<T> table, Procedure1<T> assertion) {
		super();
		this.table = table;
		this.assertion = assertion;
	}

	public void perform() {
		if(table.getRows().isEmpty()){
			return;
		}
		
		RowResults results = new RowResults();
		for (T row : table.getRows()) {
			try {
				assertion.apply(row);
				results.add(new RowPassed(row));
			} catch (Throwable e) {
				results.add(new RowFailed(row, e));
			}
		}
		if(results.hasFailed()){
			throw newAssertionError(results);
		}
	}

	private AssertionError newAssertionError(RowResults results) {
		AssertionError error = new AssertionError(createMessage(results));
		error.setStackTrace(results.getStackTrace());
		return error;
	}
	
	private String createMessage(RowResults results) {
		String formatString = createFormatString();
		StringBuilder causes = new StringBuilder();
		StringBuilder message = new StringBuilder(table.getName());
		message.append(" failed\n\n");
		describeColumns(formatString, message);
		int i = 1;
		for (RowResult result : results) {
			message.append(INDENT);
			describeRow(formatString, message, result);
			if (result instanceof RowFailed) {
				message.append("     (");
				message.append(i);
				message.append(")");
				describeCause(formatString, causes, i, (RowFailed) result);
				i++;
			}
			message.append("\n");
		}
		message.append(causes);
		return message.toString();
	}

	private String createFormatString() {
		StringBuilder formatString = new StringBuilder("|");
		List<String> columns = table.getColumnNames();
		for(int i = 0; i < columns.size(); i++){
			int length = columns.get(i).length();
			for (T row : table.getRows()) {
				String cell = row.getCells().get(i);
				int cellLength = cell == null ? 0 : cell.length();
				length = max(length, cellLength);
			}
			formatString.append(" %" + (i + 1) + "$-" + (length+5) + "s|");
		}
		return formatString.toString();
	}
	
	private void describeColumns(String formatString, StringBuilder message) {
		message.append(INDENT);
		message.append(format(formatString, table.getColumnNames().toArray()));
		message.append("\n"); 
	}

	protected void describeRow(String formatString, StringBuilder message, RowResult result) {
		List<String> cells = result.getValue().getCells();
		message.append(format(formatString, cells.toArray()));
		message.append(" ");
		message.append(result);
	}

	protected void describeCause(String formatString, StringBuilder causes, int i, RowFailed result) {
		causes.append("\n(");
		causes.append(i);
		causes.append(") ");
		describeRow(formatString, causes, result);
		causes.append("\n");
		Throwable cause = result.getCause();
		causes.append(cause.toString());
	}
}
