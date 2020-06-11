package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeLabelStyle
 *
 * Full name:        System`EdgeLabelStyle
 *
 * Usage:            EdgeLabelStyle is an option and property for Graph and related functions that specifies the style to use for edge labels.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeLabelStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeLabelStyle.html
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
fun edgeLabelStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeLabelStyle", arguments.toMutableList(), options)
}
