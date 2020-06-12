package com.daniloaraujosilva.mathemagika.library.macos_x64

import com.daniloaraujosilva.mathemagika.library.macos_x64.common.exampleFunction
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
