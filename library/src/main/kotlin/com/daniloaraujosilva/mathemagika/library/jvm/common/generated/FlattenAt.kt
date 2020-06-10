package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FlattenAt
 * 
 * Full name:        System`FlattenAt
 * 
 *                                                                                   th
 *                   FlattenAt[list, n] flattens out a sublist that appears as the n   element of list. If n is negative, the position is counted from the end. 
 *                   FlattenAt[expr, {i, j, …}] flattens out the part of expr at position {i, j, …}. 
 *                   FlattenAt[expr, {{i , j , …}, {i , j , …}, …}] flattens out parts of expr at several positions.
 *                                      1   1        2   2
 * Usage:            FlattenAt[pos] represents an operator form of FlattenAt that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FlattenAt
 * Documentation:    web: http://reference.wolfram.com/language/ref/FlattenAt.html
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
fun flattenAt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FlattenAt", arguments.toMutableList(), options)
}
