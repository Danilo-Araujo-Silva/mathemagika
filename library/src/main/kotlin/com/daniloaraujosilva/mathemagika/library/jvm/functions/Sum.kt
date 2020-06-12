package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Sum
 *
 * Full name:        System`Sum
 *
 *                                                       i
 *                   Sum[f, {i, i   }] evaluates the sum  max  f.
 *                               max                       ∑
 *                                                       i = 1
 *                   Sum[f, {i, i   , i   }] starts with i = i   .
 *                               min   max                    min
 *                   Sum[f, {i, i   , i   , di}] uses steps di.
 *                               min   max
 *                   Sum[f, {i, {i , i , …}}] uses successive values i , i , ….
 *                                1   2                               1   2
 *                                                                                            i        j
 *                                                                                             max      max
 *                   Sum[f, {i, i   , i   }, {j, j   , j   }, …] evaluates the multiple sum    ∑        ∑     …f.
 *                               min   max        min   max                                 i = i    j = j
 *                                                                                               min      min
 *                   Sum[f, i] gives the indefinite sum ∑ f.
 * Usage:                                               i
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   GeneratedParameters -> None
 *                   Method -> Automatic
 *                   Regularization -> None
 * Options:          VerifyConvergence -> True
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sum
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sum.html
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
fun sum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sum", arguments.toMutableList(), options)
}
