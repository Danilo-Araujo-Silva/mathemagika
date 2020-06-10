package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RadialityCentrality
 * 
 * Full name:        System`RadialityCentrality
 * 
 *                   RadialityCentrality[g] gives a list of radiality centralities for the vertices in the graph g.
 *                   RadialityCentrality[g, "In"] gives a list of in-centralities for a directed graph g.
 *                   RadialityCentrality[g, "Out"] gives a list of out-centralities for a directed graph g.
 * Usage:            RadialityCentrality[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RadialityCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadialityCentrality.html
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
fun radialityCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadialityCentrality", arguments.toMutableList(), options)
}
