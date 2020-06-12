package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonData
 *
 * Full name:        System`ButtonData
 *
 * Usage:            ButtonData is an option for the low-level function ButtonBox that specifies the second argument to give to the ButtonFunction for the button when the button is active and is clicked.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonData.html
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
fun buttonData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonData", arguments.toMutableList(), options)
}
