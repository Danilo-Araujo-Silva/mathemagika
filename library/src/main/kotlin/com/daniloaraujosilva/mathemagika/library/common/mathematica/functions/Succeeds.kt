package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Succeeds
 *
 * Full name:        System`Succeeds
 *
 * Usage:            Succeeds[x, y, …] displays as x ≻ y ≻ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Succeeds
 * Documentation:    web: http://reference.wolfram.com/language/ref/Succeeds.html
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
fun succeeds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Succeeds", arguments.toMutableList(), options)
}
