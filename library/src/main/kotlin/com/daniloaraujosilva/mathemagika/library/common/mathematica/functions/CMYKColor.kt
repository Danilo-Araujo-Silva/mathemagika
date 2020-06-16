package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CMYKColor
 *
 * Full name:        System`CMYKColor
 *
 *                   CMYKColor[cyan, magenta, yellow, black] is a graphics directive specifying that objects that follow are to be displayed, in the color given.
 * Usage:            CMYKColor[c, m, y, k, a] specifies opacity a.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CMYKColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/CMYKColor.html
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
fun cMYKColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CMYKColor", arguments.toMutableList(), options)
}
