package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StatusCentrality
 * 
 * Full name:        System`StatusCentrality
 * 
 *                   StatusCentrality[g] gives a list of status centralities for the vertices in the graph g.
 * Usage:            StatusCentrality[{v  w, …}] uses rules v  w to specify the graph g.
 * 
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StatusCentrality
 * Documentation:    web: http://reference.wolfram.com/language/ref/StatusCentrality.html
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
fun statusCentrality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StatusCentrality", arguments.toMutableList(), options)
}
