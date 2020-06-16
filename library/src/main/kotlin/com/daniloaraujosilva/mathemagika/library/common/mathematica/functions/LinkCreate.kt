package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinkCreate
 *
 * Full name:        System`LinkCreate
 *
 *                   LinkCreate["name"] creates a WSTP link with the specified name for another program to connect to.
 * Usage:            LinkCreate[] creates a WSTP link and picks an unused name for the link.
 *
 *                   LinkMode -> Listen
 *                   LinkOptions -> 256
 * Options:          LinkProtocol -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkCreate
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkCreate.html
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
fun linkCreate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkCreate", arguments.toMutableList(), options)
}
