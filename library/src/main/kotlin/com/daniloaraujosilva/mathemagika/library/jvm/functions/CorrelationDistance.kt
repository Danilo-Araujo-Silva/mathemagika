package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CorrelationDistance
 *
 * Full name:        System`CorrelationDistance
 *
 * Usage:            CorrelationDistance[u, v] gives the correlation coefficient distance between vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CorrelationDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/CorrelationDistance.html
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
fun correlationDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CorrelationDistance", arguments.toMutableList(), options)
}
