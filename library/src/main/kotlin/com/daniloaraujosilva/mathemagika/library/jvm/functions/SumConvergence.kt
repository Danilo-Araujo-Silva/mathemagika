package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SumConvergence
 *
 * Full name:        System`SumConvergence
 *
 *                                                                     ∞
 *                   SumConvergence[f, n] gives conditions for the sum ∑ f to be convergent.
 *                                                                     n
 *                                                                                        ∞  ∞
 *                   SumConvergence[f, {n , n , …}] gives conditions for the multiple sum ∑  ∑  … f to be convergent.
 *                                       1   2                                            n  n
 * Usage:                                                                                  1  2
 *
 *                   Assumptions :> $Assumptions
 *                   Direction -> 1
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SumConvergence
 * Documentation:    web: http://reference.wolfram.com/language/ref/SumConvergence.html
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
fun sumConvergence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SumConvergence", arguments.toMutableList(), options)
}
