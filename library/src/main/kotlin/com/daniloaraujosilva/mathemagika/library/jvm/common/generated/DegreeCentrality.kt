package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DegreeCentrality
 * 
 * Full name:        System`DegreeCentrality
 * 
 *                   DegreeCentrality[g] gives a list of vertex degrees for the vertices in the underlying simple graph of g.
 *                   DegreeCentrality[g, "In"] gives a list of vertex in-degrees.
 *                   DegreeCentrality[g, "Out"] gives a list of vertex out-degrees.
 * Usage:            DegreeCentrality[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DegreeCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/DegreeCentrality.html
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
fun degreeCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DegreeCentrality", arguments.toMutableList(), options)
}
