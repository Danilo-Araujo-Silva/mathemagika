package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AlgebraicUnitQ
 *
 * Full name:        System`AlgebraicUnitQ
 *
 * Usage:            AlgebraicUnitQ[a] yields True if a is an algebraic unit, and yields False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AlgebraicUnitQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicUnitQ.html
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
fun algebraicUnitQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicUnitQ", arguments.toMutableList(), options)
}
