package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                             \!                                            ".
 *````                                                                                           *                                    0          *
 *                                                                                               * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             SignTest                                                                                                                    *                   MaxIterations -> Automatic
 *                                                                                                                                               *                   Method -> Automatic
 * Full name:        System`SignTest                                                                                                             *                                        1
 *                                                                                                                                               *                   SignificanceLevel -> --
 *                   SignTest[data] tests whether the median of data is zero.                                                                    *                                        20
 *                   SignTest[{data , data }] tests whether the median of data  – data  is zero.                                                 * Options:          VerifyTestAssumptions -> Automatic
 *                                 1      2                                   1       2                                                          *
 *                   SignTest[dspec, μ ] tests a location measure against μ .                                                                    *                   Protected
 *                                    0                                    0                                                                     * Attributes:       ReadProtected
 *                   SignTest[dspec, μ , "property"] returns the value of "                                                                      *
                                                                                                                                                 *                   local: paclet:ref/SignTest
                                                                                                                                                 * Documentation:    web: http://reference.wolfram.com/language/ref/SignTest.html
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
fun signTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SignTest", arguments.toMutableList(), options)
}
