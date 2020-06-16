package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Conjunction
 *
 * Full name:        System`Conjunction
 *
 *                   Conjunction[expr, {a , a , …}] gives the conjunction of expr over all choices of the Boolean variables a .
 * Usage:                                1   2                                                                               i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Conjunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/Conjunction.html
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
fun conjunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Conjunction", arguments.toMutableList(), options)
}
