package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                                        \!                                               ".
 *````                                                                                                                      *                                                1 *
 *                                                                                                                          * Usage:            StyleBox["property", "TI"]    *                   AlternativeHypothesis -> Unequal
 * Name:             LocationEquivalenceTest                                                                                                                                   *                   Method -> Automatic
 *                                                                                                                                                                             *                                        1
 * Full name:        System`LocationEquivalenceTest                                                                                                                            *                   SignificanceLevel -> --
 *                                                                                                                                                                             *                                        20
 *                   LocationEquivalenceTest[{data , data , …}] tests whether the means or medians of the data  are equal.                                                     * Options:          VerifyTestAssumptions -> Automatic
 *                                                1      2                                                    i                                                                *
 *                   LocationEquivalenceTest[{data , …}, "property"] returns the value of "                                                                                    *                   Protected
                                                                                                                                                                               * Attributes:       ReadProtected
                                                                                                                                                                               *
                                                                                                                                                                               *                   local: paclet:ref/LocationEquivalenceTest
                                                                                                                                                                               * Documentation:    web: http://reference.wolfram.com/language/ref/LocationEquivalenceTest.html
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
fun locationEquivalenceTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocationEquivalenceTest", arguments.toMutableList(), options)
}
