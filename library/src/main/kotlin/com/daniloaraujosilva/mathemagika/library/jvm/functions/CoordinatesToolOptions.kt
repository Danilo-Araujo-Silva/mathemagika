package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CoordinatesToolOptions
 *
 * Full name:        System`CoordinatesToolOptions
 *
 * Usage:            CoordinatesToolOptions is an option for Graphics that gives values of options associated with the Get Coordinates tool.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CoordinatesToolOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinatesToolOptions.html
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
fun coordinatesToolOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinatesToolOptions", arguments.toMutableList(), options)
}
