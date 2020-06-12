package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MapIndexed
 *
 * Full name:        System`MapIndexed
 *
 *                   MapIndexed[f, expr] applies f to the elements of expr, giving the part specification of each element as a second argument to f.
 *                   MapIndexed[f, expr, levelspec] applies f to all parts of expr on levels specified by levelspec.
 * Usage:            MapIndexed[f] represents an operator form of MapIndexed that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MapIndexed
 * Documentation:    web: http://reference.wolfram.com/language/ref/MapIndexed.html
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
fun mapIndexed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MapIndexed", arguments.toMutableList(), options)
}
