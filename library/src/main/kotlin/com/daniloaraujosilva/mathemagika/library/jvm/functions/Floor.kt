package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Floor
 *
 * Full name:        System`Floor
 *
 *                   Floor[x] gives the greatest integer less than or equal to x.
 * Usage:            Floor[x, a] gives the greatest multiple of a less than or equal to x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Floor
 * Documentation:    web: http://reference.wolfram.com/language/ref/Floor.html
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
fun floor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Floor", arguments.toMutableList(), options)
}
