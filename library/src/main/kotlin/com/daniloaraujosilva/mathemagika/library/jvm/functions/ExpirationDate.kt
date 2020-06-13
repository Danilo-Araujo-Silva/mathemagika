package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExpirationDate
 *
 * Full name:        System`ExpirationDate
 *
 * Usage:            ExpirationDate is an option for various functions that specifies when a persistent value should be treated as expired.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExpirationDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpirationDate.html
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
fun expirationDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpirationDate", arguments.toMutableList(), options)
}
