package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GridLinesStyle
 *
 * Full name:        System`GridLinesStyle
 *
 * Usage:            GridLinesStyle is an option for 2D graphics functions that specifies how grid lines should be rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GridLinesStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GridLinesStyle.html
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
fun gridLinesStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GridLinesStyle", arguments.toMutableList(), options)
}
