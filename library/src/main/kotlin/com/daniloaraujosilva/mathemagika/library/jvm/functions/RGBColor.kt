package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor
 *
 * Full name:        System`RGBColor
 *
 *                   RGBColor[red, green, blue] is a graphics directive specifying that objects that follow are to be displayed in the color given.
 *                   RGBColor[r, g, b, a] specifies opacity a.
 * Usage:            RGBColor["string"] evaluates to a normal RGBColor object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RGBColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/RGBColor.html
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
fun rGBColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RGBColor", arguments.toMutableList(), options)
}
