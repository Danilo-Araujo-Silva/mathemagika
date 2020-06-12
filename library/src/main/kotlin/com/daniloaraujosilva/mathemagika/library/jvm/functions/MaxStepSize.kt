package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxStepSize
 *
 * Full name:        System`MaxStepSize
 *
 * Usage:            MaxStepSize is an option to functions like NDSolve that specifies the maximum size of a single step used in generating a result.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxStepSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxStepSize.html
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
fun maxStepSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxStepSize", arguments.toMutableList(), options)
}
