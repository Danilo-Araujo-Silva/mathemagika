package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindVertexCut
 * 
 * Full name:        System`FindVertexCut
 * 
 *                   FindVertexCut[g] finds a smallest vertex cut of the graph g.
 *                   FindVertexCut[g, s, t] finds a smallest s-t vertex cut of the graph g.
 * Usage:            FindVertexCut[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FindVertexCut
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindVertexCut.html
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
fun findVertexCut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindVertexCut", arguments.toMutableList(), options)
}
