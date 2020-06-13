package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             XYZColor
 *
 * Full name:        System`XYZColor
 *
 *                   XYZColor[x, y, z] is a color directive with tristimulus values x, y, and z.
 * Usage:            XYZColor[x, y, z, α] specifies opacity α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/XYZColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/XYZColor.html
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
fun xYZColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("XYZColor", arguments.toMutableList(), options)
}
