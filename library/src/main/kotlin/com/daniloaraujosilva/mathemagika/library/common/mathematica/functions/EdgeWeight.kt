package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeWeight
 *
 * Full name:        System`EdgeWeight
 *
 * Usage:            EdgeWeight is an option and annotation for Graph and related functions that specifies an edge weight.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeWeight
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeWeight.html
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
fun edgeWeight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeWeight", arguments.toMutableList(), options)
}
