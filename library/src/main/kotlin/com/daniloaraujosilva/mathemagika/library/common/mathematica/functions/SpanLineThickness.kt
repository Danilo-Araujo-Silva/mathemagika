package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpanLineThickness
 *
 * Full name:        System`SpanLineThickness
 *
 * Usage:            SpanLineThickness is an option for selections that specifies the thickness in printer's points of line-spanning characters such as ∖[VerticalLine] and ∖[HorizontalLine].
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpanLineThickness
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanLineThickness.html
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
fun spanLineThickness(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanLineThickness", arguments.toMutableList(), options)
}
