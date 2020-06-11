package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluatorNames
 *
 * Full name:        System`EvaluatorNames
 *
 * Usage:            EvaluatorNames is a global option that specifies the kernels that are currently configured to perform evaluations.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EvaluatorNames
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluatorNames.html
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
fun evaluatorNames(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluatorNames", arguments.toMutableList(), options)
}
