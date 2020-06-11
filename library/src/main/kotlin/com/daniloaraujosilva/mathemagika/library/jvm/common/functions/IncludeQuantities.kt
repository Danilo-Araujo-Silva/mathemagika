package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeQuantities
 *
 * Full name:        System`IncludeQuantities
 *
 * Usage:            IncludeQuantities is an option for DimensionalCombinations for additional quantities to include in the result.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/IncludeQuantities
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeQuantities.html
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
fun includeQuantities(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeQuantities", arguments.toMutableList(), options)
}
