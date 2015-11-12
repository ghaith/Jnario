package org.jnario.spec.tests.integration

import static extension org.junit.Assert.*

describe "RichStringValueConverter integration test" {
	fact '''Test1''' => "Test1" 
	
	fact '''
Test2''' => "Test2"

	fact '''
    Test3''' => "Test3"

	fact '''
    Test4
   Line2''' => q(" Test4\nLine2")

	fact '''
    Test5
   Line2
Line3''' => q("    Test5\n   Line2\nLine3")

	fact '''Test   ''' => "Test   "

	fact '''
Test
Test2   ''' => q("Test\nTest2   ")

	fact '''
Line1

Line2''' => q("Line1\n\nLine2")

	fact '''Line3

Line4''' => q("Line3\n\nLine4")

	fact q("Test\n   \n").assertEquals('''
Test
   
''') 

	fact '''Test
    ''' => q("Test\n")
	
	fact '''
Test6
    ''' => q("Test6\n")
   
    fact q("Test111\n").assertEquals('''Test111
        ''')
   
    def q(String s) {
		s.replace("\n", System.getProperty("line.separator"))
    }
}