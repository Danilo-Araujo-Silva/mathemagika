package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextStyle
 *
 * Full name:        System`TextStyle
 *
 * Usage:            TextStyle is an option for graphics functions and for Text which specifies the default style and font options with which text should be rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TextStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextStyle.html
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
fun textStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextStyle", arguments.toMutableList(), options)
}
