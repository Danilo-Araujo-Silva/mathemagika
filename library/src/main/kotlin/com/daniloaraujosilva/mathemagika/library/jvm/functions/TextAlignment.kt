package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TextAlignment
 *
 * Full name:        System`TextAlignment
 *
 * Usage:            TextAlignment is an option for Cell, Style and related constructs which specifies how successive lines of text should be aligned.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TextAlignment
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextAlignment.html
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
fun textAlignment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextAlignment", arguments.toMutableList(), options)
}
