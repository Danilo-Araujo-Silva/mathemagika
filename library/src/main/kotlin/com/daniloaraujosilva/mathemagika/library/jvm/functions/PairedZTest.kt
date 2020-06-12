package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                       \!                                            ".
 *````                                                                                                     *                                          0    *
 *                                                                                                         * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             PairedZTest                                                                                                                           *                   Method -> Automatic
 *                                                                                                                                                         *                                        1
 * Full name:        System`PairedZTest                                                                                                                    *                   SignificanceLevel -> --
 *                                                                                                                                                         *                                        20
 *                   PairedZTest[data] tests whether the mean of the data is zero.                                                                         * Options:          VerifyTestAssumptions -> Automatic
 *                   PairedZTest[{data , data }] tests whether the means of data  and data  are equal.                                                     *
 *                                    1      2                                  1         2                                                                *                   Protected
 *                   PairedZTest[dspec, σ] tests for zero or equal means assuming a population variance σ.                                                 * Attributes:       ReadProtected
 *                   PairedZTest[dspec, σ, μ ] tests the mean against μ .                                                                                  *
 *                                          0                          0                                                                                   *                   local: paclet:ref/PairedZTest
 *                   PairedZTest[dspec, σ, μ , "property"] returns the value of "                                                                          * Documentation:    web: http://reference.wolfram.com/language/ref/PairedZTest.html
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
fun pairedZTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PairedZTest", arguments.toMutableList(), options)
}
