package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MovingAverage
 *
 * Full name:        System`MovingAverage
 *
 *                   MovingAverage[list, r] gives the moving average of list, computed by averaging runs of r elements.
 *                   MovingAverage[list, {w , w , …, w }] gives the moving average of list, computed with weights w .
 * Usage:                                  1   2      r                                                            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MovingAverage
 * Documentation:    web: http://reference.wolfram.com/language/ref/MovingAverage.html
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
fun movingAverage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MovingAverage", arguments.toMutableList(), options)
}
