package com.daniloaraujosilva.mathemagika.library.android_native_arm64

import com.daniloaraujosilva.mathemagika.library.android_native_arm64.common.exampleFunction
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
