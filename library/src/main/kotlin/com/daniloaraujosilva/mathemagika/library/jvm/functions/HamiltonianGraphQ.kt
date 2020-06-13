package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HamiltonianGraphQ
 *
 * Full name:        System`HamiltonianGraphQ
 *
 * Usage:            HamiltonianGraphQ[g] yields True if the graph g is Hamiltonian, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HamiltonianGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/HamiltonianGraphQ.html
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
fun hamiltonianGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HamiltonianGraphQ", arguments.toMutableList(), options)
}
