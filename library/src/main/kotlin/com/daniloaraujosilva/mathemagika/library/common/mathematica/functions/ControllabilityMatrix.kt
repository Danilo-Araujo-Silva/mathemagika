package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ControllabilityMatrix
 *
 * Full name:        System`ControllabilityMatrix
 *
 * Usage:            ControllabilityMatrix[ssm] gives the controllability matrix of the state-space model ssm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllabilityMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllabilityMatrix.html
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
fun controllabilityMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllabilityMatrix", arguments.toMutableList(), options)
}
