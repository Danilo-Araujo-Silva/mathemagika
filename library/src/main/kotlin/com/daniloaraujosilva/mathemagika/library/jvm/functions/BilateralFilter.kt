package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BilateralFilter
 *
 * Full name:        System`BilateralFilter
 *
 * Usage:            BilateralFilter[data, σ, μ] applies a bilateral filter of spatial spread σ and pixel value spread μ to data.
 *
 *                   MaxIterations -> 1
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BilateralFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/BilateralFilter.html
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
fun bilateralFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BilateralFilter", arguments.toMutableList(), options)
}
