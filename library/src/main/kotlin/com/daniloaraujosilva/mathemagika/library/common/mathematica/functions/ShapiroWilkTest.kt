package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                               \!                                            ".
 *````                                                                                                             * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                                 *                   Method -> Automatic
 * Name:             ShapiroWilkTest                                                                                                                               *                                        1
 *                                                                                                                                                                 *                   SignificanceLevel -> --
 * Full name:        System`ShapiroWilkTest                                                                                                                        * Options:                               20
 *                                                                                                                                                                 *
 *                   ShapiroWilkTest[data] tests whether data is normally distributed using the Shapiro–Wilk test.                                                 *                   Protected
 *                   ShapiroWilkTest[data, "property"] returns the value of "                                                                                      * Attributes:       ReadProtected
                                                                                                                                                                   *
                                                                                                                                                                   *                   local: paclet:ref/ShapiroWilkTest
                                                                                                                                                                   * Documentation:    web: http://reference.wolfram.com/language/ref/ShapiroWilkTest.html
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
fun shapiroWilkTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShapiroWilkTest", arguments.toMutableList(), options)
}
