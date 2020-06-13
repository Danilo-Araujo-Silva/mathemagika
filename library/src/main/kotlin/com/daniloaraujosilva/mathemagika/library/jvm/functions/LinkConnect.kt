package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinkConnect
 *
 * Full name:        System`LinkConnect
 *
 * Usage:            LinkConnect["name"] connects to a WSTP link created by another program.
 *
 *                   LinkHost ->
 *                   LinkMode -> Connect
 *                   LinkOptions -> 256
 * Options:          LinkProtocol -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkConnect.html
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
fun linkConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkConnect", arguments.toMutableList(), options)
}
