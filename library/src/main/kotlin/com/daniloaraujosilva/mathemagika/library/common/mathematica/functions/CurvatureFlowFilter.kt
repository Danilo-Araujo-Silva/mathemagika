package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CurvatureFlowFilter
 *
 * Full name:        System`CurvatureFlowFilter
 *
 *                   CurvatureFlowFilter[image] applies a mean curvature flow filter to image.
 *                   CurvatureFlowFilter[image, t] specifies the amount of curvature flow time t to be applied.
 * Usage:            CurvatureFlowFilter[image, t, k] applies the curvature flow with a modified conductance term parametrized by k.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurvatureFlowFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurvatureFlowFilter.html
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
fun curvatureFlowFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurvatureFlowFilter", arguments.toMutableList(), options)
}
