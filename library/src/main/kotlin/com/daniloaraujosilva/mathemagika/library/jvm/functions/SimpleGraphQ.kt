package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SimpleGraphQ
 *
 * Full name:        System`SimpleGraphQ
 *
 * Usage:            SimpleGraphQ[g] yields True if the graph g is a simple graph and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SimpleGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SimpleGraphQ.html
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
fun simpleGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SimpleGraphQ", arguments.toMutableList(), options)
}
