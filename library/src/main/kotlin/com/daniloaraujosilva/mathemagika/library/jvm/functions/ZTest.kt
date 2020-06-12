package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                   \!                                            ".
 *````                                                                                                 *                                     0         *
 *                                                                                                     * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             ZTest                                                                                                                             *                   Method -> Automatic
 *                                                                                                                                                     *                                        1
 * Full name:        System`ZTest                                                                                                                      *                   SignificanceLevel -> --
 *                                                                                                                                                     *                                        20
 *                   ZTest[data] tests whether the mean of the data is zero.                                                                           * Options:          VerifyTestAssumptions -> Automatic
 *                   ZTest[{data , data }] tests whether the means of data  and data  are equal.                                                       *
 *                              1      2                                  1         2                                                                  *                   Protected
 *                                 2                                                                2                                                  * Attributes:       ReadProtected
 *                   ZTest[dspec, σ ] tests for zero or equal means assuming a population variance σ .                                                 *
 *                                 2                                                                                                                   *                   local: paclet:ref/ZTest
 *                   ZTest[dspec, σ , μ ] tests the mean against μ .                                                                                   * Documentation:    web: http://reference.wolfram.com/language/ref/ZTest.html
 *                                     0                          0                                                                                    *
 *                                 2                                                                                                                   * Definitions:      None
 *                   ZTest[dspec, σ , μ , "property"] returns the value of "                                                                           *
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
fun zTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZTest", arguments.toMutableList(), options)
}
