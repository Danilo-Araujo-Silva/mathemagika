package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CanonicalWarpingCorrespondence
 * 
 * Full name:        System`CanonicalWarpingCorrespondence
 * 
 *                   CanonicalWarpingCorrespondence[s , s ] gives the canonical time warping (CTW) correspondence between sequences s  and s .
 *                                                   1   2                                                                           1      2
 *                   CanonicalWarpingCorrespondence[s , s , warp] uses warp as initial warping correspondence.
 *                                                   1   2
 *                   CanonicalWarpingCorrespondence[s , s , warp, win] uses a window win for local search.
 * Usage:                                            1   2
 * 
 *                   DistanceFunction -> EuclideanDistance
 *                   MaxIterations -> 50
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CanonicalWarpingCorrespondence
 * Documentation:    web: http://reference.wolfram.com/language/ref/CanonicalWarpingCorrespondence.html
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
fun canonicalWarpingCorrespondence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CanonicalWarpingCorrespondence", arguments.toMutableList(), options)
}
