package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MapAt
 * 
 * Full name:        System`MapAt
 * 
 *                   MapAt[f, expr, n] applies f to the element at position n in expr. If n is negative, the position is counted from the end. 
 *                   MapAt[f, expr, {i, j, …}] applies f to the part of expr at position {i, j, …}. 
 *                   MapAt[f, expr, {{i , j , …}, {i , j , …}, …}] applies f to parts of expr at several positions. 
 *                                     1   1        2   2
 * Usage:            MapAt[f, pos] represents an operator form of MapAt that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MapAt
 * Documentation:    web: http://reference.wolfram.com/language/ref/MapAt.html
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
fun mapAt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MapAt", arguments.toMutableList(), options)
}
