package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Kurtosis
 *
 * Full name:        System`Kurtosis
 *
 *                   Kurtosis[list] gives the coefficient of kurtosis for the elements in list.
 * Usage:            Kurtosis[dist] gives the coefficient of kurtosis for the distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Kurtosis
 * Documentation:    web: http://reference.wolfram.com/language/ref/Kurtosis.html
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
fun kurtosis(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Kurtosis", arguments.toMutableList(), options)
}
