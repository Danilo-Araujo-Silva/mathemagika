package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotLess
 *
 * Full name:        System`NotLess
 *
 * Usage:            NotLess[x, y, …] displays as x ≮ y ≮ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLess.html
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
fun notLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLess", arguments.toMutableList(), options)
}
