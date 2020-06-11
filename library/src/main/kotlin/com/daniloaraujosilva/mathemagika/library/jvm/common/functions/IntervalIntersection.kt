package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntervalIntersection
 *
 * Full name:        System`IntervalIntersection
 *
 *                   IntervalIntersection[interval , interval , …] gives the interval representing all points common to each of the interval .
 * Usage:                                         1          2                                                                              i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntervalIntersection
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntervalIntersection.html
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
fun intervalIntersection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntervalIntersection", arguments.toMutableList(), options)
}
