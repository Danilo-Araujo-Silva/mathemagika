package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MinusPlus
 *
 * Full name:        System`MinusPlus
 *
 *                   MinusPlus[x] displays as ∓ x.
 * Usage:            MinusPlus[x, y, …] displays as x ∓ y ∓ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/MinusPlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinusPlus.html
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
fun minusPlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinusPlus", arguments.toMutableList(), options)
}
