package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Proportional
 *
 * Full name:        System`Proportional
 *
 * Usage:            Proportional[x, y, …] displays as x ∝ y ∝ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Proportional
 * Documentation:    web: http://reference.wolfram.com/language/ref/Proportional.html
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
fun proportional(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Proportional", arguments.toMutableList(), options)
}
