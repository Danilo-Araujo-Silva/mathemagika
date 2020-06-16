package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                               \!                                            ".
 *````                                                                                             * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                 *                   AlternativeHypothesis -> Unequal
 * Name:             PillaiTraceTest                                                                                                               *                   MaxIterations -> Automatic
 *                                                                                                                                                 *                   Method -> Automatic
 * Full name:        System`PillaiTraceTest                                                                                                        *                                        1
 *                                                                                                                                                 *                   SignificanceLevel -> --
 *                   PillaiTraceTest[m , m ] tests whether the matrices m  and m  are independent.                                                 *                                        20
 *                                    1   2                              1      2                                                                  * Options:          VerifyTestAssumptions -> Automatic
 *                   PillaiTraceTest[…, "property"] returns the value of "                                                                         *
                                                                                                                                                   *                   Protected
                                                                                                                                                   * Attributes:       ReadProtected
                                                                                                                                                   *
                                                                                                                                                   *                   local: paclet:ref/PillaiTraceTest
                                                                                                                                                   * Documentation:    web: http://reference.wolfram.com/language/ref/PillaiTraceTest.html
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
fun pillaiTraceTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PillaiTraceTest", arguments.toMutableList(), options)
}
