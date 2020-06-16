package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Skewness
 *
 * Full name:        System`Skewness
 *
 *                   Skewness[list] gives the coefficient of skewness for the elements in list.
 * Usage:            Skewness[dist] gives the coefficient of skewness for the distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Skewness
 * Documentation:    web: http://reference.wolfram.com/language/ref/Skewness.html
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
fun skewness(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Skewness", arguments.toMutableList(), options)
}
