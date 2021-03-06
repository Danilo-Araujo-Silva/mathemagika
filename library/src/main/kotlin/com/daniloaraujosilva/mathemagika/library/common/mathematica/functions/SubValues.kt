package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubValues
 *
 * Full name:        System`SubValues
 *
 * Usage:            SubValues[f] gives a list of transformation rules corresponding to all subvalues (values for f[x, …][…], etc.) defined for the symbol f.
 *
 * Options:          Sort -> True
 *
 *                   HoldAll
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
fun subValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubValues", arguments.toMutableList(), options)
}
