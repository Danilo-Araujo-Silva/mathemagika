package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GaussianSymplecticMatrixDistribution
 *
 * Full name:        System`GaussianSymplecticMatrixDistribution
 *
 *                   GaussianSymplecticMatrixDistribution[σ, n] represents a Gaussian symplectic matrix distribution with matrix dimensions {2 n, 2 n} over the field of complex numbers and scale parameter σ.
 * Usage:            GaussianSymplecticMatrixDistribution[n] represents a Gaussian symplectic matrix distribution with unit scale parameter.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaussianSymplecticMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaussianSymplecticMatrixDistribution.html
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
fun gaussianSymplecticMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaussianSymplecticMatrixDistribution", arguments.toMutableList(), options)
}
