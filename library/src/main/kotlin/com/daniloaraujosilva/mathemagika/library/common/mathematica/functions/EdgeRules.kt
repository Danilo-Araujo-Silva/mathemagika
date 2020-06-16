package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeRules
 *
 * Full name:        System`EdgeRules
 *
 *                   EdgeRules[g] gives the list of edge rules for the graph g.
 * Usage:            EdgeRules[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeRules.html
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
fun edgeRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeRules", arguments.toMutableList(), options)
}
