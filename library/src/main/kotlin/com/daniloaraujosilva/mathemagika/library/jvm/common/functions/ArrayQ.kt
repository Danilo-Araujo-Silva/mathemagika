package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayQ
 *
 * Full name:        System`ArrayQ
 *
 *                   ArrayQ[expr] gives True if expr is a full array or a SparseArray object, and gives False otherwise.
 *                   ArrayQ[expr, patt] requires expr to be a full array with a depth that matches the pattern patt.
 * Usage:            ArrayQ[expr, patt, test] requires also that test yield True when applied to each of the array elements in expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ArrayQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayQ.html
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
fun arrayQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayQ", arguments.toMutableList(), options)
}
