package org.jnario.spec.tests.unit.conversion

import javax.inject.Inject
import org.jnario.conversion.RichStringValueConverter
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.runner.CreateWith

import static extension org.junit.Assert.*

@CreateWith(typeof(FeatureTestCreator))
describe "RichStringValueConverter unit test" {
    
    @Inject
    RichStringValueConverter richStringValueConverter
    
	fact "toValueRemovesRichStringSignes" {
		assertConverted(
			"'''Test'''",
			"Test"
		)
	}
	
	fact "toValueRemovesRichStringSignesBrokenEnd1" {
		assertConverted(
			"'''Test''",
			"Test"
		)
	}
	
	fact "toValueRemovesRichStringSignesBrokenEnd2" {
		assertConverted(
			"'''Test'",
			"Test"
		)
	}
	
	fact "toValueRemovesRichStringSignesBrokenEnd3" {
		assertConverted(
			"'''Test",
			"Test"
		)
	}
	
	fact "toValueRemovesLineWithOnlyLineBreak" {
		assertConverted(
			"'''\n" + 
			"Test'''",
			"Test"
		)
		assertConverted(
			"'''\r\n" +
			"Test'''",
			"Test"
		)
	}

	fact "toValueRemovesIntendationToFirstCharacter" {
		assertConverted(
			"'''\n" + 
			"    Test'''",
			"Test"
		)
		assertConverted(
			"'''\r\n" + 
			"    Test'''",
			"Test"
		)
	}

	fact "toValueCountsTabsAsOneSpaceWhenMixed" {
		assertConverted(
			"'''\n" +
			"\tTest\n" +
			"  Test2'''",
			"Test\n" + 
			" Test2"
		)
		assertConverted(
			"'''\r\n" +
			"\tTest\r\n" +
			"  Test2'''",
			"Test\r\n" + 
			" Test2"
		)
	}
	
	fact "toValueRemovesIntendationToFirstCharacterMultiline" {
		assertConverted(
			"'''\n" +
			"  Test\n" +
			"   Test2'''",
			"Test\n" + 
			" Test2"
		)
		assertConverted(
			"'''\r\n" +
			"  Test\r\n" +
			"   Test2'''",
			"Test\r\n" + 
			" Test2"
		)
	}

	fact "toValueRemovesIntendationToFirstCharacterMultiline2" {
		assertConverted(
			"'''\n" +
			"    Test\n" +
			"   Test2\n" +
			" Test3'''",
			"   Test\n" +
			"  Test2\n" +
			"Test3"
		)
		assertConverted(
			"'''\r\n" +
			"    Test\r\n" +
			"   Test2\r\n" +
			" Test3'''",
			"   Test\r\n" +
			"  Test2\r\n" +
			"Test3"
		)
	}

	fact "toValueKeepsWhitespacesAfterLastCharacterWhenItKeepsIntendation" {
		assertConverted(
			"'''Test   '''",
			"Test   "
		)
	}

	fact "toValueIgnoresWhitespacesAfterLastCharacter" {
		assertConverted(
			"'''\n" +
			"Test\n" +
			"Test2   '''",
			"Test\n" + 
			"Test2   "
		)
		assertConverted(
			"'''\r\n" +
			"Test\r\n" +
			"Test2   '''",
			"Test\r\n" + 
			"Test2   "
		)
	}

	fact "toValueIgnoresEmptyLinesBetweenCharacters" {
		assertConverted(
			"'''\n" + 
			"Line1\n" +
			"\n" +
			"Line2'''",
			"Line1\n" +
			"\n" + 
			"Line2"
		)
		assertConverted(
			"'''\r\n" + 
			"Line1\r\n" +
			"\r\n" +
			"Line2'''",
			"Line1\r\n" +
			"\r\n" + 
			"Line2"
		)
	}

	fact "toValueKeepsEmptyLinesBetweenCharactersWhenItKeepsIntendation" {
		assertConverted(
			"'''Line1\n" + 
			"\n" + 
			"Line2'''",
			"Line1\n" +
			"\n" + 
			"Line2"
		)
		assertConverted(
			"'''Line1\r\n" + 
			"\r\n" + 
			"Line2'''",
			"Line1\r\n" +
			"\r\n" + 
			"Line2"
		)
	}

	fact "toValueKeepsLinesWithOnlyWhitespaces" {
		assertConverted(
			"'''\n" +
			"Test\n"+
			"   \n'''",
			"Test\n" +
			"   \n"
		)
		assertConverted(
			"'''\r\n" +
			"Test\r\n"+
			"   \r\n'''",
			"Test\r\n" +
			"   \r\n"
		)
	}
	
	fact "toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendation" {
		assertConverted(
			"'''Test\n" +
			"   '''",
			"Test\n"
		)
		assertConverted(
			"'''Test\r\n" +
			"   '''",
			"Test\r\n"
		)
	}
	
	fact "toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendationMultiline" {
		assertConverted(
			"'''Test\n" +
			"  Test1\n" +
			" Test3\n" +
			"  \t  '''",
			"Test\n" +
			"  Test1\n" + 
			" Test3\n"
		)
		assertConverted(
			"'''Test\r\n" +
			"  Test1\r\n" +
			" Test3\r\n" +
			"  \t  '''",
			"Test\r\n" +
			"  Test1\r\n" + 
			" Test3\r\n"
		)
	}
	
	fact "toValueNotIgnoresSpacesIfNotInIndentation" {
		assertConverted(
			"'''Test\n" +
			"  Test1\n" +
			" Test3\n" +
			"  \t x '''",
			"Test\n" +
			"  Test1\n" + 
			" Test3\n" +
            "  \t x "
		)
		assertConverted(
			"'''Test\r\n" +
			"  Test1\r\n" +
			" Test3\r\n" +
			"  \t x '''",
			"Test\r\n" +
			"  Test1\r\n" + 
			" Test3\r\n" +
            "  \t x "
		)
	}
	
    fact "toValueNotRemovesSpacesIfSingleLine" {
        assertConverted(
            "'''Test  '''",
            "Test  "
        )
    }
	
	fact "toValueIgnoresEmptyLinesAtTheEnd" {
		assertConverted(
			"'''\n" +
			"Test\n" +
			"   '''",
			"Test\n"
		)
	}

	fact "mixNewLineStyles" {
		assertConverted(
			"'''\r" +
			"   Line1\n" +
			"    Line2\r\n" + 
			" Line3\r" +
			"'''",
			"  Line1\n" +
			"   Line2\r\n" +
			"Line3\r"
		)
	}
	
	def assertConverted(String stringToConvert, String expected) {
		val actual = richStringValueConverter.toValue(stringToConvert, null)
		expected.assertEquals(actual)		
	}
}