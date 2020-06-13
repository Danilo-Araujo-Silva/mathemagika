package com.daniloaraujosilva.mathemagika.library.jvm

import com.daniloaraujosilva.mathemagika.library.jvm.exampleFunction
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
