package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Variance
 *
 * Full name:        System`Variance
 *
 *                   Variance[list] gives the sample variance of the elements in list.
 * Usage:            Variance[dist] gives the variance of the distribution dist.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Variance
 * Documentation:    web: http://reference.wolfram.com/language/ref/Variance.html
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
fun variance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Variance", arguments.toMutableList(), options)
}
