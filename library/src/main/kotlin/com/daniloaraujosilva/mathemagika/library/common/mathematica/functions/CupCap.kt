package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CupCap
 *
 * Full name:        System`CupCap
 *
 * Usage:            CupCap[x, y, …] displays as x ≍ y ≍ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CupCap
 * Documentation:    web: http://reference.wolfram.com/language/ref/CupCap.html
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
fun cupCap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CupCap", arguments.toMutableList(), options)
}
