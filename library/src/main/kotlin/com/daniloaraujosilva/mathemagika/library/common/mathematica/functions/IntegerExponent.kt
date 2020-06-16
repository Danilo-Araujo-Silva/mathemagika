package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IntegerExponent
 *
 * Full name:        System`IntegerExponent
 *
 * Usage:            IntegerExponent[n, b] gives the highest power of b that divides n.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntegerExponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerExponent.html
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
fun integerExponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerExponent", arguments.toMutableList(), options)
}
