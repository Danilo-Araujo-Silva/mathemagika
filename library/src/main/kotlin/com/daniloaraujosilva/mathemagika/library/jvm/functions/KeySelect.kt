package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeySelect
 *
 * Full name:        System`KeySelect
 *
 *                   KeySelect[assoc, crit] selects elements in the association assoc for which crit applied to their keys is True.
 * Usage:            KeySelect[crit] represents an operator form of KeySelect that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeySelect
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeySelect.html
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
fun keySelect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeySelect", arguments.toMutableList(), options)
}
