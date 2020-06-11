package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WarpingDistance
 *
 * Full name:        System`WarpingDistance
 *
 *                   WarpingDistance[s , s ] gives the dynamic time warping (DTW) distance between sequences s  and s .
 *                                    1   2                                                                   1      2
 *                   WarpingDistance[s , s , win] uses a window specified by win for local search.
 * Usage:                             1   2
 *
 *                   DistanceFunction -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WarpingDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/WarpingDistance.html
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
fun warpingDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WarpingDistance", arguments.toMutableList(), options)
}
