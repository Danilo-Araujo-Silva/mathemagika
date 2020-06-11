package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluationEnvironment
 *
 * Full name:        System`EvaluationEnvironment
 *
 * Usage:            EvaluationEnvironment is an option for functions such as InitializationValue and InitializationObjects that specifies the environment in which an initialization is intended to be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EvaluationEnvironment
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationEnvironment.html
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
fun evaluationEnvironment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationEnvironment", arguments.toMutableList(), options)
}
