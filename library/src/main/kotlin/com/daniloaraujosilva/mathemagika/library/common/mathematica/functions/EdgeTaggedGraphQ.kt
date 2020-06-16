package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeTaggedGraphQ
 *
 * Full name:        System`EdgeTaggedGraphQ
 *
 * Usage:            EdgeTaggedGraphQ[g] yields True if the graph g has edges tagged and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeTaggedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeTaggedGraphQ.html
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
fun edgeTaggedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeTaggedGraphQ", arguments.toMutableList(), options)
}
