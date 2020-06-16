package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegionDistance
 *
 * Full name:        System`RegionDistance
 *
 *                   RegionDistance[reg, p] gives the minimum distance from the point p to the region reg.
 * Usage:            RegionDistance[reg] gives a RegionDistanceFunction[…] that can be applied repeatedly to different points.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RegionDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionDistance.html
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
fun regionDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionDistance", arguments.toMutableList(), options)
}
