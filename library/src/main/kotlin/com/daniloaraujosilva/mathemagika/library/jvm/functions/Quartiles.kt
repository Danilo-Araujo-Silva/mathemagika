package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Quartiles
 *
 * Full name:        System`Quartiles
 *
 *                   Quartiles[list] gives a list of the 1/4, 1/2 and 3/4 quantiles of the elements in list.
 * Usage:            Quartiles[dist] gives a list of the 1/4, 1/2 and 3/4 quantiles of the distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Quartiles
 * Documentation:    web: http://reference.wolfram.com/language/ref/Quartiles.html
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
fun quartiles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Quartiles", arguments.toMutableList(), options)
}
