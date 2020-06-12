package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MapAll
 *
 * Full name:        System`MapAll
 *
 * Usage:            MapAll[f, expr] or f//@expr applies f to every subexpression in expr.
 *
 * Options:          Heads -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MapAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/MapAll.html
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
fun mapAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MapAll", arguments.toMutableList(), options)
}
