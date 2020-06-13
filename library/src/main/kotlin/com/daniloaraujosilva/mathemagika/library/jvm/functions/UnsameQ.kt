package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UnsameQ
 *
 * Full name:        System`UnsameQ
 *
 * Usage:            lhs =!= rhs yields True if the expression lhs is not identical to rhs, and yields False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnsameQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnsameQ.html
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
fun unsameQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnsameQ", arguments.toMutableList(), options)
}
