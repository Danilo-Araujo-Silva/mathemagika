package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JaccardDissimilarity
 *
 * Full name:        System`JaccardDissimilarity
 *
 * Usage:            JaccardDissimilarity[u, v] gives the Jaccard dissimilarity between Boolean vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/JaccardDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/JaccardDissimilarity.html
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
fun jaccardDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JaccardDissimilarity", arguments.toMutableList(), options)
}
