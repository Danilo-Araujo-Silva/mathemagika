package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BenfordDistribution
 *
 * Full name:        System`BenfordDistribution
 *
 * Usage:            BenfordDistribution[b] represents a Benford distribution with base parameter b.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BenfordDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BenfordDistribution.html
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
fun benfordDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BenfordDistribution", arguments.toMutableList(), options)
}
