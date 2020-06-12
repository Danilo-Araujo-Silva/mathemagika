package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeyExistsQ
 *
 * Full name:        System`KeyExistsQ
 *
 *                   KeyExistsQ[assoc, key] returns True if the specified key exists in the association assoc, and False otherwise.
 * Usage:            KeyExistsQ[key] represents an operator form of KeyExistsQ that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyExistsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyExistsQ.html
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
fun keyExistsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyExistsQ", arguments.toMutableList(), options)
}
