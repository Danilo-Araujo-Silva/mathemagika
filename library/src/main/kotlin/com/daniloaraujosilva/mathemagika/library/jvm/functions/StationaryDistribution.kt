package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StationaryDistribution
 *
 * Full name:        System`StationaryDistribution
 *
 * Usage:            StationaryDistribution[proc] represents the stationary distribution of the process proc, when it exists.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StationaryDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/StationaryDistribution.html
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
fun stationaryDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StationaryDistribution", arguments.toMutableList(), options)
}
