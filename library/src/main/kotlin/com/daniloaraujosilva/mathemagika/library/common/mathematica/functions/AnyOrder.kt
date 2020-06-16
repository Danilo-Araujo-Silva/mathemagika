package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AnyOrder
 *
 * Full name:        System`AnyOrder
 *
 *                   AnyOrder[p , p , …] is a grammar rules pattern object that represents a sequence of elements matching p , p , … in any order.
 * Usage:                      1   2                                                                                        1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnyOrder
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnyOrder.html
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
fun anyOrder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnyOrder", arguments.toMutableList(), options)
}
