package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                                               \!                                            ".
 *````                                                                                                                             * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                                                 *                   Method -> Automatic
 * Name:             MardiaSkewnessTest                                                                                                                                            *                                        1
 *                                                                                                                                                                                 *                   SignificanceLevel -> --
 * Full name:        System`MardiaSkewnessTest                                                                                                                                     * Options:                               20
 *                                                                                                                                                                                 *
 *                   MardiaSkewnessTest[data] tests whether data follows a MultinormalDistribution using the Mardia skewness test.                                                 *                   Protected
 *                   MardiaSkewnessTest[data, "property"] returns the value of "                                                                                                   * Attributes:       ReadProtected
                                                                                                                                                                                   *
                                                                                                                                                                                   *                   local: paclet:ref/MardiaSkewnessTest
                                                                                                                                                                                   * Documentation:    web: http://reference.wolfram.com/language/ref/MardiaSkewnessTest.html
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
fun mardiaSkewnessTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MardiaSkewnessTest", arguments.toMutableList(), options)
}
