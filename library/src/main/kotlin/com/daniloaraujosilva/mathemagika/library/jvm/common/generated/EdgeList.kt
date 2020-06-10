package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EdgeList
 * 
 * Full name:        System`EdgeList
 * 
 *                   EdgeList[g] gives the list of edges for the graph g.
 *                   EdgeList[g, patt] gives a list of edges that match the pattern patt.
 * Usage:            EdgeList[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/EdgeList
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeList.html
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
fun edgeList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeList", arguments.toMutableList(), options)
}
