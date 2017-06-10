/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import java.util.regex.Pattern;
import org.jnario.doc.Filter;

@SuppressWarnings("all")
public class RegexFilter implements Filter {
  public static Filter create(final String regex) {
    return new RegexFilter(regex);
  }
  
  private String regex;
  
  private Pattern pattern;
  
  public RegexFilter(final String regex) {
    this.regex = regex;
    this.pattern = Pattern.compile(regex, Pattern.DOTALL);
  }
  
  @Override
  public String apply(final String input) {
    return this.pattern.matcher(input).replaceAll("");
  }
  
  @Override
  public String toString() {
    return this.regex;
  }
}
