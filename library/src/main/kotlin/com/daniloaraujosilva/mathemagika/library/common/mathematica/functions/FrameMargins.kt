package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FrameMargins
 *
 * Full name:        System`FrameMargins
 *
 * Usage:            FrameMargins is an option for objects that can be displayed with frames which specifies the absolute margins in printer's points to leave inside the frame.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrameMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrameMargins.html
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
fun frameMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrameMargins", arguments.toMutableList(), options)
}
