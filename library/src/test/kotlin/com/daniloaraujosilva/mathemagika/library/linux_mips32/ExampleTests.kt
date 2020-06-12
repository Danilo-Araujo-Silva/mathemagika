package com.daniloaraujosilva.mathemagika.library.linux_mips32

import com.daniloaraujosilva.mathemagika.library.linux_mips32.common.exampleFunction
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 *
 */
class ExampleTests {

	/**
	 *
	 */
	@Test
	fun exampleValueCannotBeEmpty() {
		assertTrue(exampleFunction().isNotEmpty())
	}
}
