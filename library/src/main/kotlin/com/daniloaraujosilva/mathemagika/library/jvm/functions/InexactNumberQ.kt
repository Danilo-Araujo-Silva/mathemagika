package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InexactNumberQ
 *
 * Full name:        System`InexactNumberQ
 *
 * Usage:            InexactNumberQ[expr] returns True if expr is an inexact real or complex number, and returns False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InexactNumberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/InexactNumberQ.html
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
fun inexactNumberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InexactNumberQ", arguments.toMutableList(), options)
}
