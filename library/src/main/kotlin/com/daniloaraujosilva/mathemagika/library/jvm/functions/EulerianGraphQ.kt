package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EulerianGraphQ
 *
 * Full name:        System`EulerianGraphQ
 *
 * Usage:            EulerianGraphQ[g] yields True if the graph g is Eulerian, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EulerianGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/EulerianGraphQ.html
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
fun eulerianGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EulerianGraphQ", arguments.toMutableList(), options)
}
