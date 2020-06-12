package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                                                                                  \!                                            ".
 *````                                                                                                                                                                * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                                                                                    *                   Method -> Automatic
 * Name:             BaringhausHenzeTest                                                                                                                                                                              *                                        1
 *                                                                                                                                                                                                                    *                   SignificanceLevel -> --
 * Full name:        System`BaringhausHenzeTest                                                                                                                                                                       * Options:                               20
 *                                                                                                                                                                                                                    *
 *                   BaringhausHenzeTest[data] tests whether data follows a MultinormalDistribution using the Baringhaus–Henze test.                                                                                  *                   Protected
 *                   BaringhausHenzeTest[data, MultinormalDistribution[μ, Σ]] tests whether data follows the distribution with mean vector μ and covariance matrix Σ.                                                 * Attributes:       ReadProtected
 *                   BaringhausHenzeTest[data, "property"] returns the value of "                                                                                                                                     *
                                                                                                                                                                                                                      *                   local: paclet:ref/BaringhausHenzeTest
                                                                                                                                                                                                                      * Documentation:    web: http://reference.wolfram.com/language/ref/BaringhausHenzeTest.html
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
fun baringhausHenzeTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BaringhausHenzeTest", arguments.toMutableList(), options)
}
