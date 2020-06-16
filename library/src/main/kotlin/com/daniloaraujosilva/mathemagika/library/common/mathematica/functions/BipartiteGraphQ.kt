package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BipartiteGraphQ
 *
 * Full name:        System`BipartiteGraphQ
 *
 * Usage:            BipartiteGraphQ[g] yields True if the graph g is a bipartite graph and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BipartiteGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/BipartiteGraphQ.html
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
fun bipartiteGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BipartiteGraphQ", arguments.toMutableList(), options)
}
