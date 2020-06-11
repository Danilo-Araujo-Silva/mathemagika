package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CauchyDistribution
 *
 * Full name:        System`CauchyDistribution
 *
 *                   CauchyDistribution[a, b] represents a Cauchy distribution with location parameter a and scale parameter b.
 * Usage:            CauchyDistribution[] represents a Cauchy distribution with location parameter 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CauchyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CauchyDistribution.html
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
fun cauchyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CauchyDistribution", arguments.toMutableList(), options)
}
