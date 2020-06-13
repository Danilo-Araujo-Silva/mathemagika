package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindMaximumFlow
 *
 * Full name:        System`FindMaximumFlow
 *
 *                   FindMaximumFlow[g, s, t] finds the maximum flow between source vertex s and target vertex t in a graph g.
 *                   FindMaximumFlow[m, s, t] finds the maximum flow between vertex indices s and t in a graph with edge capacity matrix m.
 *                   FindMaximumFlow[data, {s , …}, {t , …}] finds the maximum flow between multi-sources s , … and multi-targets t , ….
 *                                           1        1                                                    1                       1
 *                   FindMaximumFlow[data, source, target, "property"] returns the value of "property".
 * Usage:            FindMaximumFlow[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 *                   EdgeCapacity -> Automatic
 * Options:          VertexCapacity -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindMaximumFlow
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMaximumFlow.html
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
fun findMaximumFlow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMaximumFlow", arguments.toMutableList(), options)
}
