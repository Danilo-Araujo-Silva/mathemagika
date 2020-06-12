package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterLess
 *
 * Full name:        System`GreaterLess
 *
 * Usage:            GreaterLess[x, y, …] displays as x ≷ y ≷ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/GreaterLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterLess.html
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
fun greaterLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterLess", arguments.toMutableList(), options)
}
