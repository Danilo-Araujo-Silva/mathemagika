package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SignPadding
 *
 * Full name:        System`SignPadding
 *
 * Usage:            SignPadding is an option for NumberForm and related functions that specifies whether padding should be inserted after signs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SignPadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/SignPadding.html
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
fun signPadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SignPadding", arguments.toMutableList(), options)
}
