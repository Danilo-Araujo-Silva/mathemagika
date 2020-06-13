package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ScaleRangeStyle
 *
 * Full name:        System`ScaleRangeStyle
 *
 * Usage:            ScaleRangeStyle is an option for gauge functions to describe how to style different sections of the scale.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScaleRangeStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScaleRangeStyle.html
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
fun scaleRangeStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScaleRangeStyle", arguments.toMutableList(), options)
}
