package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SplineKnots
 *
 * Full name:        System`SplineKnots
 *
 * Usage:            SplineKnots is an option for B-spline functions and graphics primitives that specifies the positions of knots.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SplineKnots
 * Documentation:    web: http://reference.wolfram.com/language/ref/SplineKnots.html
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
fun splineKnots(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SplineKnots", arguments.toMutableList(), options)
}
