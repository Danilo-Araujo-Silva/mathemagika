package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ErlangDistribution
 *
 * Full name:        System`ErlangDistribution
 *
 * Usage:            ErlangDistribution[k, λ] represents the Erlang distribution with shape parameter k and rate λ.
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ErlangDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ErlangDistribution.html
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
fun erlangDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ErlangDistribution", arguments.toMutableList(), options)
}
