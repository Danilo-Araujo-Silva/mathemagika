package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionFillingStyle
 *
 * Full name:        System`RegionFillingStyle
 *
 * Usage:            RegionFillingStyle is an option for plotting functions that specifies the style for the filled region over which the plot is being drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionFillingStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionFillingStyle.html
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
fun regionFillingStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionFillingStyle", arguments.toMutableList(), options)
}
