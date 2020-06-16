package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegionDistanceFunction
 *
 * Full name:        System`RegionDistanceFunction
 *
 * Usage:            RegionDistanceFunction[reg, …]  represents a function whose values give the distance from a point to the region reg.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionDistanceFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionDistanceFunction.html
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
fun regionDistanceFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionDistanceFunction", arguments.toMutableList(), options)
}
