package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DisplayFunction
 *
 * Full name:        System`DisplayFunction
 *
 * Usage:            DisplayFunction is an option for graphics and sound functions that specifies a function to apply to graphics and sound objects before returning them.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DisplayFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisplayFunction.html
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
fun displayFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisplayFunction", arguments.toMutableList(), options)
}
