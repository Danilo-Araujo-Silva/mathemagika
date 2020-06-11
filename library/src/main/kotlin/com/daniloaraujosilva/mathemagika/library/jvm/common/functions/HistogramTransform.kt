package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HistogramTransform
 *
 * Full name:        System`HistogramTransform
 *
 *                   HistogramTransform[image] transforms pixel values of image so that its histogram is nearly flat.
 *                   HistogramTransform[image, dist] modifies pixel values of image so that its histogram matches the probability density function (PDF) of the distribution dist.
 *                   HistogramTransform[image, ref] matches the histogram of image with the histogram of the reference image ref.
 *                   HistogramTransform[{x , x , …}, …] transforms values x .
 * Usage:                                 1   2                            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HistogramTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/HistogramTransform.html
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
fun histogramTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HistogramTransform", arguments.toMutableList(), options)
}
