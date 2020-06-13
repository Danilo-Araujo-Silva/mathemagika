package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CircularUnitaryMatrixDistribution
 *
 * Full name:        System`CircularUnitaryMatrixDistribution
 *
 * Usage:            CircularUnitaryMatrixDistribution[n] represents a circular unitary matrix distribution with matrix dimensions {n, n}.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CircularUnitaryMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CircularUnitaryMatrixDistribution.html
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
fun circularUnitaryMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CircularUnitaryMatrixDistribution", arguments.toMutableList(), options)
}
