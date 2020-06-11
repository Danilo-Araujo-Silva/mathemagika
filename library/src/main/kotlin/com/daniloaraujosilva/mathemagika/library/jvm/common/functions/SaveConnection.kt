package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SaveConnection
 *
 * Full name:        System`SaveConnection
 *
 * Usage:            SaveConnection is an option for ServiceConnect that determines whether the connection should be saved in the authenticated user's account.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SaveConnection
 * Documentation:    web: http://reference.wolfram.com/language/ref/SaveConnection.html
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
fun saveConnection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SaveConnection", arguments.toMutableList(), options)
}
