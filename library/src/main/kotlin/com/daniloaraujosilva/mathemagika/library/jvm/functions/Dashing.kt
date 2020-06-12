package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dashing
 *
 * Full name:        System`Dashing
 *
 *                   Dashing[{r , r , …}] is a two-dimensional graphics directive specifying that lines that follow are to be drawn dashed, with successive segments of lengths r , r , … (repeated cyclically). The r  are given as a fraction of the total width of the graph.
 *                             1   2                                                                                                                                             1   2                                i
 * Usage:            Dashing[r] is equivalent to Dashing[{r, r}].
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dashing
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dashing.html
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
fun dashing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dashing", arguments.toMutableList(), options)
}
