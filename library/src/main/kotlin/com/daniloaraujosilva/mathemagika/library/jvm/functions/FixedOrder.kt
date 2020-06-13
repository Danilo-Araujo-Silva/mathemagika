package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FixedOrder
 *
 * Full name:        System`FixedOrder
 *
 *                   FixedOrder[p , p , …] is a grammar rules pattern object that represents a sequence of elements matching p , p , …, in the fixed order given.
 * Usage:                        1   2                                                                                        1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FixedOrder
 * Documentation:    web: http://reference.wolfram.com/language/ref/FixedOrder.html
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
fun fixedOrder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FixedOrder", arguments.toMutableList(), options)
}
