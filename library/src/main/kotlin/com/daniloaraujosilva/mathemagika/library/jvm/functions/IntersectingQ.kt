package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IntersectingQ
 *
 * Full name:        System`IntersectingQ
 *
 *                   IntersectingQ[list , list ] yields True if list  and list  have at least one element in common, and False otherwise.
 * Usage:                              1      2                     1         2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IntersectingQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntersectingQ.html
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
fun intersectingQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntersectingQ", arguments.toMutableList(), options)
}
