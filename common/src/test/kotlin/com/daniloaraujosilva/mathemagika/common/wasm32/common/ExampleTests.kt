package com.daniloaraujosilva.mathemagika.common.wasm32.common

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
		assertTrue(
            exampleFunction().isNotEmpty())
	}
}
