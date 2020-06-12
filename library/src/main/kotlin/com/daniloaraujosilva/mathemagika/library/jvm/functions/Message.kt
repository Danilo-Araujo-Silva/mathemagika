package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Message
 *
 * Full name:        System`Message
 *
 *                   Message[symbol :: tag] prints the message symbol :: tag unless it has been switched off.
 *                   Message[symbol :: tag, e , e , …] prints a message, inserting the values of the e  as needed.
 * Usage:                                    1   2                                                    i
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Message
 * Documentation:    web: http://reference.wolfram.com/language/ref/Message.html
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
fun message(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Message", arguments.toMutableList(), options)
}
