package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ObservabilityMatrix
 *
 * Full name:        System`ObservabilityMatrix
 *
 * Usage:            ObservabilityMatrix[ssm] gives the observability matrix of the state-space model ssm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ObservabilityMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ObservabilityMatrix.html
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
fun observabilityMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ObservabilityMatrix", arguments.toMutableList(), options)
}
