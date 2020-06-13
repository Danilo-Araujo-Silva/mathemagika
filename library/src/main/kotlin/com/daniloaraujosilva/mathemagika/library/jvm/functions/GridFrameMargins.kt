package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GridFrameMargins
 *
 * Full name:        System`GridFrameMargins
 *
 * Usage:            GridFrameMargins is an option for grids that specifies the spacing between the content of the grid and the frame surrounding it.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GridFrameMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/GridFrameMargins.html
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
fun gridFrameMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GridFrameMargins", arguments.toMutableList(), options)
}
