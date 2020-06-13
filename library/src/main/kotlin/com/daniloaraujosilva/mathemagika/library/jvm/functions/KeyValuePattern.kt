package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KeyValuePattern
 *
 * Full name:        System`KeyValuePattern
 *
 *                   KeyValuePattern[{patt , …}] is a pattern object that represents an association or list of rules that includes elements matching each of the patt .
 * Usage:                                 1                                                                                                                          i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyValuePattern
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyValuePattern.html
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
fun keyValuePattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyValuePattern", arguments.toMutableList(), options)
}
