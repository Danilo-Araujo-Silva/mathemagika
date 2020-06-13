package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonFunction
 *
 * Full name:        System`ButtonFunction
 *
 * Usage:            ButtonFunction is an option for the low-level function ButtonBox that specifies the function to execute when the button is active and is clicked.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonFunction.html
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
fun buttonFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonFunction", arguments.toMutableList(), options)
}
