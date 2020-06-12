package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BetweennessCentrality
 *
 * Full name:        System`BetweennessCentrality
 *
 *                   BetweennessCentrality[g] gives a list of betweenness centralities for the vertices in the graph g.
 * Usage:            BetweennessCentrality[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BetweennessCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/BetweennessCentrality.html
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
fun betweennessCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BetweennessCentrality", arguments.toMutableList(), options)
}
