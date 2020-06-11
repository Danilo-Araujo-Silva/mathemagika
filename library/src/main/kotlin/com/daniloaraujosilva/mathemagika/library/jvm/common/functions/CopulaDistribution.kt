package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CopulaDistribution
 *
 * Full name:        System`CopulaDistribution
 *
 *                   CopulaDistribution[ker, {dist , dist , …}] represents a copula distribution with kernel distribution ker and marginal distributions dist , dist , … .
 * Usage:                                         1      2                                                                                                   1      2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CopulaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CopulaDistribution.html
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
fun copulaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CopulaDistribution", arguments.toMutableList(), options)
}
