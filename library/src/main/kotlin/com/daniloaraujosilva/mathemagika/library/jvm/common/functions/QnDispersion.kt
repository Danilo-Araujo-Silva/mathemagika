package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QnDispersion
 *
 * Full name:        System`QnDispersion
 *
 *                   QnDispersion[list] gives the Q  statistic of the elements in list.
 *                                                 n
 *                   QnDispersion[list, c] gives the Q  statistic with a scaling factor c.
 * Usage:                                             n
 *
 * Options:          Method -> FiniteSample
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QnDispersion
 * Documentation:    web: http://reference.wolfram.com/language/ref/QnDispersion.html
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
fun qnDispersion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QnDispersion", arguments.toMutableList(), options)
}
