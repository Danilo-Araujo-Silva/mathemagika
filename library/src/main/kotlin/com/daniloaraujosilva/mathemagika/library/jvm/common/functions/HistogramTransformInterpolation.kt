package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HistogramTransformInterpolation
 *
 * Full name:        System`HistogramTransformInterpolation
 *
 *                   HistogramTransformInterpolation[{x , x , …}] finds a function f so that the transformed values f(x ) are distributed nearly uniformly.
 *                                                     1   2                                                           i
 *                   HistogramTransformInterpolation[{x , x , …}, dist] finds f so that f(x ) are distributed with distribution dist.
 *                                                     1   2                               i
 * Usage:            HistogramTransformInterpolation[image, …] finds a function that reshapes the histogram of image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HistogramTransformInterpolation
 * Documentation:    web: http://reference.wolfram.com/language/ref/HistogramTransformInterpolation.html
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
fun histogramTransformInterpolation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HistogramTransformInterpolation", arguments.toMutableList(), options)
}
