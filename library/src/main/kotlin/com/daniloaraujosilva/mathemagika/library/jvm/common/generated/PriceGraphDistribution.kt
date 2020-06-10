package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PriceGraphDistribution
 * 
 * Full name:        System`PriceGraphDistribution
 * 
 * Usage:            PriceGraphDistribution[n, k, a] represents a de Solla Price graph distribution for n-vertex graphs where a new vertex with k edges is added at each step, using attractiveness parameter a.
 * 
 *                   DirectedEdges -> True
 * Options:          SelfLoops -> False
 * 
 *                   NHoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PriceGraphDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/PriceGraphDistribution.html
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
fun priceGraphDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PriceGraphDistribution", arguments.toMutableList(), options)
}
