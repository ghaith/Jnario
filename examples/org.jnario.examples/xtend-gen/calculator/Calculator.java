/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package calculator;

@SuppressWarnings("all")
public class Calculator {
  public int add(final String a, final String b) {
    return this.add((Integer.valueOf(a)).intValue(), (Integer.valueOf(b)).intValue());
  }
  
  public int add(final int a, final int b) {
    return (a + b);
  }
  
  public int divide(final int a, final int b) {
    return (a / b);
  }
  
  public int substract(final int a, final int b) {
    return (a - b);
  }
  
  @Override
  public String toString() {
    return "Calculator";
  }
}
