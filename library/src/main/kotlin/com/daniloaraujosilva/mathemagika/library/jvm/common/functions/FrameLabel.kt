package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrameLabel
 *
 * Full name:        System`FrameLabel
 *
 * Usage:            FrameLabel is an option for Graphics, Manipulate, and related functions that specifies labels to be placed on the edges of a frame.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrameLabel
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrameLabel.html
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
fun frameLabel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrameLabel", arguments.toMutableList(), options)
}
