package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GradientFilter
 *
 * Full name:        System`GradientFilter
 *
 *                   GradientFilter[data, r] gives the magnitude of the gradient of data, computed using discrete derivatives of a Gaussian of sample radius r.
 *                   GradientFilter[data, {r, σ}] uses a Gaussian with standard deviation σ.
 *                   GradientFilter[data, {{r , r , …}, …}] uses a Gaussian with radius r  at level i in data.
 * Usage:                                    1   2                                       i
 *
 *                   Method -> Automatic
 *                   Padding -> Fixed
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GradientFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GradientFilter.html
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
fun gradientFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GradientFilter", arguments.toMutableList(), options)
}
