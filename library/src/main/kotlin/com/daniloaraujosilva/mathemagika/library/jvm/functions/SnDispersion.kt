package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SnDispersion
 *
 * Full name:        System`SnDispersion
 *
 *                   SnDispersion[list] gives the S  statistic of the elements in list.
 *                                                 n
 *                   SnDispersion[list, c] gives the S  statistic with scaling factor c.
 * Usage:                                             n
 *
 * Options:          Method -> FiniteSample
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SnDispersion
 * Documentation:    web: http://reference.wolfram.com/language/ref/SnDispersion.html
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
fun snDispersion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SnDispersion", arguments.toMutableList(), options)
}
