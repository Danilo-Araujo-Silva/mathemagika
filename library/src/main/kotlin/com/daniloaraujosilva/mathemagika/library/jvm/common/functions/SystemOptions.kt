package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemOptions
 *
 * Full name:        System`SystemOptions
 *
 *                   SystemOptions["name"] gives the current setting for the internal system option with the specified name.
 * Usage:            SystemOptions[] gives the current settings for all settable internal system options.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SystemOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemOptions.html
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
fun systemOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemOptions", arguments.toMutableList(), options)
}
