package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinkRankCentrality
 *
 * Full name:        System`LinkRankCentrality
 *
 *                   LinkRankCentrality[g, α] gives the link-rank centralities for edges in the graph g and weight α.
 *                   LinkRankCentrality[g, α, β] gives the link-rank centralities, using weight α and initial vertex page-rank centralities β.
 * Usage:            LinkRankCentrality[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkRankCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkRankCentrality.html
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
fun linkRankCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkRankCentrality", arguments.toMutableList(), options)
}
