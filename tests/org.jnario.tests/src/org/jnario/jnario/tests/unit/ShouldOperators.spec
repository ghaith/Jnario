package org.jnario.jnario.tests.unit

import org.jnario.lib.Should
import static org.junit.Assert.*

describe Should {

	fact assertTrue(Should.operator_doubleArrow(true, true))
	
	fact assertFalse(Should.operator_doubleArrow(false, true))

	fact assertFalse(Should.operator_doubleArrow("not a boolean", true))
	
	fact assertFalse(Should.operator_doubleArrow(null, true))
	
	fact assertTrue(Should.operator_doubleArrow(null, null))
	
	fact assertFalse(Should.operator_doubleArrow("a String", null))
	
	fact assertFalse(Should.operator_doubleArrow(null, "a String"))
	
	fact assertTrue(Should.operator_doubleArrow("a String", "a String"))
	
	fact assertFalse(Should.operator_doubleArrow("a String", "b String"))
	
	fact assertFalse(Should.operator_doubleArrow(1, null))
	
	fact assertFalse(Should.operator_doubleArrow(null, 1))
	
	fact assertTrue(Should.operator_doubleArrow(1, 1))

	fact assertFalse(Should.operator_doubleArrow(1, 2))
	
	fact assertTrue(Should.operator_doubleArrow("a String", String))
	
	fact assertFalse(Should.operator_doubleArrow(1, String))
	
	fact assertTrue(Should.operator_doubleArrow(1, Integer))
	
	fact assertFalse(Should.operator_doubleArrow(true, String))
	
	fact assertTrue(Should.operator_doubleArrow(true, Boolean))
	
	fact assertFalse(Should.operator_doubleArrow(null, String))
	
	fact assertFalse(Should.operator_doubleArrow(Boolean, String))
	
	fact assertTrue(Should.operator_doubleArrow(Boolean, Boolean))
	
	fact assertTrue(Should.operator_doubleArrow(#[], #[]))
	
	fact assertTrue(Should.operator_doubleArrow(#[] as String[], #[] as Boolean[]))
	
	fact assertFalse(Should.operator_doubleArrow(#[] as String[], null))

	fact assertFalse(Should.operator_doubleArrow(null, #[] as String[]))
	
	fact assertFalse(Should.operator_doubleArrow(#["a String"] as String[], #[false] as Boolean[]))
	
	fact assertFalse(Should.operator_doubleArrow(#["a String"] as String[], #["another String"] as String[]))
	
	fact assertTrue(Should.operator_doubleArrow(#["a String"] as String[], #["a String"] as String[]))
	
	fact assertFalse(Should.operator_doubleArrow(#["a String", "b String"] as String[], #["a String"] as String[]))
	
	fact assertFalse(Should.operator_doubleArrow(#["a String"] as String[], #["a String", "b String"] as String[]))
	
	fact assertTrue(Should.operator_doubleArrow(#["a String", "b String"] as String[], #["a String", "b String"] as String[]))
	
}