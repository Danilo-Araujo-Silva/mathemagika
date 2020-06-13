package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DamerauLevenshteinDistance
 *
 * Full name:        System`DamerauLevenshteinDistance
 *
 * Usage:            DamerauLevenshteinDistance[u, v] gives the Damerau–Levenshtein distance between strings or vectors u and v.
 *
 * Options:          IgnoreCase -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DamerauLevenshteinDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/DamerauLevenshteinDistance.html
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
fun damerauLevenshteinDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DamerauLevenshteinDistance", arguments.toMutableList(), options)
}
