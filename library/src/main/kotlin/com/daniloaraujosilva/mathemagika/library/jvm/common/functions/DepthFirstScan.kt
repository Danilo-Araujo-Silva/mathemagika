package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DepthFirstScan
 *
 * Full name:        System`DepthFirstScan
 *
 *                   DepthFirstScan[g, s, {event   f , event   f , …}] performs a depth-first scan of the graph g starting at the vertex s and evaluates f  whenever "event " occurs.
 *                                              1    1       2    2                                                                                         i                i
 *                   DepthFirstScan[g, {event   f , event   f , …}] performs a depth-first scan of the whole graph g.
 *                                           1    1       2    2
 * Usage:            DepthFirstScan[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DepthFirstScan
 * Documentation:    web: http://reference.wolfram.com/language/ref/DepthFirstScan.html
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
fun depthFirstScan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DepthFirstScan", arguments.toMutableList(), options)
}
