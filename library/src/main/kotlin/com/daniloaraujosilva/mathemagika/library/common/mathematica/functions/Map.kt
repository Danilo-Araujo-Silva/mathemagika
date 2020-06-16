package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Map
 *
 * Full name:        System`Map
 *
 *                   Map[f, expr] or f/@expr applies f to each element on the first level in expr.
 *                   Map[f, expr, levelspec] applies f to parts of expr specified by levelspec.
 * Usage:            Map[f] represents an operator form of Map that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Map
 * Documentation:    web: http://reference.wolfram.com/language/ref/Map.html
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
fun map(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Map", arguments.toMutableList(), options)
}
