package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TildeEqual
 *
 * Full name:        System`TildeEqual
 *
 * Usage:            TildeEqual[x, y, …] displays as x ≃ y ≃ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/TildeEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/TildeEqual.html
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
fun tildeEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TildeEqual", arguments.toMutableList(), options)
}
