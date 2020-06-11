package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeyFreeQ
 *
 * Full name:        System`KeyFreeQ
 *
 *                   KeyFreeQ[assoc, form] yields True if no key in the association assoc matches form, and yields False otherwise.
 * Usage:            KeyFreeQ[form] represents an operator form of KeyFreeQ that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyFreeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyFreeQ.html
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
fun keyFreeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyFreeQ", arguments.toMutableList(), options)
}
