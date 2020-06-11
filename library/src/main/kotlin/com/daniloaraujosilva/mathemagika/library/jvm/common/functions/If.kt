package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             If
 *
 * Full name:        System`If
 *
 *                   If[condition, t, f] gives t if condition evaluates to True, and f if it evaluates to False.
 * Usage:            If[condition, t, f, u] gives u if condition evaluates to neither True nor False.
 *
 * Options:          None
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/If
 * Documentation:    web: http://reference.wolfram.com/language/ref/If.html
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
fun `if`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("If", arguments.toMutableList(), options)
}
