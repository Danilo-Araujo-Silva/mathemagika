package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpanFromBoth
 *
 * Full name:        System`SpanFromBoth
 *
 * Usage:            SpanFromBoth is a symbol that can appear at a particular position in a Grid or related construct to indicate that the corresponding position is occupied by a spanning element that appears above and to its left.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpanFromBoth
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanFromBoth.html
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
fun spanFromBoth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanFromBoth", arguments.toMutableList(), options)
}
