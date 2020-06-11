package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaussianUnitaryMatrixDistribution
 *
 * Full name:        System`GaussianUnitaryMatrixDistribution
 *
 *                   GaussianUnitaryMatrixDistribution[σ, n] represents a Gaussian unitary matrix distribution with matrix dimensions {n, n} and scale parameter σ.
 * Usage:            GaussianUnitaryMatrixDistribution[n] represents a Gaussian unitary matrix distribution with unit scale parameter.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaussianUnitaryMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaussianUnitaryMatrixDistribution.html
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
fun gaussianUnitaryMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaussianUnitaryMatrixDistribution", arguments.toMutableList(), options)
}
