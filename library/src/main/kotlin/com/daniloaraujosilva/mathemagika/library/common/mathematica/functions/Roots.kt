package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Roots
 *
 * Full name:        System`Roots
 *
 * Usage:            Roots[lhs == rhs, var] yields a disjunction of equations which represent the roots of a polynomial equation.
 *
 *                   Cubics -> True
 *                   Eliminate -> False
 *                   EquatedTo -> Null
 *                   Modulus -> 0
 *                   Multiplicity -> 1
 *                   Quartics -> True
 * Options:          Using -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Roots
 * Documentation:    web: http://reference.wolfram.com/language/ref/Roots.html
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
fun roots(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Roots", arguments.toMutableList(), options)
}
