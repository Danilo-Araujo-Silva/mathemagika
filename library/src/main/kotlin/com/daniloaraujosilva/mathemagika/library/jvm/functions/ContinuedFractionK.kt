package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContinuedFractionK
 *
 * Full name:        System`ContinuedFractionK
 *
 *                                                                                                i
 *                                                                                                 max
 *                   ContinuedFractionK[f, g, {i, i   , i   }] represents the continued fraction Κ         f/g.
 *                                                 min   max                                      i = i
 *                                                                                                     min
 *                                                                                             i
 *                                                                                              max
 *                   ContinuedFractionK[g, {i, i   , i   }] represents the continued fraction Κ         1/g.
 *                                              min   max                                      i = i
 * Usage:                                                                                           min
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          VerifyConvergence -> True
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContinuedFractionK
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuedFractionK.html
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
fun continuedFractionK(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuedFractionK", arguments.toMutableList(), options)
}
