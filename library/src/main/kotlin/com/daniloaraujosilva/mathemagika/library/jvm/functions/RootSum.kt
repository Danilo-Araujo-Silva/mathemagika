package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RootSum
 *
 * Full name:        System`RootSum
 *
 * Usage:            RootSum[f, form] represents the sum of form[x] for all x that satisfy the polynomial equation f[x] == 0.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RootSum
 * Documentation:    web: http://reference.wolfram.com/language/ref/RootSum.html
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
fun rootSum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RootSum", arguments.toMutableList(), options)
}
