package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StreamColorFunctionScaling
 *
 * Full name:        System`StreamColorFunctionScaling
 *
 * Usage:            StreamColorFunctionScaling is an option for graphics functions that specifies whether arguments supplied to a stream color function should be scaled to lie between 0 and 1.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StreamColorFunctionScaling
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamColorFunctionScaling.html
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
fun streamColorFunctionScaling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamColorFunctionScaling", arguments.toMutableList(), options)
}
