package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Keys
 *
 * Full name:        System`Keys
 *
 *                   Keys[ key   val , key   val , … ] gives a list of the keys key  in an association.
 *                             1      1     2      2                                   i
 *                   Keys[{key   val , key   val , …}] gives a list of the key  in a list of rules.
 *                            1      1     2      2                             i
 * Usage:            Keys[expr, h] gives a list of keys in expr, wrapping each of them with head h before evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Keys
 * Documentation:    web: http://reference.wolfram.com/language/ref/Keys.html
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
fun keys(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Keys", arguments.toMutableList(), options)
}
