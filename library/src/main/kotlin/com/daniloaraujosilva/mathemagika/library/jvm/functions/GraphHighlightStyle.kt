package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GraphHighlightStyle
 *
 * Full name:        System`GraphHighlightStyle
 *
 * Usage:            GraphHighlightStyle is an option to Graph and related objects that specifies styles to use for highlighted graph elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphHighlightStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphHighlightStyle.html
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
fun graphHighlightStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphHighlightStyle", arguments.toMutableList(), options)
}
