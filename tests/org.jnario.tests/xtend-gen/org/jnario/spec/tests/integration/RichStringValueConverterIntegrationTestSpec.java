package org.jnario.spec.tests.integration;

import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("RichStringValueConverter integration test")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringValueConverterIntegrationTestSpec {
  @Test
  @Named("\\\'\\\'\\\'Test1\\\'\\\'\\\' => \\\"Test1\\\"")
  @Order(1)
  public void _test1Test1() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test1", "Test1");
    Assert.assertTrue("\nExpected \'\'\'Test1\'\'\' => \"Test1\" but"
     + "\n     \'\'\'Test1\'\'\' => \"Test1\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test2\\\'\\\'\\\' => \\\"Test2\\\"")
  @Order(2)
  public void _test2Test2() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test2", "Test2");
    Assert.assertTrue("\nExpected \'\'\'\nTest2\'\'\' => \"Test2\" but"
     + "\n     \'\'\'\nTest2\'\'\' => \"Test2\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test3\\\'\\\'\\\' => \\\"Test3\\\"")
  @Order(3)
  public void _test3Test3() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test3", "Test3");
    Assert.assertTrue("\nExpected \'\'\'\n    Test3\'\'\' => \"Test3\" but"
     + "\n     \'\'\'\n    Test3\'\'\' => \"Test3\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test4 Line2\\\'\\\'\\\' => q[\\\" Test4\\\\nLine2\\\"]")
  @Order(4)
  public void _test4Line2QTest4NLine2() throws Exception {
    String _q = this.q(" Test4\nLine2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(" Test4\nLine2", _q);
    Assert.assertTrue("\nExpected \'\'\'\n    Test4\n   Line2\'\'\' => q(\" Test4\\nLine2\") but"
     + "\n     q(\" Test4\\nLine2\") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test5 Line2 Line3\\\'\\\'\\\' => q[\\\"    Test5\\\\n   Line2\\\\nLine3\\\"]")
  @Order(5)
  public void _test5Line2Line3QTest5NLine2NLine3() throws Exception {
    String _q = this.q("    Test5\n   Line2\nLine3");
    boolean _doubleArrow = Should.<String>operator_doubleArrow("    Test5\n   Line2\nLine3", _q);
    Assert.assertTrue("\nExpected \'\'\'\n    Test5\n   Line2\nLine3\'\'\' => q(\"    Test5\\n   Line2\\nLine3\") but"
     + "\n     q(\"    Test5\\n   Line2\\nLine3\") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test   \\\'\\\'\\\' => \\\"Test   \\\"")
  @Order(6)
  public void _testTest() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test   ", "Test   ");
    Assert.assertTrue("\nExpected \'\'\'Test   \'\'\' => \"Test   \" but"
     + "\n     \'\'\'Test   \'\'\' => \"Test   \" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test Test2   \\\'\\\'\\\' => q[\\\"Test\\\\nTest2   \\\"]")
  @Order(7)
  public void _testTest2QTestNTest2() throws Exception {
    String _q = this.q("Test\nTest2   ");
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test\nTest2   ", _q);
    Assert.assertTrue("\nExpected \'\'\'\nTest\nTest2   \'\'\' => q(\"Test\\nTest2   \") but"
     + "\n     q(\"Test\\nTest2   \") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Line1 Line2\\\'\\\'\\\' => q[\\\"Line1\\\\n\\\\nLine2\\\"]")
  @Order(8)
  public void _line1Line2QLine1NNLine2() throws Exception {
    String _q = this.q("Line1\n\nLine2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Line1\n\nLine2", _q);
    Assert.assertTrue("\nExpected \'\'\'\nLine1\n\nLine2\'\'\' => q(\"Line1\\n\\nLine2\") but"
     + "\n     q(\"Line1\\n\\nLine2\") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Line3 Line4\\\'\\\'\\\' => q[\\\"Line3\\\\n\\\\nLine4\\\"]")
  @Order(9)
  public void _line3Line4QLine3NNLine4() throws Exception {
    String _q = this.q("Line3\n\nLine4");
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Line3\n\nLine4", _q);
    Assert.assertTrue("\nExpected \'\'\'Line3\n\nLine4\'\'\' => q(\"Line3\\n\\nLine4\") but"
     + "\n     q(\"Line3\\n\\nLine4\") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("q[\\\"Test\\\\n   \\\\n\\\"].assertEquals[\\\'\\\'\\\' Test \\\'\\\'\\\']")
  @Order(10)
  public void _qTestNNAssertEqualsTest() throws Exception {
    String _q = this.q("Test\n   \n");
    org.junit.Assert.assertEquals(_q, "Test\n   \n");
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test \\\'\\\'\\\' => q[\\\"Test\\\\n\\\"]")
  @Order(11)
  public void _testQTestN() throws Exception {
    String _q = this.q("Test\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test\n", _q);
    Assert.assertTrue("\nExpected \'\'\'Test\n    \'\'\' => q(\"Test\\n\") but"
     + "\n     q(\"Test\\n\") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test6 \\\'\\\'\\\' => q[\\\"Test6\\\\n\\\"]")
  @Order(12)
  public void _test6QTest6N() throws Exception {
    String _q = this.q("Test6\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test6\n", _q);
    Assert.assertTrue("\nExpected \'\'\'\nTest6\n    \'\'\' => q(\"Test6\\n\") but"
     + "\n     q(\"Test6\\n\") is " + new org.hamcrest.StringDescription().appendValue(_q).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("q[\\\"Test111\\\\n\\\"].assertEquals[\\\'\\\'\\\'Test111 \\\'\\\'\\\']")
  @Order(13)
  public void _qTest111NAssertEqualsTest111() throws Exception {
    String _q = this.q("Test111\n");
    org.junit.Assert.assertEquals(_q, "Test111\n");
  }
  
  public String q(@Extension final String s) {
    String _property = System.getProperty("line.separator");
    return s.replace("\n", _property);
  }
}
