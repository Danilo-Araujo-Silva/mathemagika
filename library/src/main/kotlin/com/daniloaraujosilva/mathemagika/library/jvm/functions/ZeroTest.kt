package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ZeroTest
 *
 * Full name:        System`ZeroTest
 *
 * Usage:            ZeroTest is an option to various linear algebra functions that gives a function to use in testing whether symbolic expressions should be treated as zero.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ZeroTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZeroTest.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun zeroTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZeroTest", arguments.toMutableList(), options)
}
