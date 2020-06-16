package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GraphStyle
 *
 * Full name:        System`GraphStyle
 *
 * Usage:            GraphStyle is an option to Graph and related objects that specifies styles to use for the different graph elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphStyle.html
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
fun graphStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphStyle", arguments.toMutableList(), options)
}
