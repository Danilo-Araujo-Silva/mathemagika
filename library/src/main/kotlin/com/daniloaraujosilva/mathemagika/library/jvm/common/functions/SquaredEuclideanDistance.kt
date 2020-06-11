package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquaredEuclideanDistance
 *
 * Full name:        System`SquaredEuclideanDistance
 *
 * Usage:            SquaredEuclideanDistance[u, v] gives the squared Euclidean distance between vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SquaredEuclideanDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquaredEuclideanDistance.html
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
fun squaredEuclideanDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquaredEuclideanDistance", arguments.toMutableList(), options)
}
