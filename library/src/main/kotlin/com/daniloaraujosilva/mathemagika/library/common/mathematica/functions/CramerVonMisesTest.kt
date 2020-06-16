package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                                                     \!                                            ".
 *````                                                                                                                                   * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                                                       *                   Method -> Automatic
 * Name:             CramerVonMisesTest                                                                                                                                                  *                                        1
 *                                                                                                                                                                                       *                   SignificanceLevel -> --
 * Full name:        System`CramerVonMisesTest                                                                                                                                           * Options:                               20
 *                                                                                                                                                                                       *
 *                   CramerVonMisesTest[data] tests whether data is normally distributed using the Cramér–von Mises test.                                                                *                   Protected
 *                   CramerVonMisesTest[data, dist] tests whether data is distributed according to dist using the Cramér–von Mises test.                                                 * Attributes:       ReadProtected
 *                   CramerVonMisesTest[data, dist, "property"] returns the value of "                                                                                                   *
                                                                                                                                                                                         *                   local: paclet:ref/CramerVonMisesTest
                                                                                                                                                                                         * Documentation:    web: http://reference.wolfram.com/language/ref/CramerVonMisesTest.html
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
fun cramerVonMisesTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CramerVonMisesTest", arguments.toMutableList(), options)
}
