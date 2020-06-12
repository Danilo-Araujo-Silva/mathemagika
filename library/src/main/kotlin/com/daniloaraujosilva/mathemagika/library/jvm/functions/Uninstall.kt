package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Uninstall
 *
 * Full name:        System`Uninstall
 *
 * Usage:            Uninstall[link] terminates an external program started by Install, and removes Wolfram Language definitions set up by it.
 *
 * Options:          None
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Uninstall
 * Documentation:    web: http://reference.wolfram.com/language/ref/Uninstall.html
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
fun uninstall(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Uninstall", arguments.toMutableList(), options)
}
