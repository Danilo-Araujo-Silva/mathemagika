package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WarpingCorrespondence
 *
 * Full name:        System`WarpingCorrespondence
 *
 *                   WarpingCorrespondence[s , s ] gives the time warping (DTW) similarity path between sequences s  and s .
 *                                          1   2                                                                  1      2
 *                   WarpingCorrespondence[s , s , win] uses a window specified by win for local search.
 * Usage:                                   1   2
 *
 *                   DistanceFunction -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WarpingCorrespondence
 * Documentation:    web: http://reference.wolfram.com/language/ref/WarpingCorrespondence.html
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
fun warpingCorrespondence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WarpingCorrespondence", arguments.toMutableList(), options)
}
