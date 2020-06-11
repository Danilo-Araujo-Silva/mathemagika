package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InString
 *
 * Full name:        System`InString
 *
 *                                                                                           th
 * Usage:            InString[n] is a global object that is assigned to be the text of the n   input line.
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InString
 * Documentation:    web: http://reference.wolfram.com/language/ref/InString.html
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
fun inString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InString", arguments.toMutableList(), options)
}
