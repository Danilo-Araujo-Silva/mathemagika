package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SignedRegionDistance
 *
 * Full name:        System`SignedRegionDistance
 *
 *                   SignedRegionDistance[reg, p] gives the minimum distance from the point p to the region reg if p is outside the region and the minimum distance to the complement of reg if p is inside the region.
 * Usage:            SignedRegionDistance[reg] gives a RegionDistanceFunction[…] that can be applied repeatedly to different points.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SignedRegionDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/SignedRegionDistance.html
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
fun signedRegionDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SignedRegionDistance", arguments.toMutableList(), options)
}
