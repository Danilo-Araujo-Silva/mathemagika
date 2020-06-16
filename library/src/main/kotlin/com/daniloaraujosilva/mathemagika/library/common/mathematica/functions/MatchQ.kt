package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatchQ
 *
 * Full name:        System`MatchQ
 *
 *                   MatchQ[expr, form] returns True if the pattern form matches expr, and returns False otherwise.
 * Usage:            MatchQ[form] represents an operator form of MatchQ that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatchQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatchQ.html
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
fun matchQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatchQ", arguments.toMutableList(), options)
}
