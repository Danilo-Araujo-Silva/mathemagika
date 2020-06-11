package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KendallTauTest
 *
 * Full name:        System`KendallTauTest
 *
 *                   KendallTauTest[v , v ] tests whether the vectors v  and v  are independent.
 *                                   1   2                             1      2
 *                   KendallTauTest[m , m ] tests whether the matrices m  and m  are independent.
 *                                   1   2                              1      2
 * Usage:            KendallTauTest[…, "property"] returns the value of "property".
 *
 *                   AlternativeHypothesis -> Unequal
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                                        1
 *                   SignificanceLevel -> --
 *                                        20
 * Options:          VerifyTestAssumptions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KendallTauTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/KendallTauTest.html
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
fun kendallTauTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KendallTauTest", arguments.toMutableList(), options)
}
