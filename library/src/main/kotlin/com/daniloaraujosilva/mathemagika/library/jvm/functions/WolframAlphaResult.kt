package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WolframAlphaResult
 *
 * Full name:        System`WolframAlphaResult
 *
 * Usage:            System`WolframAlphaResult
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
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun wolframAlphaResult(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WolframAlphaResult", arguments.toMutableList(), options)
}
