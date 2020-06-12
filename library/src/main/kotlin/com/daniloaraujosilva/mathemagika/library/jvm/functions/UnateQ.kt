package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnateQ
 *
 * Full name:        System`UnateQ
 *
 *                   UnateQ[bexpr, {x , x , …}] tests whether the Boolean expression bexpr is positive unate in the variables x , x , … .
 *                                   1   2                                                                                     1   2
 *                   UnateQ[bexpr, {¬ x , ¬ x , …}] tests whether the Boolean expression bexpr is negative unate in the variables x , x , … .
 * Usage:                              1     2                                                                                     1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnateQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnateQ.html
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
fun unateQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnateQ", arguments.toMutableList(), options)
}
