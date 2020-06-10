package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindGraphPartition
 * 
 * Full name:        System`FindGraphPartition
 * 
 *                   FindGraphPartition[g] gives a partition of vertices of the graph g.
 *                   FindGraphPartition[g, k] gives a partition of vertices into k approximately equal-size parts.
 *                   FindGraphPartition[g, {n , …, n }] gives a partition of vertices into parts with sizes n , …, n .
 *                                           1      k                                                        1      k
 *                   FindGraphPartition[g, {α , …, α }] gives a partition of vertices into parts with approximate size proportions α , …, α .
 *                                           1      k                                                                               1      k
 * Usage:            FindGraphPartition[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FindGraphPartition
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGraphPartition.html
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
fun findGraphPartition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGraphPartition", arguments.toMutableList(), options)
}
