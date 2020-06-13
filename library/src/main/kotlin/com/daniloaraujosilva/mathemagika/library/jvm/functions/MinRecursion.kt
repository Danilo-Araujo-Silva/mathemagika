package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MinRecursion
 *
 * Full name:        System`MinRecursion
 *
 * Usage:            MinRecursion is an option for NIntegrate and other numerical functions that use a recursive algorithm. With MinRecursion -> n, a minimum depth of recursion of n is used before tests for convergence begin.
 *
 * Options:          None
 *
 * Attributes:       Protected
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
fun minRecursion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinRecursion", arguments.toMutableList(), options)
}
