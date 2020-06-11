package com.daniloaraujosilva.mathemagika.library.jvm.common

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 *
 */
@ExperimentalUnsignedTypes
class UtilsTests {

	/**
	 *
	 */
	@Ignore
	@Test
	fun `convert string to array list`() {
		assertEquals(arrayListOf<Any?>(1, 2, "3", "4 + 5I", null), convertFromMathematicaTo<ArrayList<Any?>>("""{1, 2, "3", 4 + 5I, None} """))
	}

	/**
	 *
	 */
	@Test
	fun `convert string to boolean`() {
		assertEquals("1", convertFromMathematicaTo("1"))
	}

	/**
	 *
	 */
	@Test
	fun `convert string to integer`() {
		assertEquals(1, convertFromMathematicaTo<Int>("1"))
	}

	/**
	 *
	 */
	@Test
	fun `convert string to string`() {
		assertEquals("1", convertFromMathematicaTo("1"))
	}
}
