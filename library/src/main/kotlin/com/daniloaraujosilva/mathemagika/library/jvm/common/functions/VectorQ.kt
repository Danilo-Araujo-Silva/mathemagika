package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VectorQ
 *
 * Full name:        System`VectorQ
 *
 *                   VectorQ[expr] gives True if expr is a list or a one‐dimensional SparseArray object, none of whose elements are themselves lists, and gives False otherwise.
 * Usage:            VectorQ[expr, test] gives True only if test yields True when applied to each of the elements in expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VectorQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorQ.html
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
fun vectorQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorQ", arguments.toMutableList(), options)
}
