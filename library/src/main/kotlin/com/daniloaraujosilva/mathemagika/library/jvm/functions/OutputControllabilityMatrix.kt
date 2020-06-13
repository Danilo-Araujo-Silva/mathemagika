package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OutputControllabilityMatrix
 *
 * Full name:        System`OutputControllabilityMatrix
 *
 * Usage:            OutputControllabilityMatrix[ssm] gives the output controllability matrix of the state-space model ssm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OutputControllabilityMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputControllabilityMatrix.html
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
fun outputControllabilityMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputControllabilityMatrix", arguments.toMutableList(), options)
}
