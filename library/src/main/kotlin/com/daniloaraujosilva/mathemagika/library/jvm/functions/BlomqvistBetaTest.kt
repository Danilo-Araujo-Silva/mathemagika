package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                 \!                                            ".
 *````                                                                                               * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                   *                   AlternativeHypothesis -> Unequal
 * Name:             BlomqvistBetaTest                                                                                                               *                   MaxIterations -> Automatic
 *                                                                                                                                                   *                   Method -> Automatic
 * Full name:        System`BlomqvistBetaTest                                                                                                        *                                        1
 *                                                                                                                                                   *                   SignificanceLevel -> --
 *                   BlomqvistBetaTest[v , v ] tests whether the vectors v  and v  are independent.                                                  *                                        20
 *                                      1   2                             1      2                                                                   * Options:          VerifyTestAssumptions -> Automatic
 *                   BlomqvistBetaTest[m , m ] tests whether the matrices m  and m  are independent.                                                 *
 *                                      1   2                              1      2                                                                  *                   Protected
 *                   BlomqvistBetaTest[…, "property"] returns the value of "                                                                         * Attributes:       ReadProtected
                                                                                                                                                     *
                                                                                                                                                     *                   local: paclet:ref/BlomqvistBetaTest
                                                                                                                                                     * Documentation:    web: http://reference.wolfram.com/language/ref/BlomqvistBetaTest.html
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
fun blomqvistBetaTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlomqvistBetaTest", arguments.toMutableList(), options)
}
