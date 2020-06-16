package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Rationalize
 *
 * Full name:        System`Rationalize
 *
 *                   Rationalize[x] converts an approximate number x to a nearby rational with small denominator.
 * Usage:            Rationalize[x, dx] yields the rational number with smallest denominator that lies within dx of x.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Rationalize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Rationalize.html
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
fun rationalize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Rationalize", arguments.toMutableList(), options)
}
