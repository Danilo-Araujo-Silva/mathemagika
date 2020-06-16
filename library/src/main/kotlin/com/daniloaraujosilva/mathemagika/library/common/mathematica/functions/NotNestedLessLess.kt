package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotNestedLessLess
 *
 * Full name:        System`NotNestedLessLess
 *
 * Usage:            NotNestedLessLess[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotNestedLessLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotNestedLessLess.html
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
fun notNestedLessLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotNestedLessLess", arguments.toMutableList(), options)
}
