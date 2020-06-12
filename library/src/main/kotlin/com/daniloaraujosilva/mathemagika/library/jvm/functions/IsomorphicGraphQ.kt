package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IsomorphicGraphQ
 *
 * Full name:        System`IsomorphicGraphQ
 *
 *                   IsomorphicGraphQ[g , g ] yields True if the graphs g  and g  are isomorphic, and False otherwise.
 * Usage:                              1   2                             1      2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IsomorphicGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/IsomorphicGraphQ.html
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
fun isomorphicGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IsomorphicGraphQ", arguments.toMutableList(), options)
}
