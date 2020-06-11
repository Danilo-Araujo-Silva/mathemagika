package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlgebraicIntegerQ
 *
 * Full name:        System`AlgebraicIntegerQ
 *
 * Usage:            AlgebraicIntegerQ[a] yields True if a is an algebraic integer, and yields False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AlgebraicIntegerQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicIntegerQ.html
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
fun algebraicIntegerQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicIntegerQ", arguments.toMutableList(), options)
}
