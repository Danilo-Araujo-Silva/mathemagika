package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SokalSneathDissimilarity
 *
 * Full name:        System`SokalSneathDissimilarity
 *
 * Usage:            SokalSneathDissimilarity[u, v] gives the Sokal–Sneath dissimilarity between Boolean vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SokalSneathDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/SokalSneathDissimilarity.html
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
fun sokalSneathDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SokalSneathDissimilarity", arguments.toMutableList(), options)
}
