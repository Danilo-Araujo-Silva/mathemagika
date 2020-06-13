package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HeaderDisplayFunction
 *
 * Full name:        System`HeaderDisplayFunction
 *
 * Usage:            HeaderDisplayFunction is an option for Dataset that specifies a function to apply to headers before displaying them.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeaderDisplayFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeaderDisplayFunction.html
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
fun headerDisplayFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeaderDisplayFunction", arguments.toMutableList(), options)
}
