package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MouseAppearance
 *
 * Full name:        System`MouseAppearance
 *
 *                   MouseAppearance[expr, graphic] changes the mouse cursor to appear as graphic when the mouse pointer is in the area where expr is displayed.
 *                   MouseAppearance[expr, graphic, {x, y}] uses the coordinates {x, y} in the graphic as the hotspot for the mouse cursor.
 *                   MouseAppearance[expr, graphic, Scaled[{x, y}]] uses the scaled coordinates {x, y} as the hotspot for the mouse cursor.
 *                   MouseAppearance[expr, "cursorname"] uses the named cursor "cursorname" as the mouse cursor.
 * Usage:            MouseAppearance[expr, Automatic] reverts to normal mouse cursor behavior.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MouseAppearance
 * Documentation:    web: http://reference.wolfram.com/language/ref/MouseAppearance.html
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
fun mouseAppearance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MouseAppearance", arguments.toMutableList(), options)
}
