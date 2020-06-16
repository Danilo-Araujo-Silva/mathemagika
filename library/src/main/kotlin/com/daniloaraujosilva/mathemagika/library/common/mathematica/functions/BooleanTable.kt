package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanTable
 *
 * Full name:        System`BooleanTable
 *
 *                   BooleanTable[bf] gives a list of truth values for all possible combinations of variable values supplied to the Boolean function bf.
 *                   BooleanTable[expr, {a , a , …}] gives a list of the truth values of the Boolean expression expr for all possible combinations of values of the a .
 *                                        1   2                                                                                                                      i
 *                   BooleanTable[expr, {a , a , …}, {b , …}, …] gives a nested table of truth values of expr with the outermost level giving possible combinations of the a .
 * Usage:                                 1   2        1                                                                                                                    i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BooleanTable
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanTable.html
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
fun booleanTable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanTable", arguments.toMutableList(), options)
}
