package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindGraphIsomorphism
 *
 * Full name:        System`FindGraphIsomorphism
 *
 *                   FindGraphIsomorphism[g , g ] finds an isomorphism that maps the graph g  to g  by renaming vertices.
 *                                         1   2                                            1     2
 *                   FindGraphIsomorphism[g , g , n] finds at most n isomorphisms.
 *                                         1   2
 * Usage:            FindGraphIsomorphism[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindGraphIsomorphism
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGraphIsomorphism.html
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
fun findGraphIsomorphism(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGraphIsomorphism", arguments.toMutableList(), options)
}
