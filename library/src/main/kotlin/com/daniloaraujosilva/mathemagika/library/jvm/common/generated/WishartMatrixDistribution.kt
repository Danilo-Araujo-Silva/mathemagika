package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WishartMatrixDistribution
 * 
 * Full name:        System`WishartMatrixDistribution
 * 
 * Usage:            WishartMatrixDistribution[ν, Σ] represents a Wishart matrix distribution with ν degrees of freedom and covariance matrix Σ.
 * 
 * Options:          None
 * 
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WishartMatrixDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WishartMatrixDistribution.html
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
fun wishartMatrixDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WishartMatrixDistribution", arguments.toMutableList(), options)
}
