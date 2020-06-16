package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TracyWidomDistribution
 *
 * Full name:        System`TracyWidomDistribution
 *
 * Usage:            TracyWidomDistribution[β] represents a Tracy–Widom distribution with Dyson index β.
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TracyWidomDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TracyWidomDistribution.html
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
fun tracyWidomDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TracyWidomDistribution", arguments.toMutableList(), options)
}
