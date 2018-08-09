package org.jnario.jnario.tests.unit;

import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Should")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ShouldSpec {
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[true, true]]")
  @Order(1)
  public void _assertTrueShouldOperatorDoubleArrowTrueTrue() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(true), Boolean.valueOf(true));
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[false, true]]")
  @Order(2)
  public void _assertFalseShouldOperatorDoubleArrowFalseTrue() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(false), Boolean.valueOf(true));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[\\\"not a boolean\\\", true]]")
  @Order(3)
  public void _assertFalseShouldOperatorDoubleArrowNotABooleanTrue() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("not a boolean", Boolean.valueOf(true));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[null, true]]")
  @Order(4)
  public void _assertFalseShouldOperatorDoubleArrowNullTrue() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(null, Boolean.valueOf(true));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[null, null]]")
  @Order(5)
  public void _assertTrueShouldOperatorDoubleArrowNullNull() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(null, null);
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[\\\"a String\\\", null]]")
  @Order(6)
  public void _assertFalseShouldOperatorDoubleArrowAStringNull() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("a String", null);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[null, \\\"a String\\\"]]")
  @Order(7)
  public void _assertFalseShouldOperatorDoubleArrowNullAString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(null, "a String");
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[\\\"a String\\\", \\\"a String\\\"]]")
  @Order(8)
  public void _assertTrueShouldOperatorDoubleArrowAStringAString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("a String", "a String");
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[\\\"a String\\\", \\\"b String\\\"]]")
  @Order(9)
  public void _assertFalseShouldOperatorDoubleArrowAStringBString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("a String", "b String");
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[1, null]]")
  @Order(10)
  public void _assertFalseShouldOperatorDoubleArrow1Null() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), null);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[null, 1]]")
  @Order(11)
  public void _assertFalseShouldOperatorDoubleArrowNull1() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(null, Integer.valueOf(1));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[1, 1]]")
  @Order(12)
  public void _assertTrueShouldOperatorDoubleArrow11() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), Integer.valueOf(1));
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[1, 2]]")
  @Order(13)
  public void _assertFalseShouldOperatorDoubleArrow12() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), Integer.valueOf(2));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[\\\"a String\\\", String]]")
  @Order(14)
  public void _assertTrueShouldOperatorDoubleArrowAStringString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("a String", String.class);
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[1, String]]")
  @Order(15)
  public void _assertFalseShouldOperatorDoubleArrow1String() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), String.class);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[1, Integer]]")
  @Order(16)
  public void _assertTrueShouldOperatorDoubleArrow1Integer() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), Integer.class);
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[true, String]]")
  @Order(17)
  public void _assertFalseShouldOperatorDoubleArrowTrueString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(true), String.class);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[true, Boolean]]")
  @Order(18)
  public void _assertTrueShouldOperatorDoubleArrowTrueBoolean() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(true), Boolean.class);
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[null, String]]")
  @Order(19)
  public void _assertFalseShouldOperatorDoubleArrowNullString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(null, String.class);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[Boolean, String]]")
  @Order(20)
  public void _assertFalseShouldOperatorDoubleArrowBooleanString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.class, String.class);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[Boolean, Boolean]]")
  @Order(21)
  public void _assertTrueShouldOperatorDoubleArrowBooleanBoolean() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.class, Boolean.class);
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[-[], -[]]]")
  @Order(22)
  public void _assertTrueShouldOperatorDoubleArrow() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()), Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[-[] as String[], -[] as Boolean[]]]")
  @Order(23)
  public void _assertTrueShouldOperatorDoubleArrowAsStringAsBoolean() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()), String.class))), ((Boolean[]) ((Boolean[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()), Boolean.class))));
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[-[] as String[], null]]")
  @Order(24)
  public void _assertFalseShouldOperatorDoubleArrowAsStringNull() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()), String.class))), null);
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[null, -[] as String[]]]")
  @Order(25)
  public void _assertFalseShouldOperatorDoubleArrowNullAsString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(null, ((String[]) ((String[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()), String.class))));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[-[\\\"a String\\\"] as String[], -[false] as Boolean[]]]")
  @Order(26)
  public void _assertFalseShouldOperatorDoubleArrowAStringAsStringFalseAsBoolean() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String")), String.class))), ((Boolean[]) ((Boolean[])Conversions.unwrapArray(Collections.<Boolean>unmodifiableList(CollectionLiterals.<Boolean>newArrayList(Boolean.valueOf(false))), Boolean.class))));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[-[\\\"a String\\\"] as String[], -[\\\"another String\\\"] as String[]]]")
  @Order(27)
  public void _assertFalseShouldOperatorDoubleArrowAStringAsStringAnotherStringAsString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String")), String.class))), ((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("another String")), String.class))));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[-[\\\"a String\\\"] as String[], -[\\\"a String\\\"] as String[]]]")
  @Order(28)
  public void _assertTrueShouldOperatorDoubleArrowAStringAsStringAStringAsString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String")), String.class))), ((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String")), String.class))));
    Assert.assertTrue(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[-[\\\"a String\\\", \\\"b String\\\"] as String[], -[\\\"a String\\\"] as String[]]]")
  @Order(29)
  public void _assertFalseShouldOperatorDoubleArrowAStringBStringAsStringAStringAsString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String", "b String")), String.class))), ((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String")), String.class))));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertFalse[Should.operator_doubleArrow[-[\\\"a String\\\"] as String[], -[\\\"a String\\\", \\\"b String\\\"] as String[]]]")
  @Order(30)
  public void _assertFalseShouldOperatorDoubleArrowAStringAsStringAStringBStringAsString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String")), String.class))), ((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String", "b String")), String.class))));
    Assert.assertFalse(_doubleArrow);
  }
  
  @Test
  @Named("assertTrue[Should.operator_doubleArrow[-[\\\"a String\\\", \\\"b String\\\"] as String[], -[\\\"a String\\\", \\\"b String\\\"] as String[]]]")
  @Order(31)
  public void _assertTrueShouldOperatorDoubleArrowAStringBStringAsStringAStringBStringAsString() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String", "b String")), String.class))), ((String[]) ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a String", "b String")), String.class))));
    Assert.assertTrue(_doubleArrow);
  }
}
