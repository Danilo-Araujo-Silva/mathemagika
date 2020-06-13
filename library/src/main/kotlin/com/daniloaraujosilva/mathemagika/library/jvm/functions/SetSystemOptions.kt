package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SetSystemOptions
 *
 * Full name:        System`SetSystemOptions
 *
 * Usage:            SetSystemOptions["name"  value] resets the value for the internal system option with the specified name.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetSystemOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetSystemOptions.html
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
fun setSystemOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetSystemOptions", arguments.toMutableList(), options)
}
