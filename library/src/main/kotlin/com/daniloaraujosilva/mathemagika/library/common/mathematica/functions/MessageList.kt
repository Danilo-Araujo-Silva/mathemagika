package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MessageList
 *
 * Full name:        System`MessageList
 *
 *                                                                                                                                             th
 * Usage:            MessageList[n] is a global object assigned to be a list of the names of messages generated during the processing of the n   input line.
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MessageList
 * Documentation:    web: http://reference.wolfram.com/language/ref/MessageList.html
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
fun messageList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MessageList", arguments.toMutableList(), options)
}
