package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CountDistinctBy
 *
 * Full name:        System`CountDistinctBy
 *
 *                   CountDistinctBy[{e , e , …}, f] gives the number of distinct values of f[e ] that occur.
 *                                     1   2                                                   i
 * Usage:            CountDistinctBy[f] represents an operator form of CountDistinctBy that can be applied to an expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CountDistinctBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/CountDistinctBy.html
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
fun countDistinctBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CountDistinctBy", arguments.toMutableList(), options)
}
