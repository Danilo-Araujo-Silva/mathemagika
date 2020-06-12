package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CookieFunction
 *
 * Full name:        System`CookieFunction
 *
 * Usage:            CookieFunction is an option for URLRead, HTTPRequest, and related functions that gives a function to apply to each cookie received when an HTTP response is received.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CookieFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CookieFunction.html
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
fun cookieFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CookieFunction", arguments.toMutableList(), options)
}
