package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LessThan
 *
 * Full name:        System`LessThan
 *
 * Usage:            LessThan[y] is an operator form that yields x < y when applied to an expression x.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LessThan
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessThan.html
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
fun lessThan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessThan", arguments.toMutableList(), options)
}
