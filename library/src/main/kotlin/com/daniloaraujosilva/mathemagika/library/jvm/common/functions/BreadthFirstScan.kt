package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BreadthFirstScan
 *
 * Full name:        System`BreadthFirstScan
 *
 *                   BreadthFirstScan[g, s, {event   f , event   f , …}] performs a breadth-first scan (bfs) of the graph g starting at the vertex s and evaluates f  whenever "event " occurs.
 *                                                1    1       2    2                                                                                                 i                i
 *                   BreadthFirstScan[g, {event   f , event   f , …}] performs a breadth-first scan of the whole graph g.
 *                                             1    1       2    2
 * Usage:            BreadthFirstScan[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BreadthFirstScan
 * Documentation:    web: http://reference.wolfram.com/language/ref/BreadthFirstScan.html
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
fun breadthFirstScan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BreadthFirstScan", arguments.toMutableList(), options)
}
