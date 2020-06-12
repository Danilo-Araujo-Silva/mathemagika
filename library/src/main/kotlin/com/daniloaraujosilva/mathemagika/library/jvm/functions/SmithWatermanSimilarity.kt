package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SmithWatermanSimilarity
 *
 * Full name:        System`SmithWatermanSimilarity
 *
 * Usage:            SmithWatermanSimilarity[u, v] gives a number representing the Smith–Waterman similarity between strings or vectors u and v.
 *
 *                   GapPenalty -> 0
 *                   IgnoreCase -> False
 * Options:          SimilarityRules -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SmithWatermanSimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/SmithWatermanSimilarity.html
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
fun smithWatermanSimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SmithWatermanSimilarity", arguments.toMutableList(), options)
}
