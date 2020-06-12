package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cumulant
 *
 * Full name:        System`Cumulant
 *
 *                                                 th
 *                   Cumulant[dist, r] gives the r   cumulant of the distribution dist.
 *                                                 th
 *                   Cumulant[list, r] gives the r   cumulant of the elements in the list.
 *                                                th
 * Usage:            Cumulant[r] represents the r   formal cumulant.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cumulant
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cumulant.html
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
fun cumulant(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cumulant", arguments.toMutableList(), options)
}
