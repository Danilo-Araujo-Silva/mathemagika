package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatchingDissimilarity
 *
 * Full name:        System`MatchingDissimilarity
 *
 * Usage:            MatchingDissimilarity[u, v] gives the matching dissimilarity between Boolean vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatchingDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatchingDissimilarity.html
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
fun matchingDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatchingDissimilarity", arguments.toMutableList(), options)
}
