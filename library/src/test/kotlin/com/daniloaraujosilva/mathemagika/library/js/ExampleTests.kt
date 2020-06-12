package com.daniloaraujosilva.mathemagika.library.js

import com.daniloaraujosilva.mathemagika.library.js.common.checkExampleObjectPackageAndReturnIt
import com.daniloaraujosilva.mathemagika.library.js.common.exampleFunction
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

	/**
	 *
	 */
	@Test
	fun checkIfExampleObjectPackageIsOk() {
		assertTrue(
            checkExampleObjectPackageAndReturnIt()
                .isNotBlank())
	}
}
