package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CloudUnshare
 *
 * Full name:        System`CloudUnshare
 *
 *                   CloudUnshare[obj] cancels sharing of the cloud object obj with everyone.
 * Usage:            CloudUnshare[obj, users] cancels sharing with the specified list of users.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudUnshare
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudUnshare.html
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
fun cloudUnshare(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudUnshare", arguments.toMutableList(), options)
}
