package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpanFromLeft
 *
 * Full name:        System`SpanFromLeft
 *
 * Usage:            SpanFromLeft is a symbol that can appear at a particular position in a Grid or related construct to indicate that the corresponding position is occupied by a spanning element that appears to its left.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpanFromLeft
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanFromLeft.html
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
fun spanFromLeft(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanFromLeft", arguments.toMutableList(), options)
}
