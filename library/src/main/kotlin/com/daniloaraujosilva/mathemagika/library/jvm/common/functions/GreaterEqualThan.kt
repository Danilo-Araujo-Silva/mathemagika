package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterEqualThan
 *
 * Full name:        System`GreaterEqualThan
 *
 * Usage:            GreaterEqualThan[y] is an operator form that yields x ≥ y when applied to an expression x.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GreaterEqualThan
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterEqualThan.html
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
fun greaterEqualThan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterEqualThan", arguments.toMutableList(), options)
}
