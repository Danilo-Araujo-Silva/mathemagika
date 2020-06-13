package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EditDistance
 *
 * Full name:        System`EditDistance
 *
 * Usage:            EditDistance[u, v] gives the edit or Levenshtein distance between strings or vectors u and v.
 *
 * Options:          IgnoreCase -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EditDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/EditDistance.html
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
fun editDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EditDistance", arguments.toMutableList(), options)
}
