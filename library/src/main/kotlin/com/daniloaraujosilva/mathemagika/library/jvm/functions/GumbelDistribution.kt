package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GumbelDistribution
 *
 * Full name:        System`GumbelDistribution
 *
 *                   GumbelDistribution[α, β] represents a Gumbel distribution with location parameter α and scale parameter β.
 * Usage:            GumbelDistribution[] represents a Gumbel distribution with location parameter 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GumbelDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/GumbelDistribution.html
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
fun gumbelDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GumbelDistribution", arguments.toMutableList(), options)
}
