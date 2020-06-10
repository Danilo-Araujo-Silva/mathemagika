package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NeedlemanWunschSimilarity
 * 
 * Full name:        System`NeedlemanWunschSimilarity
 * 
 * Usage:            NeedlemanWunschSimilarity[u, v] gives a number representing the Needleman–Wunsch similarity between strings or vectors u and v.
 * 
 *                   GapPenalty -> 0
 *                   IgnoreCase -> False
 * Options:          SimilarityRules -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NeedlemanWunschSimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/NeedlemanWunschSimilarity.html
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
fun needlemanWunschSimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NeedlemanWunschSimilarity", arguments.toMutableList(), options)
}
