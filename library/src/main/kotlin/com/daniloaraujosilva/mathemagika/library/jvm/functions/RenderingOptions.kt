package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RenderingOptions
 *
 * Full name:        System`RenderingOptions
 *
 * Usage:            RenderingOptions is an option for Style, Cell and related constructs that specifies options related to 3D rendering.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RenderingOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/RenderingOptions.html
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
fun renderingOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RenderingOptions", arguments.toMutableList(), options)
}
