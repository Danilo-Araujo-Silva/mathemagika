package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToonShading
 *
 * Full name:        System`ToonShading
 *
 *                   ToonShading[] is a three-dimensional graphics directive specifying that surfaces that follow are to be drawn to emulate two-dimensional flat objects.
 *                   ToonShading[col] uses the color col as base color.
 *                   ToonShading[{dcol, bcol, hcol}] uses the dark color dcol, the base color bcol and highlight color hcol.
 *                   ToonShading[{w , w , w }  {dcol, bcol, hcol}] uses the colors dcol, bcol and hcol weighted by the w .
 *                                 1   2   3                                                                             i
 * Usage:            ToonShading["scheme"] uses the specified discrete color scheme in ColorData.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToonShading
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToonShading.html
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
fun toonShading(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToonShading", arguments.toMutableList(), options)
}
