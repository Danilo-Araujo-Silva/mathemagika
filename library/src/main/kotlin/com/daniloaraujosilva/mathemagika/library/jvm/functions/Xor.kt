package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Xor
 *
 * Full name:        System`Xor
 *
 *                   Xor[e , e , …] is the logical XOR (exclusive OR) function. It gives True if an odd number of the e  are True, and the rest are False. It gives False if an even number of the e  are True, and the rest are False.
 * Usage:                 1   2                                                                                        i                                                                            i
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Xor
 * Documentation:    web: http://reference.wolfram.com/language/ref/Xor.html
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
fun xor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Xor", arguments.toMutableList(), options)
}
