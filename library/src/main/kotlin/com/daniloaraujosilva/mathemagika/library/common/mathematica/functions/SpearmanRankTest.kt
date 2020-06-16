package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                \!                                            ".
 *````                                                                                              * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                  *                   AlternativeHypothesis -> Unequal
 * Name:             SpearmanRankTest                                                                                                               *                   MaxIterations -> Automatic
 *                                                                                                                                                  *                   Method -> Automatic
 * Full name:        System`SpearmanRankTest                                                                                                        *                                        1
 *                                                                                                                                                  *                   SignificanceLevel -> --
 *                   SpearmanRankTest[v , v ] tests whether the vectors v  and v  are independent.                                                  *                                        20
 *                                     1   2                             1      2                                                                   * Options:          VerifyTestAssumptions -> Automatic
 *                   SpearmanRankTest[m , m ] tests whether the matrices m  and m  are independent.                                                 *
 *                                     1   2                              1      2                                                                  *                   Protected
 *                   SpearmanRankTest[…, "property"] returns the value of "                                                                         * Attributes:       ReadProtected
                                                                                                                                                    *
                                                                                                                                                    *                   local: paclet:ref/SpearmanRankTest
                                                                                                                                                    * Documentation:    web: http://reference.wolfram.com/language/ref/SpearmanRankTest.html
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
fun spearmanRankTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpearmanRankTest", arguments.toMutableList(), options)
}
