package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CanonicalWarpingDistance
 *
 * Full name:        System`CanonicalWarpingDistance
 *
 *                   CanonicalWarpingDistance[s , s ] gives the canonical time warping (CTW) distance between sequences s  and s .
 *                                             1   2                                                                     1      2
 *                   CanonicalWarpingDistance[s , s , init] uses init as the initial correspondence between the two sequences.
 *                                             1   2
 *                   CanonicalWarpingDistance[s , s , init, win] uses a window win for local search.
 * Usage:                                      1   2
 *
 *                   DistanceFunction -> EuclideanDistance
 *                   MaxIterations -> 50
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CanonicalWarpingDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/CanonicalWarpingDistance.html
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
fun canonicalWarpingDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CanonicalWarpingDistance", arguments.toMutableList(), options)
}
