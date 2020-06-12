package com.daniloaraujosilva.mathemagika.library.ios_x64

import com.daniloaraujosilva.mathemagika.library.ios_x64.common.exampleFunction
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
