package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CounterClockwiseContourIntegral
 *
 * Full name:        System`CounterClockwiseContourIntegral
 *
 * Usage:            System`CounterClockwiseContourIntegral
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun counterClockwiseContourIntegral(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CounterClockwiseContourIntegral", arguments.toMutableList(), options)
}
