package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Cap
 *
 * Full name:        System`Cap
 *
 * Usage:            Cap[x, y, …] displays as x ⌢ y ⌢ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Cap
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cap.html
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
fun cap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cap", arguments.toMutableList(), options)
}
