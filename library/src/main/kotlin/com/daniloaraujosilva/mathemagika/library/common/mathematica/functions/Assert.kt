package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Assert
 *
 * Full name:        System`Assert
 *
 *                   Assert[test] represents the assertion that test is True. If assertions have been enabled, test is evaluated when the assertion is encountered. If test is not True, then an assertion failure is generated.
 * Usage:            Assert[test, tag] specifies a tag that will be used to identify the assertion if it fails.
 *
 * Options:          None
 *
 * Attributes:       HoldAllComplete
 *
 *                   local: paclet:ref/Assert
 * Documentation:    web: http://reference.wolfram.com/language/ref/Assert.html
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
fun assert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Assert", arguments.toMutableList(), options)
}
