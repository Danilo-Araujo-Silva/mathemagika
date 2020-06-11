package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                              \!                                            ".
 *````                                                                                                            * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                                                *                   AlternativeHypothesis -> Unequal
 * Name:             PearsonCorrelationTest                                                                                                                       *                   MaxIterations -> Automatic
 *                                                                                                                                                                *                   Method -> Automatic
 * Full name:        System`PearsonCorrelationTest                                                                                                                *                                        1
 *                                                                                                                                                                *                   SignificanceLevel -> --
 *                   PearsonCorrelationTest[v , v ] tests whether the vectors v  and v  are linearly independent.                                                 *                                        20
 *                                           1   2                             1      2                                                                           * Options:          VerifyTestAssumptions -> Automatic
 *                   PearsonCorrelationTest[…, "property"] returns the value of "                                                                                 *
                                                                                                                                                                  *                   Protected
                                                                                                                                                                  * Attributes:       ReadProtected
                                                                                                                                                                  *
                                                                                                                                                                  *                   local: paclet:ref/PearsonCorrelationTest
                                                                                                                                                                  * Documentation:    web: http://reference.wolfram.com/language/ref/PearsonCorrelationTest.html
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
fun pearsonCorrelationTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PearsonCorrelationTest", arguments.toMutableList(), options)
}
