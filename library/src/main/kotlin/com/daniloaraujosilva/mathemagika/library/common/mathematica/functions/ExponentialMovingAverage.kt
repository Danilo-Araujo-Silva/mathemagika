package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExponentialMovingAverage
 *
 * Full name:        System`ExponentialMovingAverage
 *
 * Usage:            ExponentialMovingAverage[list, α] gives the exponential moving average of list with smoothing constant α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExponentialMovingAverage
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExponentialMovingAverage.html
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
fun exponentialMovingAverage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExponentialMovingAverage", arguments.toMutableList(), options)
}
