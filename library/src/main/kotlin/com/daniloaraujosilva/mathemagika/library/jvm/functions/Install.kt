package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Install
 *
 * Full name:        System`Install
 *
 * Usage:            Install["name"] starts a WSTP-compatible external program and installs Wolfram Language definitions to call functions in it.
 *
 *                   LinkHost ->
 *                   LinkMode -> Launch
 *                   LinkOptions -> 256
 * Options:          LinkProtocol -> Automatic
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Install
 * Documentation:    web: http://reference.wolfram.com/language/ref/Install.html
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
fun install(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Install", arguments.toMutableList(), options)
}
