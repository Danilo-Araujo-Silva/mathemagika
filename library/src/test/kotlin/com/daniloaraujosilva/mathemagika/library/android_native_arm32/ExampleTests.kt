package com.daniloaraujosilva.mathemagika.library.android_native_arm32

import com.daniloaraujosilva.mathemagika.library.android_native_arm32.common.exampleFunction
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
