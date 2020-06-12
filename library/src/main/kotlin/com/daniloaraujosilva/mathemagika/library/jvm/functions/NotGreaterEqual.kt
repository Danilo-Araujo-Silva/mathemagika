package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotGreaterEqual
 *
 * Full name:        System`NotGreaterEqual
 *
 * Usage:            NotGreaterEqual[x, y, …] displays as x ≱ y ≱ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotGreaterEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotGreaterEqual.html
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
fun notGreaterEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotGreaterEqual", arguments.toMutableList(), options)
}
