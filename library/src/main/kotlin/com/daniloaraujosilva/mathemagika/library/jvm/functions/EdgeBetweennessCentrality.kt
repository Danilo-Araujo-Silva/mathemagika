package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeBetweennessCentrality
 *
 * Full name:        System`EdgeBetweennessCentrality
 *
 *                   EdgeBetweennessCentrality[g] gives a list of betweenness centralities for the edges in the graph g.
 * Usage:            EdgeBetweennessCentrality[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeBetweennessCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeBetweennessCentrality.html
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
fun edgeBetweennessCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeBetweennessCentrality", arguments.toMutableList(), options)
}
