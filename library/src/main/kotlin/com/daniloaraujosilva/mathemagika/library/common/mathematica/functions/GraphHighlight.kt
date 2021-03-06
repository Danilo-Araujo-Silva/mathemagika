package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GraphHighlight
 *
 * Full name:        System`GraphHighlight
 *
 * Usage:            GraphHighlight is an option to Graph and related objects that specifies graph elements to highlight.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphHighlight
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphHighlight.html
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
fun graphHighlight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphHighlight", arguments.toMutableList(), options)
}
