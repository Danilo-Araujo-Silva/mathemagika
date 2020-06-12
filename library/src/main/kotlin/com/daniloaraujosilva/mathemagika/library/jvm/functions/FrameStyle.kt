package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrameStyle
 *
 * Full name:        System`FrameStyle
 *
 * Usage:            FrameStyle is an option for Graphics, Grid, and other constructs that specifies the style in which to draw frames.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrameStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrameStyle.html
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
fun frameStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrameStyle", arguments.toMutableList(), options)
}
