package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TildeFullEqual
 *
 * Full name:        System`TildeFullEqual
 *
 * Usage:            TildeFullEqual[x, y, …] displays as x ≅ y ≅ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/TildeFullEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/TildeFullEqual.html
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
fun tildeFullEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TildeFullEqual", arguments.toMutableList(), options)
}
