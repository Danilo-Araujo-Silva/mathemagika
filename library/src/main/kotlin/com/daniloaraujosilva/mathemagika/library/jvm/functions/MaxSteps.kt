package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxSteps
 *
 * Full name:        System`MaxSteps
 *
 * Usage:            MaxSteps is an option to functions like NDSolve that specifies the maximum number of steps to take in generating a result.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxSteps
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxSteps.html
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
fun maxSteps(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxSteps", arguments.toMutableList(), options)
}
