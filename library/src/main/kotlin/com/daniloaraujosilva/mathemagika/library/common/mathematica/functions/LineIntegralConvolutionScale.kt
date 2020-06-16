package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LineIntegralConvolutionScale
 *
 * Full name:        System`LineIntegralConvolutionScale
 *
 * Usage:            LineIntegralConvolutionScale is an option to LineIntegralConvolutionPlot and related functions that determines the scale of the line integral convolution to be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LineIntegralConvolutionScale
 * Documentation:    web: http://reference.wolfram.com/language/ref/LineIntegralConvolutionScale.html
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
fun lineIntegralConvolutionScale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LineIntegralConvolutionScale", arguments.toMutableList(), options)
}
