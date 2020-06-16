package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Drop
 *
 * Full name:        System`Drop
 *
 *                   Drop[list, n] gives list with its first n elements dropped.
 *                   Drop[list, -n] gives list with its last n elements dropped.
 *                                                         th
 *                   Drop[list, {n}] gives list with its n   element dropped.
 *                   Drop[list, {m, n}] gives list with elements m through n dropped.
 *                   Drop[list, {m, n, s}] gives list with elements m through n in steps of s dropped.
 *                   Drop[list, seq , seq , …] gives a nested list in which elements specified by seq  have been dropped at level i in list.
 * Usage:                          1     2                                                           i
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Drop
 * Documentation:    web: http://reference.wolfram.com/language/ref/Drop.html
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
fun drop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Drop", arguments.toMutableList(), options)
}
