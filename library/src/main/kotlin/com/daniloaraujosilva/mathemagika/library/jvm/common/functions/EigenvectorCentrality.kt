package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EigenvectorCentrality
 *
 * Full name:        System`EigenvectorCentrality
 *
 *                   EigenvectorCentrality[g] gives a list of eigenvector centralities for the vertices in the graph g.
 *                   EigenvectorCentrality[g, "In"] gives a list of in-centralities for a directed graph g.
 *                   EigenvectorCentrality[g, "Out"] gives a list of out-centralities for a directed graph g.
 * Usage:            EigenvectorCentrality[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EigenvectorCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/EigenvectorCentrality.html
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
fun eigenvectorCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EigenvectorCentrality", arguments.toMutableList(), options)
}
