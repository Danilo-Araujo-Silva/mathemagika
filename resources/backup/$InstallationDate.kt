package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $InstallationDate
 *
 * Full name:        System`$InstallationDate
 *
 * Usage:            $InstallationDate gives the date and time at which the copy of the Wolfram System kernel you are running was installed.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/$InstallationDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/$InstallationDate.html
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
fun `$InstallationDate`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$InstallationDate", arguments.toMutableList(), options)
}
