package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotGreaterLess
 *
 * Full name:        System`NotGreaterLess
 *
 * Usage:            NotGreaterLess[x, y, …] displays as x ≹ y ≹ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotGreaterLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotGreaterLess.html
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
fun notGreaterLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotGreaterLess", arguments.toMutableList(), options)
}
