package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Extract
 *
 * Full name:        System`Extract
 *
 *                   Extract[expr, pos] extracts the part of expr at the position specified by pos.
 *                   Extract[expr, {pos , pos , …}] extracts a list of parts of expr.
 *                                     1     2
 *                   Extract[expr, pos, h] extracts parts of expr, wrapping each of them with head h before evaluation.
 * Usage:            Extract[pos] represents an operator form of Extract that can be applied to an expression.
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Extract
 * Documentation:    web: http://reference.wolfram.com/language/ref/Extract.html
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
fun extract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Extract", arguments.toMutableList(), options)
}
