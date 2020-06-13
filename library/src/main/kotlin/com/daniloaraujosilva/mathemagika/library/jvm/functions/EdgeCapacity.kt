package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeCapacity
 *
 * Full name:        System`EdgeCapacity
 *
 * Usage:            EdgeCapacity is an option and annotation for Graph and related functions that specifies an edge capacity.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeCapacity
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeCapacity.html
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
fun edgeCapacity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeCapacity", arguments.toMutableList(), options)
}
