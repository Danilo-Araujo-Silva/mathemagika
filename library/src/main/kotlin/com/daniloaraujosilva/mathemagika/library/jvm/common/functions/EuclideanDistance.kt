package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EuclideanDistance
 *
 * Full name:        System`EuclideanDistance
 *
 * Usage:            EuclideanDistance[u, v] gives the Euclidean distance between vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EuclideanDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/EuclideanDistance.html
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
fun euclideanDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EuclideanDistance", arguments.toMutableList(), options)
}
