package com.daniloaraujosilva.mathemagika.library.jvm.common

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 *
 */
class UtilsTests {

	/**
	 *
	 */
	@Test
	fun `convert string to string`() {
		assertEquals("1", convertFromMathematicaTo("1"))
	}

	/**
	 *
	 */
	@Test
	fun `convert string to integer`() {
		assertEquals(1, convertFromMathematicaTo<Int>("1"))
	}
}
