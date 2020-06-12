package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindMinimumCostFlow
 *
 * Full name:        System`FindMinimumCostFlow
 *
 *                   FindMinimumCostFlow[g, {sd , sd , …}] finds the minimum cost flow in the graph g with sd , sd , … vertex supplies or demands.
 *                                             1    2                                                        1    2
 *                   FindMinimumCostFlow[g, s, t] finds the minimum cost maximum flow between source vertex s and target vertex t in a graph g.
 *                   FindMinimumCostFlow[g, s, t, d] finds the minimum cost flow between source s and target t, with the required flow d.
 *                   FindMinimumCostFlow[m, …] finds the minimum cost flow in a graph with cost matrix m.
 *                   FindMinimumCostFlow[data, …, "property"] returns the value of "property".
 * Usage:            FindMinimumCostFlow[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 *                   EdgeCapacity -> Automatic
 * Options:          EdgeCost -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindMinimumCostFlow
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMinimumCostFlow.html
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
fun findMinimumCostFlow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMinimumCostFlow", arguments.toMutableList(), options)
}
