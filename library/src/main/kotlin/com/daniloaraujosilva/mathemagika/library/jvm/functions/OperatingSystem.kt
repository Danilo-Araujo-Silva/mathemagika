package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OperatingSystem
 *
 * Full name:        System`OperatingSystem
 *
 * Usage:            OperatingSystem is an option for file and related operations that specifies the type of operating system to use to determine file name and other conventions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OperatingSystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/OperatingSystem.html
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
fun operatingSystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OperatingSystem", arguments.toMutableList(), options)
}
