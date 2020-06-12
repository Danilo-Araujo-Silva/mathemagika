package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NoncentralFRatioDistribution
 *
 * Full name:        System`NoncentralFRatioDistribution
 *
 *                   NoncentralFRatioDistribution[n, m, λ] represents a noncentral F-ratio distribution with n numerator degrees of freedom, m denominator degrees of freedom, and numerator noncentrality parameter λ.
 * Usage:            NoncentralFRatioDistribution[n, m, λ, η] represents a doubly noncentral F-ratio distribution with numerator noncentrality parameter λ and denominator noncentrality parameter η.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NoncentralFRatioDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NoncentralFRatioDistribution.html
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
fun noncentralFRatioDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NoncentralFRatioDistribution", arguments.toMutableList(), options)
}
