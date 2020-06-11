package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                   \!                                            ".
 *````                                                                                                 *                                          0    *
 *                                                                                                     * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             SignedRankTest                                                                                                                    *                   MaxIterations -> Automatic
 *                                                                                                                                                     *                   Method -> Automatic
 * Full name:        System`SignedRankTest                                                                                                             *                                        1
 *                                                                                                                                                     *                   SignificanceLevel -> --
 *                   SignedRankTest[data] tests whether the median of data is zero.                                                                    *                                        20
 *                   SignedRankTest[{data , data }] tests whether the median of data  - data  is zero.                                                 * Options:          VerifyTestAssumptions -> Automatic
 *                                       1      2                                   1       2                                                          *
 *                   SignedRankTest[dspec, μ ] tests a location measure against μ .                                                                    *                   Protected
 *                                          0                                    0                                                                     * Attributes:       ReadProtected
 *                   SignedRankTest[dspec, μ , "property"] returns the value of "                                                                      *
                                                                                                                                                       *                   local: paclet:ref/SignedRankTest
                                                                                                                                                       * Documentation:    web: http://reference.wolfram.com/language/ref/SignedRankTest.html
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
fun signedRankTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SignedRankTest", arguments.toMutableList(), options)
}
