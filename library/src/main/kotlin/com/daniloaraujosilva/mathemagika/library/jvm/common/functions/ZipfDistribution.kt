package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ZipfDistribution
 *
 * Full name:        System`ZipfDistribution
 *
 *                   ZipfDistribution[ρ] represents a zeta distribution with parameter ρ.
 * Usage:            ZipfDistribution[n, ρ] represents a Zipf distribution with range n.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ZipfDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZipfDistribution.html
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
fun zipfDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZipfDistribution", arguments.toMutableList(), options)
}
