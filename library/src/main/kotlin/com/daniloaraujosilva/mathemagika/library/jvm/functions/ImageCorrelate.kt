package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCorrelate
 *
 * Full name:        System`ImageCorrelate
 *
 *                   ImageCorrelate[image, ker] gives the correlation of image with kernel ker.
 * Usage:            ImageCorrelate[image, ker, f] computes a generalized correlation in which the function f is used in place of Dot.
 *
 *                   Padding -> Fixed
 * Options:          PerformanceGoal -> Speed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCorrelate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCorrelate.html
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
fun imageCorrelate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCorrelate", arguments.toMutableList(), options)
}
