package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LABColor
 *
 * Full name:        System`LABColor
 *
 *                   LABColor[l, a, b] is a color directive with lightness l and color components a and b.
 * Usage:            LABColor[l, a, b, α] specifies opacity α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LABColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/LABColor.html
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
fun lABColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LABColor", arguments.toMutableList(), options)
}
