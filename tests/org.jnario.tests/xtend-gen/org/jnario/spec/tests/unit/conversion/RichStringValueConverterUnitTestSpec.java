package org.jnario.spec.tests.unit.conversion;

import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.conversion.RichStringValueConverter;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("RichStringValueConverter unit test")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringValueConverterUnitTestSpec {
  @Inject
  RichStringValueConverter richStringValueConverter;
  
  @Test
  @Named("toValueRemovesRichStringSignes")
  @Order(1)
  public void _toValueRemovesRichStringSignes() throws Exception {
    this.assertConverted(
      "\'\'\'Test\'\'\'", 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesRichStringSignesBrokenEnd1")
  @Order(2)
  public void _toValueRemovesRichStringSignesBrokenEnd1() throws Exception {
    this.assertConverted(
      "\'\'\'Test\'\'", 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesRichStringSignesBrokenEnd2")
  @Order(3)
  public void _toValueRemovesRichStringSignesBrokenEnd2() throws Exception {
    this.assertConverted(
      "\'\'\'Test\'", 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesRichStringSignesBrokenEnd3")
  @Order(4)
  public void _toValueRemovesRichStringSignesBrokenEnd3() throws Exception {
    this.assertConverted(
      "\'\'\'Test", 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesLineWithOnlyLineBreak")
  @Order(5)
  public void _toValueRemovesLineWithOnlyLineBreak() throws Exception {
    this.assertConverted(
      ("\'\'\'\n" + 
        "Test\'\'\'"), 
      "Test");
    this.assertConverted(
      ("\'\'\'\r\n" + 
        "Test\'\'\'"), 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesIntendationToFirstCharacter")
  @Order(6)
  public void _toValueRemovesIntendationToFirstCharacter() throws Exception {
    this.assertConverted(
      ("\'\'\'\n" + 
        "    Test\'\'\'"), 
      "Test");
    this.assertConverted(
      ("\'\'\'\r\n" + 
        "    Test\'\'\'"), 
      "Test");
  }
  
  @Test
  @Named("toValueCountsTabsAsOneSpaceWhenMixed")
  @Order(7)
  public void _toValueCountsTabsAsOneSpaceWhenMixed() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "\tTest\n") + 
        "  Test2\'\'\'"), 
      ("Test\n" + 
        " Test2"));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "\tTest\r\n") + 
        "  Test2\'\'\'"), 
      ("Test\r\n" + 
        " Test2"));
  }
  
  @Test
  @Named("toValueRemovesIntendationToFirstCharacterMultiline")
  @Order(8)
  public void _toValueRemovesIntendationToFirstCharacterMultiline() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "  Test\n") + 
        "   Test2\'\'\'"), 
      ("Test\n" + 
        " Test2"));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "  Test\r\n") + 
        "   Test2\'\'\'"), 
      ("Test\r\n" + 
        " Test2"));
  }
  
  @Test
  @Named("toValueRemovesIntendationToFirstCharacterMultiline2")
  @Order(9)
  public void _toValueRemovesIntendationToFirstCharacterMultiline2() throws Exception {
    this.assertConverted(
      ((("\'\'\'\n" + 
        "    Test\n") + 
        "   Test2\n") + 
        " Test3\'\'\'"), 
      (("   Test\n" + 
        "  Test2\n") + 
        "Test3"));
    this.assertConverted(
      ((("\'\'\'\r\n" + 
        "    Test\r\n") + 
        "   Test2\r\n") + 
        " Test3\'\'\'"), 
      (("   Test\r\n" + 
        "  Test2\r\n") + 
        "Test3"));
  }
  
  @Test
  @Named("toValueKeepsWhitespacesAfterLastCharacterWhenItKeepsIntendation")
  @Order(10)
  public void _toValueKeepsWhitespacesAfterLastCharacterWhenItKeepsIntendation() throws Exception {
    this.assertConverted(
      "\'\'\'Test   \'\'\'", 
      "Test   ");
  }
  
  @Test
  @Named("toValueIgnoresWhitespacesAfterLastCharacter")
  @Order(11)
  public void _toValueIgnoresWhitespacesAfterLastCharacter() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "Test\n") + 
        "Test2   \'\'\'"), 
      ("Test\n" + 
        "Test2   "));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "Test\r\n") + 
        "Test2   \'\'\'"), 
      ("Test\r\n" + 
        "Test2   "));
  }
  
  @Test
  @Named("toValueIgnoresEmptyLinesBetweenCharacters")
  @Order(12)
  public void _toValueIgnoresEmptyLinesBetweenCharacters() throws Exception {
    this.assertConverted(
      ((("\'\'\'\n" + 
        "Line1\n") + 
        "\n") + 
        "Line2\'\'\'"), 
      (("Line1\n" + 
        "\n") + 
        "Line2"));
    this.assertConverted(
      ((("\'\'\'\r\n" + 
        "Line1\r\n") + 
        "\r\n") + 
        "Line2\'\'\'"), 
      (("Line1\r\n" + 
        "\r\n") + 
        "Line2"));
  }
  
  @Test
  @Named("toValueKeepsEmptyLinesBetweenCharactersWhenItKeepsIntendation")
  @Order(13)
  public void _toValueKeepsEmptyLinesBetweenCharactersWhenItKeepsIntendation() throws Exception {
    this.assertConverted(
      (("\'\'\'Line1\n" + 
        "\n") + 
        "Line2\'\'\'"), 
      (("Line1\n" + 
        "\n") + 
        "Line2"));
    this.assertConverted(
      (("\'\'\'Line1\r\n" + 
        "\r\n") + 
        "Line2\'\'\'"), 
      (("Line1\r\n" + 
        "\r\n") + 
        "Line2"));
  }
  
  @Test
  @Named("toValueKeepsLinesWithOnlyWhitespaces")
  @Order(14)
  public void _toValueKeepsLinesWithOnlyWhitespaces() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "Test\n") + 
        "   \n\'\'\'"), 
      ("Test\n" + 
        "   \n"));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "Test\r\n") + 
        "   \r\n\'\'\'"), 
      ("Test\r\n" + 
        "   \r\n"));
  }
  
  @Test
  @Named("toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendation")
  @Order(15)
  public void _toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendation() throws Exception {
    this.assertConverted(
      ("\'\'\'Test\n" + 
        "   \'\'\'"), 
      "Test\n");
    this.assertConverted(
      ("\'\'\'Test\r\n" + 
        "   \'\'\'"), 
      "Test\r\n");
  }
  
  @Test
  @Named("toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendationMultiline")
  @Order(16)
  public void _toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendationMultiline() throws Exception {
    this.assertConverted(
      ((("\'\'\'Test\n" + 
        "  Test1\n") + 
        " Test3\n") + 
        "  \t  \'\'\'"), 
      (("Test\n" + 
        "  Test1\n") + 
        " Test3\n"));
    this.assertConverted(
      ((("\'\'\'Test\r\n" + 
        "  Test1\r\n") + 
        " Test3\r\n") + 
        "  \t  \'\'\'"), 
      (("Test\r\n" + 
        "  Test1\r\n") + 
        " Test3\r\n"));
  }
  
  @Test
  @Named("toValueNotIgnoresSpacesIfNotInIndentation")
  @Order(17)
  public void _toValueNotIgnoresSpacesIfNotInIndentation() throws Exception {
    this.assertConverted(
      ((("\'\'\'Test\n" + 
        "  Test1\n") + 
        " Test3\n") + 
        "  \t x \'\'\'"), 
      ((("Test\n" + 
        "  Test1\n") + 
        " Test3\n") + 
        "  \t x "));
    this.assertConverted(
      ((("\'\'\'Test\r\n" + 
        "  Test1\r\n") + 
        " Test3\r\n") + 
        "  \t x \'\'\'"), 
      ((("Test\r\n" + 
        "  Test1\r\n") + 
        " Test3\r\n") + 
        "  \t x "));
  }
  
  @Test
  @Named("toValueNotRemovesSpacesIfSingleLine")
  @Order(18)
  public void _toValueNotRemovesSpacesIfSingleLine() throws Exception {
    this.assertConverted(
      "\'\'\'Test  \'\'\'", 
      "Test  ");
  }
  
  @Test
  @Named("toValueIgnoresEmptyLinesAtTheEnd")
  @Order(19)
  public void _toValueIgnoresEmptyLinesAtTheEnd() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "Test\n") + 
        "   \'\'\'"), 
      "Test\n");
  }
  
  @Test
  @Named("mixNewLineStyles")
  @Order(20)
  public void _mixNewLineStyles() throws Exception {
    this.assertConverted(
      (((("\'\'\'\r" + 
        "   Line1\n") + 
        "    Line2\r\n") + 
        " Line3\r") + 
        "\'\'\'"), 
      (("  Line1\n" + 
        "   Line2\r\n") + 
        "Line3\r"));
  }
  
  public void assertConverted(@Extension final String stringToConvert, @Extension final String expected) {
    final String actual = this.richStringValueConverter.toValue(stringToConvert, null);
    Assert.assertEquals(expected, actual);
  }
}
