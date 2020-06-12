package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StandardDeviation
 *
 * Full name:        System`StandardDeviation
 *
 *                   StandardDeviation[list] gives the sample standard deviation of the elements in list.
 * Usage:            StandardDeviation[dist] gives the standard deviation of the distribution dist.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StandardDeviation
 * Documentation:    web: http://reference.wolfram.com/language/ref/StandardDeviation.html
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
fun standardDeviation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StandardDeviation", arguments.toMutableList(), options)
}
