package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Dated
 *
 * Full name:        System`Dated
 *
 *                   Dated[obj, year] represents the object obj associated with a particular year.
 *                   Dated[obj, date] represents the object obj associated with a date.
 * Usage:            Dated[obj, All] represents the object obj for all dates where information is available about it.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dated
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dated.html
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
fun dated(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dated", arguments.toMutableList(), options)
}
