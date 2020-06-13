package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BoxFrame
 *
 * Full name:        System`BoxFrame
 *
 * Usage:            BoxFrame is an option for FrameBox objects that specifies whether to draw a frame around the contents of the box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoxFrame
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoxFrame.html
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
fun boxFrame(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoxFrame", arguments.toMutableList(), options)
}
