package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConoverTest
 *
 * Full name:        System`ConoverTest
 *
 *                   ConoverTest[{data , data , …}] tests whether the variances of data , data , … are equal.
 *                                    1      2                                         1      2
 *                                       2                                      2
 *                   ConoverTest[dspec, σ ] tests a dispersion measure against σ .
 *                                       0                                      0
 *                                       2
 *                   ConoverTest[dspec, σ , "property"] returns the value of "property".
 * Usage:                                0
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
 *                   local: paclet:ref/ConoverTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConoverTest.html
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
fun conoverTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConoverTest", arguments.toMutableList(), options)
}
