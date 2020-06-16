package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Disjunction
 *
 * Full name:        System`Disjunction
 *
 *                   Disjunction[expr, {a , a , …}] gives the disjunction of expr over all choices of the Boolean variables a .
 * Usage:                                1   2                                                                               i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Disjunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/Disjunction.html
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
fun disjunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Disjunction", arguments.toMutableList(), options)
}
