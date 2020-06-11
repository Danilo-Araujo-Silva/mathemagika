package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FactorialMoment
 *
 * Full name:        System`FactorialMoment
 *
 *                                                        th
 *                   FactorialMoment[list, r] gives the r   moment of the elements in the list.
 *                                                        th
 *                   FactorialMoment[dist, r] gives the r   moment of the distribution dist.
 *                                                       th
 * Usage:            FactorialMoment[r] represents the r   factorial moment.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FactorialMoment
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorialMoment.html
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
fun factorialMoment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorialMoment", arguments.toMutableList(), options)
}
