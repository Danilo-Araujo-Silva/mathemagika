package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpanFromAbove
 *
 * Full name:        System`SpanFromAbove
 *
 * Usage:            SpanFromAbove is a symbol that can appear at a particular position in a Grid or related construct to indicate that the corresponding position is occupied by a spanning element that appears above it.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpanFromAbove
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanFromAbove.html
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
fun spanFromAbove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanFromAbove", arguments.toMutableList(), options)
}
