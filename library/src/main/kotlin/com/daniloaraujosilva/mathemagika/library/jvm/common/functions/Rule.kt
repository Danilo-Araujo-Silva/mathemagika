package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Rule
 *
 * Full name:        System`Rule
 *
 * Usage:            lhs -> rhs or lhs  rhs represents a rule that transforms lhs to rhs.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/Rule
 * Documentation:    web: http://reference.wolfram.com/language/ref/Rule.html
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
fun rule(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Rule", arguments.toMutableList(), options)
}
