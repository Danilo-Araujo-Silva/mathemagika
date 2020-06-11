package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Majority
 *
 * Full name:        System`Majority
 *
 *                   Majority[e , e , …] gives True if the majority of the e  are True, and False if the majority are False.
 * Usage:                      1   2                                        i
 *
 * Options:          None
 *
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Majority
 * Documentation:    web: http://reference.wolfram.com/language/ref/Majority.html
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
fun majority(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Majority", arguments.toMutableList(), options)
}
