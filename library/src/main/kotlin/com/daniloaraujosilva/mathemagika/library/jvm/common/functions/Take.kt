package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Take
 *
 * Full name:        System`Take
 *
 *                   Take[list, n] gives the first n elements of list.
 *                   Take[list, -n] gives the last n elements of list.
 *                   Take[list, {m, n}] gives elements m through n of list.
 *                   Take[list, seq , seq , …] gives a nested list in which elements specified by seq  are taken at level i in list.
 * Usage:                          1     2                                                           i
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Take
 * Documentation:    web: http://reference.wolfram.com/language/ref/Take.html
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
fun take(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Take", arguments.toMutableList(), options)
}
