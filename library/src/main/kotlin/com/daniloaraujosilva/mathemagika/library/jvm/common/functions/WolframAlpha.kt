package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WolframAlpha
 *
 * Full name:        System`WolframAlpha
 *
 *                   WolframAlpha["query"] sends query to Wolfram|Alpha and imports the output.
 * Usage:            WolframAlpha["query", format] imports the output according to the specified format.
 *
 *                   AppearanceElements -> Automatic
 *                   Asynchronous -> False
 *                   ExcludePods -> None
 *                   IgnoreCase -> False
 *                   IncludePods -> All
 *                   InputAssumptions -> {}
 *                   Method -> {}
 *                   PodStates -> {}
 *                   PodWidth -> Automatic
 * Options:          TimeConstraint -> 30
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WolframAlpha
 * Documentation:    web: http://reference.wolfram.com/language/ref/WolframAlpha.html
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
fun wolframAlpha(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WolframAlpha", arguments.toMutableList(), options)
}
