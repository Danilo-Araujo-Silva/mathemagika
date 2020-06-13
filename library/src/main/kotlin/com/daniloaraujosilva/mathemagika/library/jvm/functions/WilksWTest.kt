package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                          \!                                            ".
 *````                                                                                        * Usage:            StyleBox["property", "TI"] *
 *                                                                                                                                            *                   AlternativeHypothesis -> Unequal
 * Name:             WilksWTest                                                                                                               *                   MaxIterations -> Automatic
 *                                                                                                                                            *                   Method -> Automatic
 * Full name:        System`WilksWTest                                                                                                        *                                        1
 *                                                                                                                                            *                   SignificanceLevel -> --
 *                   WilksWTest[m , m ] tests whether the matrices m  and m  are independent.                                                 *                                        20
 *                               1   2                              1      2                                                                  * Options:          VerifyTestAssumptions -> Automatic
 *                   WilksWTest[…, "property"] returns the value of "                                                                         *
                                                                                                                                              *                   Protected
                                                                                                                                              * Attributes:       ReadProtected
                                                                                                                                              *
                                                                                                                                              *                   local: paclet:ref/WilksWTest
                                                                                                                                              * Documentation:    web: http://reference.wolfram.com/language/ref/WilksWTest.html
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
fun wilksWTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WilksWTest", arguments.toMutableList(), options)
}
