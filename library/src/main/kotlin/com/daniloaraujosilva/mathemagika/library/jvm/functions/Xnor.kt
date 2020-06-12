package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Xnor
 *
 * Full name:        System`Xnor
 *
 *                   Xnor[e , e , …] is the logical XNOR (not XOR) function. It gives True if an even number of the e  are True, and the rest are False. It gives False if an odd number of the e  are True, and the rest are False.
 * Usage:                  1   2                                                                                     i                                                                           i
 *
 * Options:          None
 *
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Xnor
 * Documentation:    web: http://reference.wolfram.com/language/ref/Xnor.html
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
fun xnor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Xnor", arguments.toMutableList(), options)
}
