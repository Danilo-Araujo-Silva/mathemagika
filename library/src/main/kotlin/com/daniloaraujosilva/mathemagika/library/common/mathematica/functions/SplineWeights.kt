package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SplineWeights
 *
 * Full name:        System`SplineWeights
 *
 * Usage:            SplineWeights is an option for B-spline functions and graphics primitives that specifies weights of control points.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SplineWeights
 * Documentation:    web: http://reference.wolfram.com/language/ref/SplineWeights.html
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
fun splineWeights(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SplineWeights", arguments.toMutableList(), options)
}
