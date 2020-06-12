package com.daniloaraujosilva.mathemagika.library.wasm32

import com.daniloaraujosilva.mathemagika.library.wasm32.common.exampleFunction
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
