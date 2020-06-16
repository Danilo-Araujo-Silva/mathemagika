package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindHamiltonianCycle
 *
 * Full name:        System`FindHamiltonianCycle
 *
 *                   FindHamiltonianCycle[g] finds a Hamiltonian cycle in the graph g.
 *                   FindHamiltonianCycle[g, k] finds at most k Hamiltonian cycles.
 * Usage:            FindHamiltonianCycle[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindHamiltonianCycle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindHamiltonianCycle.html
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
fun findHamiltonianCycle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindHamiltonianCycle", arguments.toMutableList(), options)
}
