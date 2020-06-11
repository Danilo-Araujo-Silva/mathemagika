package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                           \!                                            ".
 *````                                                                                                         *                                           0   *
 *                                                                                                             * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             FisherRatioTest                                                                                                                           *                   Method -> Automatic
 *                                                                                                                                                             *                                        1
 * Full name:        System`FisherRatioTest                                                                                                                    *                   SignificanceLevel -> --
 *                                                                                                                                                             *                                        20
 *                   FisherRatioTest[data] tests whether the variance of data is 1.                                                                            * Options:          VerifyTestAssumptions -> Automatic
 *                   FisherRatioTest[{data , data }] tests whether the variances of data  and data  are equal.                                                 *
 *                                        1      2                                      1         2                                                            *                   Protected
 *                                           2                                      2                                                                          * Attributes:       ReadProtected
 *                   FisherRatioTest[dspec, σ ] tests a dispersion measure against σ .                                                                         *
 *                                           0                                      0                                                                          *                   local: paclet:ref/FisherRatioTest
 *                                           2                                                                                                                 * Documentation:    web: http://reference.wolfram.com/language/ref/FisherRatioTest.html
 *                   FisherRatioTest[dspec, σ , "property"] returns the value of "                                                                             *
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
fun fisherRatioTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FisherRatioTest", arguments.toMutableList(), options)
}
