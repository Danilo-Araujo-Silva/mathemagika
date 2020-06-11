package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PageRankCentrality
 *
 * Full name:        System`PageRankCentrality
 *
 *                   PageRankCentrality[g, α] gives a list of page-rank centralities for the vertices in the graph g and weight α.
 *                   PageRankCentrality[g, α, β] gives a list of page-rank centralities, using weight α and initial centralities β.
 * Usage:            PageRankCentrality[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PageRankCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageRankCentrality.html
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
fun pageRankCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageRankCentrality", arguments.toMutableList(), options)
}
