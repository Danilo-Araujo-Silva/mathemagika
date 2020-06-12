package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StreamStyle
 *
 * Full name:        System`StreamStyle
 *
 * Usage:            StreamStyle is an option to StreamPlot, StreamDensityPlot, and related functions that determines the style to use for drawing streamlines.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StreamStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamStyle.html
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
fun streamStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamStyle", arguments.toMutableList(), options)
}
