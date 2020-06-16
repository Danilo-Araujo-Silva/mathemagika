package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Authentication
 *
 * Full name:        System`Authentication
 *
 * Usage:            Authentication is an option for cloud, web and SSH access functions that allows authentication parameters to be given.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Authentication
 * Documentation:    web: http://reference.wolfram.com/language/ref/Authentication.html
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
fun authentication(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Authentication", arguments.toMutableList(), options)
}
