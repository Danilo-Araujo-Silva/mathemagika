package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GraphLinkEfficiency
 *
 * Full name:        System`GraphLinkEfficiency
 *
 *                   GraphLinkEfficiency[g] gives the link efficiency of the graph g.
 * Usage:            GraphLinkEfficiency[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphLinkEfficiency
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphLinkEfficiency.html
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
fun graphLinkEfficiency(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphLinkEfficiency", arguments.toMutableList(), options)
}
