package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RussellRaoDissimilarity
 *
 * Full name:        System`RussellRaoDissimilarity
 *
 * Usage:            RussellRaoDissimilarity[u, v] gives the Russell–Rao dissimilarity between Boolean vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RussellRaoDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/RussellRaoDissimilarity.html
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
fun russellRaoDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RussellRaoDissimilarity", arguments.toMutableList(), options)
}
