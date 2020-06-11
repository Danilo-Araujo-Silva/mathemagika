package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CorrelationTest
 *
 * Full name:        System`CorrelationTest
 *
 *                   CorrelationTest[{{x , y }, {x , y }, …}] tests whether the correlation coefficient for a bivariate population is zero.
 *                                      1   1     2   2
 *                   CorrelationTest[{{x , y }, {x , y }, …}, ρ ] tests whether the correlation coefficient is ρ .
 *                                      1   1     2   2        0                                                0
 *                   CorrelationTest[{{x , y }, {x , y }, …}, {{u , v }, {u , v }, …}] tests whether the correlation coefficients for two populations are equal.
 *                                      1   1     2   2          1   1     2   2
 * Usage:            CorrelationTest[…, "property"] returns the value of "property".
 *
 *                   AlternativeHypothesis -> Unequal
 *                   Method -> Automatic
 *                                        1
 *                   SignificanceLevel -> --
 *                                        20
 * Options:          VerifyTestAssumptions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CorrelationTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/CorrelationTest.html
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
fun correlationTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CorrelationTest", arguments.toMutableList(), options)
}
