package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MachineName
 *
 * Full name:        System`MachineName
 *
 * Usage:            MachineName is an option to Encode which specifies the required value of $MachineName on the computer that reads the encoded file. If no value is specified, any value of $MachineName is allowed on the file-reading computer. A setting for MachineName must be a string.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun machineName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MachineName", arguments.toMutableList(), options)
}
