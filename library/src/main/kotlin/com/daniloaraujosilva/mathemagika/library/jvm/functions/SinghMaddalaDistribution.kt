package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SinghMaddalaDistribution
 *
 * Full name:        System`SinghMaddalaDistribution
 *
 * Usage:            SinghMaddalaDistribution[q, a, b] represents the Singh–Maddala distribution with shape parameters q and a and scale parameter b.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SinghMaddalaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SinghMaddalaDistribution.html
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
fun singhMaddalaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SinghMaddalaDistribution", arguments.toMutableList(), options)
}
