package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpanMinSize
 *
 * Full name:        System`SpanMinSize
 *
 * Usage:            SpanMinSize is an option for selections that specifies the minimum size of spanning characters such as parentheses and brackets.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpanMinSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanMinSize.html
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
fun spanMinSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanMinSize", arguments.toMutableList(), options)
}
