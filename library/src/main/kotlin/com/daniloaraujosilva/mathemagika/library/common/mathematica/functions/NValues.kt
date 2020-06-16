package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NValues
 *
 * Full name:        System`NValues
 *
 * Usage:            NValues[f] gives a list of transformation rules corresponding to all numerical values (values for N[f[x, …], …], etc.) defined for the symbol f.
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
fun nValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NValues", arguments.toMutableList(), options)
}
