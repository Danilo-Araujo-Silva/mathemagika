package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Negative
 *
 * Full name:        System`Negative
 *
 * Usage:            Negative[x] gives True if x is a negative number.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Negative
 * Documentation:    web: http://reference.wolfram.com/language/ref/Negative.html
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
fun negative(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Negative", arguments.toMutableList(), options)
}
