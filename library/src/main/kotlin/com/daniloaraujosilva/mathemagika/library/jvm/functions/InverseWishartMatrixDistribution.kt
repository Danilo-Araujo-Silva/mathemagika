package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseWishartMatrixDistribution
 *
 * Full name:        System`InverseWishartMatrixDistribution
 *
 * Usage:            InverseWishartMatrixDistribution[ν, Σ] represents an inverse Wishart matrix distribution with ν degrees of freedom and covariance matrix Σ.
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseWishartMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseWishartMatrixDistribution.html
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
fun inverseWishartMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseWishartMatrixDistribution", arguments.toMutableList(), options)
}
