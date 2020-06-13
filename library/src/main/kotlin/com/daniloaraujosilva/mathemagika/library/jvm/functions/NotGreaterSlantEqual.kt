package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotGreaterSlantEqual
 *
 * Full name:        System`NotGreaterSlantEqual
 *
 * Usage:            NotGreaterSlantEqual[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotGreaterSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotGreaterSlantEqual.html
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
fun notGreaterSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotGreaterSlantEqual", arguments.toMutableList(), options)
}
