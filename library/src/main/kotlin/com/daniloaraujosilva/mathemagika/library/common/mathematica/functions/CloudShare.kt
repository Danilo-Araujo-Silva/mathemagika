package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CloudShare
 *
 * Full name:        System`CloudShare
 *
 *                   CloudShare[user] shares the current cloud document with the specified user.
 *                   CloudShare[{user , user , …}] shares the current document with all the users user .
 *                                   1      2                                                         i
 * Usage:            CloudShare[obj, users] shares the cloud object obj with the specified users.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudShare
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudShare.html
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
fun cloudShare(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudShare", arguments.toMutableList(), options)
}
