package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinkRead
 *
 * Full name:        System`LinkRead
 *
 *                   LinkRead[link] reads one expression from the specified WSTP connection.
 * Usage:            LinkRead[link, h] wraps h around the expression read before evaluating it.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkRead
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkRead.html
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
fun linkRead(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkRead", arguments.toMutableList(), options)
}
