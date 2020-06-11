package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Mean
 *
 * Full name:        System`Mean
 *
 *                   Mean[list] gives the statistical mean of the elements in list.
 * Usage:            Mean[dist] gives the mean of the distribution dist.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Mean
 * Documentation:    web: http://reference.wolfram.com/language/ref/Mean.html
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
fun mean(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Mean", arguments.toMutableList(), options)
}
