package com.daniloaraujosilva.mathemagika.library.linux_arm32_hfp

import com.daniloaraujosilva.mathemagika.library.linux_arm32_hfp.common.exampleFunction
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
