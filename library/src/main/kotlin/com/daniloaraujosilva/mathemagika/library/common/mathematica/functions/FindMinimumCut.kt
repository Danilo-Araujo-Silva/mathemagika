package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindMinimumCut
 *
 * Full name:        System`FindMinimumCut
 *
 *                   FindMinimumCut[g] gives the minimum cut of the graph g.
 * Usage:            FindMinimumCut[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          EdgeWeight -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindMinimumCut
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMinimumCut.html
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
fun findMinimumCut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMinimumCut", arguments.toMutableList(), options)
}
