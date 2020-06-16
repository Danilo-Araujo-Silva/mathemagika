package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Because
 *
 * Full name:        System`Because
 *
 * Usage:            Because[x, y] displays as x ∵ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Because
 * Documentation:    web: http://reference.wolfram.com/language/ref/Because.html
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
fun because(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Because", arguments.toMutableList(), options)
}
