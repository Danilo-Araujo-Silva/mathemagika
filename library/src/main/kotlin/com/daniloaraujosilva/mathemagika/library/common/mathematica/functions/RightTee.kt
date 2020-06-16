package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RightTee
 *
 * Full name:        System`RightTee
 *
 * Usage:            RightTee[x, y] displays as x ⊢ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightTee
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightTee.html
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
fun rightTee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightTee", arguments.toMutableList(), options)
}
