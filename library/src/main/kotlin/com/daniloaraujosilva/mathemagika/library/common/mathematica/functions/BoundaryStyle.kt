package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BoundaryStyle
 *
 * Full name:        System`BoundaryStyle
 *
 * Usage:            BoundaryStyle is an option for plotting functions that specifies the style in which boundaries of regions should be drawn.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoundaryStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoundaryStyle.html
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
fun boundaryStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoundaryStyle", arguments.toMutableList(), options)
}
