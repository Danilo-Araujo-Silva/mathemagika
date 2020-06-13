package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                         \!                                            ".
 *````                                                                                                       *                                           0   *
 *                                                                                                           * Usage:            StyleBox["property", "TI"] *                   AlternativeHypothesis -> Unequal
 * Name:             MannWhitneyTest                                                                                                                         *                   MaxIterations -> Automatic
 *                                                                                                                                                           *                   Method -> Automatic
 * Full name:        System`MannWhitneyTest                                                                                                                  *                                        1
 *                                                                                                                                                           *                   SignificanceLevel -> --
 *                   MannWhitneyTest[{data , data }] tests whether the medians of data  and data  are equal.                                                 *                                        20
 *                                        1      2                                    1         2                                                            * Options:          VerifyTestAssumptions -> Automatic
 *                   MannWhitneyTest[dspec, μ ] tests the median difference against μ .                                                                      *
 *                                           0                                       0                                                                       *                   Protected
 *                   MannWhitneyTest[dspec, μ , "property"] returns the value of "                                                                           * Attributes:       ReadProtected
                                                                                                                                                             *
                                                                                                                                                             *                   local: paclet:ref/MannWhitneyTest
                                                                                                                                                             * Documentation:    web: http://reference.wolfram.com/language/ref/MannWhitneyTest.html
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
fun mannWhitneyTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MannWhitneyTest", arguments.toMutableList(), options)
}
