package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KeyMemberQ
 *
 * Full name:        System`KeyMemberQ
 *
 *                   KeyMemberQ[assoc, form] yields True if a key in the association assoc matches form, and False otherwise.
 * Usage:            KeyMemberQ[form] represents an operator form of KeyMemberQ that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyMemberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyMemberQ.html
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
fun keyMemberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyMemberQ", arguments.toMutableList(), options)
}
