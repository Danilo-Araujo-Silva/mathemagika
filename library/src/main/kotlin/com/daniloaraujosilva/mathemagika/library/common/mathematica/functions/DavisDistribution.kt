package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DavisDistribution
 *
 * Full name:        System`DavisDistribution
 *
 * Usage:            DavisDistribution[b, n, μ] represents a Davis distribution with scale parameter b, shape parameter n, and location parameter μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DavisDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/DavisDistribution.html
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
fun davisDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DavisDistribution", arguments.toMutableList(), options)
}
