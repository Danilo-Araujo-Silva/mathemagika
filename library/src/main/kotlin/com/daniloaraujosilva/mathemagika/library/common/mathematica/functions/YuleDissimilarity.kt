package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             YuleDissimilarity
 *
 * Full name:        System`YuleDissimilarity
 *
 * Usage:            YuleDissimilarity[u, v] gives the Yule dissimilarity between Boolean vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/YuleDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/YuleDissimilarity.html
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
fun yuleDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("YuleDissimilarity", arguments.toMutableList(), options)
}
