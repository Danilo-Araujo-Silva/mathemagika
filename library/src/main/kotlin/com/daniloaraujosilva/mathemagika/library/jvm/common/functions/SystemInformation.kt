package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemInformation
 *
 * Full name:        System`SystemInformation
 *
 *                   SystemInformation[] gives detailed information about the Wolfram System being run.
 *                   SystemInformation["comp"] gives a list of rules with information about the component "comp".
 * Usage:            SystemInformation["comp", "prop"] gives the value of property "prop" for component "comp".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemInformation.html
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
fun systemInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemInformation", arguments.toMutableList(), options)
}
