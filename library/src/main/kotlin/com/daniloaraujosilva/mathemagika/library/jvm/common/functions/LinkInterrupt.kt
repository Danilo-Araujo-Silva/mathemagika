package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LinkInterrupt
 *
 * Full name:        System`LinkInterrupt
 *
 * Usage:            LinkInterrupt[link] sends an interrupt to the program at the other end of the specified WSTP connection.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LinkInterrupt
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkInterrupt.html
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
fun linkInterrupt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkInterrupt", arguments.toMutableList(), options)
}
