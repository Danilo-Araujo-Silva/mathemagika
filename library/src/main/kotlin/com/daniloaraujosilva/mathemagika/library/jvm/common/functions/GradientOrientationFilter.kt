package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GradientOrientationFilter
 *
 * Full name:        System`GradientOrientationFilter
 *
 *                   GradientOrientationFilter[data, r] gives the local orientation parallel to the gradient of data, computed using discrete derivatives of a Gaussian of pixel radius r, returning values between -π/2 and π/2.
 * Usage:            GradientOrientationFilter[data, {r, σ}] uses a Gaussian with standard deviation σ.
 *
 *                   Method -> Automatic
 *                   Padding -> Fixed
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GradientOrientationFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GradientOrientationFilter.html
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
fun gradientOrientationFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GradientOrientationFilter", arguments.toMutableList(), options)
}
