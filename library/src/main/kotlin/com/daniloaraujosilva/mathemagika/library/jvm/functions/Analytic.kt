package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Analytic
 *
 * Full name:        System`Analytic
 *
 * Usage:            Analytic is an option for Limit and Series. With Analytic -> True, unrecognized functions are treated as analytic, and processed using Taylor series expansions; with Analytic -> False, Taylor series are not used unless the function is recognized as analytic.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun analytic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Analytic", arguments.toMutableList(), options)
}
