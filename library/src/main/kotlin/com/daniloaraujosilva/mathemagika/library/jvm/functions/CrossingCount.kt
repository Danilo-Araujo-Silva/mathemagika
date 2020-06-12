package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CrossingCount
 *
 * Full name:        System`CrossingCount
 *
 * Usage:            CrossingCount[contour, p] gives a count of the number of times a ray starting from the point p crosses the closed curve contour.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CrossingCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/CrossingCount.html
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
fun crossingCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CrossingCount", arguments.toMutableList(), options)
}
