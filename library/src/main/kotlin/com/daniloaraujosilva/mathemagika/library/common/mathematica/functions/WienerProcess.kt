package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WienerProcess
 *
 * Full name:        System`WienerProcess
 *
 *                   WienerProcess[μ, σ] represents a Wiener process with a drift μ and volatility σ.
 * Usage:            WienerProcess[] represents a standard Wiener process with drift 0 and volatility 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WienerProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/WienerProcess.html
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
fun wienerProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WienerProcess", arguments.toMutableList(), options)
}
