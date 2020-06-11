package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LUVColor
 *
 * Full name:        System`LUVColor
 *
 *                   LUVColor[l, u, v] is a color directive with lightness l and color components u and v.
 * Usage:            LUVColor[l, u, v, α] specifies opacity α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LUVColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/LUVColor.html
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
fun lUVColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LUVColor", arguments.toMutableList(), options)
}
