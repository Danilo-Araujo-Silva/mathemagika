package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnitRootTest
 *
 * Full name:        System`UnitRootTest
 *
 *                   UnitRootTest[data] tests whether data came from an autoregressive time series process with unit root.
 * Usage:            UnitRootTest[data, model, "property"] returns the value of "property" for a given model.
 *
 *                   Method -> Automatic
 *                                        1
 *                   SignificanceLevel -> --
 * Options:                               20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnitRootTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitRootTest.html
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
fun unitRootTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitRootTest", arguments.toMutableList(), options)
}
