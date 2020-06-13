package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IndependenceTest
 *
 * Full name:        System`IndependenceTest
 *
 *                   IndependenceTest[v , v ] tests whether the vectors v  and v  are independent.
 *                                     1   2                             1      2
 *                   IndependenceTest[m , m ] tests whether the matrices m  and m  are independent.
 *                                     1   2                              1      2
 * Usage:            IndependenceTest[…, "property"] returns the value of "property".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IndependenceTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndependenceTest.html
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
 * Default value:    Options[IndependenceTest] := Statistics`DependencyMeasuresDump`allOpts
 *
 * Numeric values:   None
 */
fun independenceTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndependenceTest", arguments.toMutableList(), options)
}
