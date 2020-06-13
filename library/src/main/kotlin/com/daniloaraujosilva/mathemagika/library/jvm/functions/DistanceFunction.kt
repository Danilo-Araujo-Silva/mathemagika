package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DistanceFunction
 *
 * Full name:        System`DistanceFunction
 *
 * Usage:            DistanceFunction is an option for functions such as Nearest that specifies the distance value to assume between any two specified points.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DistanceFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistanceFunction.html
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
fun distanceFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistanceFunction", arguments.toMutableList(), options)
}
