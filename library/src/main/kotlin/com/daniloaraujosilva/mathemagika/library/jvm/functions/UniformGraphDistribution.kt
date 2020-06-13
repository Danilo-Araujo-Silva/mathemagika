package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UniformGraphDistribution
 *
 * Full name:        System`UniformGraphDistribution
 *
 * Usage:            UniformGraphDistribution[n, m] represents a uniform graph distribution on n-vertex, m-edge graphs.
 *
 *                   DirectedEdges -> False
 * Options:          SelfLoops -> False
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UniformGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/UniformGraphDistribution.html
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
fun uniformGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UniformGraphDistribution", arguments.toMutableList(), options)
}
