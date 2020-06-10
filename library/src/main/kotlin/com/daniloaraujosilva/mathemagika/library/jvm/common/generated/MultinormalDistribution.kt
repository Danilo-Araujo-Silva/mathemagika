package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MultinormalDistribution
 * 
 * Full name:        System`MultinormalDistribution
 * 
 *                   MultinormalDistribution[μ, Σ] represents a multivariate normal (Gaussian) distribution with mean vector μ and covariance matrix Σ.
 * Usage:            MultinormalDistribution[Σ] represents a multivariate normal distribution with zero mean and covariance matrix Σ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MultinormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultinormalDistribution.html
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
fun multinormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultinormalDistribution", arguments.toMutableList(), options)
}
