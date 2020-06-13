package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                                                 \!                                            ".
 *````                                                                                                                               * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                                                   *                   Method -> Automatic
 * Name:             PearsonChiSquareTest                                                                                                                                            *                                        1
 *                                                                                                                                                                                   *                   SignificanceLevel -> --
 * Full name:        System`PearsonChiSquareTest                                                                                                                                     * Options:                               20
 *                                                                                                                                                                                   *
 *                                                                                                            2                                                                      *                   Protected
 *                   PearsonChiSquareTest[data] tests whether data is normally distributed using the Pearson χ  test.                                                                * Attributes:       ReadProtected
 *                                                                                                                           2                                                       *
 *                   PearsonChiSquareTest[data, dist] tests whether data is distributed according to dist using the Pearson χ  test.                                                 *                   local: paclet:ref/PearsonChiSquareTest
 *                   PearsonChiSquareTest[data, dist, "property"] returns the value of "                                                                                             * Documentation:    web: http://reference.wolfram.com/language/ref/PearsonChiSquareTest.html
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
fun pearsonChiSquareTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PearsonChiSquareTest", arguments.toMutableList(), options)
}
