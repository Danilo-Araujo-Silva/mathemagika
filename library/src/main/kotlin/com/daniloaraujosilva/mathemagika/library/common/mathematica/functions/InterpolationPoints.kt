package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InterpolationPoints
 *
 * Full name:        System`InterpolationPoints
 *
 * Usage:            InterpolationPoints is an option to SmoothKernelDistribution and FunctionInterpolation that specifies the initial number of interpolation points to use.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InterpolationPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/InterpolationPoints.html
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
fun interpolationPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InterpolationPoints", arguments.toMutableList(), options)
}
