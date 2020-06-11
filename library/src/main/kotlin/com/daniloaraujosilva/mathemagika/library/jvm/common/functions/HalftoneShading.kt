package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HalftoneShading
 *
 * Full name:        System`HalftoneShading
 *
 *                   HalftoneShading[] is a three-dimensional graphics directive specifying that surfaces that follow are to be drawn with a base pattern of dots.
 *                   HalftoneShading[d] uses the density d of shading.
 *                   HalftoneShading[col] uses dots with the specified color col.
 *                   HalftoneShading["shape"] uses the specified "shape" as base pattern.
 * Usage:            HalftoneShading[d, col, "shape"] uses a fixed pattern of "shape" with the specified color col and density d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HalftoneShading
 * Documentation:    web: http://reference.wolfram.com/language/ref/HalftoneShading.html
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
fun halftoneShading(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HalftoneShading", arguments.toMutableList(), options)
}
