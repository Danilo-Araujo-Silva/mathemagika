package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FisherZDistribution
 *
 * Full name:        System`FisherZDistribution
 *
 * Usage:            FisherZDistribution[n, m] represents a Fisher z distribution with n numerator and m denominator degrees of freedom.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FisherZDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FisherZDistribution.html
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
fun fisherZDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FisherZDistribution", arguments.toMutableList(), options)
}
