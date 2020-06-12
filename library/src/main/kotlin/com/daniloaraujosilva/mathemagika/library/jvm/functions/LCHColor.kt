package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LCHColor
 *
 * Full name:        System`LCHColor
 *
 *                   LCHColor[l, c, h] is a color directive with lightness l, chroma c, and hue h.
 * Usage:            LCHColor[l, c, h, α] specifies opacity α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LCHColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/LCHColor.html
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
fun lCHColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LCHColor", arguments.toMutableList(), options)
}
