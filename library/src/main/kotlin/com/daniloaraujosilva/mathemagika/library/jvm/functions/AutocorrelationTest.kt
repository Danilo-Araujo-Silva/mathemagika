package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AutocorrelationTest
 *
 * Full name:        System`AutocorrelationTest
 *
 *                   AutocorrelationTest[data] tests whether the data is autocorrelated.
 *                   AutocorrelationTest[data, k] tests whether the data is autocorrelated up to lag k.
 * Usage:            AutocorrelationTest[data, k, "property"] returns the value of "property" for a given model.
 *
 *                   Method -> Automatic
 *                                        1
 *                   SignificanceLevel -> --
 * Options:                               20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AutocorrelationTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutocorrelationTest.html
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
fun autocorrelationTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutocorrelationTest", arguments.toMutableList(), options)
}
