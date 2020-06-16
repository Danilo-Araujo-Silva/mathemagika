package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectionSettings
 *
 * Full name:        System`ConnectionSettings
 *
 * Usage:            ConnectionSettings is an option for URLRead and related functions to specify advanced connection settings.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConnectionSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectionSettings.html
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
fun connectionSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectionSettings", arguments.toMutableList(), options)
}
