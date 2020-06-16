package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NormalizedSquaredEuclideanDistance
 *
 * Full name:        System`NormalizedSquaredEuclideanDistance
 *
 * Usage:            NormalizedSquaredEuclideanDistance[u, v] gives the normalized squared Euclidean distance between vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NormalizedSquaredEuclideanDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/NormalizedSquaredEuclideanDistance.html
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
fun normalizedSquaredEuclideanDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NormalizedSquaredEuclideanDistance", arguments.toMutableList(), options)
}
