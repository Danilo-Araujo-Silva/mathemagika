package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReplaceRepeated
 *
 * Full name:        System`ReplaceRepeated
 *
 *                   expr//.rules repeatedly performs replacements until expr no longer changes.
 * Usage:            ReplaceRepeated[rules] represents an operator form of ReplaceRepeated that can be applied to an expression.
 *
 * Options:          MaxIterations -> 65536
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReplaceRepeated
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplaceRepeated.html
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
fun replaceRepeated(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplaceRepeated", arguments.toMutableList(), options)
}
