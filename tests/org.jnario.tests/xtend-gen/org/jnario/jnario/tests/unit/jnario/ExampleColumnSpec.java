/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.unit.jnario.ExampleColumnSpecExamples;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("ExampleColumn")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleColumnSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ISerializer _iSerializer;
  
  public ExampleTable<ExampleColumnSpecExamples> _initExampleColumnSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("columnIndex", "cellIndex", "value"), 
      new ExampleColumnSpecExamples(  Arrays.asList("0", "0", "\"1\""), _initExampleColumnSpecExamplesCell0(), _initExampleColumnSpecExamplesCell1(), _initExampleColumnSpecExamplesCell2()),
      new ExampleColumnSpecExamples(  Arrays.asList("0", "1", "\"3\""), _initExampleColumnSpecExamplesCell3(), _initExampleColumnSpecExamplesCell4(), _initExampleColumnSpecExamplesCell5()),
      new ExampleColumnSpecExamples(  Arrays.asList("1", "0", "\"2\""), _initExampleColumnSpecExamplesCell6(), _initExampleColumnSpecExamplesCell7(), _initExampleColumnSpecExamplesCell8()),
      new ExampleColumnSpecExamples(  Arrays.asList("1", "1", "\"4\""), _initExampleColumnSpecExamplesCell9(), _initExampleColumnSpecExamplesCell10(), _initExampleColumnSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<ExampleColumnSpecExamples> examples = _initExampleColumnSpecExamples();
  
  public int _initExampleColumnSpecExamplesCell0() {
    return 0;
  }
  
  public int _initExampleColumnSpecExamplesCell1() {
    return 0;
  }
  
  public String _initExampleColumnSpecExamplesCell2() {
    return "1";
  }
  
  public int _initExampleColumnSpecExamplesCell3() {
    return 0;
  }
  
  public int _initExampleColumnSpecExamplesCell4() {
    return 1;
  }
  
  public String _initExampleColumnSpecExamplesCell5() {
    return "3";
  }
  
  public int _initExampleColumnSpecExamplesCell6() {
    return 1;
  }
  
  public int _initExampleColumnSpecExamplesCell7() {
    return 0;
  }
  
  public String _initExampleColumnSpecExamplesCell8() {
    return "2";
  }
  
  public int _initExampleColumnSpecExamplesCell9() {
    return 1;
  }
  
  public int _initExampleColumnSpecExamplesCell10() {
    return 1;
  }
  
  public String _initExampleColumnSpecExamplesCell11() {
    return "4";
  }
  
  @Test
  @Named("calculates cells based on table")
  @Order(1)
  public void _calculatesCellsBasedOnTable() throws Exception {
    this._modelStore.parseSpec("package bootstrap\r\ndescribe \"ExampleTable\"{\r\n\tdef{\r\n\t\t| a | b |\r\n\t\t| 1 | 2 |\r\n\t\t| 3 | 4 |\r\n\t}\r\n}\r\n");
    final Consumer<ExampleColumnSpecExamples> _function = new Consumer<ExampleColumnSpecExamples>() {
      @Override
      public void accept(final ExampleColumnSpecExamples it) {
        Query _query = ExampleColumnSpec.this._modelStore.query();
        org.jnario.ExampleTable _first = _query.<org.jnario.ExampleTable>first(org.jnario.ExampleTable.class);
        final EList<ExampleColumn> columns = _first.getColumns();
        int _columnIndex = it.getColumnIndex();
        final ExampleColumn column = columns.get(_columnIndex);
        EList<ExampleCell> _cells = column.getCells();
        int _cellIndex = it.getCellIndex();
        final ExampleCell cell = _cells.get(_cellIndex);
        String _serialize = ExampleColumnSpec.this._iSerializer.serialize(cell);
        String _trim = _serialize.trim();
        String _value = it.getValue();
        Assert.assertTrue("\nExpected cell.serialize.trim => value but"
         + "\n     cell.serialize.trim is " + new org.hamcrest.StringDescription().appendValue(_trim).toString()
         + "\n     cell.serialize is " + new org.hamcrest.StringDescription().appendValue(_serialize).toString()
         + "\n     cell is " + new org.hamcrest.StringDescription().appendValue(cell).toString()
         + "\n     value is " + new org.hamcrest.StringDescription().appendValue(_value).toString() + "\n", Should.<String>operator_doubleArrow(_trim, _value));
        
      }
    };
    this.examples.forEach(_function);
  }
}
