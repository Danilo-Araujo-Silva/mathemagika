package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                         \!                                            ".
 *````                                                                                                       *                                      0        *
 *                                                                                                           * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             LeveneTest                                                                                                                              *                   Method -> Automatic
 *                                                                                                                                                           *                                        1
 * Full name:        System`LeveneTest                                                                                                                       *                   SignificanceLevel -> --
 *                                                                                                                                                           *                                        20
 *                   LeveneTest[data] tests whether the variance of data is 1.                                                                               * Options:          VerifyTestAssumptions -> Automatic
 *                   LeveneTest[{data , data , …}] tests whether the variances of data , data , … are equal.                                                 *
 *                                   1      2                                         1      2                                                               *                   Protected
 *                                      2                                      2                                                                             * Attributes:       ReadProtected
 *                   LeveneTest[dspec, σ ] tests a dispersion measure against σ .                                                                            *
 *                                      0                                      0                                                                             *                   local: paclet:ref/LeveneTest
 *                                      2                                                                                                                    * Documentation:    web: http://reference.wolfram.com/language/ref/LeveneTest.html
 *                   LeveneTest[dspec, σ , "property"] returns the value of "                                                                                *
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
fun leveneTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeveneTest", arguments.toMutableList(), options)
}
