package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExponentFunction
 *
 * Full name:        System`ExponentFunction
 *
 * Usage:            ExponentFunction is an option for NumberForm and related functions that determines the exponent to use in printing approximate real numbers.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExponentFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExponentFunction.html
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
fun exponentFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExponentFunction", arguments.toMutableList(), options)
}
