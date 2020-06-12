package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DagumDistribution
 *
 * Full name:        System`DagumDistribution
 *
 * Usage:            DagumDistribution[p, a, b] represents a Dagum distribution with shape parameters p and a and scale parameter b.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DagumDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/DagumDistribution.html
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
fun dagumDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DagumDistribution", arguments.toMutableList(), options)
}
