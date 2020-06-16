package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DownValues
 *
 * Full name:        System`DownValues
 *
 * Usage:            DownValues[f] gives a list of transformation rules corresponding to all downvalues defined for the symbol f.
 *
 * Options:          Sort -> True
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DownValues
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownValues.html
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
fun downValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownValues", arguments.toMutableList(), options)
}
