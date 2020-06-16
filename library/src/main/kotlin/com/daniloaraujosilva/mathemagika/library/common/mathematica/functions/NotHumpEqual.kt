package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotHumpEqual
 *
 * Full name:        System`NotHumpEqual
 *
 * Usage:            NotHumpEqual[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotHumpEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotHumpEqual.html
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
fun notHumpEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotHumpEqual", arguments.toMutableList(), options)
}
