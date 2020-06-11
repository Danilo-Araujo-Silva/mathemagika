package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindCycle
 *
 * Full name:        System`FindCycle
 *
 *                   FindCycle[g] finds a cycle in the graph g.
 *                   FindCycle[g, k] finds a cycle of length at most k in the graph g.
 *                   FindCycle[g, {k}] finds a cycle of length exactly k.
 *                   FindCycle[g, {k   , k   }] finds a cycle of length between k    and k   .
 *                                  min   max                                    min      max
 *                   FindCycle[g, kspec, s] finds at most s cycles.
 *                   FindCycle[{g, v}, …] finds cycles that include the vertex v.
 * Usage:            FindCycle[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindCycle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindCycle.html
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
fun findCycle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindCycle", arguments.toMutableList(), options)
}
