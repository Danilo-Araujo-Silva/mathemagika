package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Inverse
 *
 * Full name:        System`Inverse
 *
 * Usage:            Inverse[m] gives the inverse of a square matrix m.
 *
 *                   Method -> Automatic
 *                   Modulus -> 0
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Inverse
 * Documentation:    web: http://reference.wolfram.com/language/ref/Inverse.html
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
fun inverse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Inverse", arguments.toMutableList(), options)
}
