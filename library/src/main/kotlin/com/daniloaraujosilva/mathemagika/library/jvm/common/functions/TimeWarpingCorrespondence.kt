package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeWarpingCorrespondence
 *
 * Full name:        System`TimeWarpingCorrespondence
 *
 *                   TimeWarpingCorrespondence[s , s ] gives the time warping (DTW) similarity path between sequences s  and s .
 *                                              1   2                                                                  1      2
 *                   TimeWarpingCorrespondence[s , s , r] uses a window of radius r for local search.
 * Usage:                                       1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeWarpingCorrespondence
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeWarpingCorrespondence.html
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
fun timeWarpingCorrespondence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeWarpingCorrespondence", arguments.toMutableList(), options)
}
