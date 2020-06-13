package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Last
 *
 * Full name:        System`Last
 *
 *                   Last[expr] gives the last element in expr.
 * Usage:            Last[expr, def] gives the last element if there are any elements, or def otherwise.
 *
 * Options:          None
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Last
 * Documentation:    web: http://reference.wolfram.com/language/ref/Last.html
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
fun last(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Last", arguments.toMutableList(), options)
}
