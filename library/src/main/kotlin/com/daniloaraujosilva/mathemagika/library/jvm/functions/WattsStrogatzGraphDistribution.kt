package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WattsStrogatzGraphDistribution
 *
 * Full name:        System`WattsStrogatzGraphDistribution
 *
 *                   WattsStrogatzGraphDistribution[n, p] represents the Watts–Strogatz graph distribution for n-vertex graphs with rewiring probability p.
 * Usage:            WattsStrogatzGraphDistribution[n, p, k] represents the Watts–Strogatz graph distribution for n-vertex graphs with rewiring probability p starting from a 2k-regular graph.
 *
 * Options:          None
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WattsStrogatzGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WattsStrogatzGraphDistribution.html
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
fun wattsStrogatzGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WattsStrogatzGraphDistribution", arguments.toMutableList(), options)
}
