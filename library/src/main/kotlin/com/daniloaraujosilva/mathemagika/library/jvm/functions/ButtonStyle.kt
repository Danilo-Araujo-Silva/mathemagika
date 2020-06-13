package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonStyle
 *
 * Full name:        System`ButtonStyle
 *
 * Usage:            ButtonStyle is an option for ButtonBox that specifies the default properties for the button.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonStyle.html
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
fun buttonStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonStyle", arguments.toMutableList(), options)
}
