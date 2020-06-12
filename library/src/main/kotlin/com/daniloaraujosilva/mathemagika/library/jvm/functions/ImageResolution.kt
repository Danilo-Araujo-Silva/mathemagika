package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageResolution
 *
 * Full name:        System`ImageResolution
 *
 * Usage:            ImageResolution is an option for Export, Rasterize, and related functions that specifies at what resolution bitmap images should be rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageResolution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageResolution.html
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
fun imageResolution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageResolution", arguments.toMutableList(), options)
}
