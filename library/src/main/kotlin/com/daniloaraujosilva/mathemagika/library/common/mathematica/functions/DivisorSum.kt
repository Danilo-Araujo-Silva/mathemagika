package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DivisorSum
 *
 * Full name:        System`DivisorSum
 *
 *                   DivisorSum[n, form] represents the sum of form[i] for all i that divide n.
 * Usage:            DivisorSum[n, form, cond] includes only those divisors for which cond[i] gives True.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DivisorSum
 * Documentation:    web: http://reference.wolfram.com/language/ref/DivisorSum.html
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
fun divisorSum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DivisorSum", arguments.toMutableList(), options)
}
