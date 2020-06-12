package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LessEqualThan
 *
 * Full name:        System`LessEqualThan
 *
 * Usage:            LessEqualThan[y] is an operator form that yields x ≤ y when applied to an expression x.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LessEqualThan
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessEqualThan.html
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
fun lessEqualThan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessEqualThan", arguments.toMutableList(), options)
}
