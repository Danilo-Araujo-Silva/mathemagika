package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CircularQuaternionMatrixDistribution
 *
 * Full name:        System`CircularQuaternionMatrixDistribution
 *
 * Usage:            CircularQuaternionMatrixDistribution[n] represents a circular quaternion matrix distribution with matrix dimensions {2 n, 2 n} over the field of complex numbers.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CircularQuaternionMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CircularQuaternionMatrixDistribution.html
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
fun circularQuaternionMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CircularQuaternionMatrixDistribution", arguments.toMutableList(), options)
}
