package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SiegelTukeyTest
 *
 * Full name:        System`SiegelTukeyTest
 *
 *                   SiegelTukeyTest[{data , data }] tests whether the variances of data  and data  are equal.
 *                                        1      2                                      1         2
 *                                           2                                      2
 *                   SiegelTukeyTest[dspec, σ ] tests a dispersion measure against σ .
 *                                           0                                      0
 *                                           2
 *                   SiegelTukeyTest[dspec, σ , "property"] returns the value of "property".
 * Usage:                                    0
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
 *                   local: paclet:ref/SiegelTukeyTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/SiegelTukeyTest.html
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
fun siegelTukeyTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SiegelTukeyTest", arguments.toMutableList(), options)
}
