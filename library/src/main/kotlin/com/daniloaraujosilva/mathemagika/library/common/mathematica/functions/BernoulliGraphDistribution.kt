package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BernoulliGraphDistribution
 *
 * Full name:        System`BernoulliGraphDistribution
 *
 * Usage:            BernoulliGraphDistribution[n, p] represents a Bernoulli graph distribution for n-vertex graphs with edge probability p.
 *
 *                   DirectedEdges -> False
 * Options:          SelfLoops -> False
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BernoulliGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BernoulliGraphDistribution.html
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
fun bernoulliGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BernoulliGraphDistribution", arguments.toMutableList(), options)
}
