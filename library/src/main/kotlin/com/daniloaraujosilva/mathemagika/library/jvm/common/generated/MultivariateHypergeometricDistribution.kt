package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MultivariateHypergeometricDistribution
 * 
 * Full name:        System`MultivariateHypergeometricDistribution
 * 
 *                   MultivariateHypergeometricDistribution[n, {m , m , …, m }] represents a multivariate hypergeometric distribution with n draws without replacement from a collection containing m  objects of type i. 
 * Usage:                                                        1   2      k                                                                                                                        i
 * 
 * Options:          None
 * 
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MultivariateHypergeometricDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultivariateHypergeometricDistribution.html
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
fun multivariateHypergeometricDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultivariateHypergeometricDistribution", arguments.toMutableList(), options)
}
