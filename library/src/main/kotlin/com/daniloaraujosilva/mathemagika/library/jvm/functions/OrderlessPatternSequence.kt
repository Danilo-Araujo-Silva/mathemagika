package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OrderlessPatternSequence
 *
 * Full name:        System`OrderlessPatternSequence
 *
 *                   OrderlessPatternSequence[p , p , …] is a pattern object that represents a sequence of arguments matching p , p , … in any order.
 * Usage:                                      1   2                                                                           1   2
 *
 * Options:          None
 *
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OrderlessPatternSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrderlessPatternSequence.html
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
fun orderlessPatternSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrderlessPatternSequence", arguments.toMutableList(), options)
}
