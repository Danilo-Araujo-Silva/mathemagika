package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BSplineSurface
 *
 * Full name:        System`BSplineSurface
 *
 * Usage:            BSplineSurface[array] is a graphics primitive that represents a nonuniform rational B-spline surface defined by an array of x, y, z control points.
 *
 *                   SplineClosed -> False
 *                   SplineDegree -> Automatic
 *                   SplineKnots -> Automatic
 * Options:          SplineWeights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BSplineSurface
 * Documentation:    web: http://reference.wolfram.com/language/ref/BSplineSurface.html
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
fun bSplineSurface(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BSplineSurface", arguments.toMutableList(), options)
}
