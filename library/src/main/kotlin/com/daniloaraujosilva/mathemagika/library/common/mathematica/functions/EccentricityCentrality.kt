package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EccentricityCentrality
 *
 * Full name:        System`EccentricityCentrality
 *
 *                   EccentricityCentrality[g] gives a list of eccentricity centralities for the vertices in the graph g.
 * Usage:            EccentricityCentrality[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EccentricityCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/EccentricityCentrality.html
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
fun eccentricityCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EccentricityCentrality", arguments.toMutableList(), options)
}
