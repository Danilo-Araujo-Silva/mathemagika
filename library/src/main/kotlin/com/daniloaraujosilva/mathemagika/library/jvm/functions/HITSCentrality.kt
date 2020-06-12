package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HITSCentrality
 *
 * Full name:        System`HITSCentrality
 *
 *                   HITSCentrality[g] gives a list of authority and hub centralities for the vertices in the graph g.
 * Usage:            HITSCentrality[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HITSCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/HITSCentrality.html
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
fun hITSCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HITSCentrality", arguments.toMutableList(), options)
}
