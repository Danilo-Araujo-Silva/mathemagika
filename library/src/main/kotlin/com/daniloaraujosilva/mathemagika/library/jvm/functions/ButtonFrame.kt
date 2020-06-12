package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonFrame
 *
 * Full name:        System`ButtonFrame
 *
 * Usage:            ButtonFrame is an option for the low-level function ButtonBox that specifies the type of frame to display around a button.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonFrame
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonFrame.html
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
fun buttonFrame(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonFrame", arguments.toMutableList(), options)
}
