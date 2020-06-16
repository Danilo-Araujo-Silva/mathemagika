package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpanMaxSize
 *
 * Full name:        System`SpanMaxSize
 *
 * Usage:            SpanMaxSize is an option for selections that specifies the maximum size of spanning characters such as parentheses and brackets.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpanMaxSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanMaxSize.html
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
fun spanMaxSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanMaxSize", arguments.toMutableList(), options)
}
