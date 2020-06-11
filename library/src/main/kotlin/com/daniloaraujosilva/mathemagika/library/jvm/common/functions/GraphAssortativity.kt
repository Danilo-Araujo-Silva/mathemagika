package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphAssortativity
 *
 * Full name:        System`GraphAssortativity
 *
 *                   GraphAssortativity[g] gives the assortativity coefficient of a graph g using vertex degrees.
 *                   GraphAssortativity[g, "prop"] gives the assortativity coefficient of the graph g using vertex property "prop".
 *                   GraphAssortativity[g, {{v   , v   , …}, …}] gives the assortativity coefficient of the graph g with respect to the vertex partition {{v   , v   , …}, …}.
 *                                            i1   i2                                                                                                     i1   i2
 *                   GraphAssortativity[g, {v , v , …}  {x , x , …}] gives the assortativity coefficient of the graph g using data {x , x , …} for vertices {v , v , …}.
 *                                           1   2         1   2                                                                      1   2                    1   2
 * Usage:            GraphAssortativity[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 *                   DataType -> Automatic
 *                   Normalized -> True
 * Options:          Weighted -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphAssortativity
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphAssortativity.html
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
fun graphAssortativity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphAssortativity", arguments.toMutableList(), options)
}
