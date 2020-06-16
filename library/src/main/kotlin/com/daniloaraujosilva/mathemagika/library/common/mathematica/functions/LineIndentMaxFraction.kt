package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LineIndentMaxFraction
 *
 * Full name:        System`LineIndentMaxFraction
 *
 * Usage:            LineIndentMaxFraction is an option for Cell, StyleBox, and Style that specifies the maximum fraction of the total page width to indent at the beginnings of lines.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LineIndentMaxFraction
 * Documentation:    web: http://reference.wolfram.com/language/ref/LineIndentMaxFraction.html
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
fun lineIndentMaxFraction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LineIndentMaxFraction", arguments.toMutableList(), options)
}
