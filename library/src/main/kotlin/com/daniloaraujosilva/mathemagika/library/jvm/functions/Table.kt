package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Table
 *
 * Full name:        System`Table
 *
 *                   Table[expr, n] generates a list of n copies of expr.
 *                   Table[expr, {i, i   }] generates a list of the values of expr when i runs from 1 to i   .
 *                                    max                                                                 max
 *                   Table[expr, {i, i   , i   }] starts with i = i   .
 *                                    min   max                    min
 *                   Table[expr, {i, i   , i   , di}] uses steps di.
 *                                    min   max
 *                   Table[expr, {i, {i , i , …}}] uses the successive values i , i , ….
 *                                     1   2                                   1   2
 *                   Table[expr, {i, i   , i   }, {j, j   , j   }, …] gives a nested list. The list associated with i is outermost.
 * Usage:                             min   max        min   max
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Table
 * Documentation:    web: http://reference.wolfram.com/language/ref/Table.html
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
fun table(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Table", arguments.toMutableList(), options)
}
