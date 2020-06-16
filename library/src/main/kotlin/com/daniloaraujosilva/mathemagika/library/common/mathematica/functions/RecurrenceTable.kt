package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RecurrenceTable
 *
 * Full name:        System`RecurrenceTable
 *
 *                   RecurrenceTable[eqns, expr, {n, n   }] generates a list of values of expr for successive n based on solving the recurrence equations eqns.
 *                                                    max
 *                   RecurrenceTable[eqns, expr, nspec] generates a list of values of expr over the range of n values specified by nspec.
 *                   RecurrenceTable[eqns, expr, {n , …}, {n , …}, …] generates an array of values of expr for successive n , n , … .
 * Usage:                                          1        2                                                              1   2
 *
 *                   DependentVariables -> Automatic
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RecurrenceTable
 * Documentation:    web: http://reference.wolfram.com/language/ref/RecurrenceTable.html
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
fun recurrenceTable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RecurrenceTable", arguments.toMutableList(), options)
}
