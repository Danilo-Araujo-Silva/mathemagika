package com.daniloaraujosilva.mathemagika.library.linux_mipsel32

import com.daniloaraujosilva.mathemagika.library.linux_mipsel32.common.exampleFunction
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
