package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindowFrame
 *
 * Full name:        System`WindowFrame
 *
 * Usage:            WindowFrame is a notebook option that specifies the type of frame to draw around the window in which the notebook is displayed on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowFrame
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowFrame.html
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
fun windowFrame(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowFrame", arguments.toMutableList(), options)
}
