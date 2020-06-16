package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AcyclicGraphQ
 *
 * Full name:        System`AcyclicGraphQ
 *
 * Usage:            AcyclicGraphQ[g] yields True if the graph g is an acyclic graph and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AcyclicGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AcyclicGraphQ.html
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
fun acyclicGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AcyclicGraphQ", arguments.toMutableList(), options)
}
