package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KatzCentrality
 *
 * Full name:        System`KatzCentrality
 *
 *                   KatzCentrality[g, α] gives a list of Katz centralities for the vertices in the graph g and weight α.
 *                   KatzCentrality[g, α, β] gives a list of Katz centralities using weight α and initial centralities β.
 * Usage:            KatzCentrality[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KatzCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/KatzCentrality.html
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
fun katzCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KatzCentrality", arguments.toMutableList(), options)
}
