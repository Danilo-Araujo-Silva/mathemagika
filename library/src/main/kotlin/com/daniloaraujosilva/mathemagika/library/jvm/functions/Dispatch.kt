package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dispatch
 *
 * Full name:        System`Dispatch
 *
 *                   Dispatch[{lhs   rhs , lhs   rhs , …}] generates an optimized dispatch table representation of a list of rules. The object produced by Dispatch can be used to give the rules in expr/.rules.
 * Usage:                         1      1     2      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dispatch
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dispatch.html
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
fun dispatch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dispatch", arguments.toMutableList(), options)
}
