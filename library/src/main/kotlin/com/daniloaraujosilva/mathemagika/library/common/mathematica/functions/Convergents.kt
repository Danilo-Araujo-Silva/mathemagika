package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Convergents
 *
 * Full name:        System`Convergents
 *
 *                   Convergents[list] gives a list of the convergents corresponding to the continued fraction terms list.
 *                   Convergents[x, n] gives the first n convergents for a number x.
 * Usage:            Convergents[x] gives if possible all convergents leading to the number x.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Convergents
 * Documentation:    web: http://reference.wolfram.com/language/ref/Convergents.html
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
fun convergents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Convergents", arguments.toMutableList(), options)
}
