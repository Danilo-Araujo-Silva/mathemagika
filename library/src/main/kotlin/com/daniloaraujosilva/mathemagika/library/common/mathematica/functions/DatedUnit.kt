package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DatedUnit
 *
 * Full name:        System`DatedUnit
 *
 * Usage:            DatedUnit[unit, date] represents the specified unit at a specific date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatedUnit
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatedUnit.html
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
fun datedUnit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatedUnit", arguments.toMutableList(), options)
}
