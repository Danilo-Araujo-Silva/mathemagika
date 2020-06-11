package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FreeQ
 *
 * Full name:        System`FreeQ
 *
 *                   FreeQ[expr, form] yields True if no subexpression in expr matches form, and yields False otherwise.
 *                   FreeQ[expr, form, levelspec] tests only those parts of expr on levels specified by levelspec.
 * Usage:            FreeQ[form] represents an operator form of FreeQ that can be applied to an expression.
 *
 * Options:          Heads -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FreeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/FreeQ.html
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
fun freeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FreeQ", arguments.toMutableList(), options)
}
