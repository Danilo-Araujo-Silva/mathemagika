package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CircularSymplecticMatrixDistribution
 *
 * Full name:        System`CircularSymplecticMatrixDistribution
 *
 * Usage:            CircularSymplecticMatrixDistribution[n] represents a circular symplectic matrix distribution with matrix dimensions {2 n, 2 n} over the field of complex numbers.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CircularSymplecticMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CircularSymplecticMatrixDistribution.html
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
fun circularSymplecticMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CircularSymplecticMatrixDistribution", arguments.toMutableList(), options)
}
