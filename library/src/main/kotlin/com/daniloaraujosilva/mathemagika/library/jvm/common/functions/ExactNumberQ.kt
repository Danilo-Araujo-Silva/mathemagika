package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExactNumberQ
 *
 * Full name:        System`ExactNumberQ
 *
 * Usage:            ExactNumberQ[expr] returns True if expr is an exact real or complex number, and returns False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExactNumberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExactNumberQ.html
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
fun exactNumberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExactNumberQ", arguments.toMutableList(), options)
}
