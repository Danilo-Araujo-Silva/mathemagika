package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TriangularDistribution
 *
 * Full name:        System`TriangularDistribution
 *
 *                   TriangularDistribution[{min, max}] represents a symmetric triangular statistical distribution giving values between min and max.
 *                   TriangularDistribution[] represents a symmetric triangular statistical distribution giving values between 0 and 1.
 * Usage:            TriangularDistribution[{min, max}, c] represents a triangular distribution with mode at c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TriangularDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TriangularDistribution.html
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
fun triangularDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TriangularDistribution", arguments.toMutableList(), options)
}
