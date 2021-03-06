package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GroupMultiplicationTable
 *
 * Full name:        System`GroupMultiplicationTable
 *
 * Usage:            GroupMultiplicationTable[group] gives the multiplication table of group as an array.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupMultiplicationTable
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupMultiplicationTable.html
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
fun groupMultiplicationTable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupMultiplicationTable", arguments.toMutableList(), options)
}
