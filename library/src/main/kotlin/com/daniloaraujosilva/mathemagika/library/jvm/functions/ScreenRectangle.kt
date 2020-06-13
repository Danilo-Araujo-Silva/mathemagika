package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ScreenRectangle
 *
 * Full name:        System`ScreenRectangle
 *
 * Usage:            ScreenRectangle is a global option that specifies the position of the screen by giving the coordinates of two diagonally opposite corners.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScreenRectangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScreenRectangle.html
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
fun screenRectangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScreenRectangle", arguments.toMutableList(), options)
}
