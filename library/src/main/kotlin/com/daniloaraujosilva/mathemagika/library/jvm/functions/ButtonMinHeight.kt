package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonMinHeight
 *
 * Full name:        System`ButtonMinHeight
 *
 * Usage:            ButtonMinHeight is an option for the low-level function ButtonBox that specifies the minimum total height in units of font size that should be allowed for the button.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonMinHeight
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonMinHeight.html
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
fun buttonMinHeight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonMinHeight", arguments.toMutableList(), options)
}
