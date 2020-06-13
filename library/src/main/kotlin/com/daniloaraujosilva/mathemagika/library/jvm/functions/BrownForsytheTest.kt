package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                                \!                                            ".
 *````                                                                                                              *                                             0 *
 *                                                                                                                  * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             BrownForsytheTest                                                                                                                              *                   Method -> Automatic
 *                                                                                                                                                                  *                                        1
 * Full name:        System`BrownForsytheTest                                                                                                                       *                   SignificanceLevel -> --
 *                                                                                                                                                                  *                                        20
 *                   BrownForsytheTest[data] tests whether the variance of data is 1.                                                                               * Options:          VerifyTestAssumptions -> Automatic
 *                   BrownForsytheTest[{data , data , …}] tests whether the variances of data , data , … are equal.                                                 *
 *                                          1      2                                         1      2                                                               *                   Protected
 *                                             2                                      2                                                                             * Attributes:       ReadProtected
 *                   BrownForsytheTest[dspec, σ ] tests a dispersion measure against σ .                                                                            *
 *                                             0                                      0                                                                             *                   local: paclet:ref/BrownForsytheTest
 *                                             2                                                                                                                    * Documentation:    web: http://reference.wolfram.com/language/ref/BrownForsytheTest.html
 *                   BrownForsytheTest[dspec, σ , "property"] returns the value of "                                                                                *
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
fun brownForsytheTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BrownForsytheTest", arguments.toMutableList(), options)
}
