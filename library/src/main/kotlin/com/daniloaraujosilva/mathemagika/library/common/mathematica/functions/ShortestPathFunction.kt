package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ShortestPathFunction
 *
 * Full name:        System`ShortestPathFunction
 *
 * Usage:            ShortestPathFunction[type, data] represents a function that gives the shortest path from a source vertex s to target vertex t in a graph.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShortestPathFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShortestPathFunction.html
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
fun shortestPathFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShortestPathFunction", arguments.toMutableList(), options)
}
