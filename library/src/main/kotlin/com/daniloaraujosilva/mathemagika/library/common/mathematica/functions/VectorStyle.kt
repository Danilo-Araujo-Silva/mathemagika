package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VectorStyle
 *
 * Full name:        System`VectorStyle
 *
 * Usage:            VectorStyle is an option to VectorPlot, ListVectorPlot, and related functions that determines the style to use for drawing field vectors.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VectorStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorStyle.html
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
fun vectorStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorStyle", arguments.toMutableList(), options)
}
