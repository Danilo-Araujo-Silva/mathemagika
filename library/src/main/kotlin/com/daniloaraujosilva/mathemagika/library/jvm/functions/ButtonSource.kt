package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonSource
 *
 * Full name:        System`ButtonSource
 *
 * Usage:            ButtonSource is an option for the low-level function ButtonBox that specifies the first argument to give to the ButtonFunction for the button when the button is active and is clicked.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonSource
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonSource.html
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
fun buttonSource(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonSource", arguments.toMutableList(), options)
}
