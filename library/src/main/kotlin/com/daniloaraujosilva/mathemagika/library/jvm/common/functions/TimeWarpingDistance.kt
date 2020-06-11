package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeWarpingDistance
 *
 * Full name:        System`TimeWarpingDistance
 *
 *                   TimeWarpingDistance[s , s ] gives the dynamic time warping (DTW) distance between sequences s  and s .
 *                                        1   2                                                                   1      2
 *                   TimeWarpingDistance[s , s , r] uses a window of radius r for local search.
 * Usage:                                 1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeWarpingDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeWarpingDistance.html
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
fun timeWarpingDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeWarpingDistance", arguments.toMutableList(), options)
}
