package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ClosenessCentrality
 *
 * Full name:        System`ClosenessCentrality
 *
 *                   ClosenessCentrality[g] gives a list of closeness centralities for the vertices in the graph g.
 * Usage:            ClosenessCentrality[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClosenessCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClosenessCentrality.html
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
fun closenessCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClosenessCentrality", arguments.toMutableList(), options)
}
