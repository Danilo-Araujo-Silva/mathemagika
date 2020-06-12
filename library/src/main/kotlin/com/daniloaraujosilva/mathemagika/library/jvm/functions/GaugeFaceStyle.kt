package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaugeFaceStyle
 *
 * Full name:        System`GaugeFaceStyle
 *
 * Usage:            GaugeFaceStyle is an option for gauge functions that specifies the style in which the face is to be drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaugeFaceStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaugeFaceStyle.html
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
fun gaugeFaceStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaugeFaceStyle", arguments.toMutableList(), options)
}
