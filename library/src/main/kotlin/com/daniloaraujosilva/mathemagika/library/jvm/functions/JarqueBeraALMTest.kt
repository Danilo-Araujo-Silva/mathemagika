package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JarqueBeraALMTest
 *
 * Full name:        System`JarqueBeraALMTest
 *
 *                   JarqueBeraALMTest[data] tests whether data is normally distributed using the Jarque–Bera ALM test.
 * Usage:            JarqueBeraALMTest[data, "property"] returns the value of "property".
 *
 *                   Method -> Automatic
 *                                        1
 *                   SignificanceLevel -> --
 * Options:                               20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JarqueBeraALMTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/JarqueBeraALMTest.html
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
fun jarqueBeraALMTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JarqueBeraALMTest", arguments.toMutableList(), options)
}
