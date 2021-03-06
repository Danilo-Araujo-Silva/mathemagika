package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LineBreakWithin
 *
 * Full name:        System`LineBreakWithin
 *
 * Usage:            LineBreakWithin is an option for selections that specifies whether line breaks occur automatically when the end of a line is reached.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LineBreakWithin
 * Documentation:    web: http://reference.wolfram.com/language/ref/LineBreakWithin.html
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
fun lineBreakWithin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LineBreakWithin", arguments.toMutableList(), options)
}
