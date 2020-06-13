package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TopologicalSort
 *
 * Full name:        System`TopologicalSort
 *
 *                   TopologicalSort[g] gives a list of vertices of g in topologically sorted order for a directed acyclic graph g.
 * Usage:            TopologicalSort[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TopologicalSort
 * Documentation:    web: http://reference.wolfram.com/language/ref/TopologicalSort.html
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
fun topologicalSort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TopologicalSort", arguments.toMutableList(), options)
}
