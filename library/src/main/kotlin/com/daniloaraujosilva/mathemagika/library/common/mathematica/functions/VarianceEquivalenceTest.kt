package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                                 \!                                               ".
 *````                                                                                                               *                                                1 *
 *                                                                                                                   * Usage:            StyleBox["property", "TI"]    *                   Method -> Automatic
 * Name:             VarianceEquivalenceTest                                                                                                                            *                                        1
 *                                                                                                                                                                      *                   SignificanceLevel -> --
 * Full name:        System`VarianceEquivalenceTest                                                                                                                     *                                        20
 *                                                                                                                                                                      * Options:          VerifyTestAssumptions -> Automatic
 *                   VarianceEquivalenceTest[{data , data , …}] tests whether the variances of the data  are equal.                                                     *
 *                                                1      2                                             i                                                                *                   Protected
 *                   VarianceEquivalenceTest[{data , …}, "property"] returns the value of "                                                                             * Attributes:       ReadProtected
                                                                                                                                                                        *
                                                                                                                                                                        *                   local: paclet:ref/VarianceEquivalenceTest
                                                                                                                                                                        * Documentation:    web: http://reference.wolfram.com/language/ref/VarianceEquivalenceTest.html
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
fun varianceEquivalenceTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VarianceEquivalenceTest", arguments.toMutableList(), options)
}
