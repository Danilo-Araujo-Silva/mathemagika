package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PERTDistribution
 *
 * Full name:        System`PERTDistribution
 *
 *                   PERTDistribution[{min, max}, c] represents a PERT distribution with range min to max and mode at c.
 * Usage:            PERTDistribution[{min, max}, c, λ] represents a modified PERT distribution with shape parameter λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PERTDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/PERTDistribution.html
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
fun pERTDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PERTDistribution", arguments.toMutableList(), options)
}
