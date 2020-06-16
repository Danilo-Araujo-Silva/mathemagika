package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                              \!                                            ".
 *````                                                                                            *                                       0       *
 *                                                                                                * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             PairedTTest                                                                                                                  *                   Method -> Automatic
 *                                                                                                                                                *                                        1
 * Full name:        System`PairedTTest                                                                                                           *                   SignificanceLevel -> --
 *                                                                                                                                                *                                        20
 *                   PairedTTest[data] tests whether the mean of data is zero.                                                                    * Options:          VerifyTestAssumptions -> Automatic
 *                   PairedTTest[{data , data }] tests whether the mean of data  – data  is zero.                                                 *
 *                                    1      2                                 1       2                                                          *                   Protected
 *                   PairedTTest[dspec, μ ] tests a location measure against μ .                                                                  * Attributes:       ReadProtected
 *                                       0                                    0                                                                   *
 *                   PairedTTest[dspec, μ , "property"] returns the value of "                                                                    *                   local: paclet:ref/PairedTTest
                                                                                                                                                  * Documentation:    web: http://reference.wolfram.com/language/ref/PairedTTest.html
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
fun pairedTTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PairedTTest", arguments.toMutableList(), options)
}
