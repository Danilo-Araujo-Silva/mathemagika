package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpanAdjustments
 *
 * Full name:        System`SpanAdjustments
 *
 * Usage:            SpanAdjustments is an option for selections that specifies the height and width of spanning characters.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpanAdjustments
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanAdjustments.html
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
fun spanAdjustments(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanAdjustments", arguments.toMutableList(), options)
}
