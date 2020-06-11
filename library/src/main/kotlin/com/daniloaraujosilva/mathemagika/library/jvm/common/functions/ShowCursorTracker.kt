package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowCursorTracker
 *
 * Full name:        System`ShowCursorTracker
 *
 * Usage:            ShowCursorTracker is an option for Cell that specifies whether an elliptical spot should appear momentarily to guide the eye if the cursor position jumps.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowCursorTracker
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowCursorTracker.html
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
fun showCursorTracker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowCursorTracker", arguments.toMutableList(), options)
}
