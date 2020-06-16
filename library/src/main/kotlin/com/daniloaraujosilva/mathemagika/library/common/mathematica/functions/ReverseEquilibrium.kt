package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ReverseEquilibrium
 *
 * Full name:        System`ReverseEquilibrium
 *
 * Usage:            ReverseEquilibrium[x, y, …] displays as x ⇋ y ⇋ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ReverseEquilibrium
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReverseEquilibrium.html
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
fun reverseEquilibrium(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReverseEquilibrium", arguments.toMutableList(), options)
}
